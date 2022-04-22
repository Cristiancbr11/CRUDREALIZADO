
package sistema;

import sistema.empleadosBL.empleadosBL;
import sistema.empleadosGUI.frmEmpleados;

/**
 * Se implementa la clase sistema
 * @author Daniel
 */
public class Sistema {

    /**
     * Argumentos generados a la clase principal por parte de netbeans
     * @param args the command 
     */
    public static void main(String[] args) {
        empleadosBL EM=new empleadosBL();
        frmEmpleados E=new frmEmpleados();
        E.setVisible(true);
    }
    
}
