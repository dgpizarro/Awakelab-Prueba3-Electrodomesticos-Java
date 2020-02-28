package cl.awakelab.retail;

public class Ejecutable {

    public static void main(String[] args) {

        Electrodomestico[] listaElectrodomesticos = new Electrodomestico[10];

        listaElectrodomesticos[0] = new Electrodomestico();
        listaElectrodomesticos[1] = new Electrodomestico(90000, 20);
        listaElectrodomesticos[2] = new Electrodomestico(110000, "rojo", 'a', 2);
        listaElectrodomesticos[3] = new Lavadora(200000, 68);
        listaElectrodomesticos[4] = new Lavadora(200000, "BLANCO", 'B', 70, 29);
        listaElectrodomesticos[5] = new Lavadora(200000, "azul", 'c', 68, 35);
        listaElectrodomesticos[6] = new Televisor(250000, 10);
        listaElectrodomesticos[7] = new Televisor(250000, "dorado", 'A', 11, 32, true);
        listaElectrodomesticos[8] = new Televisor(250000, "Negro", 'd', 12, 43, false);
        listaElectrodomesticos[9] = new Televisor(250000, "GRIS", 'g', 15, 60, true);

        float sumatoriaElectrodomesticos = 0;
        float sumatoriaLavadoras = 0;
        float sumatoriaTelevisores = 0;

        System.out.printf("%s%n", "");
        System.out.printf("%s%n", "Los precios finales para los productos de la tienda son:");
        System.out.printf("%s%n", "");

        for (int i = 0; i < listaElectrodomesticos.length; i++) {
            System.out.printf("- %-16s color %-6s, precio: %9.1f %n",
                    listaElectrodomesticos[i].getClass().getSimpleName(), listaElectrodomesticos[i].getColor(),
                    listaElectrodomesticos[i].precioFinal(listaElectrodomesticos[i]));
        }

        for (int i = 0; i < listaElectrodomesticos.length; i++) {
            if (listaElectrodomesticos[i] instanceof Electrodomestico)
                sumatoriaElectrodomesticos += listaElectrodomesticos[i].precioFinal(listaElectrodomesticos[i]);
            if (listaElectrodomesticos[i] instanceof Lavadora)
                sumatoriaLavadoras += listaElectrodomesticos[i].precioFinal(listaElectrodomesticos[i]);
            if (listaElectrodomesticos[i] instanceof Televisor)
                sumatoriaTelevisores += listaElectrodomesticos[i].precioFinal(listaElectrodomesticos[i]);
        }

        System.out.printf("%s%n", "");
        System.out.printf("%-26s %9.1f %n", "Total electrodomesticos: ", sumatoriaElectrodomesticos);
        System.out.printf("%-26s %9.1f %n", "Total lavadoras: ", sumatoriaLavadoras);
        System.out.printf("%-26s %9.1f %n", "Total televisores: ", sumatoriaTelevisores);
        System.out.printf("%s%n", "");
        System.out.printf("%s%n", "FIN");

    }

}
