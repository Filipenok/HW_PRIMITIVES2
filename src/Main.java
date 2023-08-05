public class Main {
    public static void main(String[] args) {

        int account = 300;
        int refill = 1000; //сумма пополнения счёта

        int bonus = (refill > 1000) ? (refill / 100) : 0;

        int amount = account + refill + bonus;

        System.out.println("Бонус равен " + bonus + " рублям(лю)");
        System.out.println("Итоговая сумма на счету клиента - " + amount + " рублей");

    }
}
