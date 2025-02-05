package entidades;

public class Cliente {
    private int id_cliente;
    private int codigo_cliente;
    private String nombre_cliente;
    private String nombre_contacto;
    private String apellido_contacto;
    private String telefono;
    private String fax;
    private String ciudad;
    private String region;
    private String pais;
    private String codigo_postal;
    private int id_empleado;
    private double limite_credito;

    public Cliente(int idCliente, int codigoCliente, String nombreCliente, String nombreContacto,
            String apellidoContacto, String telefono, String fax, String ciudad, String region, String pais,
            String codigoPostal, int idEmpleado, double limiteCredito) {
        this.id_cliente = idCliente;
        this.codigo_cliente = codigoCliente;
        this.nombre_cliente = nombreCliente;
        this.nombre_contacto = nombreContacto;
        this.apellido_contacto = apellidoContacto;
        this.telefono = telefono;
        this.fax = fax;
        this.ciudad = ciudad;
        this.region = region;
        this.pais = pais;
        this.codigo_postal = codigoPostal;
        this.id_empleado = idEmpleado;
        this.limite_credito = limiteCredito;
    }

    public Cliente(int codigo_cliente, String nombre_cliente, String nombre_contacto, String apellido_contacto,
            String telefono, String fax, String ciudad, String region, String pais, String codigo_postal,
            int id_empleado, double limite_credito) {
        this.codigo_cliente = codigo_cliente;
        this.nombre_cliente = nombre_cliente;
        this.nombre_contacto = nombre_contacto;
        this.apellido_contacto = apellido_contacto;
        this.telefono = telefono;
        this.fax = fax;
        this.ciudad = ciudad;
        this.region = region;
        this.pais = pais;
        this.codigo_postal = codigo_postal;
        this.id_empleado = id_empleado;
        this.limite_credito = limite_credito;
    }

    public Cliente() {
    }

    public int getIdCliente() {
        return id_cliente;
    }

    public void setIdCliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getCodigoCliente() {
        return codigo_cliente;
    }

    public void setCodigoCliente(int codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    public String getNombreCliente() {
        return nombre_cliente;
    }

    public void setNombreCliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getNombreContacto() {
        return nombre_contacto;
    }

    public void setNombreContacto(String nombre_contacto) {
        this.nombre_contacto = nombre_contacto;
    }

    public String getApellidoContacto() {
        return apellido_contacto;
    }

    public void setApellidoContacto(String apellido_contacto) {
        this.apellido_contacto = apellido_contacto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCodigoPostal() {
        return codigo_postal;
    }

    public void setCodigoPostal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public int getIdEmpleado() {
        return id_empleado;
    }

    public void setIdEmpleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public double getLimiteCredito() {
        return limite_credito;
    }

    public void setLimiteCredito(double limite_credito) {
        this.limite_credito = limite_credito;
    }

    public static Cliente makeSimpleCliente(int codigoCliente, String nombre, String apellido) {
        return new Cliente(codigoCliente, null, nombre, apellido, null, null, null, null, null, null, 0, 0);
    }

    @Override
    public String toString() {
        return "Cliente [id_cliente=" + id_cliente + ", codigo_cliente=" + codigo_cliente + ", nombre_cliente="
                + nombre_cliente + ", nombre_contacto=" + nombre_contacto + ", apellido_contacto=" + apellido_contacto
                + ", telefono=" + telefono + ", fax=" + fax + ", ciudad=" + ciudad + ", region=" + region + ", pais="
                + pais + ", codigo_postal=" + codigo_postal + ", id_empleado=" + id_empleado + ", limite_credito="
                + limite_credito + "]";
    }
}