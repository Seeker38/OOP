package HW6.Ex1_2;

public class MyTime {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public MyTime() {

    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        if ((hour >= 0 && hour <= 23) && (minute >= 0 && minute <= 59) && (second >= 0 && second <= 59)) {
            setHour(hour);
            setMinute(minute);
            setSecond(second);
        } else {
            System.out.println("error");
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public String toString() {
        String hours, minutes, seconds;
        hours = String.format("%02d", hour);
        minutes = String.format("%02d", minute);
        seconds = String.format("%02d", second);
        return hours + ":" + minutes + ":" + seconds;
    }

    public MyTime nextSecond() {
        second = second + 1;
        if (second >= 60) {
            second = second % 60;
            minute = minute + 1;
            if (minute >= 60) {
                minute %= 60;
                hour = hour + 1;
                if (hour >= 24) {
                    hour %= 24;
                }
            }
        }
        MyTime temp = new MyTime(hour, minute, second);
        return temp;
    }

    public MyTime nextMinue() {
        minute = minute + 1;
        if (minute >= 60) {
            minute %= 60;
            hour = hour + 1;
            if (hour >= 24) {
                hour %= 24;
            }
        }
        return new MyTime(hour, minute, second);
    }

    public MyTime nextHour() {
        hour = hour + 1;
        if (hour >= 24) {
            hour %= 24;
        }
        return new MyTime(hour, minute, second);
    }

    public MyTime previousSecond() {
        second = second - 1;
        if (second == -1) {
            second = 59;
            minute = minute - 1;
            if (minute == -1) {
                minute  = 59;
                hour = hour - 1;
                if (hour == -1) {
                    hour = 23;
                }
            }
        }
        MyTime temp = new MyTime(hour, minute, second);
        return temp;
    }

    public MyTime previousMinute() {
        minute = minute - 1;
        if (minute == -1) {
            minute  = 59;
            hour = hour - 1;
            if (hour == -1) {
                hour = 23;
            }
        }
        return new MyTime(hour, minute, second);
    }

    public MyTime previousHour() {
        hour = hour - 1;
        if (hour == -1) {
            hour = 23;
        }
        return new MyTime(hour, minute, second);
    }
}
