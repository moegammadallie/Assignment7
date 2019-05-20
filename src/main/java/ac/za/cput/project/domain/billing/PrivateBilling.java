package ac.za.cput.project.domain.billing;

public class PrivateBilling {
    private String paymentMethod;

    private PrivateBilling(){}
    private PrivateBilling(Builder builder){
        this.paymentMethod = builder.paymentMethod;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public static class Builder{
        private String paymentMethod;

        public Builder paymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }
        public PrivateBilling build() {
            return new PrivateBilling(this);
        }
    }

    @Override
    public String toString() {
        return "PrivateBilling{" +
                "paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
}
