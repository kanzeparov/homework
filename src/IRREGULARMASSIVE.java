import java.util.Arrays;

public class IRREGULARMASSIVE {
    public static void main(String[] args) {
        int[][] table = new int[3][];
        table[0] = new int[1];
        table[1] = new int[5];
        table[2] = new int[3];
        for(int i = 0; i < table.length; i++) {
            for(int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }

        int[] arr = {1342,4234,3244};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(table));
        System.out.println(Arrays.deepToString(table));
    }
}
