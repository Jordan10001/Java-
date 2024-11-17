public class remove_elemet {


    // detek buat habis di remove itu urut gk
    public static boolean detektorUrut(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int[] hasilTest = removeElement(i, array);
            if (isNaik(hasilTest)) return true;
        }return false;
    }

    public static int [] removeElement(int index, int[] array){
        /*buat array baru (hasil), panjangnya array -1
        x = 0
        buat loop i = sepanjang array

        jika i!= index
        pindah isinya ke hasil index ke x
        x++
        return hasil */
        int[] hasil = new int[array.length-1];
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            if(i!= index){
                hasil[x] = array[i];
                x++;
            }
        } return hasil;
    }

    //buat deteksi naik enggak
    public static boolean isNaik (int[] array){
        boolean hasil = true;
        for (int i = 1; i < array.length; i++) {
            if(array[i]<=array[i-1]){
                hasil = false;
            }

        }return hasil;
    }
    public static void main(String[] args) {
        int[] testing = {1,3,10,7,8};
        int[] testing2 = {2,3,1,2};

        System.out.println(detektorUrut(testing));
        System.out.println(detektorUrut(testing2));

    }
}
