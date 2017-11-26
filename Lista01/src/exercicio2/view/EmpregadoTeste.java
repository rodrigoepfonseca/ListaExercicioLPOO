/**
 *
* @author PCRodrigo
*/
package exercicio2.view;
import exercicio2.model.Empregado;
import javax.swing.JOptionPane;

public class EmpregadoTeste {
    public static void main(String[] args) {     
        
        String nome = JOptionPane.showInputDialog ("Qual o nome:");
        String sexo = JOptionPane.showInputDialog ("Qual o sexo: ");
	int idade = Integer.parseInt (JOptionPane.showInputDialog ("Qual a idade: "));

    }  
}

