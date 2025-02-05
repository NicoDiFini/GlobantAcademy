package persistencia;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import entidades.Cliente;

public class ClienteDAO extends DAO {

    public void guardarCliente(Cliente cliente) throws Exception {
        if (cliente == null) {
            throw new Exception("El cliente no puede ser nulo");
        }
        String sql = "INSERT INTO cliente (nombre_cliente, apellido_contacto) VALUES ('"
                + cliente.getNombreCliente() + "', '"
                + cliente.getApellidoContacto() + "')";
        insertarModificarEliminarDataBase(sql);
    }

    public List<Cliente> listarTodosLosClientes() throws Exception {
        String sql = "SELECT id_cliente, nombre_cliente, apellido_contacto FROM cliente";
        List<Cliente> clientes = new ArrayList<>();

        try {
            consultarDataBase(sql);
            while (resultSet.next()) {
                Cliente cliente = new Cliente();
                cliente.setIdCliente(resultSet.getInt("id_cliente"));
                cliente.setNombreCliente(resultSet.getString("nombre_cliente"));
                cliente.setApellidoContacto(resultSet.getString("apellido_contacto"));
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            throw new Exception("Error al listar los clientes: " + e.getMessage(), e);
        } finally {
            desconectarDataBase();
        }

        return clientes;
    }

    public void eliminarClientePorId(int id) throws Exception {
        String sql = "DELETE FROM cliente WHERE id_cliente = " + id;
        insertarModificarEliminarDataBase(sql);
    }

    public void buscarClientePorCodigo(int codigo) throws Exception {
        try {
            String sql = "SELECT codigo_cliente, nombre_contacto, apellido_contacto from cliente where codigo_cliente = "
                    + codigo + ";";
            consultarDataBase(sql);
            Cliente clienteEncontrado = null;
            while (resultSet.next()) {
                clienteEncontrado = Cliente.makeSimpleCliente(resultSet.getInt("codigo_cliente"),
                        resultSet.getString("nombre_contacto"), resultSet.getString("apellido_contacto"));
            }

            if (clienteEncontrado == null) {
                System.out.printf("Cliente con código %s no encontrado", codigo);
            } else {
                System.out.println(clienteEncontrado.toString());
            }

        } catch (Exception e) {
            throw e;
        }
    }
}