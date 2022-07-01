public class Main {
    public static void main(String[] args) {

        int balans = 250; // баланс
        int balansAdd = 1250; // пополнение
        int balansOver; // итоговый баланс
        int bonus = 30; //бонусный баланс
        int bonusAdd; //начислено бонусов
        int bonusOver; //итоговое количество бонусов

        if (balansAdd >= 1000) {
            bonusAdd = balansAdd / 100;
        } else {
            bonusAdd = 0;
        }
        balansOver = balans + balansAdd;
        bonusOver = bonus + bonusAdd;

        System.out.println("Ваш баланс: " + balansOver);
        System.out.println("Количество бонусов " + bonusOver);
    }

}
