package runoob.B_Object_Oriented;

public interface FA_Football extends FA_Sports {
    public void homeTeamScored(int points);

    public void visitingTeamScored(int points);

    public void endOfQuarter(int quarter);
}