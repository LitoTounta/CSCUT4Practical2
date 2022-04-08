import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

    /**
     *
     * CSCU9T4 Java strings and files exercise Task 2.
     *
     */
    public class FormatNamesm {

        public static void main(String[] args) throws FileNotFoundException {

            //Upper Case
            if (args[0].equals("-u")){
                File inputFile = new File(args[1]);
                Scanner in = new Scanner(inputFile);

                PrintWriter out = new PrintWriter(args[2]);

                //Break up name and number parts
                while(in.hasNextLine()){
                    String line = in.nextLine();
                    int i = 0;
                    while (!Character.isDigit(line.charAt(i))){
                        i++;
                    }
                    String name = line.substring(0, i);
                    String num = line.substring(i);
                    name = name.trim();  //trim whitespace


                    //Break up name to First name and the rest
                    int j = 0;
                    while (Character.isLetter(name.charAt(j))){
                        j++;
                    }
                    String firstName = name.substring(0, j);

                    //The rest of the name (middle and last name)
                    String rest = name.substring(j);
                    rest = rest.trim();

                    //Break up rest to Middle and Last Name
                    int k = 0;
                    while(Character.isLetter(name.substring(j).charAt(k))){
                        k++;
                    }
                    String surname = "";  //initialize as null

                    //If it is only a letter, it is a middle name
                    if(rest.substring(0, k).length() == 1){
                        String middle = rest.substring(0, k);
                        surname = rest.substring(k);
                        surname = surname.trim(); //trim whitespace in front of surname

                        //Make all in capital
                        firstName = firstName.toUpperCase();
                        middle = middle.toUpperCase();
                        surname = surname.toUpperCase();

                        //Date Format 'dd/mm/yyyy'
                        String dd = num.substring(0,2);
                        String mm = num.substring(2,4);
                        String yyyy = num.substring(4);

                        String output = (firstName + " " + middle + ". " + surname + " " +
                                dd + "/" + mm + "/" + yyyy + "\n");
                        out.write(output);

                    }
                    //Else it doesn't have a middle name
                    else{
                        surname = rest;
                        //Make all in capital
                        firstName = firstName.toUpperCase();
                        surname = surname.toUpperCase();

                        //Date Format 'dd/mm/yyyy'
                        String dd = num.substring(0,2);
                        String mm = num.substring(2,4);
                        String yyyy = num.substring(4);

                        String output = (firstName + " " + surname + " " +
                                dd + "/" + mm + "/" + yyyy + "\n");
                        out.write(output);
                    }
                }
                in.close();
                out.close();
            }

            //Title Case
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


                    //Break up name to First name and the rest
                    int j = 0;
                    while (Character.isLetter(name.charAt(j))){
                        j++;
                    }
                    String firstName = name.substring(0, j);

                    //The rest of the name (middle and last name)
                    String rest = name.substring(j);
                    rest = rest.trim();

                    //Break up rest to Middle and Last Name
                    int k = 0;
                    while(Character.isLetter(name.substring(j).charAt(k))){
                        k++;
                    }
                    String surname = "";  //initialize as null

                    //If it is only a letter, it is a middle name
                    if(rest.substring(0, k).length() == 1){
                        String middle = rest.substring(0, k);
                        surname = rest.substring(k);
                        surname = surname.trim(); //trim whitespace in front of surname

                        //Make Title Case (initials in capital)
                        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);
                        middle = middle.toUpperCase();
                        surname = surname.substring(0,1).toUpperCase() + surname.substring(1);

                        //Date Format 'dd/mm/yyyy'
                        String dd = num.substring(0,2);
                        String mm = num.substring(2,4);
                        String yyyy = num.substring(4);

                        String output = (firstName + " " + middle + ". " + surname + " " +
                                dd + "/" + mm + "/" + yyyy + "\n");
                        out.write(output);

                    }
                    //Else it doesn't have a middle name
                    else{
                        surname = rest;
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

                }

                in.close();
                out.close();
            }

        } // main

    } // FormatNamesm


