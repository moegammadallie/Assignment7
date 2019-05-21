package ac.za.cput.project.domain.occupational;



public class OTBooking {
    private String patientDetails;

    private OTBooking(){}
    private OTBooking(Builder builder){
        this.patientDetails = builder.patientDetails;
    }

    public String getOTPatientDetails() {
        return patientDetails;
    }

    public static class Builder{
        private String patientDetails;

        public Builder patientDetails(String patientDetails){
            this.patientDetails = patientDetails;
            return this;
        }

        public OTBooking build(){
            return new OTBooking(this);
        }
    }

    @Override
    public String toString() {
        return "OTBookingController{" +
                "patientDetails=" + patientDetails +
                '}';
    }
}
