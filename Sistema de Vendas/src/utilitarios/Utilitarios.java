
package utilitarios;

import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

/**
 *
 * @author rodolpho
 */
public class Utilitarios {
   
    // criando metodo para limpar os campos te texto do painel
    public void LimpaTela(JPanel container){
        Component conponents[] = container.getComponents();
        for (Component component: conponents){
            
            if(component instanceof JTextField){
                
                ((JTextField)component).setText(null);
            }
        }
    }
}

   
