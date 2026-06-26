import java.io.*;

public class FileHandlingProject
{
public static void main(String[] args)
{
String inputFile="input.txt";
String outputFile="output.txt";
int lines=0;
int words=0;
int characters=0;
try
{
BufferedReader br=new BufferedReader(new FileReader(inputFile));
String line;
while((line=br.readLine())!=null)
{
lines++;
characters+=line.length();
String[]wordArray=line.trim().split("\\s+");
words+=wordArray.length;
}
br.close();
BufferedWriter bw=new BufferedWriter(new FileWriter(outputFile));
bw.write("File Analysis");
bw.newLine();
bw.write("--------------");
bw.newLine();
bw.write("Total Lines:"+lines);
bw.newLine();
bw.write("Total words:"+words);
bw.newLine();
bw.write("Total Characters:"+characters);
bw.close();
System.out.println("Data processed successfully.");
System.out.println("output saved to output.txt");
}
catch(FileNotFoundException e)
{
System.out.println("Input file not found.");
}
catch(IOException e)
{
System.out.println("Error reading or writing the file.");
}
}
}

