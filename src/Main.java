
public class Main {
    public static void main(String[] args) {
        int currentBalance = 1000;
        int topUpAmount = 1500;

        int bonusPer100Rubles = 1;

        int bonusEarned = (topUpAmount > 1000) ? ((topUpAmount - 1000) / 100) * bonusPer100Rubles : 0;
        int totalBalance = currentBalance + topUpAmount + bonusEarned;

        System.out.println("Итоговый счет: " + totalBalance + " рублей");
        System.out.println("Количество бонусных рублей: " + bonusEarned);
    }
}
