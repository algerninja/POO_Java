package Ejer1;
/*
 * Isaias Manuel Pinto Martinez
 *          29671221
 * algerninjaxdd@gmail.com
 */

//Modelo de la variables principales y sus setter y getter

public class Modelo00 {

    private int ID;
    private String Nombre;
    private String Apellido;
    private int Cedula;
    private String Empresa;
    private String PTrabajo;
    private String Telefono;
    private String Correo;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }

    public String getPTrabajo() {
        return PTrabajo;
    }

    public void setPTrabajo(String PTrabajo) {
        this.PTrabajo = PTrabajo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

}
