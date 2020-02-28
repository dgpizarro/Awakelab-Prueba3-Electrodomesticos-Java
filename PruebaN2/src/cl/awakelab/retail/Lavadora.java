package cl.awakelab.retail;

public class Lavadora extends Electrodomestico {

    // ---------------------------------------------------------------------------------------------
    // ATRIBUTOS
    // ---------------------------------------------------------------------------------------------

    private float carga;

    // ---------------------------------------------------------------------------------------------
    // CONSTANTES
    // ---------------------------------------------------------------------------------------------

    /**
     * Valor por defecto de la carga de un objeto Lavadora
     */
    private final float CARGA_DEFECTO = 5;

    // ---------------------------------------------------------------------------------------------
    // CONSTRUCTORES
    // ---------------------------------------------------------------------------------------------

    /**
     * Cosntructor por defecto de objetos tipo Lavadora, con atributos definidos en
     * constantes
     */
    public Lavadora() {
        super();
        this.carga = CARGA_DEFECTO;
    }

    /**
     * Segundo constructor de objetos tipo Lavadora, hereda valores de color y
     * consumo energetico por defecto, y utiliza valor cte. de carga
     * 
     * @param precioBase
     * @param peso
     */
    public Lavadora(float precioBase, float peso) {
        super(precioBase, peso);
        this.carga = CARGA_DEFECTO;
    }

    /**
     * Tercer constructor de objetos tipo Lavadora, sin atributos con valores por
     * defecto.
     * 
     * @param precioBase
     * @param color
     * @param consumoEnergetico
     * @param peso
     * @param carga
     */
    public Lavadora(float precioBase, String color, char consumoEnergetico, float peso, float carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    // ---------------------------------------------------------------------------------------------
    // METODOS GET, SET, TOSTRING
    // ---------------------------------------------------------------------------------------------

    /**
     * Metodo para obtener la carga de un objeto tipo Lavadora
     * 
     * @return un valor float la carga de una Lavadora
     */
    public float getCarga() {
        return carga;
    }

    // ---------------------------------------------------------------------------------------------
    // METODOS PROPIOS
    // ---------------------------------------------------------------------------------------------

    /**
     * Metodo que sobrescribe el metodo precioFinal() de la clase padre
     * Electrodomestico para agregar al precio final un suple si se cumple cierta
     * condicion del atributo carga de Lavadora
     * 
     * @return Precio final (float) con o sin suple
     */
    @Override
    public float precioFinal(Electrodomestico e) {
        Lavadora a = (Lavadora) e;
        float acumulador;
        if (a.getCarga() > 30)
            acumulador = super.precioFinal(e) + 50;
        else
            acumulador = super.precioFinal(e);
        return acumulador;
    }

}
