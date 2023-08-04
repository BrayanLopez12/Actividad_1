/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import javax.swing.JOptionPane;
/**
 *
 * @author braya
 */
public class Cliente extends Persona{
    private String nit;

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
    //@Override
    //public void agregar(){
     
  //  System.out.println("Nit: " + getNit());
  //System.out.println("Nombres: " + getNombres());
  //  System.out.println("Apellidos: " + getApellidos());
  //  System.out.println("Direccion: " + getDireccion());
  //  System.out.println("Numero Telefono: " + getTelefono());
  //  System.out.println("Fecha Nacimiento: " + getFecha_nacimiento());
    @Override
     public String[] agregar(){
           try
            {         
                    String datos[]= new String[6];      
                      datos[0] = getNit();
                      datos[1] = getNombres();
                      datos[2] = getApellidos();
                      datos[3] = getDireccion();
                      datos[4] = getTelefono();
                      datos[5] = getFecha_nacimiento();
              return  datos;            
                 }
         catch(Exception ex)
            {
                  
                    JOptionPane.showMessageDialog(null,ex.getMessage(),"Error en Query",JOptionPane.ERROR_MESSAGE);
                    return  null;
            }
    }
    
}
