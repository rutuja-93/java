package _18_collection._1_arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Demo8Sort {
    public static void main(String[] args) {
        //sorting ---> comparison --> homogeneous data
        ArrayList arrayList = new ArrayList();
        arrayList.add(88);
        arrayList.add(67);
        arrayList.add(70);
        arrayList.add(91);
        System.out.println("Before sorting");
        System.out.println(arrayList);

        Collections.sort(arrayList);
        System.out.println("after sorting");
        System.out.println(arrayList);


    }
}
