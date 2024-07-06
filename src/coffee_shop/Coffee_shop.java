/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee_shop;

/**
 *
 * @author HALO44O
 */
public class Coffee_shop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Thread.sleep(3000);
        lording jf2 = new lording();
        jf2.show();

        Thread.sleep(5000);
        System.out.println("1");
        jf2.dispose();
        Login jf3 = new Login();
        jf3.show();
    }
}
