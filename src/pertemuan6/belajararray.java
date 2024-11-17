package pertemuan6;

public class belajararray {
    public static void main(String[] args) {

        int[] daftarnilai = new int[4];
        // array menyimpan 4 int
        // 0 1 2 3
        // nilai mahasiswa pertama di simpan di baris peratama baris 0
        daftarnilai[0]=90;
        daftarnilai[1]=75;
        daftarnilai[2]=55;
        daftarnilai[3]=80;
        // alternative
        String[] daftarnama = {"Joni","Jono","Mulyono","Wati"};

        for (int i = 0; i <=3 ; i++) {
            System.out.printf("Nilai mhs %s = %d \n",daftarnama[i],daftarnilai[i]);
        }
        //menggunakan Foreach loop
        for (String nama : daftarnama) {
            System.out.println("Foraech loop");
            System.out.println(nama);
        }

        int jumlah=0;
        for (int nilai:daftarnilai) {
            jumlah= jumlah+nilai;
        }
        double ratarata = jumlah/daftarnilai.length;
        System.out.println("Rata rata nilai : "+ratarata);
    }
}
