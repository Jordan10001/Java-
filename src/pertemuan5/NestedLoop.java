package pertemuan5;

public class NestedLoop {
    public static void main(String[] args) {

        /*
        // Nested loop basic
        for(int i = 1; i<=5;i++){
            //Outer loop
            System.out.println("Loop luar: " + i);
            for(int j = 1; j<=3;j++){
                //Inner loop
                System.out.println("Loop dalam: " + j);

            }
        }

        // nested loop for didalam while

        Scanner myInput = new Scanner(System.in);
        int pilihan=0;
        while(pilihan!=1){
            System.out.println("Loop luar");
            for(int i=1; i<=3;i++){
                System.out.println("Loop dalam");
            }
            System.out.print("Tekan 1 untuk keluar");
            pilihan=myInput.nextInt();
        }

         */

        // Nested loop
        // dimana inner loop tergantung dari outer loop
        /*
         *
         **
         ***
         ****
         *****
         */
        int angka = 5;
        for (int i =1; i<= angka; i++){
            for (int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        /*
        misal angka = 5 hasilnya:
        *****
        ****
        ***
        **
        *
        12345
        1234
        123
        12
        1

        54321
        5432
        543
        54
        5


         */

        for (int i =1; i<= angka; i++){
            for (int j = 5; j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i =1; i<= angka; i++){
            for (int j = 1; j<=angka -(i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // continue
        for(int i=1; i<=9;i++){
            System.out.println("Baris ke: " + i);
            if(i==5) continue; //saat baris ke 5 dia skip cetak angka

            for(int j=1;j<=9;j++){
                if(j%2==0) continue;
                // ketika j genap
                // langsung ke iterasi berikutnya
                // tanpa print j
                System.out.print(j);
                if(j==5) break; // waktu J nya 5 dia break dari loop
            }
            System.out.println();
        }

    }
}
