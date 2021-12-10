package L17_Dec04;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        // create
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list);

        // size
        System.out.println(list.size());

        // add
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        System.out.println(list);

        System.out.println(list.size());

        // heap memory full
        //while (true) list.add(10);

        // get
        System.out.println(list.get(2));
        System.out.println(list.get(6));
        System.out.println(list.get(list.size() - 1));

        // set - > update
        list.set(2, 2000);
        System.out.println(list.set(0, 1));

        // remove
        // range : 0 -> size - 1
        list.remove(2);
        System.out.println(list);
    }
}
