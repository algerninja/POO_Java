
package poo_java;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author PIMM
 */
public class control implements ActionListener {

    
    private Model mod;
    private view v00;

    public control(Model mod, view v00) {
        this.mod = mod;
        this.v00 = v00;
        
        this.v00.jbtn_ingresar.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == v00.jbtn_ingresar) {
            mod.setNombre(v00.txt_Nomb.getText().trim());
            mod.setApellido(v00.txt_Ape.getText().trim());
            mod.setCedula(v00.txt_Ced.getText().trim());
            
            v00.jlb_info.setText("Saludos "+mod.getNombre()+ " " +mod.getApellido());
        }
        
    }
    
    public void Iniciar() {
        v00.setTitle("POO_Java");
        v00.setLocationRelativeTo(null);
    }
    
    
    
}
