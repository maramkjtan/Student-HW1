/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runstudent;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author Maram Tanani
 */
public class RunStudent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Student s1 = new ITstudent(11, "maram", "C.S", 2, 5, 8);
        Student s2 = new ITstudent(11, "maram", "C.S", 5, 8, 9);
        Student s3 = new ArtStudent(11, "maram", "C.S", 8, 6, 3);
        Student s4 = new ITstudent(11, "maram", "C.S", 5, 8, 8);

       Student []s = {s1,s2,s3,s4};
       
        Student.sort(s);
        
      
        PrintWriter p = new PrintWriter(new File("src/runstudent/student.txt"));
        for (Student a : s) {
            p.println(a);
        }
        p.close();

    }

}
