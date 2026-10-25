
public class Main {

    public static void main(String[] args) {

        // ==========================================
        // 1. PRODUCTO GENERAL
        // ==========================================

        // Crear un objeto de la clase padre Producto
        Producto producto1 = new Producto(
                "Laptop",
                1500,
                "Electrónica"
        );

        System.out.println("=== PRODUCTO GENERAL ===");

        // Mostrar la información del producto una sola vez
        producto1.mostrarInformacion();

        // Guardar el precio original antes del descuento
        double precioOriginal1 = producto1.calcularPrecioFinal();

        // Aplicar un descuento del 10 %
        producto1.aplicarDescuento(10);

        // Obtener el precio final después del descuento
        double precioFinal1 = producto1.calcularPrecioFinal();

        // Mostrar el resumen de precios
        System.out.println("Precio original: $" + precioOriginal1);
        System.out.println("Descuento aplicado: 10 %");
        System.out.println("Precio final: $" + precioFinal1);


        // ==========================================
        // 2. PRODUCTO ELECTRÓNICO
        // ==========================================

        // Crear un objeto de la clase derivada ProductoElectronico
        ProductoElectronico producto2 = new ProductoElectronico(
                "Laptop HP",
                18000,
                "Electrónica",
                24
        );

        System.out.println("\n=== PRODUCTO ELECTRÓNICO ===");

        // Mostrar la información heredada del producto
        producto2.mostrarInformacion();

        // Guardar el precio original antes del descuento
        double precioOriginal2 = producto2.calcularPrecioFinal();

        // Aplicar un descuento del 10 % mediante un método heredado
        producto2.aplicarDescuento(10);

        // Obtener el precio final después del descuento
        double precioFinal2 = producto2.calcularPrecioFinal();

        // Mostrar el resumen de precios
        System.out.println("Precio original: $" + precioOriginal2);
        System.out.println("Descuento aplicado: 10 %");
        System.out.println("Precio final: $" + precioFinal2);


        // ==========================================
        // 3. PRODUCTO ALIMENTICIO
        // ==========================================

        // Crear un objeto de la clase derivada ProductoAlimenticio
        ProductoAlimenticio producto3 = new ProductoAlimenticio(
                "Leche",
                30,
                "Alimentos",
                "30/11/2026"
        );

        System.out.println("\n=== PRODUCTO ALIMENTICIO ===");

        // Mostrar la información heredada del producto
        producto3.mostrarInformacion();

        // Guardar el precio original antes del descuento
        double precioOriginal3 = producto3.calcularPrecioFinal();

        // Aplicar un descuento del 10 % mediante un método heredado
        producto3.aplicarDescuento(10);

        // Obtener el precio final después del descuento
        double precioFinal3 = producto3.calcularPrecioFinal();

        // Mostrar el resumen de precios
        System.out.println("Precio original: $" + precioOriginal3);
        System.out.println("Descuento aplicado: 10 %");
        System.out.println("Precio final: $" + precioFinal3);
    }
}
