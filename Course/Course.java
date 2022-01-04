public class Course {
    private String code;
    private String description;
    private int numOfCredits;
    private static int totalCredits = 0;

    public Course(String code, String description, int numOfCredits) {
        this.code = code;
        this.description = description;
        this.numOfCredits = numOfCredits;
        totalCredits = totalCredits + numOfCredits;
    }

    @Override
    public String toString() {
        return ("Code: " + this.code + "\n" + "Description: " + this.description + "\n" + "Credits: "
                + this.numOfCredits);
    }

    @Override
    public boolean equals(Object o) {
        Course testCourse = (Course) o;

        if (code.equals(testCourse.code) && description.equals(testCourse.description)
                && numOfCredits == testCourse.numOfCredits) {
            return true;
        }
        return false;
    }

    public String getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }

    public int getNumOfCredits() {
        return this.numOfCredits;
    }

    public static int getTotalCredits() {
        return totalCredits;
    }
}