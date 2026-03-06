import java.util.Stack;
import java.util.Scanner;

public class WebsiteManagement {

    static Stack<String> history = new Stack<>();
    static Scanner In = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    static String input(String UI){
        System.out.print(UI);
        return In.nextLine();
    }

    static void undo(){
        if(history.isEmpty()) System.out.println("No website to go back");
        else System.out.println("Back from: " + history.pop());
    }

    static void search(){
        String website = input("Enter website: ");
        history.push(website);
        System.out.println("Opening: " + website);
    }

    static void currentWebsite(){
        if(history.isEmpty()) System.out.println("No website opened");
        else System.out.println("Current website: " + history.peek());
    }

    static void menu(){
        for(;;){
            System.out.println("\nS: Search website");
            System.out.println("U: Back to before website");
            System.out.println("C: Show current website");
            System.out.println("E: Exit program");

            String choices = input("Enter choices: ");

            if(choices.equalsIgnoreCase("E")) break;
            else if(choices.equalsIgnoreCase("S")) search();
            else if(choices.equalsIgnoreCase("U")) undo();
            else if(choices.equalsIgnoreCase("C")) currentWebsite();
            else System.out.println("Menu Error, try again");
        }
    }
}