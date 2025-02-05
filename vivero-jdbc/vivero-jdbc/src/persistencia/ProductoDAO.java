package persistencia;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import entidades.Producto;

public class ProductoDAO extends DAO {

    public void eliminarProductoPorCodigo(int id_producto) throws Exception {
        String sql = "DELETE FROM producto WHERE id_producto = " + id_producto;
        insertarModificarEliminarDataBase(sql);
    } 

    public List<Producto> obtenerProductos() throws Exception {
        String sql = "SELECT id_producto, codigo_producto, nombre, id_gama, dimensiones, proveedor, descripcion, cantidad_stock, precio_venta, precio_proveedor FROM producto";
        List<Producto> productos = new ArrayList<>();

        try {
            consultarDataBase(sql);
            while (resultSet.next()) {
                Producto producto = new Producto();
                producto.setIdProducto(resultSet.getInt("id_producto"));
                producto.setCodigoProducto(resultSet.getString("codigo_producto"));
                producto.setNombre(resultSet.getString("nombre"));
                producto.setIdGama(resultSet.getInt("id_gama"));
                producto.setDimensiones(resultSet.getString("dimensiones"));
                producto.setProveedor(resultSet.getString("proveedor"));
                producto.setDescripcion(resultSet.getString("descripcion"));
                producto.setCantidadStock(resultSet.getInt("cantidad_stock"));
                producto.setPrecioVenta(resultSet.getDouble("precio_venta"));
                producto.setPrecioProveedor(resultSet.getDouble("precio_proveedor"));
                productos.add(producto);
            }
        } catch (SQLException e) {
            throw new Exception("Error al listar los productos: " + e.getMessage(), e);
        } finally {
            desconectarDataBase();
        }

        return productos;
    }
}
