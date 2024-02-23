package oopintro.exercise3;

public class Student {
    public String name;
    public double firstGrade;
    public double secondGrade;
    public double thirdGrade;
    private double finalGrade;
    private boolean finalStatus;

    public String getFinalResultsMessage() {
        setFinalGradeAndStatus();
        if(!finalStatus) {
            return "FAILED!\nMISSING POINTS: " + getMissingPoints();
        } else return "APPROVED!";
    }

    private void setFinalGradeAndStatus() {
        this.finalGrade = ((firstGrade * 30) + (secondGrade * 35) + (thirdGrade * 35)) / 100;
        if (finalGrade >= 6.0) {
            this.finalStatus = true;
        }
    }

    private double getMissingPoints() {
        double missingPoints = 6.0 - finalGrade;
        return missingPoints > 0 ? missingPoints: 0;
    }
}
