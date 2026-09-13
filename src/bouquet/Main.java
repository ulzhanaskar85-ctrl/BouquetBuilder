package bouquet;
public class Main {
    public static void main(String[] args) {

        BouquetDirector director = new BouquetDirector();

        Bouquet roseBouquet = director.createRoseBouquet();
        Bouquet peonyBouquet = director.createPeonyBouquet();
        Bouquet mixedBouquet = director.createMixedBouquet();

        Bouquet customBouquet = new Bouquet.Builder()
                .addFlower("Roses")
                .addFlower("Lilies")
                .addFlower("Peonies")
                .setWrapping("Cream paper")
                .setRibbon("Pink")
                .addGreenery()
                .addGreetingCard("With love!")
                .setDelivery(false)
                .build();

        System.out.println("Rose Bouquet:");
        System.out.println(roseBouquet);

        System.out.println("\nPeony Bouquet:");
        System.out.println(peonyBouquet);

        System.out.println("\nMixed Bouquet:");
        System.out.println(mixedBouquet);

        System.out.println("\nCustom Bouquet:");
        System.out.println(customBouquet);
    }
}
