package academy.devdojo.maratonajava.javacore.modificadorestatico.dominio;

public class Carro {
    private String nome;
    private double valocidadeMaxima;
    private static double velocidadeLimite = 250;
    //por ser static, é um atributo da classe carro, e não mais de cada elemento
    //se for alterado no código c1.velocidadeMaxima, todos os carros seguintes instanciados
    //terão o novo valor de velocidadeMaxima

    public Carro(String nome, double valocidadeMaxima) {
        this.nome = nome;
        this.valocidadeMaxima = valocidadeMaxima;
    }

    public void imprime(){
        System.out.println("--------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade máxima: " + this.valocidadeMaxima);
        System.out.println("Velocidade limite: " + Carro.velocidadeLimite);
    }

    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite(){
        return velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValocidadeMaxima() {
        return valocidadeMaxima;
    }

    public void setValocidadeMaxima(double valocidadeMaxima) {
        this.valocidadeMaxima = valocidadeMaxima;
    }
}
