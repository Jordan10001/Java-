package Template;

import java.util.ArrayList;

public class array2dlist {
    public static void main(String[] args) {
        //Array 2d
        int [][] arr2d = new int[2][2]; //row 2 column 2

        //Arraylist
        ArrayList<ArrayList<Integer>> arraylist2d= new ArrayList<>();
        //row dan column dinamis

        // [1, 2, 3, 4] --> 1d
        // [ [1,2,3], [4,5,6], [7,8,9,10] ] --> 2d
        int x = 1;
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                arr2d[i][j] = x++;
            }
        }

    //        for (int i = 0; i < arr2d.length; i++) {
    //            for (int j = 0; j < arr2d[i].length; j++) {
    //                System.out.print(arr2d[i][j]);
    //            }
    //            System.out.println();
    //        }

        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);

        arraylist2d.add(input);

        ArrayList<Integer> input2 = new ArrayList<>();
        input2.add(1);
        input2.add(2);
        input2.add(3);
        input2.add(4);
        arraylist2d.add(input2);

        ArrayList<Integer> input3 = new ArrayList<>();
        input3.add(1);
        input3.add(2);
        arraylist2d.add(input3);

        for (int i = 0; i < arraylist2d.size(); i++) {
            for (int j = 0; j < arraylist2d.get(i).size(); j++) {
                System.out.print(arraylist2d.get(i).get(j));
            }
            System.out.println();
        }
        System.out.println();

        arraylist2d.get(1).add(5);

        for (int i = 0; i < arraylist2d.size(); i++) {
            for (int j = 0; j < arraylist2d.get(i).size(); j++) {
                System.out.print(arraylist2d.get(i).get(j));
            }
            System.out.println();
        }





    }
}
