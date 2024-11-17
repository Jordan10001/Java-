import java.util.ArrayList;

public class blajar_bro {
    public static void main(String[] args) {


    }

    public static void bublesort (ArrayList<Integer> aar){
        int n = aar.size();

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n-1 ; j++) {
                if (aar.get(j) > aar.get(j+1)){
                    int temp = aar.get(j);
                    aar.set(j,aar.get(j+1));
                    aar.set(j+1,temp);
                }
            }
        }
    }

    public static void bublesort (int [] aar){
        int n =aar.length;

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n-1 ; j++) {
                if (aar[j] > aar[j+1]){
                    int temp = aar[j];
                    aar[j] = aar[j+1];
                    aar[j+1] = temp;
                }
            }
        }
    }
}
