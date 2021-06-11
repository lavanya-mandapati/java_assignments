package streamAPI;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class main {
    public static void main(String[]args) {
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        studentList.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        studentList.add(new Student(133, "MartinTheron", 17, "Male", "Electronic", 2017, 90.3));
        studentList.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        studentList.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        studentList.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        studentList.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        studentList.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        studentList.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        studentList.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        studentList.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        studentList.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        studentList.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        studentList.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        studentList.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        studentList.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        studentList.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5F));

        //Print the name of all departments in the college?
        Student.student_list(studentList);

        //Get the names of all students who have enrolled after 2018?
        Student.enroll(studentList);


        //Get the details of all male student in the computer sci department?
        Student.males_cse(studentList);


        // How many male and female student are there ?
        Student.gender(studentList);

        //What is the average age of male and female students?
        Student.avg(studentList);


        //Get the details of highest student having highest percentage ?
        Student.highestPercentage(studentList);

        //Count the number of students in each department?
        Student.numberOfStudentsInEachDepartment(studentList);


        //What is the average percentage achieved in each department?
        Student.avgPercentageInEachDepartment(studentList);


        //Get the details of youngest male student in the Electronic department?
        Student.youngestMale(studentList);


        //How many male and female students are there in the computer science department?
        Student.male_female_cse(studentList);

        }

}
