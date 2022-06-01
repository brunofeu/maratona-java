package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Luffy";
        estudante01.sexo = 'M';
        estudante01.idade = 21;

        estudante02.nome = "Sakura";
        estudante02.sexo = 'F';
        estudante02.idade = 16;

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
    }
}
