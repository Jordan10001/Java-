package pertemuan4n5;

public class latihanFor {
    /*
    A jailer has a large number of prisoners to guard and has to seat them at a number of tables at mealtimes. The regulations
    state the following seating arrangements:
    l. Each table is to seat the same number of prisoners.
    2. The number at each table is to be an odd number.
       The jailer finds that when he seats the prisoners:

    3 per table, he has 2 prisoners left over;
    5 per table, he has 4 prisoners left over;
    7 per table, he has 6 prisoners left over,
    9 per table, he has 8 prisoners left over;
    but when he seats them II per table there are none left over.
     */

    public static void main(String[] args) {
        for (int i=1; i<=10000; i++){
            int hasil= i*11;
            if (hasil%3==2 && hasil%5==4 && hasil%7==6 && hasil%9==8 ){
                System.out.println(hasil);
            }


        }
    }



}
