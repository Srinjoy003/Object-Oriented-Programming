// 2. Write a Java program to open a file, write to the file and display the contents of the file.

import java.io.*;
import java.awt.Desktop;

public class FileHandling{
    public static void main(String[] args){
        String file = "sample.txt";

        try{
            FileWriter fileWriter = new FileWriter(file);
            // BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Hellooooo");
            bufferedWriter.newLine();
            bufferedWriter.write("Byeeeeee");

            bufferedWriter.close();

        }

        catch(IOException e){
            System.out.println("Error");
        }

        try{
            String line;
            FileReader fileReader = new FileReader(file);
            // BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);

            }
            bufferedReader.close();

        }

        catch(IOException e){
            System.out.println("Error");
        }

        try{

            Desktop desktop = Desktop.getDesktop();

            File f = new File("sample.txt");
            if(f.exists()) 
                desktop.open(f);

        }

        catch(IOException e){
            System.out.println("Error");
        }

     
    }
}