package Class;

public class Student {
    String name;
    String address;

    String[] courses;
    int[] scores;
    int numCourses;
    static final int MAX_COURSES = 30;

    public Student(String name) {
        this(name, "hidden");
    }

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
        courses = new String[MAX_COURSES];
        scores = new int[MAX_COURSES];
        numCourses = 0;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    // Add a course and grade
    public void addCourseScore(String course, int score) {
        courses[numCourses] = course;
        scores[numCourses] = score;
        ++numCourses;
    }

    // Print all courses taken and their grades
    public void printScores() {
        System.out.print(name);
        for (int i = 0; i < numCourses; ++i) {
            System.out.print(" " + courses[i] + ":" + scores[i]);
        }
        System.out.println();
    }

    // Compute the average grade
    public double getAverageScore() {
        int sum = 0;
        for (int i = 0; i < numCourses; ++i) {
            sum += scores[i];
        }
        return (double) sum / numCourses;
    }
}