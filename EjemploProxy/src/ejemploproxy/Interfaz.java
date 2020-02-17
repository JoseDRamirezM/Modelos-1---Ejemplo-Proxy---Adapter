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
public class Interfaz {
    protected Proxy p;
    
    public Interfaz(Proxy p){
        this.p = p;
    }
    public String op(){
        return p.op();
    };
}
