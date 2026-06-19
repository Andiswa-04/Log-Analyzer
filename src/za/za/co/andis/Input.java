package za.za.co.andis;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input {
    private final File filename;

    Input(File filename){
        this.filename = filename;
    }

    public String getFilename(){
        return this.filename.getName();
    }


    public String getPath(){
        return this.filename.getAbsolutePath();
    }

    public void readFile(){
        try(Scanner myReader = new Scanner(this.filename)){
           for(String sent : this.filename. )
        }
        catch (FileNotFoundException e){
        }
    }


}
