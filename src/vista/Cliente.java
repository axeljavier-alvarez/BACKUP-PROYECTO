/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author axel5
 */
public class Cliente extends Persona {
private String nit;
   
    // crear constructor vacio
    public Cliente(){}
    public Cliente(String nit, String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento) {
        super(nombres, apellidos, direccion, telefono, fecha_nacimiento);
        this.nit = nit;
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
               String datos [ ] = new String[6];
               datos[0] = getNit();
               datos[1] = getNombres();
               datos[2] = getApellidos();
               datos[3] = getDireccion();
               datos[4] = getTelefono();
               datos[5] = this.getFecha_nacimiento();

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
