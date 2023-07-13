import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
public class Job25 {

	public static void main(String[] args) {
		try {

 

            String scriptPath = "/home/sriharipriya/import_file/scripts/getHMS.sh";

 

            // Create the ProcessBuilder for the shell script

 

            ProcessBuilder processBuilder = new ProcessBuilder("bash", scriptPath);

 

            // Start the process
            Process process = processBuilder.start();
 

            // Wait for the process to complete
            int exitCode = process.waitFor();

 		// Handle the exit code

            if (exitCode == 0) {

                System.out.println(

                        "File imported successfully.");

            } else {

                System.out.println("FDB file import failed. Exit code: " + exitCode);

            }

        } catch (IOException | InterruptedException e) {

            e.printStackTrace();

        }

         

	}

}
