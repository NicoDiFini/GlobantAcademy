package entidades;

import java.sql.Date;

public class Pedido {
    private Integer idPedido;
    private Integer codigoPedido;
    private Date fechaPedido;
    private Date fechaEsperada;
    private Date fechaEntrega;
    private String estado;
    private String comentario;
    private Integer idCliente;

    public Pedido(Integer idPedido, Integer codigoPedido, Date fechaPedido, Date fechaEsperada, Date fechaEntrega,
            String estado, String comentario, Integer idCliente) {
        this.idPedido = idPedido;
        this.codigoPedido = codigoPedido;
        this.fechaPedido = fechaPedido;
        this.fechaEsperada = fechaEsperada;
        this.fechaEntrega = fechaEntrega;
        this.estado = estado;
        this.comentario = comentario;
        this.idCliente = idCliente;
    }

    public Pedido(Integer codigoPedido, Date fechaPedido, Date fechaEsperada, Date fechaEntrega, String estado,
            String comentario, Integer idCliente) {
        this.codigoPedido = codigoPedido;
        this.fechaPedido = fechaPedido;
        this.fechaEsperada = fechaEsperada;
        this.fechaEntrega = fechaEntrega;
        this.estado = estado;
        this.comentario = comentario;
        this.idCliente = idCliente;
    }

    public Pedido() {
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Integer getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(Integer codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Date getFechaEsperada() {
        return fechaEsperada;
    }

    public void setFechaEsperada(Date fechaEsperada) {
        this.fechaEsperada = fechaEsperada;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "Pedido [idPedido=" + idPedido + ", codigoPedido=" + codigoPedido + ", fechaPedido=" + fechaPedido
                + ", fechaEsperada=" + fechaEsperada + ", fechaEntrega=" + fechaEntrega + ", estado=" + estado
                + ", comentario=" + comentario + ", idCliente=" + idCliente + "]";
    }

}
