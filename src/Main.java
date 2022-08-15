import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Student s1 = new Student("s1", 19);
        Student s2 = new Student("s2", 19);
        Student s3 = new Student("s3", 19);
        Student s4 = new Student("s4", 19);
        Student s5 = new Student("s5", 19);
        Student s6 = new Student("s6", 19);
        Student s7 = new Student("s7", 19);
        Student s8 = new Student("s8", 19);
        Student s9 = new Student("s9", 19);
        Student s10 = new Student("s10", 19);
        Student s11 = new Student("s11", 19);
        Student s12 = new Student("s12", 19);
        Student s13 = new Student("s13", 19);
        Student s14 = new Student("s14", 19);
        Student s15 = new Student("s15", 19);
        Student s16 = new Student("s16", 19);
        Student s17 = new Student("s17", 19);
        Student s18 = new Student("s18", 19);
        Student s19 = new Student("s19", 19);
        Student s20 = new Student("s20", 19);
        Student s21 = new Student("s21", 19);
        Student s22 = new Student("s22", 19);
        Student s23 = new Student("s23", 19);
        Student s24 = new Student("s24", 19);
        Student s25 = new Student("s25", 19);
        Student s26 = new Student("s26", 19);
        Student s27 = new Student("s27", 19);
        Student s28 = new Student("s28", 19);
        Student s29 = new Student("s29", 19);
        Student s30 = new Student("s30", 19);
        Student s31 = new Student("s31", 19);
        Student s32 = new Student("s32", 19);
        Student s33 = new Student("s33", 19);
        Student s34 = new Student("s34", 19);
        Student s35 = new Student("s35", 19);
        Student s36 = new Student("s36", 19);
        Student s37 = new Student("s37", 19);
        Student s38 = new Student("s38", 19);
        Student s39 = new Student("s39", 19);
        Student s40 = new Student("s40", 19);

        Mentor mentor = new Mentor("-", 0);
        for (Student student : Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s31, s32, s33, s34, s35, s36, s37, s38, s39, s40)) {
            mentor.addStudents(student);
        }
        Mentor mentor1 = new Mentor("mentor1", 20);
        Mentor mentor2 = new Mentor("mentor2", 20);
        Mentor mentor3 = new Mentor("mentor3", 20);
        Mentor mentor4 = new Mentor("mentor4", 20);
        Mentor[] mentors = {mentor1, mentor2, mentor3, mentor4};
        Student[] m1 = new Student[mentor.getStudents().length / mentors.length];
        Student[] m2 = new Student[mentor.getStudents().length / mentors.length];
        Student[] m3 = new Student[mentor.getStudents().length / mentors.length];
        Student[] m4 = new Student[mentor.getStudents().length / mentors.length];
        for(int u = 0; u<4;u++){
            System.out.println(mentors[u].getName());
        for (int i = 0; i < mentor.getStudents().length / mentors.length; i++) {
            int c = random.nextInt(0, mentor.getStudents().length);
            if (mentor.getStudents()[c] != null) {
                System.out.println(mentor.getStudents()[c].getName());
                mentor.getStudents()[c] = null;
            } else {
                while (true) {
                    c = random.nextInt(0, mentor.getStudents().length);
                    if (mentor.getStudents()[c] != null) {
                        break;
                    }
                }
                System.out.println(mentor.getStudents()[c].getName());
                mentor.getStudents()[c] = null;
            }
        }
        }
       /* System.out.println("          ");
        System.out.println("          ");
        System.out.println(mentor2.getName()+" studentteri");
        for (int i = 0; i < mentor.getStudents().length / mentors.length; i++) {
            int c = random.nextInt(0, mentor.getStudents().length);
            if (mentor.getStudents()[c] != null) {
                m2[i] = mentor.getStudents()[c];
                mentor.getStudents()[c] = null;
            } else {
                while (true) {
                    c = random.nextInt(0, mentor.getStudents().length);
                    if (mentor.getStudents()[c] != null) {
                        break;
                    }
                }
                m2[i] = mentor.getStudents()[c];
                mentor.getStudents()[c] = null;
            }
            System.out.println(m2[i].getName());
        }
        System.out.println("          ");
        System.out.println("          ");
        System.out.println(mentor3.getName()+" studentteri");
        for (int i = 0; i < mentor.getStudents().length / mentors.length; i++) {
            int c = random.nextInt(0, mentor.getStudents().length);
            if (mentor.getStudents()[c] != null) {
                m3[i] = mentor.getStudents()[c];
                mentor.getStudents()[c] = null;
            } else {
                while (true) {
                    c = random.nextInt(0, mentor.getStudents().length);
                    if (mentor.getStudents()[c] != null) {
                        break;
                    }
                }
                m3[i] = mentor.getStudents()[c];
                mentor.getStudents()[c] = null;
            }
            System.out.println(m3[i].getName());
        }
        System.out.println("          ");
        System.out.println("          ");
        System.out.println(mentor4.getName()+" studentteri");
        for (int i = 0; i < mentor.getStudents().length / mentors.length; i++) {
            int c = random.nextInt(0, mentor.getStudents().length);
            if (mentor.getStudents()[c] != null) {
                m4[i] = mentor.getStudents()[c];
                mentor.getStudents()[c] = null;
            } else {
                while (true) {
                    c = random.nextInt(0, mentor.getStudents().length);
                    if (mentor.getStudents()[c] != null) {
                        break;
                    }
                }
                m4[i] = mentor.getStudents()[c];
                mentor.getStudents()[c] = null;
            }
            System.out.println(m4[i].getName());
        }*/
    }
}
