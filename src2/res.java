import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class res {
    public static void main(String[] args)throws IOException {



    }

    public static void fileReading()throws IOException{
        File file = new File("/Users/logankrieg/Desktop/BankInfo/BankShit.txt");
        Scanner scan = new Scanner(file);
        System.out.println(file);

        String fileContent = "";
        while(scan.hasNextLine()){
            fileContent = fileContent.concat(scan.nextLine() + "\n");
        }
        FileWriter writer = new FileWriter("/Users/logankrieg/Desktop/BankInfo/BankShit.txt");
        writer.write(fileContent);
        writer.close();
    }


    }

