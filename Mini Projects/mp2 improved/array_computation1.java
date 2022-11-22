/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ic
 */
public class array_computation1 {
    
    public static void main(String[] args){
        
        array_computation b = new array_computation();
        
        int[] array1 = new int[10] , array2 = new int[10],  array3 = new int[10];
        
        array1 = b.input_array1(array1);
        array2 = b.input_array2(array2);
         
        b.all(array1, array2, array3);
    }
}
