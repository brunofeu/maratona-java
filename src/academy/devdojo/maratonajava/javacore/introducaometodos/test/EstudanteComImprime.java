package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Estudante;

public class EstudanteComImprime {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Luffy";
        estudante01.sexo = 'M';
        estudante01.idade = 21;
        estudante01.imprime();

        estudante02.nome = "Sakura";
        estudante02.sexo = 'F';
        estudante02.idade = 16;
        estudante02.imprime();

    }
}
