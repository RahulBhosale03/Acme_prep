package Advanced_Pattern;
//          1
//         1 2 3
//       1 2 3 4 5
//     1 2 3 4 5 6 7
public class Pattern03 {
    public static void main(String[] args) {

        int n = 4;

        for (int i = 0; i < n; i++) {

            // spaces
            for (int j = 0; j < n - i -1; j++) {
                System.out.print(" ");
            }

            int start = 1; // reset for every row

            // numbers
            for (int j = 0; j < 2 * i +1 ; j++) {
                System.out.print(start + " ");
                start++;
            }

            System.out.println();
        }
    }
}
