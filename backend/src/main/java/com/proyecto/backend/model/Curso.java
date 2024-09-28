package com.proyecto.backend.model;

public class Curso {
  private int id_curso;
  private String descripcion;
  private String nombre;
  private String horario;

  public Curso(int id, String descripcion, String nombre, String horario){
    this.id_curso=id;
    this.descripcion=descripcion;
    this.nombre=nombre;
    this.horario=horario;
  }
}