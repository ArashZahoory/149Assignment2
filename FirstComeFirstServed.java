import java.util.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 * This class simulates the first come first served (FCFS) algorithm
 * It recieves the arrayList with 100 processes that have already 
 * been initialized.
 * It then simulates the FCFS algorithm, and prints out results
 * 
 * The first come first served algorithm sorts the array list based on
 * time of arrival
 * 
 * 
 */
public class FirstComeFirstServed
{
    // instance variables - replace the example below with your own
    private ArrayList<Process> processArrayList;
    private String content; 
    
    
    /**
     * Constructor for objects of class FirstComeFirstServed
     */
    public FirstComeFirstServed(ArrayList<Process> processArrayList)
    {
        // initialise instance variables
        this.processArrayList = processArrayList;
    }

    /**
     * Constructor for objects of class FirstComeFirstServed
     */
    public void introduceProcess()
    {
        content += "First Come First Serve: \n";
        content += "Process Name|Arrival Time|Expected Run Time|Priority|\n";
        
        for(int i=0; i < processArrayList.size(); i++){
        content += ((char)(i + 65) + "            |Arrival Time|Expected Run Time|Priority|\n");
        content += (                 "Process Name|Arrival Time|Expected Run Time|Priority|\n");
            
        }
        
        
        
        
        
    }
    
    
    
    
    
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void displayProcesses()
    {
        try {
			File file = new File("/Users/arashzahoory/Desktop/cs149/filename.txt");

			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			//parameter 'content' is content to be written to file
			//should probably store in a string, then put here.
			bw.write(content);
			bw.close();
			System.out.println("\nFirst Come First Serve has been printed to file. \n");
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
