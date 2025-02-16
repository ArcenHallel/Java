import java.util.Scanner;
class scanner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("what is your name? ");
        String name = scanner.nextLine();

        System.out.printf("Hello %s. How are you? ", name);
        int age = Integer.parseInt(scanner.nextLine());
        
        System.out.printf("%d is an excellent age to start programming. What language do you prefer? ", age);
        String language = scanner.nextLine();

        System.out.printf("%s is a very popular programming language. ", language);

        scanner.close();
    }
}