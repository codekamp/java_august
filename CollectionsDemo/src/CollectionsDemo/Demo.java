package CollectionsDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by cerebro on 07/09/16.
 */
public class Demo {
    public static void main(String[] args) {

        List<String> students = StudentService.studentList();

        students.get(0);
        students.add("hemesh");
        System.out.println(students);
    }
}
