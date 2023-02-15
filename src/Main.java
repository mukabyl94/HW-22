import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        Random random = new Random();
        ArrayList<Integer> evenNumber = new ArrayList<>();
        ArrayList<Integer> exactNumber = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            integers.add(i, random.nextInt(100));
            if (integers.get(i)%2 == 0 ){
                evenNumber.add(integers.get(i));
            } else {
                exactNumber.add(integers.get(i));
            }
        }
        System.out.println(integers);
        System.out.println(evenNumber);
        System.out.println(exactNumber);
    }
}