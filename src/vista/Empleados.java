/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author axel5
 */
public class Empleados extends Persona {
private String nit;
   
    // crear constructor vacio
    public Empleados(){}

    public Empleados(String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento, int sueldo, int bonificacion, int total) {
        super(nombres, apellidos, direccion, telefono, fecha_nacimiento, sueldo, bonificacion, total);
    }

   

    
    

   
    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

     // metodos crud
@Override
       protected String[] crear(){
           try {
               String datos [ ] = new String[9];
               datos[0] = getNit();
               datos[1] = getNombres();
               datos[2] = getApellidos();
               datos[3] = getDireccion();
               datos[4] = getTelefono();
               datos[5] = this.getFecha_nacimiento();
              String ssueldo = Integer.toString(getSueldo());
              datos[6] = ssueldo;
              
              String sbonificacion = Integer.toString(getBonificacion());
              datos[7] = sbonificacion;
        
              String stotal = Integer.toString(getTotal());
              datos[8] = stotal;
               
               return datos;
           } catch (Exception ex){
               System.out.println("Tiene un error: " + ex.getMessage());
               return null;
           }    
       }
      
       /* 
@Override
        protected void leer(){}
@Override
       protected void actualizar(){}
@Override
       protected void borrar(){} */



    
}
