package runoob.B_Object_Oriented;

public interface FA_Hockey extends FA_Sports {
    public void homeGoalScored();

    public void visitingGoalScored();

    public void endOfPeriod(int period);

    public void overtimePeriod(int ot);
}