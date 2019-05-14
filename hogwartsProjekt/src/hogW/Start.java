package hogW;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Martin
 */
public class Start {
    
public static InfDB idb;
    
        public static void main(String args[]) 
        {
            try
            {
                idb = new InfDB("/db/hogdb.fdb");
            }
            catch(InfException e)
            {
                JOptionPane.showMessageDialog(null, "Något gick fel!");
                System.out.println("Internt felmeddelande:" + e.getMessage());
            }
                  
            
            new Huvudfonster().setVisible(true);

        }
    
}
