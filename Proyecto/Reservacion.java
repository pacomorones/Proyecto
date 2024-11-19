import java.time.LocalDateTime;

/**
 * Clase encargada de simular una reservacion
 */
public class Reservacion {

    /* Atributos */

    protected int personas;
    protected double costoTotal;
    protected double deposito;
    private LocalDateTime fechaEntrada;
    private LocalDateTime fechaSalida;
    
    public Reservacion (Cliente cliente, Habitacion habitacion, int personas,
                        double costoTotal, double deposito, LocalDateTime fechaEntrada,
                        LocalDateTime fechaSalida) {
                        this.cliente = cliente;
                        this.habitacion = habitacion;
                        this.personas = personas;
                        this.costoTotal = costoTotal;
                        this.deposito = deposito;
                        this.fechaEntrada = fechaEntrada;
                        this.fechaSalida = fechaSalida;
                    }

    /***** GETTERS *****/
    public Cliente obtenerCliente() {
        return cliente;
    }
        
    public Habitacion obtenerHabitacion() {
        return habitacion;
    }

    public int obtenerPersonas() {
        return personas;
    }

    public double obtenerCostoTotal() {
        return costoTotal;
    }

    public double obtenerDeposito() {
        return deposito;
    }

    public LocalDateTime obtenerFechaEntrada() {
        return fechaEntrada;
    }

    public LocalDateTime obtenerFechaSalida() {
        return fechaSalida;
    }

    /******* SETTERS *******/
    public void asignarPersonas(int personas) {
        this.personas = personas;
    }

    public void asignarCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public void asignarDeposito(double deposito) {
        this.deposito = deposito;
    }

    public void asignarFechaEntrada(LocalDateTime fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public void asignarFechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    }
