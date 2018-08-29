/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lilbum
 */
public class exercise1_3 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        int lo = 1;
        
        int hi = 1;
        
        System.out.println("all sucessive terms:");
        
        System.out.println(lo);
        
        while(hi < 50){
            System.out.println(hi);
            
            hi = lo + hi;
            
            lo = hi - lo;
        }
        
  
        
    }
    
}
