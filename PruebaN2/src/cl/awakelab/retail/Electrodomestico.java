package cl.awakelab.retail;

/**
 * Super-clase, todos sus atributos se heredan a las sub-clases y posee el
 * metodo para calcular el precio final de un objeto, el cual se sobrescribira
 * en las sub-clases.
 * 
 * @author Diego Pizarro
 *
 */
public class Electrodomestico {

    // ---------------------------------------------------------------------------------------------
    // ATRIBUTOS
    // ---------------------------------------------------------------------------------------------

    private float precioBase;
    private String color;
    private char consumoEnergetico;
    private float peso;

    // ---------------------------------------------------------------------------------------------
    // CONSTANTES
    // ---------------------------------------------------------------------------------------------

    // Biblioteca de valores char correspondientes a los tipos de consumo energetico
    protected char tipoConsumoEnergetico[] = { 'A', 'B', 'C', 'D', 'E', 'F' };

    // Biblioteca de Strings de colores disponibles para un Electrodomestico
    protected String coloresDisponibles[] = { "BLANCO", "NEGRO", "ROJO", "ROJO", "AZUL", "GRIS" };

    // Valores por defecto atributos objeto Electrodomestico y para sus clases hijas
    private final float PRECIO_BASE_DEFECTO = 100000;
    private final String COLOR_DEFECTO = coloresDisponibles[0];
    private final float PESO_DEFECTO = 5;
    private final char CONSUMO_ENERGETICO_DEFECTO = tipoConsumoEnergetico[5];

    // ---------------------------------------------------------------------------------------------
    // CONSTRUCTORES
    // ---------------------------------------------------------------------------------------------

    /**
     * Constructor por defecto, con atributos definidos en constantes
     */
    public Electrodomestico() {
        this.precioBase = PRECIO_BASE_DEFECTO;
        this.color = COLOR_DEFECTO;
        this.consumoEnergetico = CONSUMO_ENERGETICO_DEFECTO;
        this.peso = PESO_DEFECTO;
    }

    /**
     * Segundo constructor, utiliza valores de color y consumo energetico por
     * defecto
     * 
     * @param precioBase, atributo
     * @param peso,       atributo
     */
    public Electrodomestico(float precioBase, float peso) {
        this();
        this.precioBase = precioBase;
        this.peso = peso;
    }

    /**
     * Tercer constructor, sin atributos con valores por defecto.
     * 
     * @param precioBase,        atributo
     * @param color,             atributo
     * @param consumoEnergetico, atributo
     * @param peso,              atributo
     */
    public Electrodomestico(float precioBase, String color, char consumoEnergetico, float peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    // ---------------------------------------------------------------------------------------------
    // METODOS GET, SET, TOSTRING
    // ---------------------------------------------------------------------------------------------

    /**
     * Metodo para obtener el precio base de un objeto tipo Electrodomestico
     * 
     * @return un valor float del precio base de un objeto
     */
    public float getPrecioBase() {
        return precioBase;
    }

    /**
     * Metodo para obtener el color de un objeto tipo Electrodomestico
     * 
     * @return un String del color de un objeto
     */
    public String getColor() {
        return color;
    }

    /**
     * Metodo para obtener el consumo energetico de un objeto tipo Electrodomestico
     * 
     * @return una letra correspondiente al tipo de consumo energetico de un objeto
     */
    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    /**
     * Metodo para obtener el peso de un objeto tipo Electrodomestico
     * 
     * @return un valor float del peso de un objeto
     */
    public float getPeso() {
        return peso;
    }

    // ---------------------------------------------------------------------------------------------
    // METODOS PROPIOS
    // ---------------------------------------------------------------------------------------------

    /**
     * Metodo para comprobar que el usuario haya ingresado una letra (char) que se
     * encuentra dentro de los datos permitidos independiente de si se digita en
     * MAYUS o MINUS, con la que se asignara info consumo electronico a un objeto
     * Electrodomestico.
     * 
     * @param letra sin validar
     * @return letra validada de consumo energetico
     */
    private char comprobarConsumoEnergetico(char letra) {
        char consumo = CONSUMO_ENERGETICO_DEFECTO;

        for (char c : tipoConsumoEnergetico) {
            if (Character.toUpperCase(letra) == c)
                consumo = Character.toUpperCase(letra);
        }

        return consumo;
    }

    /**
     * Metodo para comprobar que el usuario haya ingresado el color (String) que se
     * encuentra dentro de los datos permitidos independiente de si se digita en
     * MAYUS o MINUS, para asignarselo a un objeto Electrodomestico.
     * 
     * @param color sin validar
     * @return color de objeto validado
     */
    private String comprobarColor(String color) {
        String colorValidado = COLOR_DEFECTO;

        for (String string : coloresDisponibles) {
            if (color.equalsIgnoreCase(string))
                colorValidado = string;
        }

        return colorValidado;
    }

    /**
     * Metodo que calcula precio final de un objeto Electrodomestico en base a su
     * tipo de consumo energetico y de su rango de peso o tamano.
     * 
     * @param e, Objeto de clase Electrodomestico o de sus clases hijas
     * @return valor float de precio final
     */
    public float precioFinal(Electrodomestico e) {
        float acumulador = e.getPrecioBase();
        if (e.getConsumoEnergetico() == 'A')
            acumulador += 100;
        if (e.getConsumoEnergetico() == 'B')
            acumulador += 80;
        if (e.getConsumoEnergetico() == 'C')
            acumulador += 60;
        if (e.getConsumoEnergetico() == 'D')
            acumulador += 50;
        if (e.getConsumoEnergetico() == 'E')
            acumulador += 30;
        if (e.getConsumoEnergetico() == 'F')
            acumulador += 10;
        if (e.getPeso() >= 0 && e.getPeso() <= 19)
            acumulador += 10;
        if (e.getPeso() >= 20 && e.getPeso() <= 49)
            acumulador += 50;
        if (e.getPeso() >= 50 && e.getPeso() <= 79)
            acumulador += 80;
        if (e.getPeso() >= 80)
            acumulador += 100;
        return acumulador;
    }

}
