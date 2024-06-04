/*
 * Nombre: Cesar Sanchez Gonzaga
 */
import java.util.ArrayList;
import java.util.List;

public class Tienda implements ITienda{
    private List<IProducto> productos;

    public Tienda() {
        this.productos = new ArrayList<>();
    }

    //Implementar los métodos
    
    public void agregarProducto(IProducto producto) {
		productos.add(producto);
    }
    
    public void listarProductos() {
    	for(IProducto productos : productos) {
    		((IProducto) productos).imprimeDetallesProducto();
    	}
    }
    
    public double obtenerPromedioPrecioProductos() {
    	double promedio = 0;
    	double suma = 0;
    	for(IProducto productos : productos) {
    		suma += ((IProducto) productos).getPrecio();
    	}
    	promedio = suma/productos.size();
    	return promedio;
    }
    
	@Override
	public IProducto obtenerProductoMasCostoso() {
		double mayorPrecio = 0;
		double control;
    	for(IProducto productos : productos) {
    		control = ((IProducto) productos).getPrecio();
    		if(control>mayorPrecio) {
    			mayorPrecio=control;
    		}
    	}
    	for(IProducto productos : productos) {
    		if(mayorPrecio==((IProducto) productos).getPrecio()) {
        		((IProducto) productos).imprimeDetallesProducto();
        		return productos;
    		}
    	}
    	return null;
	}

    //Punto extra. El valor a buscar puede ser parte del nombre.
    public Boolean buscarProductoPorNombre(String nombre){
    	String nombreP;
    	Boolean control = null;
        for(IProducto productos : productos){
        	nombreP = ((IProducto) productos).getModelo();
        	if(nombre.equals(nombreP)) {
        		control = true;
        	} else {
        		control = false;
        	}
        }
        return control;
    }




}
