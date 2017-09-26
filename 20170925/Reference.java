
public class Reference {
    public static void main(String[] args) {
        String name = "object oriented programming";
        System.out.println(name);

        String name2 = "object oriented programming";
        
        String class1 = "Java Programming";
        String class2 = "Java Programming";
        String class3 = new String("Java Programming");

        System.out.println(class1 + " " + class2 + " " + class3);

        System.out.println(class1 == class2);
        System.out.println(class1 == class3);
        System.out.println(class1.equals(class3));


        int[] scores = { 83, 90, 87 };
        System.out.println("Array length is " + scores.length);

        System.out.println("scores[0] : " + scores[0]);
        System.out.println("scores[1] : " + scores[1]);
        System.out.println("scores[2] : " + scores[2]);
        System.out.println("scores : " + scores);

        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("Sum : " + sum);
        double avg = (double) sum / scores.length;
        System.out.println("Average : " + avg);



        int[] arr1 = new int[3];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr1[" + i + "] : " + arr1[i]);
        }
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr1[" + i + "] : " + arr1[i]);
        }

        
        
        
        
        double[] arr2 = new double[3];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("arr2[" + i + "] : " + arr2[i]);
        }
        
        arr2[0] = 0.1;
        arr2[1] = 0.2;
        arr2[2] = 0.3;
        
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("arr2[" + i + "] : " + arr2[i]);
        }

        
        String[] arr3 = new String[3];
        for (int i = 0; i < arr3.length; i++) {
            System.out.println("arr3[" + i + "] : " + arr3[i]);
        }
        arr3[0] = "Jan.";
        arr3[1] = "Feb.";
        arr3[2] = "March";
        for (int i = 0; i < arr3.length; i++) {
            System.out.println("arr3[" + i + "] : " + arr3[i]);
        }

        
        System.out.println("Array length is " + scores.length);

        for (int i = 0; i < scores.length; ++i) {
            System.out.println(i + "th element: " + scores[i]);
        }

        String[] strArray = new String[3];
        strArray[0] = "Java";
        strArray[1] = "Java";
        strArray[2] = new String("Java");

        System.out.println(strArray[0] == strArray[1]);
        System.out.println(strArray[0] == strArray[2]);
        System.out.println(strArray[0].equals(strArray[2]));
        
        int[][] multiScores = { { 90, 80, 95 }, { 100, 80, 90 } };
        int mScores1[][] = null;
        mScores1 = new int[2][3];

        for (int i = 0; i < multiScores.length; ++i) {
            for (int j = 0; j < multiScores[i].length; j++) {
                System.out.println(i + " X " + j + " : " + multiScores[i][j]);
            }
        }

        for (int[] ss : multiScores) {
            for (int s : ss) {
                System.out.println(s);
            }
        }

        for (int i = 0; i < multiScores[0].length; i++) {
            for (int j = 0; j < multiScores.length; j++) {
                System.out.println(multiScores[j][i]);
            }
        }
        
        int totalScore = 0;
        scores = new int[] { 83, 90, 87 };

        for (int s : scores) {
            totalScore += s;
            System.out.println("entry value: " + s);
        }
        System.out.println(totalScore);

        String[] courses = null;
        courses = new String[] { "Java", "Software", "C++" };
        for (String course : courses) {
            System.out.println(course);
        }

        String input = "leeky, 1g, bokyeong, chohye  ,cjy97424";
        String[] ids = input.split(",");
        for (String id : ids) {
            System.out.println(id);
        }
    }
}
