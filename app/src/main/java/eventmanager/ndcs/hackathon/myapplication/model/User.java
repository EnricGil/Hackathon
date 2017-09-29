package eventmanager.ndcs.hackathon.myapplication.model;

import java.util.List;

/**
 * Created by miguel on 29/9/17.
 */

public class User {

    private String id;
    private String nombre;
    private String apellidos;
    private String pass;
    private String email;
    private String telefono;
    private boolean admin;

    public List<String> getEventos() {
        return eventos;
    }

    public void setEventos(List<String> eventos) {
        this.eventos = eventos;
    }

    private List<String> eventos;


    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public static class Builder{

        User user;

        public Builder () { user = new User(); }

        public Builder id (String id){
            this.user.id = id;
            return this;
        }

        public Builder nombre (String nombre){
            this.user.nombre = nombre;
            return this;
        }

        public Builder apellidos (String apellidos){
            this.user.apellidos = apellidos;
            return this;
        }

        public Builder email (String email){
            this.user.email = email;
            return this;
        }

        public Builder telefono (String telefono){
            this.user.telefono = telefono;
            return this;
        }

        public Builder admin (boolean admin){
            this.user.admin = admin;
            return this;
        }

        public Builder pass (String pass){
            this.user.pass = pass;
            return this;
        }

        public Builder eventos (List<String> eventos){
            this.user.eventos = eventos;
            return this;
        }

        public User build () {return this.user;}

    }

}
