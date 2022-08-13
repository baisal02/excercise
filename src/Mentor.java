public class Mentor extends Person {
    private Student[] students = new Student[40];
    private int i = 0;

    public Student[] getStudents() {
        return students;
    }

    public void addStudents(Student studentn) {
        students[i] = studentn;
        i++;
    }

    public int getI() {
        return i;
    }

    public void takeAnExam() {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].explain());
        }
    }

    public Mentor(String name, int age) {
        super(name, age);
    }

}
