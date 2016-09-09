package CollectionsDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by cerebro on 07/09/16.
 */
public class StudentService {

    public static List<String> studentList() {

        // code to fetch data from internet

        List<String> students = new LinkedList<>();

        students.add("Suresh");
        students.add("Ramesh");
        students.add("Rishikesh");

        return students;
    }
}
