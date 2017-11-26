package exercicio1.model;
public class Cocker extends Cachorro {
    boolean tosa;

    public Cocker(boolean tosa, String nome, String raca, String tipo, String cor) {
        super(nome, raca, tipo, cor);
        this.tosa = tosa;
    }    
 
    
}
