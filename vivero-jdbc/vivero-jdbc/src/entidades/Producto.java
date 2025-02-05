package entidades;

public class Producto {
    private Integer idProducto;
    private String codigoProducto;
    private String nombre;
    private Integer idGama;
    private String dimensiones;
    private String proveedor;
    private String descripcion;
    private Integer cantidadStock;
    private Double precioVenta;
    private Double precioProveedor;

    public Producto(Integer idProducto, String codigoProducto, String nombre, Integer idGama, String dimensiones,
            String proveedor, String descripcion, Integer cantidadStock, Double precioVenta, Double precioProveedor) {
        this.idProducto = idProducto;
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.idGama = idGama;
        this.dimensiones = dimensiones;
        this.proveedor = proveedor;
        this.descripcion = descripcion;
        this.cantidadStock = cantidadStock;
        this.precioVenta = precioVenta;
        this.precioProveedor = precioProveedor;
    }

    public Producto(String codigoProducto, String nombre, Integer idGama, String dimensiones, String proveedor,
            String descripcion, Integer cantidadStock, Double precioVenta, Double precioProveedor) {
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.idGama = idGama;
        this.dimensiones = dimensiones;
        this.proveedor = proveedor;
        this.descripcion = descripcion;
        this.cantidadStock = cantidadStock;
        this.precioVenta = precioVenta;
        this.precioProveedor = precioProveedor;
    }

    public Producto() {
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdGama() {
        return idGama;
    }

    public void setIdGama(Integer idGama) {
        this.idGama = idGama;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(Integer cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Double getPrecioProveedor() {
        return precioProveedor;
    }

    public void setPrecioProveedor(Double precioProveedor) {
        this.precioProveedor = precioProveedor;
    }

    @Override
    public String toString() {
        return "Producto [idProducto=" + idProducto + ", codigoProducto=" + codigoProducto + ", nombre=" + nombre
                + ", idGama=" + idGama + ", dimensiones=" + dimensiones + ", proveedor=" + proveedor + ", descripcion="
                + descripcion + ", cantidadStock=" + cantidadStock + ", precioVenta=" + precioVenta
                + ", precioProveedor=" + precioProveedor + "]";
    }

}
