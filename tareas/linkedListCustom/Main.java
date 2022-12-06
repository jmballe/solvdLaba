package linkedListCustom;

import linkedListCustom.exceptions.OutOfBoundsException;

public class Main {
    public static void main(String[] args) throws OutOfBoundsException {
        LinkedListCustom<Integer> list = new LinkedListCustom<Integer>();
        list.add(5);
        list.add(6);
        list.add(12312);
        list.add(123);
        list.add(100);
        list.print();
        System.out.println(list.get(1));
        list.delete(6);
        //Border case: First element.
        list.delete(5);
        //Border case: Last element.
        list.delete(100);
        list.delete(12312);
        //Border case: only 1 element.
        list.delete(123);
        //Print without elements
        list.print();
    }


}
