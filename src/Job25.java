import java.io.IOException;

public class Job25 {

	public static void main(String[] args) {
		try {

 

            String scriptPath = "/home/sriharipriya/import_file/scripts/getHMS.sh";

 

            // Create the ProcessBuilder for the shell script

 

            ProcessBuilder processBuilder = new ProcessBuilder("bash", scriptPath);

 

            // Start the process
            Process process = processBuilder.start();

 

            // Read the output from the process
            InputStream inputStream = process.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

 

            // Wait for the process to complete
            int exitCode = process.waitFor();

 

            // Print the exit code
            System.out.println("Script execution completed with exit code: " + exitCode);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

	}

}
