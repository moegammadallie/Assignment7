package ac.za.cput.project.domain.physio;

import java.util.Date;

public class PTSchedule {
    private Date date;
    private int time;

    private PTSchedule(){}
    private PTSchedule(Builder builder){
        this.date = builder.date;
        this.time = builder.time;
    }

    public Date getPTDate() {
        return date;
    }

    public int getPTTime() {
        return time;
    }


    public static class Builder{
        private Date date;
        private int time;

        public Builder date(Date date){
            this.date = date;
            return this;
        }

        public Builder time(int time){
            this.time = time;
            return this;
        }
        public PTSchedule build() {
            return new PTSchedule(this);
        }
    }

    @Override
    public String toString() {
        return "PTSchedule{" +
                "date=" + date +
                ", time=" + time +
                '}';
    }
}
