public interface Student {
    public long getStudentID();
    public double getOverallGPA();
    public double getGrade();
    public String getMajor();
    public boolean applyMajor(String string);
    public void applyScholarship(String string);
    public void promoteGrade(double dbl);
    public void payTuition(boolean bool, String str);
}
