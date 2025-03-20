public class Main {
    public static void main(String[] args) {
        Account Alice = new Account(100);
        Account Bob = new Account(60);
        Account Charles = new Account(120);

        System.out.println("\nBalances before transfers :");
        System.out.println("Alice : " + Alice);
        System.out.println("Bob : " + Bob);
        System.out.println("Charles : " + Charles);

        Alice.transfer(20, Charles);
        Alice.transfer(10, Bob);
        Bob.transfer(30, Charles);
        Bob.transfer(100, Charles);
        Bob.transfer(-10,Charles);

        System.out.println("\nBalances after transfers :");
        System.out.println("Alice : " + Alice);
        System.out.println("Bob : " + Bob);
        System.out.println("Charles : " + Charles);
    }
}