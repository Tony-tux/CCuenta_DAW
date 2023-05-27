package cuenta;
/**
 * 
 * @author antonio
 * Programa de creacion y manejo de una cuenta corriente.
 */
public class CCuenta {

    /**
     * @return Deculeve el nombre del usuario de la cuenta.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre 
     * Recibe el nombre del usuario de la cuenta corriente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return Devuelve el número de la cuenta corriente.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta
     * Recibe el número de cuenta a buscar.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return Devuelve cuanto saldo tiene la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo
     * Recibe cuanto saldo tiene la cuenta corriente.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return Devuelve el tipo de interés al que está la cuenta corriente.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés
     * Recibe el tipo de interes al que tiene que estar la cuenta corriente.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }
    /**
     * 
     * @param nom
     * Nombre del usuario de la cuenta corriente
     * @param cue
     * Número de la cuenta corriente
     * @param sal
     * Monto del saldo de la cuenta corriente
     * @param tipo
     * Parametro colocado pero sin uso, tendria que ser el tipo de interes. TODO.
     * 
     */

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public double estado()
    {
        return getSaldo();
    }
    /**
     * 
     * @param cantidad
     * Cantidad de dinero que se va a ingresar
     * @throws Exception 
     * Aviso de que se está ingresando con cantidad negativa.
     */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * 
     * @param cantidad
     * Cantidad de dinero que se va a retirar.
     * @throws Exception 
     * Aviso de que se está intentando retirar una cantidad negativa.
     */

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
