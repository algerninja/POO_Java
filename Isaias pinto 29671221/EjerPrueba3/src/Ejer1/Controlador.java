package Ejer1;
/*
 * Isaias Manuel Pinto Martinez
 *          29671221
 * algerninjaxdd@gmail.com
 */
import java.awt.event.*;
import javax.swing.*;
import AppPackage.AnimationClass;

public class Controlador implements ActionListener {

    private Modelo00 mod;
    private Consultas modC;
    private Vista00 V00;

    public Controlador(Modelo00 mod, Consultas modC, Vista00 V00) {
        this.mod = mod;
        this.modC = modC;
        this.V00 = V00;

        this.V00.jbtnStar.addActionListener(this);
        this.V00.jbtnMod.addActionListener(this);
        this.V00.jbtnDel.addActionListener(this);
        this.V00.jbtnBus.addActionListener(this);
        this.V00.jbtnExit.addActionListener(this);
        this.V00.jbtnAgg.addActionListener(this);
        this.V00.jbtnBack.addActionListener(this);
    }

    public void Iniciar() {
        V00.setTitle("Registro de trabajadores");
        V00.setLocationRelativeTo(null);
        V00.txtID.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == V00.jbtnAgg) {
            mod.setNombre(V00.txtNombre.getText().trim());
            mod.setApellido(V00.txtApellido.getText().trim());
            mod.setCedula(Integer.parseInt(V00.txtCedula.getText().trim()));
            mod.setEmpresa(V00.txtEmpresa.getText().trim());
            mod.setPTrabajo(V00.txtPTrabajo.getText().trim());
            mod.setTelefono(V00.txtTlf.getText().trim());
            mod.setCorreo(V00.txtCorreo.getText().trim());

            if (modC.Registrar(mod)) {
                JOptionPane.showMessageDialog(null, "Registro Exitoso");
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Registro Fallido");
                Limpiar();
            }
        }

        if (e.getSource() == V00.jbtnMod) {
            mod.setID(Integer.parseInt(V00.txtID.getText()));
            mod.setNombre(V00.txtNombre.getText().trim());
            mod.setApellido(V00.txtApellido.getText().trim());
            mod.setCedula(Integer.parseInt(V00.txtCedula.getText().trim()));
            mod.setEmpresa(V00.txtEmpresa.getText().trim());
            mod.setPTrabajo(V00.txtPTrabajo.getText().trim());
            mod.setTelefono(V00.txtTlf.getText().trim());
            mod.setCorreo(V00.txtCorreo.getText().trim());

            if (modC.Modificar(mod)) {
                JOptionPane.showMessageDialog(null, "Modificiacion Exitoso");
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Modificiacion Fallido");
                Limpiar();
            }
        }

        if (e.getSource() == V00.jbtnDel) {
            mod.setID(Integer.parseInt(V00.txtID.getText()));

            if (modC.Eliminar(mod)) {
                JOptionPane.showMessageDialog(null, "Eliminacion Exitoso");
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Eliminacion Fallido");
                Limpiar();
            }
        }

        if (e.getSource() == V00.jbtnBus) {
            mod.setCedula(Integer.parseInt(V00.txtBuscar.getText()));

            if (modC.Buscar(mod)) {
                V00.txtID.setText(String.valueOf(mod.getID()));
                V00.txtNombre.setText(mod.getNombre());
                V00.txtApellido.setText(mod.getApellido());
                V00.txtCedula.setText(String.valueOf(mod.getCedula()));
                V00.txtEmpresa.setText(mod.getEmpresa());
                V00.txtPTrabajo.setText(mod.getPTrabajo());
                V00.txtTlf.setText(String.valueOf(mod.getTelefono()));
                V00.txtCorreo.setText(mod.getCorreo());
            } else {
                JOptionPane.showMessageDialog(null, "Busqueda Fallido");
            }
        }

        if (e.getSource() == V00.jbtnExit) {
            int dialog = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "Desea salir?", "Salir", dialog);
            if (result == 0) {
                System.exit(0);
            }
        }

        if (e.getSource() == V00.jbtnStar) {
            //--------->

            //Menu
            AnimationClass Star = new AnimationClass();
            Star.jButtonXLeft(30, -140, 10, 5, V00.jbtnStar);

            AnimationClass Agg = new AnimationClass();
            Agg.jButtonXRight(-140, 30, 10, 5, V00.jbtnAgg);

            AnimationClass Bus = new AnimationClass();
            Bus.jButtonXRight(-140, 30, 10, 5, V00.jbtnBus);

            AnimationClass Mod = new AnimationClass();
            Mod.jButtonXRight(-140, 30, 10, 5, V00.jbtnMod);

            AnimationClass Del = new AnimationClass();
            Del.jButtonXRight(-140, 30, 10, 5, V00.jbtnDel);

            AnimationClass Back = new AnimationClass();
            Back.jButtonXLeft(-140, 30, 10, 5, V00.jbtnBack);
            //*-------------*--------------*//

        }

        if (e.getSource() == V00.jbtnBack) {
            //<---------
            //Menu
            AnimationClass Back = new AnimationClass();
            Back.jButtonXLeft(30, -140, 10, 5, V00.jbtnBack);

            AnimationClass Agg = new AnimationClass();
            Agg.jButtonXLeft(30, -140, 10, 5, V00.jbtnAgg);

            AnimationClass Bus = new AnimationClass();
            Bus.jButtonXLeft(30, -140, 10, 5, V00.jbtnBus);

            AnimationClass Mod = new AnimationClass();
            Mod.jButtonXLeft(30, -140, 10, 5, V00.jbtnMod);

            AnimationClass Del = new AnimationClass();
            Del.jButtonXLeft(30, -140, 10, 5, V00.jbtnDel);

            AnimationClass Star = new AnimationClass();
            Star.jButtonXRight(-140, 30, 10, 5, V00.jbtnStar);
            //*-------------*--------------*//
        }
    }

    public void Limpiar() {
        V00.txtNombre.setText(null);
        V00.txtApellido.setText(null);
        V00.txtCedula.setText(null);
        V00.txtEmpresa.setText(null);
        V00.txtPTrabajo.setText(null);
        V00.txtTlf.setText(null);
        V00.txtCorreo.setText(null);
        V00.txtBuscar.setText(null);
    }

}
