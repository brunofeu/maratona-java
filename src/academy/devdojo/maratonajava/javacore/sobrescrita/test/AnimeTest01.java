package academy.devdojo.maratonajava.javacore.sobrescrita.test;

import academy.devdojo.maratonajava.javacore.sobrescrita.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Stone");

        //sobrescrita de toString
        System.out.println(anime.toString());
    }
}
