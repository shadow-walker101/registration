
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.time.LocalDateTime; 

public class Patient {

    String countyOfResisdence;
    String serialization;
    String registrationNumber;
    boolean registrationStatus = false;
    


    Patient(String county){
    
       countyOfResisdence = county;
       serialization = generateSerialNumber();

       registrationNumber = countyOfResisdence + "/" + serialization + "/" + getTodayDate();
        
    }

// Method to generate serialization.

    public String generateSerialNumber(){

        Random random = new Random();
        String id = String.format("%04d", random.nextInt(10000));

        return id;
    }

// Method to generate date.

    public String getTodayDate(){

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd:MM:yyy");  
        LocalDateTime now = LocalDateTime.now();  

        return dtf.format(now);



    }
    
}
