import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Student> students=new ArrayList<>();
        int choice;

        do {
            System.out.println("\n--- Student Management ---");
            System.out.println("1.Add Student\n2.View Students\n3.Search Student\n4.Delete Student\n5.Exit");
            System.out.print("Enter choice: "); 
            choice=sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter Roll No: "); 
                    int roll=sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Name: "); 
                    String name=sc.nextLine();
                    System.out.print("Enter Marks: "); 
                    int marks=sc.nextInt();
                    students.add(new Student(name,roll,marks));
                    System.out.println("Student Added!"); 
                    break;

                case 2:
                    System.out.println("\nAll Students:");
                    for(Student s:students) System.out.println(s);
                    break;

                case 3:
                    System.out.print("Enter Roll No to search: "); 
                    int r=sc.nextInt();
                    boolean found=false;
                    for(Student s:students){
                        if(s.getRollNo()==r){ 
                            System.out.println(s); 
                            found=true; 
                            break; 
                        } 
                    }
                    if(!found) System.out.println("Student not found!"); 
                    break;

                case 4:
                    System.out.print("Enter Roll No to delete: "); 
                    int d=sc.nextInt();
                    boolean deleted=students.removeIf(s->s.getRollNo()==d);
                    System.out.println(deleted?"Deleted successfully!":"Student not found!"); 
                    break;

                case 5: 
                    System.out.println("Exiting..."); 
                    break;

                default: 
                    System.out.println("Invalid choice!");
            }
        } while(choice!=5);
    }
}
