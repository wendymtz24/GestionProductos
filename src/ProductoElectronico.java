public class ProductoElectronico extends Producto {

    // Atributo exclusivo de los productos electrónicos
    private int mesesGarantia;

    // Constructor de la clase derivada
    public ProductoElectronico(
            String nombre,
            double precio,
            String categoria,
            int mesesGarantia) {

        super(nombre, precio, categoria);
        this.mesesGarantia = mesesGarantia;
    }

    // Sobrescribir el método heredado de la clase Producto
    @Override
    public void mostrarInformacion() {

        // Mostrar la información común del producto
        super.mostrarInformacion();

        // Mostrar el atributo exclusivo del producto electrónico
        System.out.println("Garantía: " + mesesGarantia + " meses");
    }


    // Método exclusivo para mostrar la garantía
    public void mostrarGarantia() {
        System.out.println("Garantía: " + mesesGarantia + " meses");
    }
}

