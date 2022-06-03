package academy.devdojo.maratonajava.javacore.heranca.test;

import academy.devdojo.maratonajava.javacore.heranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.heranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Bruno");
//        pessoa.setNome("Bruno");
        pessoa.setCpf("11111111111");
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Santos");
//        funcionario.setNome("Santos");
        funcionario.setCpf("222222222222");
        funcionario.setSalario(2000000);

        funcionario.imprime();

    }
}
