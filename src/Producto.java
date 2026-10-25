public class Producto {

    // Atributos del producto
    private String nombre;
    private double precio;
    private String categoria;

    // Constructor: inicializa los datos del producto
    public Producto(String nombre, double precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    // Muestra la información actual del producto
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Categoría: " + categoria);
    }

    // Aplica un descuento porcentual y actualiza el precio del producto
    public void aplicarDescuento(double porcentaje) {
        precio = precio - (precio * porcentaje / 100);
    }

    // Devuelve el precio actual del producto después de los descuentos
    public double calcularPrecioFinal() {
        return precio;
    }
}
