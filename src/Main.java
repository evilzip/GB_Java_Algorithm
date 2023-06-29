import java.util.LinkedList;
import java.util.Random;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LInkedList list = new LInkedList();

        for (int i = 0; i < 20; i++) {
            list.add(new Random().nextInt(20));
        }


        list.print();
       // list.sort();
        list.reverse();
        list.print();
    }
}