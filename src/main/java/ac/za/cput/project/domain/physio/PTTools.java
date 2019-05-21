package ac.za.cput.project.domain.physio;

public class PTTools {
    private int toolCode;
    private String toolName;
    private int quantity;

    private PTTools(){}
    private PTTools(Builder builder){
        this.toolCode = builder.toolCode;
        this.toolName = builder.toolName;
        this.quantity = builder.quantity;
    }
    public int getPTToolCode() {
        return toolCode;
    }

    public String getPTToolName() {
        return toolName;
    }

    public int getPTQuantity() {
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

        public PTTools build(){
            return new PTTools(this);
        }
    }

    @Override
    public String toString() {
        return "PTToolsController{" +
                "toolCode=" + toolCode +
                ", toolName='" + toolName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
