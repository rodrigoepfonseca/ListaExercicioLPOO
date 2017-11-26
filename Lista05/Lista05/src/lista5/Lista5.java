    package lista5;
    /**
     *
     * @author PCRodrigo
     */
    //código foi depurado sem a linha 15 para teste e a linha 18 não foi impressa na tela, caso contrário séra impresso normalmente
    public class Lista5 {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {

        try {
          int[] vetor = new int[4];
                  System.out.printf("antes do exception\n");
                  vetor [4] = 1 ;
                  System.out.printf("sera impresso\n");
        } catch (ArrayIndexOutOfBoundsException exception) {
          System.out.print("exception de erro ao acessar algo que não existe no vetor\n");
        } 
         finally  {
          System.out.print("Esse texto séra impresso na tela\n");
        }
        }

    }