package academy.devdojo.maratonajava.introducao;

public class ArraysMultidimensionais {
    public static void main(String[] args) {
        int[][] dias = new int[12][3];

        for(int[] arrBase: dias){
            for(int num: arrBase){
                System.out.println(num);
            }
        }
    }
}
