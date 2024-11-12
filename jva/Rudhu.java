import java.util.*;
 class Rudhu {
    public static void main(String[] args) {
        int pin = 1234;                            //pin number is 1234
        int balance = 10000;
        int AddAmount = 0;
        int TakeAmount = 0;
         
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your pin number");
        int password = scanner.nextInt();
        scanner.nextLine(); // Consume leftover newline

        if (password == pin) {
            System.out.println("enter your name");
            name = scanner.nextLine();
            System.out.println("Welcome " + name);

            while (true) {
                System.out.println("press 1 to check your balance");
                System.out.println("press 2 to add amount");
                System.out.println("press 3 to take amount");
                System.out.println("press 4 to take receipt");
                System.out.println("press 5 to exit");

                int opt = scanner.nextInt();
                switch (opt) {
                    case 1:
                        System.out.println("your current balance is " + balance);
                        break;
                    case 2:
                        System.out.println("How much amount do you want to add to your account?");
                        AddAmount = scanner.nextInt();
                        System.out.println("Successfully credited");
                        balance = AddAmount + balance;
                        break;
                    case 3:
                        System.out.println("How much amount do you want to take?");
                        TakeAmount = scanner.nextInt();
                        if (TakeAmount > balance) {
                            System.out.println("your balance is insufficient");
                            System.out.println("try less than your current balance");
                        } else {
                            System.out.println("successfully taken");
                            balance = balance - TakeAmount;
                        }
                        break;
                    case 4:
                        System.out.println("welcome to rudhu ATM");
                        System.out.println("Available balance is " + balance);
                        System.out.println("Amount deposited: " + AddAmount);
                        System.out.println("Amount taken: " + TakeAmount);
                        System.out.println("thank you");
                        break;
                    case 5:
                        System.out.println("thank you");
                        break;
                    default:
                        System.out.println("press a number below 5");
                        break;
                }

                if (opt == 5) {
                    break;
                }
            }
        } else {
            System.out.println("wrong pin");
        }

        scanner.close(); // Close the scanner to avoid resource leak
    }
}
