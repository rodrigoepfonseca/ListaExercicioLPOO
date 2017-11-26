    /**
     *
     * @author PCRodrigo
     */
package exer1.model;
    public class Natal extends CartaoWeb{
        public Natal(String destinatario) {
            super(destinatario);
        }
        @Override
        public String retornarMensagem(String remetente) {
            String mensagem ="................, " + this.destinatario + "\n ............!\n"+ ".........." + remetente;
            return mensagem;
        }
    }

