import java.io.*;

public class Chapter8_1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\fz_sa\\Desktop\\fileinputstream.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\fz_sa\\Desktop\\fileoutputstream.txt");
        FileReader fileReader = new FileReader("C:\\Users\\fz_sa\\Desktop\\filereader.txt");
        FileWriter fileWriter = new FileWriter("C:\\Users\\fz_sa\\Desktop\\filewriter.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        byte[] bytes = new byte[1024];
        int len;
        while((len = fileInputStream.read(bytes)) != -1){
            fileOutputStream.write(bytes);
        }
        fileInputStream.close();
        fileOutputStream.close();



        while((len = bufferedReader.read()) != -1){
            bufferedWriter.write(len);
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
