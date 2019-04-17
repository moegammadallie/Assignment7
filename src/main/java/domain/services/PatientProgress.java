package domain.services;

public class PatientProgress {
    private String progress;

    private PatientProgress(){}
    private PatientProgress(Builder builder){
        this.progress = builder.progress;
    }

    public String getProgress() {
        return progress;
    }

    public static class Builder{
        private String progress;

        public Builder progress(String progress) {
            this.progress = progress;
            return this;
        }
        public PatientProgress build() {
            return new PatientProgress(this);
        }
    }

    @Override
    public String toString() {
        return "PatientProgress{" +
                "progress='" + progress + '\'' +
                '}';
    }
}
