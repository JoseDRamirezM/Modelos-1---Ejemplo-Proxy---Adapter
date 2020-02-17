/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploproxy;

/**
 *
 * @author USUARIO
 */
public class EjemploProxy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProxyObjetoReal objR = new ProxyObjetoReal();
        ProxyOtroObjeto oObj = new ProxyOtroObjeto();
        
        Interfaz i1 = new Interfaz(objR);
        System.out.println(i1.op());
        
        i1 = new Interfaz(oObj);
        System.out.println(i1.op());
        
        
    }
    
}
