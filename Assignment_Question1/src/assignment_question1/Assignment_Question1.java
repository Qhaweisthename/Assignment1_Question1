/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment_question1;

import java.util.Scanner;

public class Assignment_Question1 {

    // Define a data structure to store and manage student information
    //global variables
    //By using arrays, I can store multiple students data in parallel,
    //studentCount helps keep track of how many students are currently in my data structure.
    private static final int MAX_STUDENTS = 100;
    private static String[] studentIds = new String[MAX_STUDENTS];
    private static String[] studentNames = new String[MAX_STUDENTS];
    private static int[] studentAges = new int[MAX_STUDENTS];
    private static String[] studentEmails = new String[MAX_STUDENTS];
    private static String[] studentCourses = new String[MAX_STUDENTS];
    private static int studentCount = 0;

    public static void main(String[] args) {
        Prompt();
    }

    public static void Prompt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("STUDENT MANAGEMENT APPLICATION ");
        System.out.println("************************************************");
        System.out.println("Enter (1) to launch menu or any other key to exit ");

        String Input = sc.nextLine();

        if (Input.equals("1")) {
            System.out.println("Please select one of the following menu items:\n"
                    + "(1) Capture a new student. \n"
                    + "(2) Search for a student \n"
                    + "(3) Delete a student \n"
                    + "(4) Print student report \n"
                    + "(5) Exit Application ");
            Choose();
        } else {
            System.out.println("You are exiting the program,\nbye bye . . . ");
        }
    }

    public static void Choose() {
        Scanner sc = new Scanner(System.in);
        int menuChoice = sc.nextInt();//user input

        // choice user makes will result to these methods or pop ups being activated 
        if (menuChoice == 1) {
            SaveStudent();
        } else if (menuChoice == 2) {
            SearchStudent();
        } else if (menuChoice == 3) {
            DeleteStudent();
        } else if (menuChoice == 4) {
            StudentReport();
        } else if (menuChoice == 5) {
            ExitStudentApplication();
        } else {
            System.out.println("\n\nInvalid choice, Please Enter a valid choice \n\n");
        }
    }

    public static void SaveStudent() {
        Scanner sc = new Scanner(System.in);

        String[] cap = new String[5];
        int[] capNum = new int[1];
        boolean loop = true;

        System.out.println("\nCapture a new student\n"
                + "*************************************************************\n"
                + "Enter the student id: ");
        cap[0] = sc.next();
        System.out.println("Enter the student name: ");
        cap[1] = sc.next();

        while (loop) {
            System.out.println("Enter the student age: ");
            capNum[0] = sc.nextInt();

            if (capNum[0] >= 16) {
                System.out.println("Enter the student email: ");
                cap[3] = sc.next();
                System.out.println("Enter the student course: ");
                cap[4] = sc.next();

                // Store the student information in the data structure
                studentIds[studentCount] = cap[0];
                studentNames[studentCount] = cap[1];
                studentAges[studentCount] = capNum[0];
                studentEmails[studentCount] = cap[3];
                studentCourses[studentCount] = cap[4];
                studentCount++;

                System.out.println("\nCapture a new student\n"
                        + "*************************************************************\n"
                        + "Enter the student id: " + cap[0]);
                System.out.println("Enter the student name: " + cap[1]);
                System.out.println("Enter the student age: " + capNum[0]);
                System.out.println("Enter the student email: " + cap[3]);
                System.out.println("Enter the student course: " + cap[4]);

                System.out.println("\nEnter (1) to launch menu or any other key to exit \n");
                int menuChoice = sc.nextInt();
                
                if (menuChoice == 1) {
                    Prompt();
                    
                }else{
                    System.out.println("Exiting Program");
                }

                loop = false;
                
                
            } else {
                System.out.println("You have entered an incorrect student age!!!\n"
                        + "Please re-enter the student age >>\n\n");
                loop = true;
            }
        }
    }

    public static void SearchStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student ID to search: ");
        String searchID = sc.next();

        // Search for the student by ID in the data structure
        boolean found = false;
        for (int i = 0; i < studentCount; i++) {
            if (studentIds[i].equals(searchID)) {
                System.out.println("Student found!");
                System.out.println("Student ID: " + studentIds[i]);
                System.out.println("Student Name: " + studentNames[i]);
                System.out.println("Student Age: " + studentAges[i]);
                System.out.println("Student Email: " + studentEmails[i]);
                System.out.println("Student Course: " + studentCourses[i]);
                found = true;
                 
                System.out.println("\nEnter (1) to launch menu or any other key to exit \n");
                int menuChoice = sc.nextInt();
                
                if (menuChoice == 1) {
                    Prompt();
                    
                }else{
                    System.out.println("Exiting Program");
                }
            }
        }

        if (!found) {
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("Student  with Student ID: " +searchID+ "was not found!");
            System.out.println("-------------------------------------------------------------------------------------");
             System.out.println("\nEnter (1) to launch menu or any other key to exit \n");
                int menuChoice = sc.nextInt();
                
                if (menuChoice == 1) {
                    Prompt();
                    
                }else{
                    System.out.println("Exiting Program");
                    
                }
        }
    }

    public static void DeleteStudent() {
        
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter student ID to delete: ");
    String deleteID = sc.next();

    // Find the student by ID in the data structure and delete their information
    int deleteIndex = -1;
    for (int i = 0; i < studentCount; i++) {
        if (studentIds[i].equals(deleteID)) {
            deleteIndex = i;
            break;
        }
    }

    if (deleteIndex != -1) {
        // Shift the elements in the arrays to remove the student
        for (int i = deleteIndex; i < studentCount - 1; i++) {
            studentIds[i] = studentIds[i + 1];
            studentNames[i] = studentNames[i + 1];
            studentAges[i] = studentAges[i + 1];
            studentEmails[i] = studentEmails[i + 1];
            studentCourses[i] = studentCourses[i + 1];
        }

        // Decrement the student count
        studentCount--;

        System.out.println("Student with student ID: " + deleteID + " WAS deleted!");
        
          System.out.println("\nEnter (1) to launch menu or any other key to exit \n");
                int menuChoice = sc.nextInt();
                
                if (menuChoice == 1) {
                    Prompt();
                    
                }else{
                    System.out.println("Exiting Program");
                    
                }
    } else {
        System.out.println("Student not found");
    }
    }

    public static void StudentReport() {
       //displays all data entered in by the user  
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Student Report:");
        for (int i = 0; i < studentCount; i++) {
            System.out.println("Student ID: " + studentIds[i]);
            System.out.println("Student Name: " + studentNames[i]);
            System.out.println("Student Age: " + studentAges[i]);
            System.out.println("Student Email: " + studentEmails[i]);
            System.out.println("Student Course: " + studentCourses[i]);
            System.out.println("------------------------------");
          
              System.out.println("\nEnter (1) to launch menu or any other key to exit \n");
                int menuChoice = sc.nextInt();
                
                if (menuChoice == 1) {
                    Prompt();
                    
                }else{
                    System.out.println("Exiting Program");
                    
                }
        }
    }

    public static void ExitStudentApplication() {
        System.out.println("Closing Program");
    }
}