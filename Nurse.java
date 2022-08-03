import java.util.ArrayList;
import java.util.Scanner;
// import javax.swing.plaf.PanelUI;

import javax.swing.JOptionPane;

public class Nurse {

    ArrayList<Patient> patients = new ArrayList<Patient>();

// Method to register a Patient.

    public void reigister(){

        System.out.println( "*********** ~~Welcome~~ *********** \n" );
        int count = 1;
        // Scanner scanner = new Scanner(System.in);

        while(patients.size() != 3 ){

            String county = JOptionPane.showInputDialog("Enter  County of residence for patient " + count + ": ").toLowerCase().trim();
            // System.out.print("Enter  County of residence for patient " + count + ": ");
           // String county = scanner.next().toLowerCase().trim();

           if(!county.isEmpty()) {

                Patient newPatient = new Patient(county);
                newPatient.registrationStatus = true;
                patients.add(newPatient);
                count++;
            }

            else{

                JOptionPane.showMessageDialog(null, "You must enter a value");

            }
        }

        
    
    }

// Method to display Patient's information.
    public void display(){

        System.out.println( "**********************" );

        for(Patient patient: patients){

            JOptionPane.showMessageDialog(null,

              patient.registrationStatus ? "+ REGISTERED: " + "\u2713"+  "\n" + " + REG-NO: " 
            + patient.registrationNumber: "Unregistered"

            );

            //System.out.println( patient.registrationNumber);
        }


    }
   

    
}
