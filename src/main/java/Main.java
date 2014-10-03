
import java.io.IOException;
import java.util.Scanner;
import static java.lang.Thread.sleep;

/**
 * Created by MMishanin on 15.09.2014.
 */
public class Main{

    public static void main(String[] args) throws IOException, InterruptedException{

        Scanner input = new Scanner(System.in);
        System.out.println("Добро пожаловать в Симулятор Бабули во дворе 2.0!\nПочувствуйте себя бабулей обсуждающей вас, каждый раз, когда вы проходите мимо!\n\nДля начала игры нажмите Enter");

        input.nextLine();
        StringBuilder loading = new StringBuilder("Loading");
        for (int i = 1; i < 9; i++) {
            System.out.print(loading.toString());
            loading.append(".");
            if (i % 4 == 0){
                loading.setLength(7);
            }
            sleep(250);
            System.out.print("\r");
        }

        System.out.println("Представьте себя Старушкой Семённой, которая считает себя очень важным звеном жизни всех окружающих\nТакие как вы начинают свой день с пульта и телевизора\n");
        Questions.ask();
    }
}




