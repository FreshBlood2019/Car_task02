package ProblemsHW;

public class Problem08 {
    public static void main (String[] args) {
        int month=9;

        if(month==1) {
            System.out.println("January");
        } else if(month==2) {
            System.out.println("February");
        } else if(month==3) {
            System.out.println("March");
        } else if(month==4) {
            System.out.println("April");
        } else if(month==5) {
            System.out.println("May");
        } else if(month==6) {
            System.out.println("June");
        } else if(month==7) {
            System.out.println("July");
        } else if(month==8) {
            System.out.println("August");
        }  else if(month==9) {
            System.out.println("September");
        } else if(month==10) {
            System.out.println("October");
        } else if(month==11) {
            System.out.println("November");
        }  else if(month==12) {
            System.out.println("December");
        } else
            System.out.println("A non-existent month");


}}

// Another variant of problem solving
class Months {
    public static void main(String[] args) {
        int month = 9;
        String monthName;
        if(month == 1)
            monthName = "January";
        else if(month == 2)
            monthName = "February";
        else if(month == 3)
            monthName = "March";
        else if(month == 4)
            monthName = "April";
        else if(month == 5)
            monthName = "May";
        else if(month == 6)
            monthName = "June";
        else if(month == 7)
            monthName = "July";
        else if(month == 8)
            monthName = "August";
        else if(month == 9)
            monthName = "September";
        else if(month == 10)
            monthName = "October";
        else if(month == 11)
            monthName = "November";
        else if(month == 12)
            monthName = "December";
        else
            monthName = "A non-existent month";
        System.out.println("The name of the month is " + monthName);


    }
}

// One more variant
class monthSwitch {
    public static void main(String[] args) {
        int month = 4;
        String monthName;
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
            default:
                monthName = "A non-existent month";
        }
        System.out.println("The name of the month is " + monthName);
    }

}
