package pertemuan8;

public class MatrixOperation {
    //Print matrix
    public static void printmatrix(int [][] array){
        for (int[]baris:array){
            for (int angka : baris){
                System.out.print(angka+" ");
            }
            System.out.println();
        }
    }

    // penjumlahan matrix
    // jumlahkan 2 matrix yang berukuran sama
    // 1 2 + 5 6 = 1+5 2+6
    // 3 4   7 8   3+7 4+8
    // yang dihasilkan adalah array 2d
    // yang diterima adalah 2 buah array 2d
    public static int [][] jumlahmatrix(int[][]array1, int[][]array2){
        int baris = array1.length;
        int kolom = array1[0].length;
        int [][] hasil = new int[baris][kolom];

        for (int i = 0; i <baris ; i++) {
            for (int j = 0; j <kolom ; j++) {
                hasil[i][j] = array1[i][j]+array2[i][j];
            }
        }
        return hasil;
    }


    // perkalian matrix
    // input berupa 2 array2d
    // asumsi jumlah kolom array 1 = jumlah baris array 2
    // hasilnya berupa array 2d
    // ukurannya baris = jumlah baris array1
    // kolom = jumlah kolom array2
    public static int [][] kalikanmatrix(int [][] array1, int [][] array2){
        int baris1 = array1.length;
        int kolom1 = array1[0].length;
        int baris2 = array2.length;
        int kolom2 = array2[0].length;
        int[][] hasil = new int [baris1][kolom2];
        // proses perkalian
        // a b *  e f = ae+bg  af+bh   x(i=0)   ->  j=0  j=1
        // c d    g h = ce+dg  cf+dh   y(i=0)   ->  j=0  j=1
        for (int i = 0; i <baris1 ; i++) {
            for (int j = 0; j <kolom2 ; j++) {
                for (int k = 0; k <kolom1 ; k++) {
                    hasil[i][j] += array1[i][k]*array2[k][j];
                }
            }
        }
        return hasil;
    }

    // subtotsl(sum)
    //  contoh   1 2  x
    //           3 4  y
    // sum total 4 6  z
    //mudah tapi tidak terbiasa loop dari kolom
    // hasil subtotal berupa array int

    public static int[] subtotal(int [][] array){
        int baris =array.length;
        int kolom =array[0].length;
        int[] hasil = new int [kolom];
        for (int i = 0; i <kolom ; i++) {
            for (int j = 0; j <baris ; j++) {
                hasil[i] += array[j][i]; // jumlahkan setiap baris di kolom i
            }
        }
        return hasil;
    }

    public static void main(String[] args) {
        int [][] matrix1={
                {1,2,3},
                {4,5,6}
        };
        int [][] matrix2={
                {11,12,13},
                {14,15,16}
        };
        printmatrix(matrix1);

        if ((matrix1.length==matrix2.length)&& (matrix1[0].length==matrix2[0].length)){
            int[][]matrix3 = jumlahmatrix(matrix1,matrix2);
            System.out.println("hasil penjumlahan : ");
            printmatrix(matrix3);
        }

        int[][] matrix4 = {
                {1,2,3},
                {4,5,6}
        };
        int [][] matrix5 ={
                {7,8},
                {9,10},
                {11,12}
        };

        System.out.println("Matrix 4");
        printmatrix(matrix4);
        System.out.println("Matrix 5");
        printmatrix(matrix5);
        System.out.println("Hasil kali matrix");
        printmatrix(kalikanmatrix(matrix4,matrix5));
    }
}
