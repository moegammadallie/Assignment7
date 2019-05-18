package domain.physio;

public class PTAvailability {
    private Boolean booked;

    private PTAvailability(){}
    private PTAvailability(Builder builder){
        this.booked = builder.booked;
    }

    public Boolean getPTBooked() {
        return booked;
    }

    public static class Builder{
        private Boolean booked;

        public Builder booked(Boolean booked){
            this.booked = booked;
            return this;
        }

        public PTAvailability build(){
            return new PTAvailability(this);
        }
    }

    @Override
    public String toString() {
        return "PTAvailability{" +
                "booked=" + booked +
                '}';
    }
}
