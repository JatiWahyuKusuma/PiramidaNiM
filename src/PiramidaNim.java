
public class PiramidaNim {
    public static void main(String[] args) throws Exception {
        System.out.println("Nim : 2141762139");
        int[] nim = {2, 1, 4, 1, 7, 6, 2, 1, 3, 9 };
        int h = 0, i = 5, j = 1;
        while (j <= i) {
        int a = i, b = 1;
        while (a > j) {
        System.out.print(" ");
        j--;
        }
        while (b <= j) {
            if (h > 9) {
                System.out.print(" ");
                    } else {
                        System.out.print(nim[h] + " ");
                        h = h + 1;
                    }
        b++;
        }
        System.out.println();
        j++;
        }
    }
}
