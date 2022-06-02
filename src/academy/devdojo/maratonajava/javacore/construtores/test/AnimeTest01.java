package academy.devdojo.maratonajava.javacore.construtores.test;


import academy.devdojo.maratonajava.javacore.construtores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto",  "TV", 120, "ação");

//        anime.setNome("dbz");
//        anime.setTipo("TV");
//        anime.setEpisodios(12);

//        anime.init("dbz", "TV", 120, "Ação");

        anime.imprime();
    }
}
