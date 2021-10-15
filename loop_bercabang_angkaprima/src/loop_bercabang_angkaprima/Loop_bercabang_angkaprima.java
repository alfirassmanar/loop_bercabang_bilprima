/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop_bercabang_angkaprima;
import java.util.Scanner;

/**
 *
 * @author alfir
 */
public class Loop_bercabang_angkaprima {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
    
        System.out.print("inputkan : ");
        i = input.nextInt();
        int bil = 2, c = 0;

       i = i + (i + 1);
       for(int p = 0; p <= i; p++ ){
           c = 0;
          for(int q = 2; q <= bil; q++){
               if(bil % q == 0){
               c++;
           }
          }
          
        if(c == 1){
            System.out.print(" "+bil);
                if(p < i-2){
                    System.out.print(" ");
                } else if(p>5) {
                    System.out.print(" ");
                }
        }
        bil++;
        
          }
       }
        
    }

