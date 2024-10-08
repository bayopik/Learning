public class CreateCarThrouhtPattern {

    private String model;
    private String brand;
    private String color;
    private Short generation;
    private String power;

    public String getModel() {
        return model;
    }

    /*
     *** Паттерн Builder
     */
    public static class Builder {

        private final CreateCarThrouhtPattern newCreateCarThrouhtPattern;

        public Builder() {
            newCreateCarThrouhtPattern = new CreateCarThrouhtPattern();
        }

        public Builder withModel(String model){
            newCreateCarThrouhtPattern.model = model;
            return this;
        }

        public Builder withBrand(String brand){
            newCreateCarThrouhtPattern.brand = brand;
            return this;
        }

        public Builder withColor(String color){
            newCreateCarThrouhtPattern.color = color;
            return this;
        }

        public Builder withGeneration(Short generation){
            newCreateCarThrouhtPattern.generation = generation;
            return this;
        }

        public Builder withPower(String power){
            newCreateCarThrouhtPattern.power = power;
            return this;
        }

        public CreateCarThrouhtPattern build(){
            return newCreateCarThrouhtPattern;
        }
    }
}
