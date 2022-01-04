public class CourseClient {
    public static void main(String[] args) {
        Course course = new Course("CS1", "Computer Science Course", 3);
        System.out.println("Course 1");
        System.out.println(course.toString());
        System.out.println();
        System.out.println(course.getCode());
        System.out.println();
        System.out.println(course.getDescription());
        System.out.println();
        System.out.println(course.getNumOfCredits());
        System.out.println();
        System.out.println();

        Course course2 = new Course("CS2", "Computer Science Course", 3);
        System.out.println("Course 2");
        System.out.println(course2.toString());
        System.out.println();
        System.out.println(course2.getCode());
        System.out.println();
        System.out.println(course2.getDescription());
        System.out.println();
        System.out.println(course2.getNumOfCredits());
        System.out.println();

        System.out.println("Does Object 1 equal Object 2?");
        if (course.equals(course2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println(" ");
        System.out.println("Your total credits:" + " " + Course.getTotalCredits());
    }
}
