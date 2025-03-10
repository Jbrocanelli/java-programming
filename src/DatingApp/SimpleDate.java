package DatingApp;

public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void advance(){
        if(this.day == 30){
            this.month += 1;
            this.day = 1;
        } else if (this.month == 12 && this.day == 30) {
            this.year += 1;
            this.month = 1;
            this.day = 1;
        }
        else{
            this.day += 1;
        }
    }

    public void advance(int howManyDays){
        for(int i = 0; i < howManyDays; i++){
            advance();
        }
    }

    public SimpleDate afterNumberOfDays(int days){
        SimpleDate clone = new SimpleDate(day, month, year);
        clone.advance(days);
        return clone;
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
}
