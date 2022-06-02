package academy.devdojo.maratonajava.javacore.introducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double sal: this.salario){
            System.out.println(sal);
        }
    }

    public void imprimirMedia() {
        double media = 0;
        for (double sal: salario){
            media += sal;
        }
        media /= salario.length;
        System.out.println("media: " + media);
    }
}
