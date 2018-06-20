/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hjabbar1
 */
public class MagicNameTester {

 public static void main(String[] args) {
  
    MagicName z = new MagicName(); //B1 A
        System.out.println(z);

    String[] people={"Annabella", "Penelope", "Giovanna", "Celestine", "Amberlynn", "Georgiana", "Emmanuel", "Wilhelmina", "Stephanie", "Alessandro"};
        MagicName[] x = new MagicName[people.length];
    for (int i=0; i<people.length; i++)
        x[i] = new MagicName(people[i]);

    for (int i=0; i<people.length; i++)
        System.out.println(x[i]);

    z.setName("Wilhelmina");
    for (int i=0; i<people.length; i++)
        System.out.println(x[i] +" compared with " + z + ": " + z.equals(x[i]));
        System.out.println();
        System.out.println("#DGF");
    }
}
/*Question 1 for past exam paper*/