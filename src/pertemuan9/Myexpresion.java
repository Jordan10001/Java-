package pertemuan9;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Myexpresion {
    /*
    public static void main(String[] args) {
        int angka1 =10, angka2=0;
        Scanner in = new Scanner(System.in);
        try{
            angka1= in.nextInt();
            if (angka1<0 || angka1>100)
                throw new ArithmeticException("Angka harus dr 0-100");
            angka2= in.nextInt();


            int hasil = angka1/angka2;
            System.out.println(hasil);
        }catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
            System.out.println("Pembagian dengan noll");
        }catch (InputMismatchException ex){
            System.out.println(ex.getMessage());
        }catch (RuntimeException ex){//pwerfulll yang utama
            System.out.println(ex.getMessage());
        }finally {
            System.out.println("Finaly");
        }

        System.out.println("=========================================");




        System.out.println("Akhir program");

    }

     */
}

class myfile{
    /*
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter("/home/mobdev/IdeaProjects/c14240117/UTS/mhs.txt");
        writer.println("Adi 100");
        String nama = "budi";
        int nilai = 80;
        writer.println(nama+""+nilai);
        writer.close();
    }

     */



    public static void main(String[] args)  {
        try{
            FileWriter fwriter = new FileWriter("mhs.txt",true);
            PrintWriter writer = new PrintWriter(fwriter);
            writer.println("Adi 100");
            String nama = "budi";
            int nilai = 80;
            writer.println(nama+" "+nilai);
            writer.close();
        }catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }




}

/*
class Readfile{
    public static void main(String[] args) {
        try {
            File file = new File("mhs.txt");
            Scanner in = new Scanner(file);
            while (in.hasNext()){
                System.out.print(in.next()+" ");
                System.out.println(in.nextDouble());
            }
            in.close();
        }catch (IOException | InputMismatchException ex){
            System.out.println(ex.getMessage());
        }
    }
}


 */


