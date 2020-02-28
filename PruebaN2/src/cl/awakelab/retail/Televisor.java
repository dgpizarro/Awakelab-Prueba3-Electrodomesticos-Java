package cl.awakelab.retail;

/**
 * Sub-clase de Electrodomestico, posee dos atributos propios y sobrescribe el
 * metodo precioFinal()
 * 
 * @author Diego Pizarro
 *
 */

public class Televisor extends Electrodomestico {

    // ---------------------------------------------------------------------------------------------
    // ATRIBUTOS
    // ---------------------------------------------------------------------------------------------

    private float resolucion;
    private boolean sintonizadorTDT;

    // ---------------------------------------------------------------------------------------------
    // CONSTANTES
    // ---------------------------------------------------------------------------------------------

    // Valores por defecto de la resolucion de un objeto Televisor, y de la presencia
    // o no de un sint. TDT.

    private final float RESOLUCION_DEFECTO = 20;

    private final boolean SINTONIZADOR_TDT_DEFECTO = false;

    // ---------------------------------------------------------------------------------------------
    // CONSTRUCTORES
    // ---------------------------------------------------------------------------------------------

    /**
     * Cosntructor por defecto de objetos tipo Televisor, con atributos definidos en
     * constantes heredadas y propias de esta clase.
     */
    public Televisor() {
        super();
        this.resolucion = RESOLUCION_DEFECTO;
        this.sintonizadorTDT = SINTONIZADOR_TDT_DEFECTO;
    }

    /**
     * Segundo constructor de objetos tipo Televisor, hereda valores de color y
     * consumo energetico por defecto, y utiliza valor cte. de resolucion y
     * sintonizadorTDT
     * 
     * @param precioBase, atributo
     * @param peso,       atributo
     */
    public Televisor(float precioBase, float peso) {
        super(precioBase, peso);
        this.resolucion = RESOLUCION_DEFECTO;
        this.sintonizadorTDT = SINTONIZADOR_TDT_DEFECTO;
    }

    /**
     * Tercer constructor de objetos tipo Lavadora, sin atributos con valores por
     * defecto.
     * 
     * @param precioBase,        atributo
     * @param color,             atributo
     * @param consumoEnergetico, atributo
     * @param peso,              atributo
     * @param resolucion,        atributo
     * @param sintonizadorTDT,   atributo
     */
    public Televisor(float precioBase, String color, char consumoEnergetico, float peso, float resolucion,
            boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    // ---------------------------------------------------------------------------------------------
    // METODOS GET, SET, TOSTRING
    // ---------------------------------------------------------------------------------------------

    /**
     * Metodo para obtener la resolucion de un objeto tipo Televisor
     * 
     * @return resolcuion en pulgadas
     */
    public float getResolucion() {
        return resolucion;
    }

    /**
     * Metodo para conocer si un objeto tipo Televisor tiene o no sintonizador de
     * TDT
     * 
     * @return valor true o false
     */
    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    // ---------------------------------------------------------------------------------------------
    // METODOS PROPIOS
    // ---------------------------------------------------------------------------------------------

    /**
     * Metodo que sobrescribe el metodo precioFinal() de la clase padre
     * Electrodomestico para agregar al precio final un suple si se cumple cierta
     * condicion del atributo resolucion y/o sintonizadorTDT de un objeto Televisor
     * 
     * @return Precio final (float) con o sin suple
     */
    @Override
    public float precioFinal(Electrodomestico e) {
        Televisor t = (Televisor) e;
        float acumulador = super.precioFinal(e);
        if (t.getResolucion() > 40)
            acumulador = acumulador * (float) 1.3;
        if (t.isSintonizadorTDT() == true)
            acumulador += 50;
        return acumulador;
    }

}
