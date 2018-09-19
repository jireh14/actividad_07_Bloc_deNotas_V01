package main;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import models.ModelNotas;
import views.ViewNotas;
import controllers.ControllerNotas;

public class Main {
    private static ViewNotas viewNotas;
    private static ModelNotas modelNotas;
    private static ControllerNotas controllerNotas;
    

   public void reafFile(String path){
        try{
            String row;
            try (FileReader file = new FileReader(path)){
                BufferedReader bufferedReader = new BufferedReader(file);
                while ((row = bufferedReader.readLine()) !=null){
                    System.out.println(row);
                }
                bufferedReader.close();
            }
        }catch (FileNotFoundException err){
            System.err.println("File not found:" + err.getMessage());
        }catch (IOException err){
            System.err.println("Error on I/O operation:" + err.getMessage());
        }
       
    }
    public void writeFile(String path, String message){
        try{
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file, true);
            try (PrintWriter printWriter = new PrintWriter(fileWriter)){
                printWriter.println(message);
                printWriter.close();
            }
            
        }catch (FileNotFoundException err){
            System.err.println("File not found:" + err.getMessage());
        }catch (IOException err){
            System.err.println("Error on I/O operation:" + err.getMessage());
        }
    }
    
    public static void main(String[] args){
        Main objeto = new Main();
        String path = "C:\\Users\\Jireh Castillo\\Documents\\archivo\\texto.txt";
        objeto.writeFile(path, "");
        objeto.reafFile(path);
    }
}

