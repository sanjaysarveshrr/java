//package Practice;
//
//import java.util.*;
//
//public int[][] diagonalSort(int[][] mat) {
//    int m = mat.length;    // Number of rows
//    int n = mat[0].length; // Number of columns
//    int []ar=new int[n];
//    for(int i=0;i<m;i++){
//        for(int j=i;j<n;j++){
//
//        }
//
//}
//
//public class MatrixDiagonalSorter {
//    // Helper method to print the matrix
//    public static void printMatrix(int[][] mat) {
//        for (int[] row : mat) {
//            System.out.println(Arrays.toString(row));
//        }
//    }
//    public static void main(String[] args) {
//        MatrixDiagonalSorter sorter = new MatrixDiagonalSorter();
//
//        // Test Case 1
//        int[][] mat1 = {
//                {3, 3, 1, 1},
//                {2, 2, 1, 2},
//                {1, 1, 1, 2}
//        };
//        System.out.println("Original Matrix 1:");
//        printMatrix(mat1);
//        int[][] sortedMat1 = sorter.diagonalSort(mat1);
//        System.out.println("Sorted Matrix 1:");
//        printMatrix(sortedMat1);
//
//        // Test Case 2
//        int[][] mat2 = {
//                {11, 25, 66, 1, 69, 7},
//                {23, 55, 17, 45, 15, 52},
//                {75, 31, 36, 44, 58, 8},
//                {22, 27, 33, 25, 68, 4},
//                {84, 28, 14, 11, 5, 50}
//        };
//        System.out.println("Original Matrix 2:");
//        printMatrix(mat2);
//        int[][] sortedMat2 = sorter.diagonalSort(mat2);
//        System.out.println("Sorted Matrix 2:");
//        printMatrix(sortedMat2);
//    }
//}
//}
