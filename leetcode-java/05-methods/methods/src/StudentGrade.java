import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        calcStudentsGrade();
    }
    static void calcStudentsGrade() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of subjects: ");
        int count = in.nextInt(), totMarks = 0;

        for (int i = 1; i <= count; i++) {
            System.out.println("Enter of mark of " + i + " " + "subject : ");
            totMarks += in.nextInt();
        }
        System.out.println("Total marks: " + totMarks);

        float percentage = ( float) totMarks /(count * 100) * 100;
        System.out.println("Percentage: "+ percentage);

        if (percentage > 90) {
            System.out.println("Grade : A+");
        } else if ( percentage > 70){
            System.out.println("Grade : A");
        } else if (percentage > 60) {
            System.out.println("Grade : B");
        } else if (percentage > 50) {
            System.out.println("Grade : C");
        } else {
            System.out.println("Grade: D");
        }
    }
}
