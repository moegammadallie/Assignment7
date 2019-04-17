package domain.services;

public class Impediment {
    private String impedimentCode;
    private String impedimentName;
    private String impedimentDescription;

    private Impediment(){}
    private Impediment(Builder builder){
        this.impedimentCode = builder.impedimentCode;
        this.impedimentName = builder.impedimentName;
        this.impedimentDescription = builder.impedimentDescription;
    }

    public String getImpedimentCode() {
        return impedimentCode;
    }

    public String getImpedimentName() {
        return impedimentName;
    }

    public String getImpedimentDescription() {
        return impedimentDescription;
    }

    public static class Builder{
        private String impedimentCode;
        private String impedimentName;
        private String impedimentDescription;

        public Builder impedimentCode(String impedimentCode) {
            this.impedimentCode = impedimentCode;
            return this;
        }

        public Builder impedimentName(String impedimentName) {
            this.impedimentName = impedimentName;
            return this;
        }

        public Builder impedimentDescription(String impedimentDescription) {
            this.impedimentDescription = impedimentDescription;
            return this;
        }
        public Impediment build() {
            return new Impediment(this);
        }
    }

    @Override
    public String toString() {
        return "Impediment{" +
                "impedimentCode='" + impedimentCode + '\'' +
                ", impedimentName='" + impedimentName + '\'' +
                ", impedimentDescription='" + impedimentDescription + '\'' +
                '}';
    }
}
