import java.util.Scanner;

public class HomeworkLessonTwo {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите свой username:");

        String user = scan.nextLine();

        System.out.printf("Hello, %s!", user);

        scan.close();
    }
}