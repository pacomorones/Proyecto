public class Habitacion {
    public String idHabitacion;
    protected String tipoHabitacion;
    protected boolean vistaMar;
    protected double precio;

    public Habitacion (String idHabitacion, String tipoHabitacion, boolean vistaMar, double precio) {
        this.idHabitacion = idHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.vistaMar = vistaMar;
        this.precio = precio;
    }

    /**** Setters de todas los atributos de la clase Habitación ****/

    public String obtenerId() {
        return idHabitacion;
        return i;
    }

    public String obtenerTipoHabitacion() {
        return tipoHabitacion;
    }

    public boolean obtenerVistaMar() {
        return vistaMar;
    }

    public double obtenerPrecio() {
        return  precio;
    }


    /**** Setters de todas los atributos de la clase Habitación ****/

    public void asignarId(String idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public void asignarTipoHab(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public void asignarVistaMar(boolean vistaMar) {
        this.vistaMar = vistaMar;
    }

    public void asignarPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Muestra una representación de la instancia como una cadena de texto
     * @return Una instancia de Habitación como cadena de texto.
     */
    @Override
    public String toString() {
        String habitacion = String.format("|%55s|\n", " ");

        habitacion += String.format("|  ID Habitación:  %38s   |\n", idHabitacion);
        habitacion += String.format("|  Tipo de Habitación:  %38s   |\n", tipoHabitacion);
        habitacion += String.format("|  Vista:  %38s   |\n", vistaMar);
        habitacion += String.format("|  Precio:  %38s   |\n", precio);

        return habitacion;
    }

    /**
     * 
     */
    @Override
    public boolean equals(Object  obj) {

        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (!(obj instanceof Habitacion))
            return false;

        Habitacion otraHabitacion = (Habitacion)obj;

        if (!(this.idHabitacion.equals(otraHabitacion.idHabitacion)))
            return false;

        if (!(this.tipoHabitacion.equals(otraHabitacion.tipoHabitacion)))
            return false;
        
        if (this.vistaMar != otraHabitacion.vistaMar)
            return false;

        if (this.precio != otraHabitacion.precio)
            return false;
        
        return true;
    }
}