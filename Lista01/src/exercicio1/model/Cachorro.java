/**
 *
* @author PCRodrigo
*/
package exercicio1.model;
public class Cachorro extends Animal {
    String nome;
    String raca;

    public Cachorro(String nome, String raca, String tipo, String cor) {
        super(tipo, cor);
        this.nome = nome;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Cachorro{" + "nome=" + nome + ", raca=" + raca + '}';
    }
    
    
}
