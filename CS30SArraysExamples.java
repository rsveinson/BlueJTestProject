import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           Sveinson
 *  Class:          CS30S
 * 
 *  Assignment:     some array examples
 * 
 *  Description:    looking at the basic array funtions
 * 
 *************************************************************/

public class CS30SArraysExamples {

    public static void main(String[] args) throws IOException{
    // ***** constants *******
    
    // ***** variables *****
    
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input
        
        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output
        
        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
        
        int[] list = new int[10];   // declare and allocate an array of 10 ints
        int n = 0;                  // control variable for input loop
        int count = 0;              // input counter
        //System.out.println(list[10]);
    
    // ***** objects *****
    
        Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // file io buffers for reading and writing to text files
        
        //BufferedReader fin = new BufferedReader(new FileReader("filename.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));
    
    // ***** print banners *****
    
        banner = "*****************************" + nl;
        banner += "Name:        Sveinson" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  Array Examples" + nl;
        banner += "*****************************" + nl + nl;
        
        System.out.println(banner);
        //fout.print(banner);
    
    // ***** Get Input *****
    // pre loop processing
    count = 0;
    
    // load the array
    prompt = "enter up to 10 numbers. enter -1 to stop";
    System.out.println(prompt);
    
    n = scanner.nextInt();
    
    while(n != -1 && count < 10){
        System.out.println(n);
        list[count] = n;
        count++;
        
        // update the loop
        n = scanner.nextInt();
    }// end while
    
    // ***** Main Processing *****
    
    // basic structure of array computation
    for(int i = 0; i < 10; i++){
        // array computation stuff goes here
        System.out.println(i + ": " + list[i]);
    }//end for
        
    
    // ***** Print Formatted Output *****
    
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("end of processing");
        //fout.println("End of Processing");
        
    // **** close io buffers *****
    
        //fin.close();
        //fout.close();
    } // end main 
    
} // end FormatTemplate
