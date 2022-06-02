package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Bruno";
        funcionario.idade = 33;
        funcionario.salario = new double[] {3600, 4000, 5000};

        funcionario.imprimir();

        funcionario.imprimirMedia();

    }
}
