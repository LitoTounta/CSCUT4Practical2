import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 * CSCU9T4 Java strings and files exercise.
 *
 */
public class FilesInOut {

    public static void main(String[] args) throws FileNotFoundException {
        if (args[0].equals("-u")){
            File inputFile = new File(args[1]);
            Scanner in = new Scanner(inputFile);

            PrintWriter out = new PrintWriter(args[2]);
            // Replace this with statements to set the file name (input) and file name (output).
            // Initially it will be easier to hardcode suitable file names.

            //Break up each line to Name and Number
            while(in.hasNextLine()){
                String line = in.nextLine();
                int i = 0;
                while (!Character.isDigit(line.charAt(i))){
                    i++;
                }
                String name = line.substring(0, i);
                String num = line.substring(i);
                name = name.trim();  //trim whitespace


                //Break up name to First and Last Name
                int j = 0;
                while (Character.isLetter(name.charAt(j))){
                    j++;
                }
                String firstName = name.substring(0, j);
                String surname = name.substring(j);
                surname = surname.trim(); //trim whitespace in front of surname


                //Make Title Case (initials in capital)
                firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);
                surname = surname.substring(0,1).toUpperCase() + surname.substring(1);

                //Date Format 'dd/mm/yyyy'
                String dd = num.substring(0,2);
                String mm = num.substring(2,4);
                String yyyy = num.substring(4);

                //System.out.print(firstName + " " + surname);
                //System.out.println(" " + num);

                String output = (firstName + " " + surname + " " +
                        dd + "/" + mm + "/" + yyyy + "\n");

                out.write(output);
            }
            // Set up a new Scanner to read the input file.
            // Processing line by line would be sensible here.
            // Initially, echo the text to System.out to check you are reading correctly.
            // Then add code to modify the text to the output format.

            // Set up a new PrintWriter to write the output file.
            // Add suitable code into the above processing (because you need to do this line by line also).
            // That is, read a line, write a line, loop.

            // Finally, add code to read the filenames as arguments from the command line.

            System.out.println("You need to add your own code to do anything");
            //System.out.println(args[0]);

            in.close();
            out.close();
        }
        else{
            File inputFile = new File(args[0]);
            Scanner in = new Scanner(inputFile);

            PrintWriter out = new PrintWriter(args[1]);
            // Replace this with statements to set the file name (input) and file name (output).
            // Initially it will be easier to hardcode suitable file names.

            //Break up each line to Name and Number
            while(in.hasNextLine()){
                String line = in.nextLine();
                int i = 0;
                while (!Character.isDigit(line.charAt(i))){
                    i++;
                }
                String name = line.substring(0, i);
                String num = line.substring(i);
                name = name.trim();  //trim whitespace


                //Break up name to First and Last Name
                int j = 0;
                while (Character.isLetter(name.charAt(j))){
                    j++;
                }
                String firstName = name.substring(0, j);
                String surname = name.substring(j);
                surname = surname.trim(); //trim whitespace in front of surname


                //Make Title Case (initials in capital)
                firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);
                surname = surname.substring(0,1).toUpperCase() + surname.substring(1);

                //Date Format 'dd/mm/yyyy'
                String dd = num.substring(0,2);
                String mm = num.substring(2,4);
                String yyyy = num.substring(4);

                //System.out.print(firstName + " " + surname);
                //System.out.println(" " + num);

                String output = (firstName + " " + surname + " " +
                        dd + "/" + mm + "/" + "yyyy" + "\n");

                out.write(output);
            }
            // Set up a new Scanner to read the input file.
            // Processing line by line would be sensible here.
            // Initially, echo the text to System.out to check you are reading correctly.
            // Then add code to modify the text to the output format.

            // Set up a new PrintWriter to write the output file.
            // Add suitable code into the above processing (because you need to do this line by line also).
            // That is, read a line, write a line, loop.

            // Finally, add code to read the filenames as arguments from the command line.

            System.out.println("You need to add your own code to do anything");
            //System.out.println(args[0]);

            in.close();
            out.close();

        }


    } // main

    //public void titleCase(string a, string b){



} // FilesInOut
