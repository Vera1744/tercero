public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int pay = 1100;
        int newBalance;
        int bonus;
        if (pay > 1000) {
            bonus = pay / 100;
            newBalance = balance + pay + bonus;
            System.out.println("Вы пополнили счет на " + pay + " рублей, поздравляем, вы получаете " + bonus +
                    " бонусных рублей и баланс вашей карты составляет " + newBalance + " рублей");
        } else {
            bonus = 0;
            newBalance = balance + pay;
            System.out.println("Вы пополнили счет на " + pay + " рублей, баланс вашей карты " + newBalance + " рублей");
        }
    } }
