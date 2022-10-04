// After doing this class, I noticed how powerful inheritance is and I love it.
public class StudentResult extends TestResult{ // Inherits from the TestResults
    String studentID;

    public StudentResult(String studentID){
        super();
        this.studentID = studentID;
    }

    /**
     * Creates a StudentResults object
     * @param studentID String of student's ID
     * @param numberOfScores How many tests did the student take
     */
    public StudentResult(String studentID, int numberOfScores){
        super(numberOfScores); // Inheritance
        this.studentID = studentID;
    }

    public String getStudentID() {
        return studentID;
    }

    /**
     * Updates test result
     * @param testId The Test's number
     * @param value Updated score
     */
    public void addResult(int testId, double value){
        this.setScore(testId, value);
    }

    /**
     * @return Student ID with the test results and the grade all comma seperated
     */
    public String toString(){
        return studentID + ", " + super.toString() + ", " + this.getGrade();
    }


}
