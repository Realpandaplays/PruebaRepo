package Principal;
import Vistas.menuPrincipal;
import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
/**
 *
 * @author Laura Pineda
 */



/**Pruebas de como crear ramas en github**/
public class Inicio {

    public static void main(String[] args) {
        menuPrincipal menu = new menuPrincipal();
        JFrame mainWindow = new JFrame("Menu Sample");
        mainWindow.setLayout(new BorderLayout());
        mainWindow.add(menu);
        mainWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainWindow.setLocationRelativeTo(null);
        mainWindow.setVisible(true);
        mainWindow.pack();
    }
    
    

    
}
