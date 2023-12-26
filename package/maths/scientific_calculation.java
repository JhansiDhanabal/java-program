/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maths;
import java.util.*;
import pack.*;
/**
 *
 * @author USER
 */
public class scientific_calculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("""
                           1.arithmetic
                           2.angle
                           3.square
                           4.square root
                           5.exit
                           """);
        Scanner o=new Scanner(System.in);
        int i=1;
        while(i==1)
        {
        System.out.println("enter your choice:");
        int ch=o.nextInt();
        switch(ch)
        {
            case 1:
                calculation obj=new calculation();
                obj.add(2, 8);
                obj.sub(5, 4);
                obj.mul(9, 1);
                obj.div(9, 3);
                break;
            case 2:
                pack.pack1.angle obj1=new pack.pack1.angle();
                obj1.sin(30);
                obj1.cos(60);
                obj1.tan(45);
                break;
            case 3:
                pack.pack2.square obj2=new pack.pack2.square();
                obj2.square(4);
                break;
            case 4:
                pack.pack3.root obj3=new pack.pack3.root();
                obj3.root(16);
                break;
            case 5:
                i=0;
                break;
        }
        }
    }
    
}
