import java.util.Scanner;

/**
 * Created by MMishanin on 26.09.2014.
 */
public class Questions {

    private static boolean FILM = true;
    private static boolean THERE_ANY_GRANDMA_IN_THE_STREET = false;
    private static boolean NOT_SEAK = false;
    private static boolean CALL_FOR_A_WALK = false;
    private static boolean HEALING = false;
    private static boolean ANYONE_TYPIC = false;
    private static boolean EVENING = false;

    static boolean correctAnswer = false;

    static Scanner input = new Scanner(System.in);

    Questions(){
        FILM = true;
    }

    private static boolean trueAnswer(String answer){
        return answer.equals("Y")      || answer.equals("YEA") ||
                answer.equals("YES")    || answer.equals("T") ||
                answer.equals("TRUE")   || answer.equals("TRU") ||
                answer.equals("ДА")     || answer.equals("Д") ||
                answer.equals("1")      || answer.equals("YEAH") ||
                answer.equals("DA")     || answer.equals("LF");
    }

    private static boolean falseAnswer(String answer){
        return answer.equals("N")      || answer.equals("NO") ||
                answer.equals("NE")     || answer.equals("0") ||
                answer.equals("NET")    || answer.equals("F") ||
                answer.equals("FALSE")  || answer.equals("НЕТ") ||
                answer.equals("НЕ")     || answer.equals("Н");
    }

    public static void ask(){

        if (FILM) {
            System.out.println("Идет ли сериал?");

            String answer = input.nextLine().toUpperCase();

            while (!correctAnswer) {
                if (trueAnswer(answer)) {
                    System.out.println("Смотрите долго сериал");
                    ask();
                } else if (falseAnswer(answer)) {
                    System.out.println("Посмотрели в Окно!");
                    FILM =false;
                    THERE_ANY_GRANDMA_IN_THE_STREET = true;
                    ask();
                } else {
                    System.out.println("Вы ввели некорректные данные.\nПожалуйста введите \"Да\" или \"Нет\" (\"Yes\" или \"No\")");
                    answer = input.nextLine().toUpperCase();
                }
            }
        }

        if (THERE_ANY_GRANDMA_IN_THE_STREET){
            System.out.println("Сидит ли какая-нибудь Митрофановна на скамейке?");

            String answer = input.nextLine().toUpperCase();

            while (!correctAnswer) {
                if (trueAnswer(answer)) {
                    System.out.println("Выходим во двор!");
                    THERE_ANY_GRANDMA_IN_THE_STREET = false;
                    ANYONE_TYPIC = true;
                    ask();
                } else if (falseAnswer(answer)) {
                    System.out.println("Звоним и узнаем \"Чойта ты не во дворе?\"");
                    THERE_ANY_GRANDMA_IN_THE_STREET = false;
                    NOT_SEAK = true;
                    ask();
                } else {
                    System.out.println("Вы ввели некорректные данные.\nПожалуйста введите \"Да\" или \"Нет\" (\"Yes\" или \"No\")");
                    answer = input.nextLine().toUpperCase();
                }
            }
        }

        if (NOT_SEAK){
            System.out.println("Митрофановна здорова?");

            String answer = input.nextLine().toUpperCase();

            while (!correctAnswer) {
                if (trueAnswer(answer)) {
                    System.out.println("Зовем ее во двор!");
                    NOT_SEAK = false;
                    CALL_FOR_A_WALK = true;
                    ask();
                } else if (falseAnswer(answer)) {
                    System.out.println("Идем к ней с таблеточками! Надо спасать подруженцию!");
                    NOT_SEAK = false;
                    HEALING = true;
                    ask();
                } else {
                    System.out.println("Вы ввели некорректные данные.\nПожалуйста введите \"Да\" или \"Нет\" (\"Yes\" или \"No\")");
                    answer = input.nextLine().toUpperCase();
                }
            }
        }

        if (CALL_FOR_A_WALK){

            System.out.println("Согласилась ли она погулять?");

            String answer = input.nextLine().toUpperCase();

            while (!correctAnswer) {
                if (trueAnswer(answer)) {
                    System.out.println("Идем подручку во двор!");
                    CALL_FOR_A_WALK = false;
                    ANYONE_TYPIC = true;
                    ask();
                } else if (falseAnswer(answer)) {
                    System.out.println("Ну что уж, пойдем домой к телеку!");
                    CALL_FOR_A_WALK = false;
                    FILM = true;
                    ask();
                } else {
                    System.out.println("Вы ввели некорректные данные.\nПожалуйста введите \"Да\" или \"Нет\" (\"Yes\" или \"No\")");
                    answer = input.nextLine().toUpperCase();
                }
            }
        }

        if (HEALING){

            System.out.println("Помогли ли аспиринчики и валокардинчики?");

            String answer = input.nextLine().toUpperCase();

            while (!correctAnswer) {
                if (trueAnswer(answer)) {
                    System.out.println("Предлагаем ей пойти во двор!");
                    HEALING = false;
                    CALL_FOR_A_WALK = true;
                    ask();
                } else if (falseAnswer(answer)) {
                    System.out.println("Митрофанна истошно закричала: \"Брось меня! Беги Джонни! Я их задержу! Врееешеь, не возьмееешь!!!\" \n Мы решили убраться пока целы и пошли домой к телеку!");
                    HEALING = false;
                    FILM = true;
                    ask();
                } else {
                    System.out.println("Вы ввели некорректные данные.\nПожалуйста введите \"Да\" или \"Нет\" (\"Yes\" или \"No\")");
                    answer = input.nextLine().toUpperCase();
                }
            }
        }

        if (ANYONE_TYPIC){

            System.out.println("Проходят ли всякие наркоши, пьяницы и путаны?");

            String answer = input.nextLine().toUpperCase();

            while (!correctAnswer) {
                if (trueAnswer(answer)) {
                    System.out.println("Обсуждаете всех из их семьи до 5 колена! Вам хорошо! Индикатор счастья на пределе!");
                    ANYONE_TYPIC = false;
                    EVENING = true;
                    ask();
                } else if (falseAnswer(answer)) {
                    System.out.println("Всегда есть глобальные проблемы которые можно обсудить!");
                    ANYONE_TYPIC = false;
                    EVENING = true;
                    ask();
                } else {
                    System.out.println("Вы ввели некорректные данные.\nПожалуйста введите \"Да\" или \"Нет\" (\"Yes\" или \"No\")");
                    answer = input.nextLine().toUpperCase();
                }
            }
        }

        if (EVENING){

            System.out.println("Наступил ли вечер?");

            String answer = input.nextLine().toUpperCase();

            while (!correctAnswer) {
                if (trueAnswer(answer)) {
                    System.out.println("Идем домой к телеку!");
                    EVENING = false;
                    FILM = true;
                    ask();
                } else if (falseAnswer(answer)) {
                    System.out.println("Можно еще понаблюдать еще за прохожими!");
                    EVENING = false;
                    ANYONE_TYPIC = true;
                    ask();
                } else {
                    System.out.println("Вы ввели некорректные данные.\nПожалуйста введите \"Да\" или \"Нет\" (\"Yes\" или \"No\")");
                    answer = input.nextLine().toUpperCase();
                }
            }
        }
    }
}
