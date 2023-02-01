public class Main {
    public static void main(String[] args) {

        int moneyAdd = 1001;
        int bonusesAdd;
        int presentAccount = 500;
        int totalBonuses = 10;
        int finalAccount = presentAccount + moneyAdd;

        if (moneyAdd > 1000) {
            bonusesAdd = moneyAdd / 100;
        } else {
            bonusesAdd = 0;
        }


        totalBonuses = totalBonuses + bonusesAdd;

        System.out.println("Рублей на вашем счету - " + finalAccount + " ; Бонусов - " + totalBonuses + ".");


    }
}