package pertemuan7;

public class belajarsearchingandshorting {
    public static int linearsearch(int [] array, int yangdicari){
        int hasil=-1;
        for (int i = 0; i <array.length ; i++) {
            if (yangdicari==array[i])
                hasil = i;
        }
        return hasil;
    }

    public static void bublesort(int[] array){
        for (int i = 0; i <array.length -1 ; i++) {
            for (int j = 0; j <array.length-i -1; j++) {
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
    // Selection

    public static void main(String[] args) {
        int[]daftarangka ={2,5,1,2,6,4};
        System.out.println(linearsearch(daftarangka,12));
        System.out.println(linearsearch(daftarangka,5));
        System.out.println("--------------------------------------------------------");
        bublesort(daftarangka);
        for (int i : daftarangka){
            System.out.println(i);
        }
    }
}
