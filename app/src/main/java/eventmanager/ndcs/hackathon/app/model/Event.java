package eventmanager.ndcs.hackathon.app.model;

import java.util.Date;
import java.util.Map;

/**
 * Created by miguel on 29/9/17.
 */

public class Event {

    private String id;
    private String nombre;
    private String categoria;
    private Date fecha;
    private String descripcion;
    private Map<String, Confirmacion> asistentes;

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Map<String, Confirmacion> getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(Map<String, Confirmacion> asistentes) {
        this.asistentes = asistentes;
    }

    public static class Builder{

        Event event;

        public Builder () { event = new Event(); }

        public Builder id (String id){
            this.event.id = id;
            return this;
        }

        public Builder nombre (String nombre){
            this.event.nombre = nombre;
            return this;
        }

        public Builder categoria (String categoria){
            this.event.categoria = categoria;
            return this;
        }

        public Builder fecha (Date fecha){
            this.event.fecha = fecha;
            return this;
        }

        public Builder asistentes (Map<String, Confirmacion> asistentes){
            this.event.asistentes = asistentes;
            return this;
        }

        public Event build () {return this.event;}

    }

}
