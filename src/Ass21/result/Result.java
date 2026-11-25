package Ass21.result;

public class Result {
    private int mark1, mark2, mark3;

    public Result(int mark1, int mark2, int mark3){
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
    }

    public int calculateTotal() {
        return mark1 + mark2 + mark3;
    }

    public double calculatePercentage() {
        return calculateTotal() / 3.0;
    }

    public String getFinalResult() {
        return calculatePercentage() >= 40.0 ? "Pass" : "Fail";
    }
}