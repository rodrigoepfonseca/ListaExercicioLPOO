/**
 *
* @author PCRodrigo
*/
package exercicio1.view;
import exercicio1.model.Cocker;
import javax.swing.JOptionPane;
public class CockerTeste {
    public static void main(String[] args) {
        int opcao;
        boolean tosa = false;
        
        String cor = JOptionPane.showInputDialog("cor?");
        String tipo = JOptionPane.showInputDialog ("tipo?");
        String nome = JOptionPane.showInputDialog("nome?");
        String raca = JOptionPane.showInputDialog(" raça?");
        opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - tosar \n 2 - Não  tosar"));
        switch (opcao) {
            case 1:
                tosa = true;
                break;
            case 2:
                tosa = false;
                break;
        }
        Cocker teste = new Cocker (tosa, cor, tipo, nome, raca);
        
    }
    
}