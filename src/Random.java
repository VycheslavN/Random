//import java.util.Random;
import java.util.Scanner;

public class Random {
    public Random(int i) {

    }

    public static void main(String[] args) {
        int min, max;
        min=0;
        max=10;
        Random rand = new Random(10);
        System.out.println("Введите любое число от 1 до 10");
            System.out.println("");
            Scanner in = new Scanner(System.in);
            int number = in.nextInt();
            System.out.println("Ваш выбор:"+number);
            int guess = rand.nextInt();
            System.out.println("Это. Если нет нажмите: М(больше), L(меньше), Y(да)");
            System.out.println("String enter:");
            String str = "";
            boolean rez = false;
            while (guess!=number) {
                str = in.nextLine();
                if (str.equalsIgnoreCase("Y")) {
                    System.out.println("Вы проиграли");
                    System.exit(0);
                }
                else if(str.equalsIgnoreCase("L")) {
                    max = guess;
                    guess = guess - (max - min);
                    rez = true;
                }
                else if (str.equalsIgnoreCase("M")) {
                    min = guess;
                    guess = guess + (max - min);
                    rez = true;
                }
                if(rez) {
                   System.out.println(guess+"");
                   rez=false;
                }
            }
    }

    private int nextInt() {


        return 0;
    }
}
