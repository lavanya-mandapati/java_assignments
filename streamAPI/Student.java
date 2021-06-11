package streamAPI;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
public class Student {
    int id,age,year_of_enrollment;
    String name,gender,engDepartment;
    double perTillDate;
    Student(int id, String name,int age,String gender,String engDepartment,int year_of_enrollment,double perTillDate)
    {
        this.id=id;
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.engDepartment=engDepartment;
        this.year_of_enrollment=year_of_enrollment;
        this.perTillDate=perTillDate;
    }
    public String getEngDepartment()
    {
        return engDepartment;
    }
    public double getPerTillDate()
    {
        return perTillDate;
    }
    public int getAge()
    {
        return age;
    }
    public String getGender()
    {

        return gender;
    }
    public static void student_list(List<Student> studentList)
    {
        studentList.forEach(s -> System.out.println(s.engDepartment));
    }
    public static void enroll(List<Student> studentList)
    {
        List<String>students =studentList.stream().filter(s->s.year_of_enrollment>2018).map(s->s.name).collect(Collectors.toList());
        System.out.println(students);
    }
    public static void males_cse(List<Student> studentList)
    {
        studentList.stream().filter(s->s.engDepartment=="Computer Science" && s.gender=="Male").forEach(s->System.out.println(s.id+" "+s.name+" "+s.gender+" "+s.year_of_enrollment+" "+s.perTillDate));
    }
    public static void gender(List<Student> studentList) {
        List<String> gender = studentList.stream().map(student1 -> student1.gender).collect(Collectors.toList());
        Map<String, Long> gender1=gender.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(gender1);
    }
    public static void avg(List<Student> studentList) {
        double avg_age=studentList.stream().collect(Collectors.summingDouble(s->s.age));
        System.out.println(avg_age/17);
    }
    public static void highestPercentage(List<Student> studentList)
    {
        Student s1=studentList.stream().max((s_1,s_2)->s_1.perTillDate>s_2.perTillDate ? 1:-1).get();
        System.out.println(s1.id+" "+s1.name+" "+s1.gender+" "+s1.age+" "+s1.engDepartment+" "+s1.year_of_enrollment+" "+s1.perTillDate);
    }
    public static void numberOfStudentsInEachDepartment(List<Student> studentList)
    {
        List<String>dept_list=studentList.stream().map(student1 -> student1.engDepartment).collect(Collectors.toList());
        Map<String, Long> stud_dept_list=dept_list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(stud_dept_list);
    }
    public static void avgPercentageInEachDepartment(List<Student>studentList)
    {
        Map<String,Double> avg_percent=studentList.stream().collect(Collectors.groupingBy(Student::getEngDepartment,Collectors.averagingDouble(Student::getPerTillDate)));
        System.out.println(avg_percent);
    }
    public static void youngestMale(List<Student>studentList)
    {
        Optional<Student>youngest=studentList.stream().filter(s->s.gender=="Male"&&s.engDepartment=="Electronic").min(Comparator.comparing(Student::getAge));
        Student youngest_elc= youngest.get();
        System.out.println(youngest_elc.id+" "+youngest_elc.name+" "+youngest_elc.age+" "+youngest_elc.engDepartment+" "+youngest_elc.year_of_enrollment+" "+youngest_elc.perTillDate);
    }
    public static void male_female_cse(List<Student>studentList)
    {
        Map<String,Long>count_members=studentList.stream().filter(s->s.engDepartment=="Computer Science").collect(Collectors.groupingBy(Student::getGender,Collectors.counting()));
        System.out.println(count_members);
    }


}
