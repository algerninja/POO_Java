package Ejer1;
/*
 * Isaias Manuel Pinto Martinez
 *          29671221
 * algerninjaxdd@gmail.com
 */
public class Principal {
    public static void main(String[] args) {
        Modelo00 mod = new Modelo00();
        Consultas modC = new Consultas();
        Vista00 V00 = new  Vista00();
        
        Controlador ctrl = new Controlador(mod, modC, V00);
        ctrl.Iniciar();
        V00.setVisible(true);
    }
}
