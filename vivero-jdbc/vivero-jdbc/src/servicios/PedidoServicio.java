package servicios;

import persistencia.PedidoDAO;
import entidades.Pedido;
import java.util.List;
import java.sql.Date;

public class PedidoServicio {
    PedidoDAO pd = new PedidoDAO();

    public List<Pedido> guardarPedido(Integer codigoPedido, Date fechaPedido, Date fechaEsperada, Date fechaEntrega,
            String estado, String comentario, Integer idCliente) throws Exception {

        validacionesCyF(codigoPedido, fechaPedido);
        Pedido pedido = new Pedido(codigoPedido, fechaPedido, fechaEsperada, fechaEntrega, estado, comentario,
                idCliente);

        return pd.guardarPedido(pedido);
    }

    public void validacionesCyF(Integer codigoPedido, Date fechaPedido) throws Exception {
        if (codigoPedido == null) {
            throw new Exception("El codigo del pedido no puede ser nulo.");
        }
        if (fechaPedido == null) {
            throw new Exception("La fecha del pedido no puede ser nula.");
        }
    }
}
