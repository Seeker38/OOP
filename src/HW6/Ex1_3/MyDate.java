package HW6.Ex1_3;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public String[] MONTHS = {"Jan", "Feb", " Mar", "Apr", "May", "Jun", " Jul", "Aug", "sep", " Oct", " Nov", "Dec"};
    public String[] DAYS = {"Sunday", " Monday", "Tuesday", "Wednesday", "Friday", "Saturday"};

    public int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }

    public boolean isValidDate(int year, int month, int day) {
        if ((year >= 1 && year <= 9999 && month >= 1 && month <= 12 && day >= 1 && day <= 31) || ((day == 28 && !isLeapYear(year) && month == 2) || (day == 29 && isLeapYear(year) && month == 2) || (day == 30 && (month == 4 || month == 6 || month == 9 || month == 11) || (day == 31 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12))))) {
            return true;
        }
        return false;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        //Gauss's algorithm for determining the day of the week
        int t[] = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        if (month < 3) {
            year -= 1;
        }
        return (year + year / 4 - year / 100 + year / 400 + t[month - 1] + day) % 7;
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setDate(int year, int month, int day) {
        try {
            if (isValidDate(year, month, day)) {
                this.year = year;
                this.month = month;
                this.day = day;
            }
        } catch (Exception e) {
            System.out.println("Invalid year, month, or day!");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        try {
            if (year > 0 && year < 10000) {
                this.year = year;
            }
        } catch (Exception e) {
            System.out.println("Invalid year!");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        try {
            if (month > 0 && month < 13) {
                this.month = month;
            }
        } catch (Exception e) {
            System.out.println("Invalid month!");
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        int max = 31;
        switch (this.getMonth()) {
            case 1:
                max = 31;
                break;
            case 2:
                if (isLeapYear(this.year)) max = 29;
                else max = 28;
                break;
            case 3:
                max = 31;
                break;
            case 4:
                max = 30;
                break;
            case 5:
                max = 31;
                break;
            case 6:
                max = 30;
                break;
            case 7:
                max = 31;
                break;
            case 8:
                max = 31;
                break;
            case 9:
                max = 30;
                break;
            case 10:
                max = 31;
                break;
            case 11:
                max = 30;
                break;
            case 12:
                max = 31;
                break;
        }
        try {
            if (day > 0 && day <= max) {
                this.day = day;
            }
        } catch (Exception e) {
            System.out.println("Invalid month!");
        }
    }

    public String toString() {
        if (isValidDate(this.getYear(), this.getMonth(), this.getDay())) {
            String thu = "";

            switch (getDayOfWeek(this.year, this.month, this.day)) {
                case 0:
                    thu = "Sun";
                    break;
                case 1:
                    thu = "Mon";
                    break;
                case 2:
                    thu = "Tues";
                    break;
                case 3:
                    thu = "Wednes";
                    break;
                case 4:
                    thu = "Thurs";
                    break;
                case 5:
                    thu = "Fri";
                    break;
                case 6:
                    thu = "Satur";
                    break;
            }
            String month = "";
            switch (this.getMonth()) {
                case 1:
                    month = "Jan";
                    break;
                case 2:
                    month = "Feb";
                    break;
                case 3:
                    month = "Mar";
                    break;
                case 4:
                    month = "Apr";
                    break;
                case 5:
                    month = "May";
                    break;
                case 6:
                    month = "Jun";
                    break;
                case 7:
                    month = "Jul";
                    break;
                case 8:
                    month = "Aug";
                    break;
                case 9:
                    month = "Sep";
                    break;
                case 10:
                    month = "Oct";
                    break;
                case 11:
                    month = "Nov";
                    break;
                case 12:
                    month = "Dec";
                    break;
            }
            return thu + "day " + this.day + " " + month + " " + this.year;
        } else {
            return "Invalid Date!";
        }
    }

    public int dayMax() {
        int dayMax = 31;
        switch (this.getMonth()) {
            case 1:
                dayMax = 31;
                break;
            case 2:
                if (isLeapYear(this.year)) dayMax = 29;
                else dayMax = 28;
                break;
            case 3:
                dayMax = 31;
                break;
            case 4:
                dayMax = 30;
                break;
            case 5:
                dayMax = 31;
                break;
            case 6:
                dayMax = 30;
                break;
            case 7:
                dayMax = 31;
                break;
            case 8:
                dayMax = 31;
                break;
            case 9:
                dayMax = 30;
                break;
            case 10:
                dayMax = 31;
                break;
            case 11:
                dayMax = 30;
                break;
            case 12:
                dayMax = 31;
                break;
        }
        return dayMax;
    }

    public MyDate nextDay() {
        if (this.getDay() != this.dayMax()) {
            this.day++;
        } else {
            this.day = 1;
            if (this.month == 12) {
                this.month = 1;
                this.year++;
            } else {
                this.month++;
            }
        }
        return this;
    }

    public MyDate nextMonth() {
        int tempMonth = this.getMonth() + 1;
        if (this.getMonth() == 12) {
            tempMonth = 1;
        }
        MyDate temp = new MyDate(this.getYear(), tempMonth, 1);
        if (this.dayMax() > temp.dayMax()) {
            this.setDay(this.dayMax());
        }
        if (this.month == 12) {
            this.setMonth(1);
            this.year++;
        } else {
            this.month++;
        }
        return this;
    }

    public MyDate nextYear() {
        try {
            if (this.year < 10000) {
                this.year++;
                return this;
            }
            if (isLeapYear(this.getYear())) {
                if ((this.getMonth() == 2) && (this.getDay() == 29)) {
                    this.setDay(28);
                }
            }
        } catch (Exception e) {
            System.out.println("Year out of range!");
        }
        return this;
    }

    public MyDate previousDay() {
        if (this.day != 1) {
            this.day--;
        } else {
            if (this.getMonth() != 1) {
                this.day = this.dayMax();
                this.month--;
            } else {
                this.day = 31;
                this.month = 12;
                this.year--;
            }
        }
        return this;
    }

    public MyDate previousMonth() {
        int tempMonth = this.getMonth() - 1;
        if (this.getMonth() == 1) {
            tempMonth = 12;
        }
        MyDate temp = new MyDate(this.getYear(), tempMonth, 1);
        if (this.dayMax() > temp.dayMax()) {
            this.setDay(this.dayMax());
        }
        if (this.getMonth() != 1) {
            this.month--;
        } else {
            this.month = 12;
        }
        return this;
    }

    public MyDate previousYear() {
        try {
            if (this.year > 0) {
                this.year--;
            }
            if (isLeapYear(this.getYear())) {
                if ((this.getMonth() == 2) && (this.getDay() == 29)) {
                    this.setDay(28);
                }
            }
        } catch (Exception e) {
            System.out.println("Year out of range!");
        }
        return this;
    }
}
