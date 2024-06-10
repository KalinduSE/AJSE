import java.util.*;

class Student {
    private int id;
    private String firstName;
    private double cgpa;

    public Student(int id, String firstName, double cgpa) {
        this.id = id;
        this.firstName = firstName;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getCgpa() {
        return cgpa;
    }
}

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getCgpa() != s2.getCgpa()) {
            return Double.compare(s2.getCgpa(), s1.getCgpa()); // Sort by CGPA in decreasing order
        } else if (!s1.getFirstName().equals(s2.getFirstName())) {
            return s1.getFirstName().compareTo(s2.getFirstName()); // Sort by first name alphabetically
        } else {
            return Integer.compare(s1.getId(), s2.getId()); // Sort by ID in ascending order
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int id = scanner.nextInt();
            String firstName = scanner.next();
            double cgpa = scanner.nextDouble();
            studentList.add(new Student(id, firstName, cgpa));
        }

        Collections.sort(studentList, new StudentComparator());

        for (Student student : studentList) {
            System.out.println(student.getFirstName());
        }
    }
}