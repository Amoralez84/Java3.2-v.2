public class Main {
    public static void main(String[] args) {
        int balance = 50;
        int replenishment = 1490;
        int bonus = replenishment / 100;
        if (replenishment <= 1000) {
            bonus = 0;
        }
        int total = balance + replenishment + bonus;
        System.out.println("Bonus:" + bonus);
        System.out.println("Total:" + total);
    }
}