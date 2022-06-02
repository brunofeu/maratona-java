package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
        calculadora.multiplicaDoisNumeros(10, 2);

        double resultado = calculadora.divideDoisNumeros(20, 0);
        System.out.println(resultado);

        calculadora.somaVarArgs(1,2,3,4,5,6);
    }
}
