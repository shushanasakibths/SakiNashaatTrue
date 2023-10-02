public class StudentRunner {
    public static void main(String[] args) {
        Student student1 = new Student("Farhana", "Nasaki", 2025, 16);
        student1.addTestScore(85.5);
        student1.addTestScore(100);
        student1.addTestScore(95.6);
        student1.addTestScore(89.3);
        student1.printStudentInfo();

        System.out.println();
        student1.studentAge(17);
        student1.addTestScore(100);
        student1.printStudentInfo();
    }
}
