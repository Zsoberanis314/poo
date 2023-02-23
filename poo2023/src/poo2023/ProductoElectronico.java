
package poo2023;

/**
 * @author Manuel Antonio
 */
public abstract class ProductoElectronico {
    
    private double precio=0;
    private String marca;
    private String modelo;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
    
    
}
