package entidades;

public class DetallePedido {
    private Integer idDetallePedido;
    private Integer idPedido;
    private Integer idProducto;
    private Integer cantidad;
    private Double precioUnidad;
    private Integer numeroLinea;
    
    public DetallePedido(Integer idDetallePedido, Integer idPedido, Integer idProducto, Integer cantidad,
            Double precioUnidad, Integer numeroLinea) {
        this.idDetallePedido = idDetallePedido;
        this.idPedido = idPedido;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
        this.numeroLinea = numeroLinea;
    }

    public DetallePedido(Integer idPedido, Integer idProducto, Integer cantidad, Double precioUnidad,
            Integer numeroLinea) {
        this.idPedido = idPedido;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
        this.numeroLinea = numeroLinea;
    }

    public DetallePedido() {
    }

    public Integer getIdDetallePedido() {
        return idDetallePedido;
    }

    public void setIdDetallePedido(Integer idDetallePedido) {
        this.idDetallePedido = idDetallePedido;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(Double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public Integer getNumeroLinea() {
        return numeroLinea;
    }

    public void setNumeroLinea(Integer numeroLinea) {
        this.numeroLinea = numeroLinea;
    }

    @Override
    public String toString() {
        return "DetallePedido [idDetallePedido=" + idDetallePedido + ", idPedido=" + idPedido + ", idProducto="
                + idProducto + ", cantidad=" + cantidad + ", precioUnidad=" + precioUnidad + ", numeroLinea="
                + numeroLinea + "]";
    }

}