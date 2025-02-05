package persistencia;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import entidades.Pedido;

public class PedidoDAO extends DAO {

    public List<Pedido> obtenerPedido() throws Exception {
        String sql = "SELECT id_pedido, codigo_pedido, nombre, id_gama, dimensiones, proveedor, descripcion, cantidad_stock, precio_venta, precio_proveedor FROM pedido";
        List<Pedido> pedidos = new ArrayList<>();

        try {
            consultarDataBase(sql);
            while (resultSet.next()) {
                Pedido pedido = new Pedido();
                pedido.setIdPedido(resultSet.getInt("id_pedido"));
                pedido.setCodigoPedido(resultSet.getInt("codigo_pedido"));
                pedido.setFechaPedido(resultSet.getDate("fecha_pedido"));
                pedido.setFechaEsperada(resultSet.getDate("fecha_esperada"));
                pedido.setFechaEntrega(resultSet.getDate("fecha_entrega"));
                pedido.setEstado(resultSet.getString("estado"));
                pedido.setComentario(resultSet.getString("comentario"));
                pedido.setIdCliente(resultSet.getInt("id_cliente"));
                pedidos.add(pedido);
            }
        } catch (SQLException e) {
            throw new Exception("Error al listar los pedidos: " + e.getMessage(), e);
        } finally {
            desconectarDataBase();
        }

        return pedidos;
    }

    public List<Pedido> guardarPedido(Pedido pedido) throws Exception {
        if (pedido == null) {
            throw new Exception("El pedido no puede ser nulo");
        }
        String sql = "INSERT INTO pedido (codigo_pedido, fecha_pedido, fecha_esperada, fecha_entrega, estado, comentario, id_cliente) VALUES ('"
                + pedido.getCodigoPedido() + "', '"
                + pedido.getFechaPedido() + "', '"
                + pedido.getFechaEsperada() + "', '"
                + pedido.getFechaEntrega() + "', '"
                + pedido.getEstado() + "', '"
                + pedido.getComentario() + "', '"
                + pedido.getIdCliente() + "')";
        insertarModificarEliminarDataBase(sql);
        return obtenerPedido();
    }
}
