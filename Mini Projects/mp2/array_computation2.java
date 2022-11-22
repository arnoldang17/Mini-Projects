/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ic
 */
import java.util.*;

public class array_computation2 {
    
    int choice, x = 1;
    int[] array1 = new int[10];
    int[] array2 = new int[10];
    int[] array3 = new int[10];
    
    Scanner a = new Scanner(System.in);
    
    void menu(){
        System.out.println("Menu");
        System.out.println("1. addition");
        System.out.println("2. subtraction");
        System.out.println("3. multiplication");
        System.out.println("4. division");
        System.out.println("5. exit");
        System.out.println("Choose a number: ");
        choice = a.nextInt();
        a.nextLine();
    }
    
    void input_array1(){
        
        for (int i = 0; i < array1.length; i++){
            
        System.out.println("Input Number " + (i + 1) + " of the first array: ");
        array1[i] = a.nextInt();
        
        }
    }
    
    void input_array2(){
        
        for (int j = 0; j < array2.length; j++){
            
        System.out.println("Input Number " + (j + 1) + " of the second array: ");
        array2[j] = a.nextInt();

        }

    }
    
     void all(){
        input_array1();
        input_array2();
        
        while(x == 1){
            

            System.out.println("Column A: " + Arrays.toString(array1));
            System.out.println("Column B: " + Arrays.toString(array2));
            menu();
            
                switch(choice){
                 
                 case 1: {
                     
                     addition();
                     break;
                 }
                 case 2: {
                     
                     subtraction();
                     break;
                 }
                 case 3: {
                     
                     multiplication();
                     break;
                 }
                 case 4: {
                     
                     division();
                     break;
                 }
                 case 5: {
                     
                     x = 0;
                     break;
                 }
                 default:{
                     System.out.print("Wrong Syntax\n");
                     
                     System.out.print("Press any key to continue . . . ");
                     a.nextLine();
                     //clearScreen();
                     continue;
                 }
                }
             
            if (x != 0) loop();
    
            }

    }
    int loop(){
        System.out.println("Do you want to go back to menu? 1 for yes, 0 for no: ");
        return x = a.nextInt();
    }   
    
    void addition(){
        
        System.out.println("Addition");

        for (int i = 0; i < array1.length; i++){
            
            System.out.println(array1[i] + " + " + array2[i] + " = " + (array1[i] + array2[i]));
            
        }
        for (int i = 0; i < 10; i++){
            
            array3[i] = array1[i] + array2[i];
        }
        System.out.println("Sum: " + Arrays.toString(array3));
        

    }
    void subtraction(){
        
        for (int i = 0; i < array1.length; i++){
            
            System.out.println(array1[i] + " - " + array2[i] + " = " + (array1[i] - array2[i]));
            
        }
        
        for (int i = 0; i < 10; i++){
            
            array3[i] = array1[i] - array2[i];
        }
        
        System.out.println("Difference: " + Arrays.toString(array3));
            

        }
        
        
    void multiplication(){
        
        for (int i = 0; i < array1.length; i++){
            
            System.out.println(array1[i] + " x " + array2[i] + " = " + (array1[i] * array2[i]));
            
        }
        
        for (int i = 0; i < 10; i++){
            
            array3[i] = array1[i] * array2[i];
        }
        
        System.out.println("Product: " + Arrays.toString(array3));
            
            
            

        }
        
    void division(){
        
        for (int i = 0; i < array1.length; i++){
            
            System.out.println(array1[i] + " / " + array2[i] + " = " + (array1[i] / array2[i]));
            
        }
        
        for (int i = 0; i < 10; i++){
            
            array3[i] = array1[i] / array2[i];
        }
        
        System.out.println("Quotient: " + Arrays.toString(array3));
            
            
        }
        

       
    }
    
    

