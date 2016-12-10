package Default;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Bilal on 09-12-2016.
 */
public class customerSave {

    private static void FileWritePrintWriteClass() {
        //Writing the results to a file
        System.out.println("FileWrite, PrintWrite,Path Class example:\n");

        try{
            //Getting the current absolute path
            Path currentRelativePath = Paths.get("");
            String s = currentRelativePath.toAbsolutePath().toString();
            System.out.println("Path : "+s+"\n");
            //Setting the filename to FileWrite, false means do not append
            //FileWriter(File file, boolean append)

            //This constructor creates a FileWriter object given a File object with a boolean
            //indicating whether or not to append the data written.
            FileWriter write = new FileWriter(s+"/Results.txt",false);
            PrintWriter print_line = new PrintWriter(write);
            print_line.println("its the test file");
            print_line.println("Hello world test01");


            print_line.close();

            //JOptionPane.showMessageDialog(null, "Hi, your results are in Results.txt.", "Program Successfully Finished.", JOptionPane.PLAIN_MESSAGE);
        }
        catch(IOException ex){

        }

        System.out.println("\n");
    }
}
