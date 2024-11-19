/**
 * Excepción que se lanza al intentar reservar una
 * habitación ya reservada
 */
public class ExisteHabitacionReservadaExcepcion extends Exception{

    public ExisteHabitacionReservadaExcepcion(String mensaje) {
        super(mensaje);
    }
}
