import java.io.FileWriter;
import java.io.File;
public class res {
    public static void main(String[] args){


    }


    public class ResourceLoader {

        private static final String BANKINFO_FOLDERNAME = "questions";

        /**
         * Returns the folder containing all the questions
         *
         */
        public static File getBankInfoFolder(){
            String userDirectory = System.getProperty("user.dir");
            System.out.println(userDirectory+"\\"+BANKINFO_FOLDERNAME);

            return new File(userDirectory+"\\"+BANKINFO_FOLDERNAME);
        }

    }
    File folder = ResourceLoader.getBankInfoFolder();

for(File f : folder.listFiles()){

        // Read the text file...

    }
}
