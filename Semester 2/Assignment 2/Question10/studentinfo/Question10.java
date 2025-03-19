package Question10.studentinfo;

import Question10.sports.Sports;

class Student {
    protected String name;
    protected int roll;

    public void inputDetails(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
    }
}

class Test extends Student implements Sports {
    private int mark1, mark2;
    protected int score1 = 10, score2 = 15;

    public void inputTestDetails(int mark1, int mark2) {
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    public void showTestDetails() {
        showDetails();
        System.out.println("Marks: " + mark1 + ", " + mark2);
        System.out.println("Sports Score: " + (score1 + score2));
        System.out.println("Grand Total: " + (mark1 + mark2 + score1 + score2));
    }
}


public class Question10 {
    public static void main(String[] args) {
        Test t = new Test();
        t.inputDetails("John", 101);
        t.inputTestDetails(80, 90);
        t.showTestDetails();
    }
}