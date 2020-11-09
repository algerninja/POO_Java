/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_java;

/**
 *
 * @author PIMM
 */
public class POO_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Model mod = new Model();
        view vis = new view();
        
        control ctrl = new control(mod, vis);
        ctrl.Iniciar();
        vis.setVisible(true);
                
    }
    
}
