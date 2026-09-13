#Bouquet Builder
##Project Description
Bouquet Builder is a Java project that demonstrates the **Builder Design Pattern**.
The project allows users to create customizable flower bouquets with different flowers, wrapping, ribbons, greenery, greeting cards, and delivery options.
The Builder Pattern makes the creation of a complex `Bouquet` object easier, more readable, and more flexible.

##Design Pattern
The project uses the **Builder Design Pattern**.

###Product
`Bouquet` is the product being created.

It contains:
- Flowers
- Wrapping
- Ribbon
- Greenery
- Greeting card
- Delivery

###Builder
`Bouquet.Builder` is responsible for step-by-step construction of a `Bouquet`.
It provides the following methods:
- `addFlower()`
- `setWrapping()`
- `setRibbon()`
- `addGreenery()`
- `addGreetingCard()`
- `setDelivery()`
- `build()`
The Builder uses **method chaining**, which makes the code easier to read.

Example:

    Bouquet bouquet = new Bouquet.Builder()
            .addFlower("Roses")
            .addFlower("Lilies")
            .setWrapping("Cream paper")
            .setRibbon("Pink")
            .addGreenery()
            .addGreetingCard("With love!")
            .setDelivery(false)
            .build();

###Director
`BouquetDirector` provides reusable predefined bouquet configurations.
It contains:
- `createRoseBouquet()`
- `createPeonyBouquet()`
- `createMixedBouquet()`

###Client
`Main` is the client class.
It creates bouquets using both the Director and the Builder directly and prints the results to the console.

##Clean Code Principles

###1. Meaningful Names
Meaningful names are used throughout the project.

Examples:

- `flowers`
- `wrapping`
- `greetingCard`
- `createRoseBouquet()`
- `createMixedBouquet()`
These names clearly describe their purpose.

###2. Single Responsibility

Each class has a clear responsibility:
- `Bouquet` represents the product.
- `Bouquet.Builder` constructs the product.
- `BouquetDirector` provides predefined configurations.
- `Main` tests the application.
This makes the project easier to understand and maintain.

###3. Small Methods
Methods are kept small and focused on one task.
For example, `addFlower()` only adds a flower, while `setRibbon()` only sets the ribbon.
The Director methods also contain only the steps required to create a particular bouquet.

###4. Validated Construction
The `build()` method validates the bouquet before creating it.
A bouquet cannot be created without at least one flower.
Example:

    if (flowers.isEmpty()) {
        throw new IllegalStateException("A bouquet must contain at least one flower.");
    }
This prevents invalid objects from being created.

###5. Avoiding Unclear Values
The project uses descriptive variable and method names instead of unclear names such as `x`, `a`, or `value`.
For example:

    setWrapping("Kraft paper")
    setRibbon("Red")
This makes the code easier to understand.

##Project Structure

    BouquetBuilder
    │
    ├── src
    │   └── bouquet
    │       ├── Bouquet.java
    │       ├── BouquetDirector.java
    │       └── Main.java
    │
    └── README.md

##How to Run
1. Open the project in IntelliJ IDEA.
2. Open `Main.java`.
3. Run the `main()` method.
4. The created bouquets will be displayed in the console.

##Example Output

    --- Bouquet ---
    Flowers: [Roses, Roses, Roses]
    Wrapping: Kraft paper
    Ribbon: Red
    Greenery: Yes
    Greeting card: None
    Delivery: No
    ---------------

##Technologies

- Java
- IntelliJ IDEA
- GitHub

##Author

Ulzhan Askar
