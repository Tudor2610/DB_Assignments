package Tema2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Main {
    public static Map<Integer, TreeSet<Student>> grades;
    public static void generateCatalogue(){
        grades = new HashMap<>();
        grades.put(0, new TreeSet<>());
        grades.put(1, new TreeSet<>());
        grades.put(2, new TreeSet<>());
        grades.put(3, new TreeSet<>());
        grades.put(4, new TreeSet<>());
        grades.put(5, new TreeSet<>());
        grades.put(6, new TreeSet<>());
        grades.put(7, new TreeSet<>());
        grades.put(8, new TreeSet<>());
        grades.put(9, new TreeSet<>());
        grades.put(10, new TreeSet<>());
    }


    public static void addStudentToCatalogue(Student s){
        grades.get((int)Math.round(s.getGrade())).add(s);
    }

    public static void printCatalogue(){
        for(Map.Entry<Integer, TreeSet<Student>> entry : grades.entrySet()){
            System.out.print(entry.getKey() + "\t: ");
            for(Student student: entry.getValue()){
                System.out.print(student.toString() + "; ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        generateCatalogue();
        addStudentToCatalogue(new Student("Ion", 8.49));
        addStudentToCatalogue(new Student("Vasile", 7.5));
        addStudentToCatalogue(new Student("Andrei", 9.4));
        addStudentToCatalogue(new Student("Tudor", 9.8));
        addStudentToCatalogue(new Student("Andreea", 7.8));
        addStudentToCatalogue(new Student("Sebastian", 6.5));
        addStudentToCatalogue(new Student("Ioana", 5.05));
        addStudentToCatalogue(new Student("Alexandru", 9.5));
        addStudentToCatalogue(new Student("Matei", 8.3));
        addStudentToCatalogue(new Student("George", 4.6));
        addStudentToCatalogue(new Student("Maria", 9.6));
        addStudentToCatalogue(new Student("Stefan", 4.4));
        addStudentToCatalogue(new Student("Stefania", 6.1));
        printCatalogue();
    }

}
