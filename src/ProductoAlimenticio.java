public class ProductoAlimenticio extends Producto {

    // Atributo exclusivo de los productos alimenticios
    private String fechaCaducidad;

    // Constructor de la clase derivada
    public ProductoAlimenticio(
            String nombre,
            double precio,
            String categoria,
            String fechaCaducidad) {

        super(nombre, precio, categoria);
        this.fechaCaducidad = fechaCaducidad;
    }

    // Sobrescribir el método heredado de la clase Producto
    @Override
    public void mostrarInformacion() {

        // Mostrar la información común del producto
        super.mostrarInformacion();

        // Mostrar el atributo exclusivo del producto alimenticio
        System.out.println("Fecha de caducidad: " + fechaCaducidad);
    }


    // Método exclusivo para mostrar la fecha de caducidad
    public void mostrarCaducidad() {
        System.out.println("Fecha de caducidad: " + fechaCaducidad);
    }
}
