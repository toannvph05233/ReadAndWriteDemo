package ReadWriteFileCsv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileIO {

    public static void write(List<Object> rows, String PATH) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(PATH))) {
            bw.write("Id");
            bw.write(",");
            bw.write("Name");
            bw.write(",");
            bw.write("Address");
            bw.newLine();
            for (Object obj : rows) {
                bw.write(obj.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<String> read(String path){
        List<String> list = new ArrayList<>();
        try (BufferedReader bir = new BufferedReader(new FileReader(path))) {

            String line = bir.readLine();
            while (line != null) {
                line = bir.readLine();
                list.add(line);
//                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
