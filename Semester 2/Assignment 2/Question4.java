class Deposit {
    private long principal;
    private int time;
    private double rate;
    private double total_amt;

    public Deposit() {
        this.principal = 0;
        this.time = 0;
        this.rate = 0;
        this.total_amt = 0;
    }

    public Deposit(long principal, int time, double rate) {
        this.principal = principal;
        this.time = time;
        this.rate = rate;
        calc_amt();
    }

    public Deposit(long principal, int time) {
        this.principal = principal;
        this.time = time;
        this.rate = 5.0;
        calc_amt();
    }

    public Deposit(long principal, double rate) {
        this.principal = principal;
        this.time = 1;
        this.rate = rate;
        calc_amt();
    }

    private void calc_amt() {
        this.total_amt = principal + (principal * rate * time) / 100;
    }

    public void display() {
        System.out.println("Principal: " + principal);
        System.out.println("Time: " + time + " years");
        System.out.println("Rate: " + rate + "%");
        System.out.println("Total Amount: " + total_amt);
    }
}

public class Question4 {
    public static void main(String[] args) {
        Deposit d1 = new Deposit(10000, 2, 5.5);
        d1.display();
    }
}
