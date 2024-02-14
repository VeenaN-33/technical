// public class tues1 {
//     public static void main(String[] args) {
//         int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

//         // Convert array to matrix
//         int rows = array.length;
//         int columns = array[0].length;

//         // Print the matrix
//         // for (int i = 0; i < rows; i++) 
//             for (int j = 0; j < columns; j++) {
//                 System.out.print(array[i][j] + " ");
//             }
//             System.out.println();
//         }
// }
// }
public class tues1 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Get dimensions of the matrix
        int rows = matrix.length;
        int columns = matrix[0].length;

        // Transpose the matrix
        int[][] transposedMatrix = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        // Print the transposed matrix
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
}
}