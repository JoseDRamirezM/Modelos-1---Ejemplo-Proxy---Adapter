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
public class Adapter implements Objeto {
    
    OtroObjeto o = new OtroObjeto();    
    @Override
    public String op() {
        return o.hacer();
    }
    
}
