package lettergrade;

import java.util.Scanner;

/**
 *
 * @author geneivaocampo
 */
public class LetterGrade {

    public static void main(String[] args) {
        
        System.out.print("Enter Grade: ");
        Scanner input = new Scanner(System.in);
        int studentGrade = input.nextInt();
        int total; // sum of grades entered by user
        int average; // average of grades
        int gradeCounter = 1; // number of the grade to be entered next
        
        total = 0; // initialize total
        total = total + studentGrade; // add grade to total
        studentGrade = studentGrade + 1; // increment counter by 1
        
        average = total / 10; // integer division yields integer result
        
        while ( gradeCounter <= 10 )//loop
        {
            
         while ((studentGrade >= 0) && (studentGrade <= 100))// condition
         {
            if ((studentGrade >= 90) && (studentGrade <= 100)){
            System.out.println("A");
            }
            else if ((studentGrade >= 80) && (studentGrade <= 90)){
            System.out.println("B");
            }
            else if ((studentGrade >= 70) && (studentGrade <= 80)){
            System.out.println("C");
            }
            else if ((studentGrade >= 60) && (studentGrade <= 70)){
            System.out.println("D");
            }
            else{
            System.out.println("F");
            }
            
            System.out.print("Enter Grade: ");
            studentGrade = input.nextInt();
            studentGrade++;
            average = total / 10; // integer division yields integer result
            System.out.println(average);
         }
       }
    }
}
