package domain.services;

public class PatientBilling {
    private int hours;

    private PatientBilling(){}
    private PatientBilling(Builder builder){
        this.hours = builder.hours;
    }

    public int getHours() {
        return hours;
    }

    public static class Builder{
        private int hours;

        public Builder hours(int hours) {
            this.hours = hours;
            return this;
        }
        public PatientBilling build() {
            return new PatientBilling(this);
        }
    }

    @Override
    public String toString() {
        return "PatientBilling{" +
                "hours=" + hours +
                '}';
    }
}
