package Class;
public class StaticMember {
    String color;
    static double pi = 3.141592;
    static int times(int x, int y) {
        return x * y;
    }
    void setColor(String color) {
        this.color = color;
    }
    public static void main(String[] args) {
        StaticMember staticExercise = new StaticMember();
        staticExercise.setColor("Blue");
        StaticMember staticExercise2 = new StaticMember();
        staticExercise2.setColor("Yellow");
        System.out.println(staticExercise.color + staticExercise2.color);
        int radius = 5;
        double sizeOfCircle = 0.0;
        sizeOfCircle = StaticMember.pi * StaticMember.times(radius, radius); // recommended
        sizeOfCircle = staticExercise.pi * staticExercise.times(radius, radius);
    }
}
