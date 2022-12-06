package linkedListCustom;

import linkedListCustom.exceptions.OutOfBoundsException;

public class LinkedListCustom <T> {
    private Node<T> firstNode;
    private Integer size;

    public LinkedListCustom() {
        firstNode = null;
        size = 0;
    }

    public void add(T value){
        size++;
        Node<T> node = new Node<>(value,null,null);
        if(firstNode == null){
            firstNode = node;
        } else {
            Node<T> lastNode = firstNode;
            while(lastNode.getNext() != null){
                lastNode = lastNode.getNext();
            }
            lastNode.setNext(node);
            node.setPrev(lastNode);
        }
    }

    public void delete(T value){
        Node<T> lastNode = firstNode;
        while(lastNode != null && !lastNode.getValue().equals(value)){
            lastNode = lastNode.getNext();
        }
        if(lastNode == null){
            System.out.println("Element could not be delete because it was not found.");
        } else {
            if(lastNode.getNext() != null){
                lastNode.getNext().setPrev(lastNode.getPrev());
            }
            if(lastNode.getPrev() != null){
                lastNode.getPrev().setNext(lastNode.getNext());
            } else {
                firstNode = lastNode.getNext();
            }
            size--;
            System.out.println("Element with value " + value + ", deleted.");
        }
    }

    public T get(Integer position) throws OutOfBoundsException {
        if(position >= size){
            throw new OutOfBoundsException("The value entered is bigger or equal to the size of the list." +
                    " Remember lists are indexed from 0 to listSize - 1");
        }
        Node<T> node = firstNode;
        if(position == 0){
            return firstNode.getValue();
        } else {
            for (int i = 0; i < position; i++) {
                node = node.getNext();
            }
        }
        return node.getValue();
    }

    public void print(){
        if(size == 0){
            System.out.println("The list is empty.");
        } else {
            System.out.println("Printing list: ");
            Node<T> node = firstNode;
            System.out.print("[" + node.getValue() + ", ");
            while(node.getNext() != null){
                node = node.getNext();
                if(node.getNext() != null){
                    System.out.print(node.getValue() + ", ");
                } else {
                    System.out.println(node.getValue() + "]");
                }
            }
        }
    }

    public Integer getSize() {
        return size;
    }
}
