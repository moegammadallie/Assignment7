package ac.za.cput.project.domain.occupational;

public class OTTools {
    private int toolCode;
    private String toolName;
    private int quantity;

    private OTTools(){}
    private OTTools(Builder builder){
        this.toolCode = builder.toolCode;
        this.toolName = builder.toolName;
        this.quantity = builder.quantity;
    }

    public int getOTToolCode() {
        return toolCode;
    }

    public String getOTToolName() {
        return toolName;
    }

    public int getOTQuantity() {
        return quantity;
    }

    public static class Builder {
        private int toolCode;
        private String toolName;
        private int quantity;

        public Builder toolCode(int toolCode){
            this.toolCode = toolCode;
            return this;
        }

        public Builder toolName(String toolName){
            this.toolName = toolName;
            return this;
        }

        public Builder quantity(int quantity){
            this.quantity = quantity;
            return this;
        }

        public OTTools build(){
            return new OTTools(this);
        }
    }

    @Override
    public String toString() {
        return "OTToolsController{" +
                "toolCode=" + toolCode +
                ", toolName='" + toolName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
