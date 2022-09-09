public class Piramida2 {
   public static void main(String args[]) {
        int[] nim = { 2, 1, 4, 1, 7, 6, 2, 1, 3, 9};
        int index = 0;
        for (int i : nim) {
            index = index + i;
        }
        System.out.println("Jumlah Dari Semua Elemen Array Adalah :" + index);
    }
}