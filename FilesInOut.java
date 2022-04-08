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

                name = name.toUpperCase();

                //Date Format 'dd/mm/yyyy'
                String dd = num.substring(0,2);
                String mm = num.substring(2,4);
                String yyyy = num.substring(4);

                String output = (name + " " +
                        dd + "/" + mm + "/" + yyyy + "\n");

                out.write(output);
            }

            in.close();
            out.close();
        }
        else{
            File inputFile = new File(args[0]);
            Scanner in = new Scanner(inputFile);

            PrintWriter out = new PrintWriter(args[1]);

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

                String output = (firstName + " " + surname + " " +
                        dd + "/" + mm + "/" + yyyy + "\n");

                out.write(output);
            }

            in.close();
            out.close();
        }
    } // main

} // FilesInOut
