/**
 * La clase modela un sencillo podómetro que registra información
 * acerca de los pasos, distancia, ..... que una persona
 * ha dado en una semana. 
 * 
 * @author    - Christhoper Pinday Delgado - 
 */

public class Podometro {
     //constantes que indican el sexo de una persona
    private final char HOMBRE = 'H';
    private final char MUJER = 'M';
    //Constantes, representan un porcentaje (45% y 41%) sobre la altura de 
    //de la persona que se usaran para calcular la long. de su zancada
    private final double ZANCADA_HOMBRE = 0.45;
    private final double ZANCADA_MUJER = 0.41;
    //Dos constantes que indican el nº de dia de la semana
    private final int SABADO = 6;
    private final int DOMINGO = 7; 
    
    //ATRIBUTOS
    private String marca; //Marca del podómetro
    //A. de Configuración
    private double altura; //altura de la persona (cm)
    private char sexo; //sexo de la persona 'M' o 'H'
    private double longitudZancada; //Almacena la long. de la zancada de la persona en cm
    // A. de Estadísticas
    private int totalPasosLaborables; //nº de pasos dados de lun a vie
    private int totalPasosSabado; //guarda el nº de pasos dados el sabado
    private int totalPasosDomingo; //nº pasos del domingo
    private double totalDistanciaSemana; //distancia recorrida en toda la semana (km)
    private double totalDistanciaFinSemana; //distancia recorrida el fin de semana (km)
    private int tiempo; //tiempo total caminado en la semana (en min)
    private int caminatasNoche; //Nro. de caminatas (paseos) dados a partir de las 21h en toda la semana
    
    /**
     * Inicializa el podómetro con la marca indicada por el parámetro.
     * El resto de atributos se ponen a 0 y el sexo, por defecto, es mujer
     */
    public Podometro() {

        
    }

    /**
     * accesor para la marca
     *  
     */
    public  void  getMarca() {

         

    }

    /**
     * Simula la configuración del podómetro.
     * Recibe como parámetros la altura y el sexo de una persona
     * y asigna estos valores a los atributos correspondiente.
     * Asigna además el valor adecuado al atributo longitudZancada
     * 
     * (leer enunciado)
     *  
     */
    public void configurar(double queAltura, char queSexo) {

        
    }

     /**
     *  Recibe cuatro parámetros que supondremos correctos:
     *    pasos - el nº de pasos caminados
     *    dia - nº de día de la semana en que se ha hecho la caminata 
     *              (1 - Lunes, 2 - Martes - .... - 6 - Sábado, 7 - Domingo)
     *    horaInicio – hora de inicio de la caminata
     *    horaFin – hora de fin de la caminata
     *    
     *    A partir de estos parámetros el método debe realizar ciertos cálculos
     *    y  actualizará el podómetro adecuadamente  
     *   
     *   (leer enunciado del ejercicio)
     */
    public void registrarCaminata(int pasos, int dia, int horaInicio,
                            int horaFin) {

       

    }
    
     /**
     * Muestra en pantalla la configuración del podómetro
     * (altura, sexo y longitud de la zancada)
     * 
     * (ver enunciado)
     *  
     */
    public void printConfiguracion() {

        

    }

    /**
     * Muestra en pantalla información acerca de la distancia recorrida,
     * pasos, tiempo total caminado, ....
     * 
     * (leer enunciado)
     *  
     */
    public void printEstadísticas() {

        

    }

   

    /**
     *  Calcula y devuelve un String que representa el nombre del día
     *  en el que se ha caminado más pasos - "SÁBADO"   "DOMINGO" o  "LABORABLES"
     */
    public void diaMayorNumeroPasos() {

         

    }
    
    
    /**
     * Restablecer los valores iniciales del podómetro
     * Todos los atributos se ponen a cero salvo el sexo
     * que se establece a MUJER. La marca no varía
     *  
     */    
    public void reset() {

        

    }

}
