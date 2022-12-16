package homework4;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.LinkedList;
public class queueLinkedList {
    public static void main(String[] args) {

        int[] list = { 3, 5, 7, 2, 4, 6 };

        LinkedList<Integer> llist = new LinkedList<>();
        for (Integer temp : list) {
            llist.add(temp);
        }
        System.out.println(llist);

        enqueue(llist, 4);
        System.out.println(llist);

        System.out.print(dequeue(llist) + " ");
        System.out.println(llist);

        System.out.print(first(llist) + " ");
        System.out.println(llist);
    }
    public static void enqueue(LinkedList<Integer> list, int num) {
        list.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        list.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        return num;
    }
}
