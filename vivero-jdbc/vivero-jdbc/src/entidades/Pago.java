package entidades;

import java.sql.*;

public class Pago {
    private Integer idPago;
    private Integer idCliente;
    private String formaPago;
    private String idTransaccion;
    private Date fechaPago;
    private Double total;

    public Pago(Integer idPago, Integer idCliente, String formaPago, String idTransaccion, Date fechaPago,
            Double total) {
        this.idPago = idPago;
        this.idCliente = idCliente;
        this.formaPago = formaPago;
        this.idTransaccion = idTransaccion;
        this.fechaPago = fechaPago;
        this.total = total;
    }

    public Pago(Integer idCliente, String formaPago, String idTransaccion, Date fechaPago, Double total) {
        this.idCliente = idCliente;
        this.formaPago = formaPago;
        this.idTransaccion = idTransaccion;
        this.fechaPago = fechaPago;
        this.total = total;
    }

    public Pago() {
    }

    public Integer getIdPago() {
        return idPago;
    }

    public void setIdPago(Integer idPago) {
        this.idPago = idPago;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(String idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Pago [idPago=" + idPago + ", idCliente=" + idCliente + ", formaPago=" + formaPago + ", idTransaccion="
                + idTransaccion + ", fechaPago=" + fechaPago + ", total=" + total + "]";
    }

}
