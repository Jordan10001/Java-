package pertemuan3;

public class pertemuan3ke2 {

        public static void main(String[] args) {
            boolean isHujan; // contoh flag
            boolean isDingin;
            isHujan = true;
            isDingin = true;

            // jika dingin pakai jaket << jalur bahagia
            // jika hujan dan dingin pakai jaket
            // jika panas dan hujan pakai payung

            if(isHujan){
                if(isDingin){
                    System.out.println("Pakai jaket");
                } else {
                    System.out.println("Pakai payung");
                }
            } else if (isDingin){
                System.out.println("Pakai jaket");
            }

            // bisa disederhanakan dengan logika
            if (isDingin){
                System.out.println("Pakai Jaket");
            } else if (isHujan) { // sudah pasti tidak dingin, tinggal cek hujan
                System.out.println("Pakai payung");
            }

        /*
         user input angka
         jika angka >= 10 dan genap output angka besar genap
         jika angka >= 10 dan ganjil output angka besar ganjil
         jika angka < 10 dan genap output angka kecil genap
         jika angka < 10 dan ganjil output angka kecil ganjil
         */
            int angka = 13;
            // nested if
            if (angka>=10){
                if (angka%2==0){
                    System.out.println("Angka besar genap");
                } else {
                    System.out.println("Angka besar ganjil");
                }
            } else {
                if (angka%2==0){
                    System.out.println("Angka kecil genap");
                } else {
                    System.out.println("Angka kecil ganjil");
                }
            }
            // sederhanakan dengan flag
            boolean isBesar=false, isGenap=false;
            if (angka >= 10) isBesar = true;
            if (angka%2==0) isGenap = true;
            // bentuk sederhana yang tidak nested
            if(isBesar && isGenap) {
                System.out.println("Angka besar genap");
            } else if (isBesar){ // ini sudah pasti ganjil
                System.out.println("Angka besar ganjil");
            } else if (isGenap){ // karena sudah pasti !isBesar
                System.out.println("Angka kecil genap");
            } else {
                System.out.println("Angka kecil ganjil");
            }

            int pilihan = 1;


        /* pura pura Menu:
            1. Hitung
            2. Exit
         */

            /*if(pilihan == 1){
                System.out.println("Masukkan angka: ");
                int angka1 = 12; // pura puranya disini input

                if (angka1< 10) {
                    System.out.println("Angka kecil");
                } else {
                    System.out.println("Angka besar");
                }
            }

             */
            // tidak bisa if(pilihan == 1 && angka < 10) karena angka belum ada
            // disini nested if tidak bisa disederhanakan
            // karena if yg dalam tergantung pada statement setelah if yg luar










        }

}
