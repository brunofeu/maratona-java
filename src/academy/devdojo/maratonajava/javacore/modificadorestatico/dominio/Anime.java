package academy.devdojo.maratonajava.javacore.modificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    //bloco de inicialização estático ocorre apenas uma vez
    // bloco não estático ocorre todas as vezes que a classe é instanciada

    static { // este bloco de inicialização ocorre antes do construtor
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++){
            episodios[i] = i+1;
            System.out.print(episodios[i]+" ");
        }
        System.out.println();
    }

    public Anime(String nome) {
        this.nome = nome;
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

}
