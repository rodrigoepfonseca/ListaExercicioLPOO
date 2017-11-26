/**
 *
* @author PCRodrigo
*/
package exer1.model;
public class Aniversario extends CartaoWeb{
    public Aniversario(String destinatario) {
	super(destinatario);
    }
    @Override
    public String retornarMensagem(String remetente) {
        String mensagem = "teste, " + this.destinatario+ "\n teste\n"+ "teste" + remetente;
        return mensagem;
    }
}