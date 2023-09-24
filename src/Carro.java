public class Carro {
    public String nome;
    public String cor;
    public float peso;
    public int velocidade;

    private void movimentar(int velocidade) {
        System.out.println("O carro está se movimentando: " + velocidade + " km/h.");
    }

    public void frear(int tempo) {
        this.movimentar(99);
        System.out.println("O carro freou em " + tempo + " segundos.");
    }

}
