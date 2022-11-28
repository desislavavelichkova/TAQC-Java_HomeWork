import java.util.Arrays;

public class Task_6 {
    public static void main(String[] args) {
        //6.Change the sequence of columns of the matrix so that
        // the elements of its first row are sorted in ascending order.
        System.out.println("Input:");
        int[][] mtrx =
                {{70, 67, 31}, {10, 90, 56}, {23, 78, 97}};

        //Sort first row
        int[] temp = new int[mtrx.length];
        int k = 0;
        // display matrix using for loop
        for (int i = 0; i < mtrx.length; i++) {
            for (int j = 0; j < mtrx[i].length; j++) {
                System.out.print(mtrx[i][j] + " ");
                if (i == 0){
                    temp[k] = mtrx[i][j];
                    k++;
                }
            }
            System.out.println(); // new line
        }
        // Sort temp array.
        Arrays.sort(temp);

        // Insert first row in to the matrix.
        for (int i = 0; i < mtrx.length; i++){
            for (int j = 0; j < mtrx.length; j++){
                if (i == 0){
                    mtrx[i][j] = temp[j];
                }
            }
        }
        //display sorted matrix.
        System.out.println();
        System.out.println("Result:");
        for (int i = 0; i < mtrx.length; i++) {
            for (int j = 0; j < mtrx[i].length; j++) {
                System.out.print(mtrx[i][j] + " ");
            }
            System.out.println();
        }
    }
}
