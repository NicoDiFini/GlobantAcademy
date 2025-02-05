package main;

import entidades.*;
import persistencia.*;
import servicios.*;

import java.util.List;

public class App {
    public static void main(String[] args) {

        ClienteDAO clienteDAO = new ClienteDAO();
        ClienteServicio clienteServicio = new ClienteServicio();
        ProductoDAO productoDAO = new ProductoDAO();

        // listar clientes
        try {
            List<Cliente> clientes = clienteServicio.listarClientes();
            System.out.println("Lista de clientes:");
            for (Cliente c : clientes) {
                System.out.println(c);
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            List<Producto> productos = productoDAO.obtenerProductos();
            System.out.println("Lista de productos:");
            for (Producto p : productos) {
                System.out.println(p);
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

        // buscar cliente por codigo
        try {
            clienteServicio.buscarClientePorCodigo(1);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

        // eliminar cliente por codigo
        try {
            clienteDAO.eliminarClientePorId(1);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

        // crear cliente
        try {
            System.out.println("Ingrese parametros para crear un cliente:");
            int codigoC = Integer.parseInt(System.console().readLine());
            String nombre = System.console().readLine();
            String nombreContacto = System.console().readLine();
            String apellidoContacto = System.console().readLine();
            String telefono = System.console().readLine();
            String fax = System.console().readLine();
            String ciudad = System.console().readLine();
            String region = System.console().readLine();
            String pais = System.console().readLine();
            String codigoPostal = System.console().readLine();
            int idEmpleado = Integer.parseInt(System.console().readLine());
            double limiteCredito = Double.parseDouble(System.console().readLine());
            Cliente cliente = clienteServicio.crearNuevoCliente(codigoC, nombre, nombreContacto, apellidoContacto,
                    telefono, fax, ciudad, region, pais, codigoPostal, idEmpleado, limiteCredito);
            System.out.println("Cliente creado con id " + cliente.getIdCliente());
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }


    }
}