import java.util.Scanner;

class Main {
    public int fib(int num) {
        if(num < 2)
            return num;

        return fib(num - 1) + fib(num - 2);
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        main.fib(num);
        System.out.println(main.fib(num));
    }
}
