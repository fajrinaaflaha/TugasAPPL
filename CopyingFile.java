import java.util.Scanner;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CopyingFile {
    public static void main (String[] args){
        
        boolean notFound = true;
        while (notFound){
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Filename : ");
            String filename = keyboard.nextLine();
            try {
                File file = new File("C:\\Users\\fajrinaaflaha\\Documents\\NetBeansProjects\\JavaApplication5\\src\\" +filename);
                Scanner readFile = new Scanner(file);
                while(readFile.hasNextLine()){
                System.out.println(readFile.nextLine());
                notFound= false;
            }
            } catch (FileNotFoundException e) {
                System.out.println ("The file " + filename + " was not found.");
            }
        }
        
        
    }
}