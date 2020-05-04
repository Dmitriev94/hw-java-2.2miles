public class Main {

    public static void main(String[] args) {
        double fillup = 1000.50; // объявляем переменную суммы пополнения счета, которая по идее может содержать копейки
        int bonus;  // объявляем бонус
        if (fillup > 1000) {
            bonus = (int) (fillup / 100);
        } else {
            bonus = (int) 0;
        }

        System.out.println(bonus);

    }
}
