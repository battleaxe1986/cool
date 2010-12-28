/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blankformwithlistener;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Cadiz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame jfr = new JFrame();
        jfr.setSize(500, 500);
        jfr.setSize(new Dimension(500,500));
        JButton jbt = new JButton("Click me");
        jbt.addActionListener(new foo());
        jfr.getContentPane().add(jbt);
        jfr.setVisible(true);
        //Scanner sc = new Scanner(System.in);


    }
//mvc moddelled view controller
    //push notification on the cell phone , and connects to the cpu
    //and makes it ring
    //instance of
    //implements
    //try to implement the sort on click of the button
}

class foo implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        System.out.println("Hello world");

        double[] adnos1 = new double[10];
        for (int i = 0; i < 10; i++) {
            adnos1[i] = i;
            //sort(adnos1);
        }
        for (int i = adnos1.length - 1; i >= 0; i--) {
            double adnosMost = adnos1[0];
            int adnosMostIndex = 0;

            if (adnosMost < adnos1[i]) {
                adnosMost = adnos1[i];

                System.out.println(adnos1[i]);
            }


        }
    }
}
   /* public static double sort(double[]adnos1){
    int j=0;



        }


        return j;
    }
}*/
