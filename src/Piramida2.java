public class Piramida2 {
   public static void main(String args[]) {
        int[] nim = { 2, 1, 4, 1, 7, 6, 2, 1, 3, 9};
        int index = 0;
        System.out.println("Nim : 2141762139");
        for (int i : nim) {
            index = index + i;
        }
        System.out.println("total elemen array :" + index);
    }
}