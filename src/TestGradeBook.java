public class TestGradeBook {
    public static void main(String[] args) {
        GradeBook lm121 = new GradeBook("LM121" , 5);
        GradeBook lm051 = new GradeBook("LM051", 1);

        // Store the students in variables for easier accessibility and readability.
        String milan = "21308128";
        String tadhg = "21212121";

        lm121.addStudentResult(milan, 2, 42.1);
        lm121.addStudentResult(milan, 0, 31.1);
        lm121.addStudentResult("21308128", 1, 7.5);
        lm121.addStudentResult("21308128", 3, 5.5);
        lm121.addStudentResult("21308128", 4, 12.22);

        lm121.addStudentResult("21212121", 0, 4.4);
        lm121.addStudentResult(tadhg, 1, 7.4);
        lm121.addStudentResult(tadhg, 2, 43);
        lm121.addStudentResult(tadhg, 3, 12);
        lm121.addStudentResult(tadhg, 4, 1);


        lm051.addStudentResult("21315205", 0, 33);
        lm051.addStudentResult("21308128", 0, 10);

        System.out.println(lm121);
        System.out.println(lm051);
    }
}
