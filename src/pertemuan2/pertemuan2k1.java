package pertemuan2;

public class pertemuan2k1 {
    public static void main(String[] args) {
        double angkadesimal = 78912.345678;
        int angkabulat = 7;
        String kalimat = "Halo apa kabar";
        System.out.println("Kalimatnya "+ kalimat + " angka desimalnya " + angkadesimal + " angkabulatnya adalah " +
                angkabulat);

        System.out.printf("Kalimatnya %S angka desimalnya = %f angka bulatnya = %d" +
                "\n",kalimat,angkadesimal,angkabulat);
        System.out.printf("angka desimal = %,.2f\n",angkadesimal);
        double angkadesimal2 = 18.837238;
        System.out.printf("angka desimal = %,9.2f\n",angkadesimal2);
        System.out.printf("angka desimal 2 = %,15.2f\n",angkadesimal2);
    }
}


