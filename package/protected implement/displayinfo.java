/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package protectedimplement;
import protecteddemo.*;
/**
 *
 * @author USER
 */
public class displayinfo extends display{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        displayinfo obj=new displayinfo();
        obj.display();
        try 
        {
            obj.info();
        }
        catch(Exception e)
        {
            System.out.println("CAUTION : info(method) is default method can't access outside the package");
            System.out.println(e);
        }
    }
    
}
