import java.io.*;

class FileWriterExample {
    public void fileWriter() {
        int line = 0;
        int letter = 0;
        File file = new File("C:\\Users\\M.Sathis Kumar\\Desktop\\New folder (2)\\FileWriter.java");
        File file1 = new File("C:\\Users\\M.Sathis Kumar\\Desktop\\New folder\\File Write and Reader\\src\\FileWriterAndReader.java");
        try {
            if (!(file.exists())) {
                file.createNewFile();
                FileReader fileReader = new FileReader(file1);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                FileWriter fileWriter = new FileWriter(file);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                String fileRead = bufferedReader.readLine();
                while (fileRead != null) {
                    line++;
                    letter = letter + fileRead.length();
                    bufferedWriter.write(fileRead + "\n");
                    fileRead = bufferedReader.readLine();
                }
                bufferedWriter.flush();
                bufferedReader.close();
            }
        } catch (Exception e) {

        }
        System.out.println(letter);
        System.out.println(line);
    }
}

public class FileWriterAndReader {
    public static void main(String[] args) {
        FileWriterAndReader fileWriterAndReader=new FileWriterAndReader();
        fileWriterAndReader.methodCall();
    }
    public void methodCall(){
        FileWriterExample fileWriter = new FileWriterExample();
        fileWriter.fileWriter();
    }
}
