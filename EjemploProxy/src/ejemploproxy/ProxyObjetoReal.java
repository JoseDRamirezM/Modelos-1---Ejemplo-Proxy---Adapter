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
public class ProxyObjetoReal implements Proxy {

    @Override
    public String op() {
        ObjetoReal r = new ObjetoReal();
        return r.op() + " Ejecutado";
    }
    
}
