import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SmartDataSolutions 
{
	public static void convertFile(File file) throws IOException
	{
		File csvFile =  new File("NewFile.csv");
		Scanner reader = new Scanner(file);
		FileWriter writer = new FileWriter(csvFile);
		
		while (reader.hasNext())
		{
			String line = reader.nextLine();
			StringBuilder sbr = new StringBuilder();
			String[] parts = line.split(" ");
			
			for (String part:parts)
			{
				sbr.append(part + ",");
			}
			
			writer.append(sbr.toString() + "\n");
			writer.flush();
		}
	}
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		convertFile(new File("C:/Users/sxs136330/Downloads/lat2d.dat"));
	}
}
