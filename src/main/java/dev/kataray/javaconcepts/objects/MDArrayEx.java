package dev.kataray.javaconcepts.objects;

public class MDArrayEx {

    public static void main(String[] args) {
        int array1[][]= {{1,2,3},{4,5,6}};
        int array2[][] = {{1,2},{3},{4,5,},{6}};
        System.out.println( "Values in array1 by row are" );
        outputArray( array1 );

        System.out.println( "\nValues in array2 by row are" );
        outputArray( array2 );

    }

    private static void outputArray(int[][] array2) {
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
    }


}

