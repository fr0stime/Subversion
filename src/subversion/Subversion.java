/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subversion;

import java.util.Scanner;

/**
 *
 * @author fr0st
 */
public class Subversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner input = new Scanner (System.in);
        int[] num = new int[5];
        
        for (int i = 0; i < num.length; i++){
            System.out.println("Introdueix un valor");
            System.out.print(">");
            num[i] =input.nextInt();
           
        }
        int check = num[0];
        for (int i = 0; i < num.length; i++){
            if (num[i]< check){
                check=num[i];
                
            }else {
                System.out.println("Seguent valor");
            }
        }
        System.out.println("Valor de check " +check);
    }
    }

    

