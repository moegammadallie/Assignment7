package ac.za.cput.project.domain.occupational;

public class OTAvailability {
    private Boolean booked;

    private OTAvailability(){}
    private OTAvailability(Builder builder){
        this.booked = builder.booked;
    }

    public Boolean getOTBooked() {
        return booked;
    }


    public static class Builder{
        private Boolean booked;

        public Builder booked(Boolean booked){
            this.booked = booked;
            return this;
        }

        public OTAvailability build(){
            return new OTAvailability(this);
        }
    }

    @Override
    public String toString() {
        return "OTAvailability{" +
                "booked=" + booked +
                '}';
    }
}
