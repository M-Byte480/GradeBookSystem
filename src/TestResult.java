public class TestResult {
    private double[] studentScores = new double[3];

    private static final double[] SCORE = {0, 1, 30, 35, 40, 48, 52, 56, 60, 64, 72, 80};
    private static final String[] GRADE = {"NG", "F", "D2", "D1", "C3", "C2", "C1", "B3", "B2", "B1", "A2", "A1"};

    public TestResult(){
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
    public double getTotal(){
        return this.sum();
    }

    public String getGrade(){
        double total = this.getTotal();
        String score = "NG";

        for (int i = 0; i < SCORE.length; i++) {
            if(total <= SCORE[i]){
                score = GRADE[i];
            }
        }
        return score;
    }

    private double sum(){
        double t = 0;
        for (double i :
                studentScores) {
            t+=i;
        }
        return t;
    }
}
