import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("src/num.txt");

        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("5");
        bufferedWriter.newLine();
        bufferedWriter.write("10");
        bufferedWriter.newLine();
        bufferedWriter.write("20");
        bufferedWriter.newLine();
        bufferedWriter.write("12");
        bufferedWriter.newLine();
        bufferedWriter.write("33");
        bufferedWriter.newLine();

        bufferedWriter.close();


        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        int sum = 0;

        while((line = bufferedReader.readLine()) != null){
            int number = Integer.parseInt(line);
            sum += number;
        }

        System.out.println("Total : " + sum);
        bufferedReader.close();



    }
}