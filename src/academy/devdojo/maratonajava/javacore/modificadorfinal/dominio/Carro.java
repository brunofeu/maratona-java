package academy.devdojo.maratonajava.javacore.modificadorfinal.dominio;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    // quando substituido por "final" o valor não pode mais ser alterado

    private final Comprador COMPRADOR = new Comprador();
    // o COMPRADOR fica limitado a apenas uma instancia
    // pode ser utilizado para abrir conexão com o banco de dados.
    // não é necessário cada novo usuário inscanticar uma nova classe
    // singleton pattern


}
