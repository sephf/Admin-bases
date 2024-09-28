package com.proyecto.backend.model;

public class Maquina {
  private int id_maquina;
  private String descripcion;
  private String estado;

  public int getIdMaquina(){
    return id_maquina;
  }
  public String getDescripcion(){
    return descripcion;
  }
  public String getEstado(){
    return estado;
  }
  public void setIdMaquina(int id){
     this.id_maquina=id;
  }
  public void setDescripcion(String descripci){
     this.descripcion=descripci;
  }
  public void setEstado(String est){
    this.estado=est;
  }
}
