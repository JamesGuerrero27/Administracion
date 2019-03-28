/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administracion;

/**
 *
 * @author Perla Solis
 */
public class Programa implements IEjecutable{
    private String nombre;
    private TipoUsuario rolNecesario;

    public Programa(String nombre, TipoUsuario RolNecesario) {
        this.nombre = nombre;
        this.rolNecesario = RolNecesario;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoUsuario getrolNecesario() {
        return rolNecesario;
    }

    @Override
    public void ejecutar(TipoUsuario rolUsuario) {
        if(rolUsuario == rolNecesario){
        System.out.println("Ejecutando: " + this.getNombre());    
        }
        else { 
            System.out.println("No tiene los privilegios necesarios");
            
        }
    }
    
}

