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
public class Administracion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computadora compu =  new Computadora();

        compu.agregarUsuario("cvarela", true);

        compu.agregarUsuario("keilin", false);

        Usuario u = compu.obtenerUsuario("cvarela");

        Usuario u2 = compu.obtenerUsuario("keilin");

        u.agregarPrograma("word", TipoUsuario.ADMINISTRADOR);

        u.agregarPrograma("excel", TipoUsuario.NOADMINISTRADOR);

        u.imprimirInformacion();

        u.ejecutarPrograma(0);

        u.ejecutarPrograma(1);

        

        u2.agregarPrograma("calc", TipoUsuario.ADMINISTRADOR);

        u2.ejecutarPrograma(0);

 
    }
    
}
