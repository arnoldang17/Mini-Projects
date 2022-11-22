/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ic
 */
import java.util.*;

public class array_computation {
    
    int choice;
    String x = "y";

    
    Scanner a = new Scanner(System.in);
    
    int[] input_array1(int[] array1){
        
        for (int i = 0; i < array1.length; i++){
            
        System.out.println("Input Number " + (i + 1) + " of the first array: ");
        array1[i] = a.nextInt();
        
        }
        return array1;
        
    }
    int[] input_array2(int[] array2){
        
        for (int j = 0; j < array2.length; j++){
            
        System.out.println("Input Number " + (j + 1) + " of the second array: ");
        array2[j] = a.nextInt();
    
        }
            return array2;
    }
     void all(int[] array1, int[] array2, int[] array3){

  
        while(x.equals("y")){
            clearScreen();

            System.out.println("Column A: " + Arrays.toString(array1));
            System.out.println("Column B: " + Arrays.toString(array2));

            System.out.println("Menu");
            System.out.println("1. addition");
            System.out.println("2. subtraction");
            System.out.println("3. multiplication");
            System.out.println("4. division");
            System.out.println("5. exit");
            System.out.println("Choose a number: ");
            choice = a.nextInt();
            a.nextLine();
            
                switch(choice){
                 
                 case 1: {
                     
                     addition(array1, array2, array3);
                     break;
                 }
                 case 2: {
                     
                     subtraction(array1, array2, array3);
                     break;
                 }
                 case 3: {
                     
                     multiplication(array1, array2, array3);
                     break;
                 }
                 case 4: {
                     
                     division(array1, array2, array3);
                     break;
                 }
                 case 5: {
                     
                     x = "n";
                     break;
                 }
                 default:{
                     System.out.print("Wrong Syntax\n");
                     
                     System.out.print("Press enter key to continue . . . ");
                     a.nextLine();
                     clearScreen();
                     continue;
                 }
                }
             
            if (!x.equals("n")) loop();
    
            }

    }
    String loop(){
        System.out.println("Do you want to go back to menu? [y] for yes, [n] for no: ");
        return x = a.next();
        
    }   

    void clearScreen(){
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }
    
    void addition(int[] array1, int[] array2, int[] array3){
        
        System.out.println("Addition");

        for (int i = 0; i < array1.length; i++){
            
            System.out.println(array1[i] + " + " + array2[i] + " = " + (array1[i] + array2[i]));
            
        }
        for (int i = 0; i < 10; i++){
            
            array3[i] = array1[i] + array2[i];
        }
        System.out.println("\nSum: " + Arrays.toString(array3));
        

    }
    void subtraction(int[] array1, int[] array2, int[] array3){
        
        for (int i = 0; i < array1.length; i++){
            
            System.out.println(array1[i] + " - " + array2[i] + " = " + (array1[i] - array2[i]));
            
        }
        
        for (int i = 0; i < 10; i++){
            
            array3[i] = array1[i] - array2[i];
        }
        
        System.out.println("\nDifference: " + Arrays.toString(array3));
            
        }
        
        
    void multiplication(int[] array1, int[] array2, int[] array3){
        
        for (int i = 0; i < array1.length; i++){
            
            System.out.println(array1[i] + " x " + array2[i] + " = " + (array1[i] * array2[i]));
            
        }
        
        for (int i = 0; i < 10; i++){
            
            array3[i] = array1[i] * array2[i];
        }
        
        System.out.println("\nProduct: " + Arrays.toString(array3));
                
        }
        
    void division(int[] array1, int[] array2, int[] array3){
        
        for (int i = 0; i < array1.length; i++){
            
            System.out.println(array1[i] + " / " + array2[i] + " = " + (array1[i] / array2[i]));
            
        }
        
        for (int i = 0; i < 10; i++){
            
            array3[i] = array1[i] / array2[i];
        }
        
        System.out.println("\nQuotient: " + Arrays.toString(array3));
            
            
        }
        

       
    }
    
    

