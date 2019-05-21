package ac.za.cput.project.domain.occupational;

import java.util.Date;

public class OTSchedule {
    private Date date;
    private int time;

    private OTSchedule(){}
    private OTSchedule(Builder builder){
        this.date = builder.date;
        this.time = builder.time;
    }

    public Date getOTDate() {
        return date;
    }

    public int getOTTime() {
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
        public OTSchedule build() {
            return new OTSchedule(this);
        }
    }

    @Override
    public String toString() {
        return "OTScheduleController{" +
                "date=" + date +
                ", time=" + time +
                '}';
    }
}
