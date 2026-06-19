package za.za.co.andis;

import java.io.File;

public class ReadFile {
    public static void main(String[] args){

        File logFile = new File("log.txt");

        Input inputfile = new Input(logFile);


        inputfile.readFile();
    }
}
