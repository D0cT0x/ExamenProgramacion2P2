/*
 * Nombre: Cesar Sanchez Gonzaga
 */
public interface ITienda {
    void agregarProducto(IProducto producto);
    void listarProductos();
    double obtenerPromedioPrecioProductos();
    IProducto obtenerProductoMasCostoso();
}