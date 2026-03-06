import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {

    static ArrayList<String> id = new ArrayList<>();
    static ArrayList<String> name = new ArrayList<>();
    static ArrayList<String> age = new ArrayList<>();
    static ArrayList<String> gpa = new ArrayList<>();
    static Scanner In = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    static String input(String UI){
        System.out.print(UI);
        return In.nextLine();
    }

    static void addStudent(){
		for(;;){
			String stuID = input("Enter student ID: ");
			if(id.contains(stuID)) System.out.println("Student Already Used!");
			else{
				id.add(stuID);
				name.add(input("Enter name: "));
				age.add(input("Enter age: "));
				gpa.add(input("Enter gpa: "));
				break;
			}
		}
    }

    static void search(){
        String stuID = input("Enter student ID for searching: ");
        if(id.contains(stuID)) {
            int index = id.indexOf(stuID);
			System.out.println("ID\tNAME\tAGE\tGPA");
            System.out.printf("%s\t%s\t%s\t%s\n", id.get(index),
                                                  name.get(index),
                                                  age.get(index),
                                                  gpa.get(index));
        }
        else System.out.println("Student not found!");
    }

    static void updateStuData(){
        String stuID = input("Enter student ID for update: ");
        if(id.contains(stuID)){
            int index = id.indexOf(stuID);
            id.set(index, input("Enter new ID: "));
            name.set(index, input("Enter new name: "));
            age.set(index, input("Enter new age: "));
            gpa.set(index, input("Enter new gpa: "));
        }
        else System.out.println("Student not found!");
    }

    static void showAllStudent(){
        System.out.println("ID\tNAME\tAGE\tGPA");
        for (int i = 0; i < id.size(); i++) {
            System.out.printf("%s\t%s\t%s\t%s\n", id.get(i), name.get(i), age.get(i), gpa.get(i));
        }
    }

    static void delStuData(){
        String stuID = input("Enter student ID for del: ");
        if(id.contains(stuID)){
            int index = id.indexOf(stuID);
            id.remove(index);
            name.remove(index);
            age.remove(index);
            gpa.remove(index);
        }
        else System.out.println("Student not found!");
    }

    static void menu(){
        for(;;){
            System.out.println("\n[A] Add Student");
            System.out.println("[S] Show Students");
            System.out.println("[R] Search Student");
            System.out.println("[D] Delete Student");
            System.out.println("[U] Update Student");
            System.out.println("[E] Exit Program");

            String choices = input("Enter choices: ");

            if(choices.equalsIgnoreCase("E")) break;
            else if(choices.equalsIgnoreCase("A")) addStudent();
            else if(choices.equalsIgnoreCase("S")) showAllStudent();
            else if(choices.equalsIgnoreCase("R")) search();
            else if(choices.equalsIgnoreCase("D")) delStuData();
            else if(choices.equalsIgnoreCase("U")) updateStuData();
            else System.out.println("Menu Error, try again");
        }
    }
}