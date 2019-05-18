package domain.occupational;

public class OccupationalTherapist {
    private String qualification;

    private OccupationalTherapist(){}
    private OccupationalTherapist(Builder builder){
        this.qualification = builder.qualification;
    }

    public String getQualification() {
        return qualification;
    }

    public static class Builder{
        private String qualification;

        public Builder qualification(String qualification){
            this.qualification = qualification;
            return this;
        }

        public OccupationalTherapist build(){
            return new OccupationalTherapist(this);
        }
    }

    @Override
    public String toString() {
        return "OccupationalTherapistFactory{" +
                "qualification='" + qualification + '\'' +
                '}';
    }
}
