/**
 *
* @author PCRodrigo
*/
package exer1.model;
public class DiaDosNamorados extends CartaoWeb{
    public DiaDosNamorados(String destinatario) {
        super(destinatario);
    }
    @Override
    public String retornarMensagem(String remetente) {
        String mensagem = "teste, " + this.destinatario + "\n teste\n"+ "teste" + remetente;
        return mensagem;
    }
}
