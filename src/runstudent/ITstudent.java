/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runstudent;

/**
 *
 * @author Maram Tanani
 */
public class ITstudent extends Student{
   
    public ITstudent(int id, String name, String major,double mid ,double finaol ,double project) {
        super(id, name, major);
        this.grade=mid*0.30 + project*0.30 + finaol*40;
    }

   

    
    
   
    
}
