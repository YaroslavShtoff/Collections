import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class Main {
    public static final List<String> NAMES = List.of(
            "Катя",
            "Сергей",
            "Дмитрий",
            "Юрий",
            "Виолетта",
            "Карен",
            "Вова",
            "Антоннина Павловна ",
            "Юстасс",
            "Алекс"
    );
    public static final Random RANDOM = new Random();
    private static final int MAX_SIZE = 5;
    public static void main(String[] args) {
        Queue<String> queue1 = new ArrayDeque<>();
        Queue<String> queue2 = new ArrayDeque<>();
        randomFelling(queue1);
        randomFelling(queue2);
        System.out.println("Превая очередь" + queue1);
        System.out.println("Превая очередь" + queue2);
        System.out.println();

         add("Катя",queue1,queue2);
        System.out.println("Превая очередь" + queue1);
        System.out.println("Превая очередь" + queue2);
        System.out.println();

        remove(queue1,queue2);
        System.out.println("Превая очередь" + queue1);
        System.out.println("Превая очередь" + queue2);
        System.out.println();
    }




    private static  void add(String name,
         Queue<String> queue1,
         Queue<String> queue2) {
        if (queue1.size() == MAX_SIZE || queue2.size() == MAX_SIZE) {
            System.out.println("Нужно позвать Галю!");
            return;
        }
        if (queue1.size() < queue2.size() ) {
            queue1.offer(name);
        } else  {
            queue1.offer(name);
        }


    }

    public static void remove(Queue<String> queue1,
                              Queue<String> queue2) {
        if (RANDOM.nextBoolean()) {
            queue1.poll();
        } else {
            queue2.poll();
        }

    }

    public static void randomFelling(Queue<String> queue){
        int size = RANDOM.nextInt(MAX_SIZE+1);
        for (int i = 0; i < size; i++) {
            queue.offer(NAMES.get(RANDOM.nextInt(NAMES.size())));

        }

    }
}
