package pl.sda.savestudent;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.studentmodel.Student;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class App {


    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("Maciej", "Kowalski", 1));
        studentList.add(new Student("Krzysztof", "Nowak", 2));
        studentList.add(new Student("Jan", "Nowicki", 3));
        studentList.add(new Student("Jacek", "Fajnydziałek", 4));
        studentList.add(new Student("Alex", "Zedra", 5));


        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("student.json"), studentList);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
