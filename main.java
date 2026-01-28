import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberofstudents = scanner.nextInt();
        if (numberofstudents > 1 && numberofstudents <= 100) {
            Student[] studentarray = new Student[numberofstudents];
            for(int i=0;i<numberofstudents;i++){
               System.out.println("Enter the roll number of student ");
               int id=scanner.nextInt();
               System.out.println("Enter the name of student " + (i+1));
               String name=scanner.next();
               Student studentobjects =new Student(id,name);
               studentarray[i]=studentobjects;
            }
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
