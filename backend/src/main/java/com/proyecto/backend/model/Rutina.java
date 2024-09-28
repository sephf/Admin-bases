package com.proyecto.backend.model;
import java.util.Date;
public class Rutina {

    private int id_rutina;

    private int cliente;

    private int instructor;

    private int maquina;

    private Date fecha;

    private int horas;

    private String nombre;

    public Rutina(int a, int b, int c, int d, Date e, int f, String g){
      this.id_rutina =a;
      this.cliente= b;
      this.instructor=c;
      this.maquina=d;
      this.fecha=e;
      this.horas=f;
      this.nombre=g;
    }
    public int getIdRutina() {
        return id_rutina;
    }

    public void setIdRutina(int idRutina) {
        this.id_rutina = idRutina;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public int getInstructor() {
        return instructor;
    }

    public void setInstructor(int instructor) {
        this.instructor = instructor;
    }

    public int getMaquina() {
        return maquina;
    }

    public void setMaquina(int maquina) {
        this.maquina = maquina;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
