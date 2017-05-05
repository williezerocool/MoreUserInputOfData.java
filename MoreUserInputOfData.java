/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moreuserinputofdata;

import java.util.Scanner;
/**
 *
 * @author kendrabooker
 */
public class MoreUserInputOfData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        String firstName, lastName, loginName;
        int grade, studentId;
        double gpa;
        
        System.out.print("Enter first name ");
        firstName = keyboard.next();
        
        System.out.print("Enter last name ");
        lastName = keyboard.next();
        
        System.out.print("Enter a 6 digit whole number ");
        studentId = keyboard.nextInt();
        
        System.out.print("What grade are you in? ");
        grade = keyboard.nextInt();
        
        System.out.print("Whats your GPA? ");
        gpa = keyboard.nextDouble();
        
        System.out.println("Your inoformation: \n" + "Login: " + lastName + "_" + studentId + "\n" + "Id: " + studentId + "\n" + "Name: " + lastName + ", " + firstName + "\n" + "GPA: " + gpa + "\n" + "Grade: " + grade );
        
    }
    
}
