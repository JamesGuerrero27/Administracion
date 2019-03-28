/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administracion;

import java.util.ArrayList;

/**
 *
 * @author Perla Solis
 */
public class Computadora {
    ArrayList <Usuario> usuario =  new ArrayList <>();
public void agregarUsuario (String username, boolean esAdmin){
    for (int i = 0; i < usuario.size(); i++){
        if(usuario.get(i).getUsername().equals(username)){
            System.out.println("Ya existe el usuario");
            return;
        }
    }
    if(esAdmin == true){
        Administrador admin = new Administrador (username);
        usuario.add(admin);    
    }
    else if (esAdmin == false){
         NoAdministrador noadmin = new NoAdministrador(username);
         usuario.add(noadmin);
         
        
         }   
    }
public Usuario obtenerUsuario (String username){
    for (int i = 0; i < usuario.size(); i++) {
        if(usuario.get(i).getUsername().equals(username))
        return usuario.get(i);
        System.out.println(usuario.get(i).getRol());
        
    }
return null;
}

}


