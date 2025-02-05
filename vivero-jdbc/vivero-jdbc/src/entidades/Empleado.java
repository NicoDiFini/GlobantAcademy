package entidades;

public class Empleado {
    private Integer idEmpleado;
    private Integer codigoEmpleado;
    private String nombre;
    private String apellido;
    private String extension;
    private String email;
    private Integer idOficina;
    private Integer idJefe;
    private String puesto;

    public Empleado(Integer idEmpleado, Integer codigoEmpleado, String nombre, String apellido, String extension,
            String email, Integer idOficina, Integer idJefe, String puesto) {
        this.idEmpleado = idEmpleado;
        this.codigoEmpleado = codigoEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.extension = extension;
        this.email = email;
        this.idOficina = idOficina;
        this.idJefe = idJefe;
        this.puesto = puesto;
    }

    public Empleado(Integer codigoEmpleado, String nombre, String apellido, String extension, String email,
            Integer idOficina, Integer idJefe, String puesto) {
        this.codigoEmpleado = codigoEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.extension = extension;
        this.email = email;
        this.idOficina = idOficina;
        this.idJefe = idJefe;
        this.puesto = puesto;
    }

    public Empleado() {
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Integer getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(Integer codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdOficina() {
        return idOficina;
    }

    public void setIdOficina(Integer idOficina) {
        this.idOficina = idOficina;
    }

    public Integer getIdJefe() {
        return idJefe;
    }

    public void setIdJefe(Integer idJefe) {
        this.idJefe = idJefe;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Empleado [idEmpleado=" + idEmpleado + ", codigoEmpleado=" + codigoEmpleado + ", nombre=" + nombre
                + ", apellido=" + apellido + ", extension=" + extension + ", email=" + email + ", idOficina="
                + idOficina + ", idJefe=" + idJefe + ", puesto=" + puesto + "]";
    }
}