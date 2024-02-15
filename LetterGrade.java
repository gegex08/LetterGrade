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
        int total = studentGrade ; // sum of grades entered by user
        int gradeCounter = 1; // number of the grade to be entered next
        
   
         while ((studentGrade >= 0) && (studentGrade <= 100))// condition
         {
            if ((studentGrade >= 90) && (studentGrade <= 100)){
            System.out.println("A");
            }
            else if ((studentGrade >= 80) && (studentGrade < 90)){
            System.out.println("B");
            }
            else if ((studentGrade >= 70) && (studentGrade < 80)){
            System.out.println("C");
            }
            else if ((studentGrade >= 60) && (studentGrade < 70)){
            System.out.println("D");
            }
            else{
            System.out.println("F");
            }
            
            System.out.print("Enter Grade: ");// Needs to ask user again at each loop
            studentGrade = input.nextInt();
            total += studentGrade; //each time that this function is called it will add the next grade total
            gradeCounter++;//increment the grade count 
         }
            int average = total / gradeCounter; // integer division yields integer result
            System.out.println("The average is: " + average);
         }
       }
    

