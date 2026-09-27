//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        // Crear un objeto de la clase Producto
        Producto producto1 = new Producto(
                "Laptop",
                1500,
                "Electrónica"
        );

        // Mostrar la información inicial del producto
        producto1.mostrarInformacion();

        // Aplicar un descuento del 10%
        producto1.aplicarDescuento(10);

        // Mostrar la información después del descuento
        producto1.mostrarInformacion();

        // Obtener y mostrar el precio final
        double precioFinal = producto1.calcularPrecioFinal();

        System.out.println("Precio final: $" + precioFinal);

    }
}