class Student {
    private int id;
    private String name;
    private String department;
    private double cgpa;
    private String university;
    private static int totalStudents = 0;
    
    public Student(int id, String name, String department, double cgpa, String university) {
    this.id = id;
    this.name = name;
    this.department = department;
    this.cgpa = cgpa;
    this.university = university;
    totalStudents++;
    }
    
    public void displayStudentDetails() {
    System.out.println("ID: " + id);
    
    System.out.println("Name: " + name);
    System.out.println("Department: " + department);
    System.out.println("CGPA: " + cgpa);
    System.out.println("University: " + university);
    }
    
    public static void displayTotalStudents() {
    System.out.println("Total number of students: " + totalStudents);
    }
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Student[] students = new Student[4];
    int count = 0;
    
    while (count < 4) {
    int id;
    String name;
    String department;
    double cgpa;
    String university;
    
    if (count == 0) {
    id = 223014100;
    name = "Jannatul Tazree";
    department = "CSE";
    cgpa = 3.20;
    university = "University of Liberal Arts";
    } else if (count == 1) {
    id = 223014098;
    name = "Humaira Kabir Upoma";
    department = "BBA";
    cgpa = 4.00;
    university = "BRAC University";
    } else if (count == 2) {
    id = 223014212;
    name = "Tamim Hossain Riyad";
    department = "MSJ";
    cgpa = 2.98;
    university = "Daffodil International University";
    } else if (count == 3) {
    id = 223014111;
    name = "Tanvir Hossain Roza";
    department = "English";
    cgpa = 3.68;
    
    university = "North South University";
    } else {
    break;
    }
    
    students[count] = new Student(id, name, department, cgpa, university);
    count++;
    }
    
    System.out.println("Student Details:");
    for (Student student : students) {
    student.displayStudentDetails();
    System.out.println();
    }
    
    Student.displayTotalStudents();
    }
    }