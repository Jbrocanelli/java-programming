
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        // first compare years
        if (this.year < compared.year) {
            return true;
        }

        // if the years are the same, compare months
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        // the years and the months are the same, compare days
        if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance(){
        if (day < 30) {
            day++;
        } else if (day == 30 && month < 12) {
            day = 1;
            month++;
        } else if (day == 30 && month == 12) {
            day = 1;
            month = 1;
            year++;
        }
    }
    public void advance(int howManyDays){
        for (int i = 0; i < howManyDays; i++){
            advance();
        }
    }

    public SimpleDate afterNumberOfDays(int days){
        SimpleDate newDate = new SimpleDate(day, month, year);
        newDate.advance(days);

        return newDate;
    }
}