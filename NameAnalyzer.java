import java.util.Scanner;

public class StudentNameAnalyzer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student's full name: ");
        String name = sc.nextLine();

        System.out.println("============================");
        System.out.println("       NAME ANALYZER");
        System.out.println("============================");

        System.out.println("Original        : " + name);
        System.out.println("Length          : " + name.length());
        System.out.println("Uppercase       : " + name.toUpperCase());
        System.out.println("Lowercase       : " + name.toLowerCase());
        System.out.println("First Character : " + name.charAt(0));
        System.out.println("Last Character  : " + name.charAt(name.length() - 1));

        String[] words = name.trim().split("\\s+");
        System.out.println("Words           : " + words.length);

        System.out.println("Without Spaces  : " + name.replace(" ", ""));

        sc.close();
    }
}