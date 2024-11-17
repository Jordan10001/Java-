import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class soalbuyulia {
    public static void tulisFile(String jenis, int ukuran, char gambar) {
        try {
            FileWriter wr = new FileWriter("DataBangun.txt", true); //supaya nggak nge overwrite isi file yang lama
            wr.write(jenis + " " + ukuran + " " + gambar + "\n");
            wr.close();
        } catch(IOException e) {
            System.out.println("file gabisa dibuka");
        }
    }

    public static void simpan() {
        try {
            FileWriter wr = new FileWriter("TampilanBangun.txt");
            File obj = new File("DataBangun.txt");
            Scanner sc = new Scanner(obj);
            while(sc.hasNextLine()) {
                String bentuk = sc.next();
                //System.out.println(bentuk);
                int ukuran = sc.nextInt();
                char gambar = sc.next().charAt(0);
                //System.out.println(bentuk + " " + ukuran + " " + gambar);
                //int ukuran = 5;

                if(bentuk.equals("Garis")) {
                    for(int i=0; i<ukuran; i++) {
                        wr.write(gambar);
                        //System.out.print(gambar);
                    }
                    wr.write("\n");
                }

                else if(bentuk.equals("Persegi")) {
                    for(int i=0; i<ukuran; i++) {
                        for(int j=0; j<ukuran; j++) {
                            wr.write(gambar);
                        }
                        wr.write("\n");
                    }
                }

                else {
                    for(int i=1; i<=ukuran; i++) { //i buat baris
                        for(int j=1; j<=i; j++) { //baris ke-i, output karakter sebanyak i kali
                            wr.write(gambar);
                        }
                        wr.write("\n");
                    }
                }

                if(sc.hasNextLine()) wr.write("\n");
            }
            wr.close();
        } catch (IOException e) {
            System.out.println("error");
        }
    }

    public static void tampilkan(File f) {
        try {
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("error");
        }

    }

    public static void main(String[] args) {
        int pilihan;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("MENU");
            System.out.println("1. Input data bangun");
            System.out.println("2. Simpan bentuk bangun ke file lain");
            System.out.println("3. Tampilkan semua bangun");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    //input data bangun
                    try {
                        File data = new File("DataBangun.txt");
                        if(data.createNewFile()) {} //buat bikin file baru
                    } catch(IOException e) {
                        System.out.println("gagal input");
                    }
                    System.out.print("Jenis bangun: ");
                    String jenis = sc.nextLine();
                    System.out.print("Ukuran: ");
                    int ukuran = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Karakter gambar: ");
                    char gambar = sc.nextLine().charAt(0);
                    tulisFile(jenis, ukuran, gambar);
                    break;
                case 2:
                    //simpan bentuk ke file
                    try {
                        File tampilan = new File("TampilanBangun.txt");
                        if(tampilan.createNewFile()) {} //buat file baru
                        simpan();
                    } catch(IOException e) {
                        System.out.println("gagal nyimpen");
                    }
                    break;
                case 3:
                    //tampilkan semua
                    try {
                        File tampilan = new File("TampilanBangun.txt");
                        if(tampilan.createNewFile()) {}
                        tampilkan(tampilan);
                    } catch (IOException e) {
                        System.out.println("error");
                    }
                    break;
                case 4:
                    System.out.println("udah");
                    break;
                default:
                    System.out.println("pilih 1-4");
                    break;
            }
        } while(pilihan != 4);
    }
}
