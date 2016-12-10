package Default;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bilal on 10-12-2016.
 */
public class CSVUtil {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEP = "\n";

    private static final String FILE_HEADER = ("id,fname,lname,phone");

public static void CSVWriteFile(String fileName, List array){
    List customers = new ArrayList(array);
    customers.add(array);

    FileWriter fileWriter = null;

    try{
        fileWriter = new FileWriter(fileName);

        fileWriter.append(FILE_HEADER.toString());

        fileWriter.append(NEW_LINE_SEP.toString());

        for(Customer customer : customers){
            fileWriter.append(customer.getCustID());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(customer.getfName());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(customer.getlName());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(customer.getcPhone());
            fileWriter.append(NEW_LINE_SEP);

            System.out.println("CSV Created.");

        }
        }catch(Exception e) {
                System.out.println("Error Creating CSV");
                e.printStackTrace();


            }finally {
        try {
            fileWriter.flush();
            fileWriter.close();
        }catch(IOException e){
            System.out.println("Error Closing Writer");
            e.printStackTrace();

        }
    }
}
}
