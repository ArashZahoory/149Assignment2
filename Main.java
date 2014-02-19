import java.util.*;
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    public static void main (String [] args)
    {
        ArrayList<Process> processArrayList = new ArrayList<Process>(); 
        ProcessGenerator newProcesses = new ProcessGenerator(10);
        processArrayList = newProcesses.generateProcesses();
        
        
        
        
        
    }
}
