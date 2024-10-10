package Template;

public class bublesort {
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
    public static void main(String[] args) {
        int[]daftarangka ={2,5,1,2,6,4};
        bublesort(daftarangka);
        for (int i : daftarangka){
            System.out.println(i);
        }
    }
}

// 1  2  3  4  5