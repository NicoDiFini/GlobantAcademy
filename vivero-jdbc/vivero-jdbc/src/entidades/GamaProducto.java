package entidades;

public class GamaProducto {
    private Integer idGama;
    private String gama;
    private String descripcionTexto;
    private String descripcionHTML;
    private String imagen;

    public GamaProducto(Integer idGama, String gama, String descripcionTexto, String descripcionHTML, String imagen) {
        this.idGama = idGama;
        this.gama = gama;
        this.descripcionTexto = descripcionTexto;
        this.descripcionHTML = descripcionHTML;
        this.imagen = imagen;
    }

    public GamaProducto(String gama, String descripcionTexto, String descripcionHTML, String imagen) {
        this.gama = gama;
        this.descripcionTexto = descripcionTexto;
        this.descripcionHTML = descripcionHTML;
        this.imagen = imagen;
    }

    public GamaProducto() {
    }

    public Integer getIdGama() {
        return idGama;
    }

    public void setIdGama(Integer idGama) {
        this.idGama = idGama;
    }

    public String getGama() {
        return gama;
    }

    public void setGama(String gama) {
        this.gama = gama;
    }

    public String getDescripcionTexto() {
        return descripcionTexto;
    }

    public void setDescripcionTexto(String descripcionTexto) {
        this.descripcionTexto = descripcionTexto;
    }

    public String getDescripcionHTML() {
        return descripcionHTML;
    }

    public void setDescripcionHTML(String descripcionHTML) {
        this.descripcionHTML = descripcionHTML;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "GamaProducto [idGama=" + idGama + ", gama=" + gama + ", descripcionTexto=" + descripcionTexto
                + ", descripcionHTML=" + descripcionHTML + ", imagen=" + imagen + "]";
    }

}