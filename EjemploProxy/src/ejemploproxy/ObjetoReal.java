package ejemploproxy;


import ejemploproxy.Objeto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class ObjetoReal implements Objeto{

    @Override
    public String op() {
        return "Operacion objeto real";
    }
    
}
