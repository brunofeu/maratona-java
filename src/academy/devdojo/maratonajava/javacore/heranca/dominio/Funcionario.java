package academy.devdojo.maratonajava.javacore.heranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;

    public Funcionario(String nome) {
        super(nome);
    }

    public void imprime() { //sobreescrita de metodos
        super.imprime(); //puxa da classe pai e adiciona o que vem abaixo
        System.out.println(this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
