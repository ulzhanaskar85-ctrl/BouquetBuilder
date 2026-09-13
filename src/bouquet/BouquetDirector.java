package bouquet;
public class BouquetDirector {
    public Bouquet createRoseBouquet() {
        return new Bouquet.Builder()
                .addFlower("Roses")
                .addFlower("Roses")
                .addFlower("Roses")
                .setWrapping("Kraft paper")
                .setRibbon("Red")
                .addGreenery()
                .build();
    }

    public Bouquet createPeonyBouquet() {
        return new Bouquet.Builder()
                .addFlower("Peonies")
                .addFlower("Peonies")
                .addFlower("Peonies")
                .setWrapping("White paper")
                .setRibbon("Pink")
                .addGreenery()
                .build();
    }

    public Bouquet createMixedBouquet() {
        return new Bouquet.Builder()
                .addFlower("Roses")
                .addFlower("Peonies")
                .addFlower("Lilies")
                .addFlower("Tulips")
                .setWrapping("Pastel paper")
                .setRibbon("White")
                .addGreenery()
                .addGreetingCard("Have a beautiful day!")
                .setDelivery(true)
                .build();
    }
}
