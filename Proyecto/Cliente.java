public class Cliente {
    private String idCliente;
    private String nombre;
    private date fechaNacimiento;
    private String nacionalidad;
    private String email;
    private String numTel;
    private boolean esVIP;

    /**
     * Construye un nuevo cliente con los datos que recibe
     */
    public Cliente (String idCliente, String nombre, date fechaNacimiento,
                    String nacionalidad, String email, String numTel,
                    boolean esVIP) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.email = email;
        this.numTel = numTel;
        this.esVIP = esVIP;
    }

    public String obtenerId() { 
        return idCliente;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerFechaNacimiento() {
        return fechaNacimiento;
    }

    public String obtenerNacionalidad() {
        return nacionalidad;
    }

    public String obtenerEmail() {
        return email;
    }

    public String obtenerNumTel() {
        return numTel;
    }

    public String obtenerEsVip() {
        return esVIP;
    }

    /********* SETTERS *********/

    public void asignarId(String idCliente) {
        this.idCliente = idCliente;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    public void asignarFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    } 

    public void asignarNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void asignarEmail(String email) {
        this.email = email;
    }

    public void asignarNumTel(String numTel) {
        this.numTel = numTel;
    }

    public void asignarEsVip(boolean esVIP) {
        this.esVIP = esVIP;
    }           
}