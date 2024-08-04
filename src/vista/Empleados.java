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

    public Empleados(String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento, String sueldo, String bonificacion) {
        super(nombres, apellidos, direccion, telefono, fecha_nacimiento, sueldo, bonificacion);
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
               String datos [ ] = new String[8];
               datos[0] = getNit();
               datos[1] = getNombres();
               datos[2] = getApellidos();
               datos[3] = getDireccion();
               datos[4] = getTelefono();
               datos[5] = this.getFecha_nacimiento();
               datos[6] = getSueldo();
               datos[7] = getBonificacion();
               
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
