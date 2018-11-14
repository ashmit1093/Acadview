import java.util.*;
class Swap
{
    Node head;


    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

    void swap()
    {
        Node temp = head;


        while (temp != null && temp.next != null) {


            int k = temp.data;
            temp.data = temp.next.data;
            temp.next.data = k;
            temp = temp.next.next;
         }
    }



    public void push(int new_data)
    {

        Node new_node = new Node(new_data);


        new_node.next = head;


        head = new_node;
    }


    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String args[])
    {
        Swap list = new Swap();


        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);

        System.out.println("Linked List before calling pairWiseSwap() ");
        list.printList();

        list.swap();

        System.out.println("Linked List after calling pairWiseSwap() ");
        list.printList();
    }
}