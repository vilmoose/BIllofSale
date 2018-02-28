/*
 *Vilmos Feher
* BillofSale.java
*28/02/2018
*In this program we calculates what amounts go on the bill when purchasing a 
*T-Shirt
*/

package billofsale;

/**
 *
 * @author vifeh1685
 */
public class BillofSale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      double cost, payment, total, tax, change;
      cost=12.49; //price of the shirt (without HST)
      payment=20.0;
      tax= cost*0.13;
      total=cost+tax;
      change= payment-total;
      
      System.out.println(" Cost $ " + cost  + " \n Tax $ " + tax + " \n Total $ " + total  + " \n Change $ " + change);
    }
    
}
