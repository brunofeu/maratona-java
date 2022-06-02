package academy.devdojo.maratonajava.javacore.sobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.sobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

//        anime.setNome("dbz");
//        anime.setTipo("TV");
//        anime.setEpisodios(12);

        anime.init("dbz", "TV", 120);
//        anime.init("dbz", "TV", 120, "Ação");

        anime.imprime();
    }
}
