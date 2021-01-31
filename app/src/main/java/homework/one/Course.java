package homework.one;

public class Course {
    //Local Variables
    private String Department;
    private String CourseName;
    private String DeptCode;
    private int CourseNum;
    private int Credits;


    //Constructors
    public Course (String dept, String cn, int cNum, int cred) {
        Department=dept;
        CourseName=cn;
        CourseNum=cNum;
        Credits= cred;
        if (Department== "Computer Science"){
            DeptCode= "CS";
        }else if (Department== "Chemistry"){
            DeptCode= "CHEM";
        }else if (Department== "Physics"){
            DeptCode= "PHYS";
        }else if (Department== "Mathematics"){
            DeptCode= "MATH";
        }else if (Department== "Botany"){
            DeptCode= "BTNY";
        }else{
            DeptCode= "ZOO";
        }
    }

    //getters and setters
    public String getDepartment() {
        return Department;
    }

    public String getCourseName() {
        return CourseName;
    }

    public int getCourseNum() {
        return CourseNum;
    }
    public int getCredits(){
        return Credits;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public void setCourseNum(int courseNum) {
        CourseNum = courseNum;
    }
    public void setCredits(int cred){
        Credits= cred;
    }

    @Override
    public String toString() {
        return DeptCode + " " + CourseNum + " " + CourseName + " Credit Hours: " + Credits;
    }
}
