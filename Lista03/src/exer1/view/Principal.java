/**
 *
* @author PCRodrigo
*/
package exer1.view;
import exer1.model.Aniversario;
import exer1.model.CartaoWeb;
import exer1.model.DiaDosNamorados;
import exer1.model.Natal;
import javax.swing.JOptionPane;
public class Principal {
    static CartaoWeb[] cartoes;
    public static void main(String[] args) {
        cartoes = new CartaoWeb[3];
        DiaDosNamorados cartao1 = new DiaDosNamorados("teste!");
        cartoes [0] = cartao1;
        Natal cartao2 = new Natal("teste!");

	}

}