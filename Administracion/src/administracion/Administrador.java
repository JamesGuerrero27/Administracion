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
public class Administrador extends Usuario {

    public Administrador(String username) {
        super(username, TipoUsuario.ADMINISTRADOR);
      
    }

    @Override
    public void imprimirInformacion() {
        System.out.println("Usuario :" + this.getUsername() + " es: " + this.getRol());
    }
    
}
