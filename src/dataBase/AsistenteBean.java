package dataBase;

import java.io.Serializable;

/**
 * Bean de los datos personales de un asistente.
 * @author Max Emmanuel Sierra Gómez
 * @version 1.0.0
 */
public class AsistenteBean implements Serializable{
    
    private String nombre;
    private int edad;
    private String adscripcion;
    private String dondeSeEntero;
    private String email;
    private int asistencias;
    
    public AsistenteBean(){
    }

    public AsistenteBean(String nombre, int edad, String adscripcion, String dondeSeEntero, String email, int asistencias) {
        this.nombre = nombre;
        this.edad = edad;
        this.adscripcion = adscripcion;
        this.dondeSeEntero = dondeSeEntero;
        this.email = email;
        this.asistencias = asistencias;
    }
    
    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getAdscripcion() {
        return adscripcion;
    }

    public void setAdscripcion(String adscripcion) {
        this.adscripcion = adscripcion;
    }

    public String getDondeSeEntero() {
        return dondeSeEntero;
    }

    public void setDondeSeEntero(String dondeSeEntero) {
        this.dondeSeEntero = dondeSeEntero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}