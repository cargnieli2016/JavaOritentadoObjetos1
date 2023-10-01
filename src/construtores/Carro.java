package construtores;

public class Carro {
    public String nome;
    public String cor;
    public float peso;
    public int velocidade;

    public Carro(int velocidade, int tempo) {
        this.movimentar(velocidade);
        this.frear(tempo);

    }

    public void movimentar(int velocidade) {
        System.out.println("O carro está se movimentando com a velocidade " + velocidade + " km/h.");
    }

    public void frear(int tempo) {
        System.out.println("O carro freou em " + tempo + " segundos.");
    }

}
