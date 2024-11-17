import java.util.Scanner;

public class LatihanUTSno2 {
    /*Dalam sebuah kelas terdapat 5 kelompok:
    Kelompok 1: Amanda Leonard, Peggy Vasquez, Broderick Bridges
    Kelompok 2: Deana Keith, Nita Huffman, Long Cohen
    Kelompok 3: Eloy Morris, Chad Larsen, Lilly Logan, Silvia Baxter
    Kelompok 4: Therese Miranda, Efrain Burns, Janna Carney
    Kelompok 5: Vance Conley, Noble Daniel, Jerrell Odonnell, Janette Murillo
    Buatlah sebuah array string 2D yang berisi data nama-nama anggota kelompok diatas! (Satu kelompok menjadi
    satu baris)Lalu buatlah method yang dapat mencari nama yang diinputkan (huruf besar kecil tidak masalah) lalu
    menampilkan nama-nama seluruh anggota kelompoknya!
     */
    public static void cariNama(String[][] kelompok, String nama) {
        for (int i = 0; i <kelompok.length ; i++) {
            for (int j = 0; j <kelompok[i].length ; j++) {
                if (kelompok[i][j].equalsIgnoreCase(nama)){
                    for(String angota : kelompok[i]){
                        System.out.println(angota);
                    }
                }
            }
        }
        System.out.println("Nama tidak ditemukan");
    }
    public static void main(String[] args) {
        String[][] kelompok = {
                {"Amanda Leonard", "Peggy Vasquez", "Broderick Bridges"},
                {"Deana Keith", "Nita Huffman", "Long Cohen"},
                {"Eloy Morris", "Chad Larsen", "Lilly Logan", "Silvia Baxter"},
                {"Therese Miranda", "Efrain Burns", "Janna Carney"},
                {"Vance Conley", "Noble Daniel", "Jerrell Odonnell", "Janette Murillo"}
        };
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan nama yang ingin dicari: ");
        String nama = in.nextLine();
        cariNama(kelompok, nama);
    }
}
