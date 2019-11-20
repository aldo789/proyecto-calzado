
package Modelo;


public class Persona {
    
    int id;
    String usuario;
    String pass;
    String nombre;
    String apellido;
    String correo;
    String numero;
    String tipoU;
    int estadoU;

    public Persona() {
    }

    public Persona(int id, String usuario, String pass, String nombre, String apellido, String correo, String numero, String tipoU, int estadoU) {
        this.id = id;
        this.usuario = usuario;
        this.pass = pass;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.numero = numero;
        this.tipoU = tipoU;
        this.estadoU = estadoU;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipoU() {
        return tipoU;
    }

    public void setTipoU(String tipoU) {
        this.tipoU = tipoU;
    }

    public int getEstadoU() {
        return estadoU;
    }

    public void setEstadoU(int estadoU) {
        this.estadoU = estadoU;
    }
     
    
    
    
    
    
}
