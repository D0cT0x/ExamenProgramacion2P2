/*
 * Nombre: Cesar Sanchez Gonzaga
 */
public class Laptop implements IProducto{
    private String nombre;
    private String marca;
    private int garantia;
    private double precio;
    
    // Definicion el constructor
    
    public Laptop(String nombre, String marca, double precio, int garantia) {
    	this.nombre = nombre;
    	this.marca = marca;
    	this.precio = precio;
    	this.garantia = garantia;
    	this.precio = precio;
    }
    
    // Implementar metodos
    @Override
    public String getModelo() {
    	return nombre;
    }
    
    @Override
    public String getMarca() {
    	return marca;
    }
    
    @Override
    public double getPrecio() {
    	return precio;
    }
    
    public int getGarantia() {
    	return garantia;
    }
    
    @Override
    public void imprimeDetallesProducto() {
    	System.out.println("Nombre de la Laptop: " + nombre);
    	System.out.println("Marca: "+marca);
    	System.out.println("Años de garantia: "+garantia);
    	System.out.println("Precio: "+precio);
    	
    }
    
}
