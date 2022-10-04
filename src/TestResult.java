import java.util.Arrays;

public class TestResult {

    // Data fields
    private double[] studentScores;
    private static final double[] SCORE = {0, 1, 30, 35, 40, 48, 52, 56, 60, 64, 72, 80};
    private static final String[] GRADE = {"NG", "F", "D2", "D1", "C3", "C2", "C1", "B3", "B2", "B1", "A2", "A1"};


    public TestResult(){
        this(3);
    }

    public TestResult(int numberOfTest){
        this.studentScores = new double[numberOfTest];
    }

    public void setScore(int i, double value){
        studentScores[i] = value;
    }

    public double getScore(int i){
        return studentScores[i];
    }

    /**
     * @return total score of the student
     */
    public double getTotal(){
        double t = 0;
        for (double i :
                studentScores) {
            t+=i;
        }
        return t;
    }

    /**
     * @return The score of the student as comma separated values
     */
    public String toString(){
        String temp = Arrays.toString(studentScores);
        return temp.substring(1, temp.length() - 1);
    }

    /**
     * @return The grade student receives
     */
    public String getGrade(){
        double total = this.getTotal();
        String score = "A1"; // Make the assumption the student got A1
        boolean found = false;

        for (int i = 0; i < SCORE.length && !found; i++) {
            if(total <= SCORE[i]){ // Score range will increase
                score = GRADE[i]; // Assign it if it's in the given range
                found = true; // We found our result
            } // If it doesn't break, student got >80
        }
        return score;
    }

}
