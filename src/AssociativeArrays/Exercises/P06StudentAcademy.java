package AssociativeArrays.Exercises;

import java.util.*;

public class P06StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> studentsGrade = new LinkedHashMap<>();

        int countStudents = Integer.parseInt(scanner.nextLine());
        for (int student = 1; student <= countStudents; student++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            //1. if the student is not enrolled
            studentsGrade.putIfAbsent(name, new ArrayList<>());
            //2 if the student is enrolled
            studentsGrade.get(name).add(grade);
        }

        // student's name -> list of grades (studentsGrade)
        
        // student's name -> average grade
        Map<String, Double> avgGradeStudents = new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> entry : studentsGrade.entrySet()) {
            // entry: (key) student's name -> (value) list of grades
            String studentName = entry.getKey();
            List<Double> listGrades = entry.getValue();
            double avgGrade = getAvgGrade(listGrades);
            if(avgGrade >= 4.50) {
                avgGradeStudents.put(studentName, avgGrade);
            }
        }
        avgGradeStudents.forEach((key, value) -> System.out.printf("%s -> %.2f%n", key, value));
    }
    private static double getAvgGrade(List<Double> listGrades) {
        double sumGrades = 0;
        for (double grade : listGrades) {
           sumGrades += grade;
        }
        return sumGrades / listGrades.size();
    }
}
