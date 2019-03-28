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
public abstract class Usuario {
    private String username;
    private TipoUsuario rol;
    ArrayList <Programa> programa = new ArrayList <>();

    public Usuario(String username, TipoUsuario rol) {
        this.username = username;
        this.rol = rol;
         
}

    public String getUsername() {
        return username;
    }

    public TipoUsuario getRol() {
        return rol;
    }

    public ArrayList<Programa> getPrograma() {
        return programa;
    }
    
    public abstract void imprimirInformacion();
    
    public void agregarPrograma (String nombre, TipoUsuario rolNecesario){
        Programa progra =  new Programa(nombre, rolNecesario);
        programa.add(progra);
    }
    public void ejecutarPrograma(int pos){
        programa.get(pos).ejecutar(rol);
    }
}


