package org.example.oop;

class Wallet {
    float money;
    Wallet(float amount) {
        this.money = amount;
    }
    public void addMoney(float amount) {
        this.money += amount;
    }
    public void removeMoney(float amount) {
        money -= amount;
    }
    public void printMoney() {
        System.out.println("Wartość portfela: " + this.money);
    }
}

public class InvokingMethods {
    public static void main(String[] args) {
        Wallet wallet = new Wallet(3000);
        for (int i = 1; i <= 6; i++) {
            System.out.println("Miesiąc: " + i);
            wallet.addMoney(5000);
            wallet.removeMoney(2000);
            wallet.removeMoney(1000);
        }
        System.out.println("Podsumowanie wydatków po pół roku:");
        wallet.printMoney();
    }
}
