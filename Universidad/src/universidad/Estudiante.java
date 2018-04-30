/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

/**
 *
 * @author Jefe de Sistemas
 */
public class Estudiante {
   private String nombre; 
   private String apellido; 
   private String dni; 
 
   public String getNombre(){ 
   return nombre;
   } 
 
   public void setNombre(String nombre){ 
   this.nombre = nombre;
   } 
 
   public String getApellido(){
   return apellido; 
   } 
 
   public void setApellido(String apellido){
   this.apellido = apellido;
   } 
 
   public String getDni(){
   return dni; 
   }
 
  public void setDni(String dni){
  this.dni = dni; 
  } 
 
  public void mostrarEstudianteActual(){
  System.out.println(nombre+" "+apellido+", es el estudiante actual");
  }
}
