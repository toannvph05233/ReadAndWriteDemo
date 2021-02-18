package ReadWriteFileCsv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Student s = new Student(1,"sonmc","Hn");
        Student s2 = new Student(2,"sonmc2","Hn2");
        Student s3 = new Student(3,"sonmc3","Hn3");

        List<Object> rows = new ArrayList<>();
        rows.add(s);
        rows.add(s2);
        rows.add(s3);
        String path = "./src/students.csv";

        FileIO.write(rows,path);

        System.out.println("11111");
        showList(rows);

        rows.add(new Student(5,"toan","QN"));
        FileIO.write(rows,path);
        System.out.println("22222");
        showList(rows);
    }
    public static List<Object> convertStudent(List<String> stringList){
        List<Object> listStudent = new ArrayList<>();
        for (int i = 0;i <stringList.size()-1;i++){
                String[] str = stringList.get(i).split(",");
                listStudent.add(new Student(Integer.parseInt(str[0]),str[1],str[2]));
        }
        return listStudent;
    }
    public static void showList(List<Object> list){
        String path = "./src/students.csv";
        List<String> stringList = FileIO.read(path);
        list = convertStudent(stringList);
        for (Object obj: list){
            System.out.println(obj.toString());
        }
    }

}
