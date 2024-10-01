/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package personalincometaxcaculator;

import java.util.Scanner;

public class PersonalIncomeTaxCalculator {
  
    public static float fncPersonalIncomeTax(float sal, float tx, int nod) {
        if (sal < 0) {
            return -1;
        }
        
        if (tx < 0) {
            return 0;
        }
        
        if (nod < 0) {
            return -1;
        }
        
        float ti = sal - tx - 9000000 - nod * 4000000;
        
        if (ti <= 0) {
            return 0;
        }
        
        if (ti <= 5000000) {
            return 0.05f * ti;
        } else if (ti <= 10000000) {
            return 0.1f * ti - 250000;
        } else if (ti <= 20000000) {
            return 0.15f * ti - 750000;
        } else if (ti <= 40000000) {
            return 0.2f * ti - 2250000;
        } else if (ti <= 80000000) {
            return 0.25f * ti - 6250000;
        } else {
            return 0.3f * ti - 16250000;
        }
    }
}
