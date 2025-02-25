public class Question4 {
    public static int numberOfDaysInAYear(int year){
        if (year % 400 == 0 || (year%4 == 0 && year%100 != 0)){
            return 366;
        }
        return 365;
    }
    public static void main(String[] args) {
        int days = 0;
        for (int i = 0 ; i<=20 ; i++){
            days += numberOfDaysInAYear(2000+i);
        }
        System.out.printf("There are total of %d days between 2000 and 2020" , days);
    }
}
