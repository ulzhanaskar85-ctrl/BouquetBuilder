package bouquet;
import java.util.ArrayList; import java.util.List;
public class Bouquet {
    private final List<String> flowers;
    private final String wrapping;
    private final String ribbon;
    private final boolean greenery;
    private final String greetingCard;
    private final boolean delivery;

    private Bouquet(Builder builder) {
        this.flowers = builder.flowers;
        this.wrapping = builder.wrapping;
        this.ribbon = builder.ribbon;
        this.greenery = builder.greenery;
        this.greetingCard = builder.greetingCard;
        this.delivery = builder.delivery;
    }

    public static class Builder {

        private final List<String> flowers = new ArrayList<>();
        private String wrapping;
        private String ribbon;
        private boolean greenery;
        private String greetingCard;
        private boolean delivery;

        public Builder addFlower(String flower) {
            flowers.add(flower);
            return this;
        }

        public Builder setWrapping(String wrapping) {
            this.wrapping = wrapping;
            return this;
        }

        public Builder setRibbon(String ribbon) {
            this.ribbon = ribbon;
            return this;
        }

        public Builder addGreenery() {
            this.greenery = true;
            return this;
        }

        public Builder addGreetingCard(String greetingCard) {
            this.greetingCard = greetingCard;
            return this;
        }

        public Builder setDelivery(boolean delivery) {
            this.delivery = delivery;
            return this;
        }

        public Bouquet build() {
            if (flowers.isEmpty()) {
                throw new IllegalStateException("A bouquet must contain at least one flower.");
            }

            return new Bouquet(this);
        }
    }

    @Override
    public String toString() {
        return "\n--- Bouquet ---" +
                "\nFlowers: " + flowers +
                "\nWrapping: " + wrapping +
                "\nRibbon: " + ribbon +
                "\nGreenery: " + (greenery ? "Yes" : "No") +
                "\nGreeting card: " + (greetingCard == null ? "None" : greetingCard) +
                "\nDelivery: " + (delivery ? "Yes" : "No") +
                "\n---------------";
    }
}