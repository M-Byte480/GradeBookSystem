import java.util.*;

public class GradeBook {
    private String name;
    private int numberOfTests;
    private HashMap<String, StudentResult> studentToGrade = new HashMap<String, StudentResult>();

    /**
     * Creates a GradeBook object
     * @param name Name of the book
     * @param numberOfTests How many tests each student of said Name done
     */
    public GradeBook(String name, int numberOfTests){
        this.name = name;
        this.numberOfTests = numberOfTests;
    }

    /**
     * Adds student if said Student with given ID does not exist.
     * Updates the said Student's given Test's code to given value
     * @param id Student ID
     * @param testId Test's Code
     * @param value Score
     */
    public void  addStudentResult(String id, int testId, double value){
        StudentResult reference = this.studentToGrade.get(id);

        if(reference != null){ // If it does exist, update it. Base case.
            reference.addResult(testId, value);

        }else{ // Make it
            studentToGrade.put(id, new StudentResult(id, numberOfTests));
            this.addStudentResult(id, testId, value); // Recursive call, it will exit after next instance because we made sure it is created.
        }
    }

    /**
     * @return Each student ID, test scores, and grade comma separated with \n for each element.
     */
    public String toString(){
        StringBuilder temp = new StringBuilder(); // This to be printed out

        for (Map.Entry<String, StudentResult> student :
                studentToGrade.entrySet()) {
            temp.append(student.getValue().toString()).append("\n");
        }

        return temp.toString();
    }
}
