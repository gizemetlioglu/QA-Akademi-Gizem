package week4;

import java.util.*;

public class HomeWorkWeek4 {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        User user1 = new User("Ahmet", "ahmet", "1234", "05552909999", "Istanbul/Avcilar");
        User user2 = new User("Mehmet", "mehmet", "1234+", "05552909998", "Kocaeli/Gebze");
        User user3 = new User("Ayse", "Ayse", "12345", "05552909997", "Konya/Meryem");
        User user4 = new User("Fatma", "Fatma", "A12345+", "05552909996", "Ordu/Unye");
        User user5 = new User("Auspicious", "ahmet", "1234", "05552909995", "Samsun/Carsamba");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);

        HashMap<String, HashMap<String, List<Product>>> categories = new HashMap<>();
        HashMap<String, List<Product>> fruitAndVegetableSubCategories = new HashMap<>();
        HashMap<String, List<Product>> snackSubCategories = new HashMap<>();
        HashMap<String, List<Product>> breakfastSubCategories = new HashMap<>();

        List<Product> fruits = new ArrayList<>();
        Product apple = new Product("apple", "Description", 5, 4);
        Product pear = new Product("pear", "Description", 5, 4);
        Product grape = new Product("grape", "Description", 5, 4);
        fruits.add(apple);
        fruits.add(pear);
        fruits.add(grape);
        fruitAndVegetableSubCategories.put("Fruit", fruits);

        List<Product> vegetables = new ArrayList<>();
        Product tomato = new Product("tomato", "Description", 5, 4);
        Product pepper = new Product("pepper", "Description", 5, 4);
        Product eggPlant = new Product("eggPlant", "Description", 5, 4);
        vegetables.add(tomato);
        vegetables.add(pepper);
        vegetables.add(eggPlant);
        fruitAndVegetableSubCategories.put("Vegetables", vegetables);
        categories.put("Fruits and Vegetables", fruitAndVegetableSubCategories);

        List<Product> chips = new ArrayList<>();
        Product lays = new Product("lays", "Description", 5, 4);
        Product doritos = new Product("doritos", "Description", 5, 4);
        Product ruffles = new Product("ruffles", "Description", 5, 4);
        chips.add(lays);
        chips.add(doritos);
        chips.add(ruffles);
        snackSubCategories.put("Chips", chips);

        List<Product> chocolates = new ArrayList<>();
        Product tadelle = new Product("tadelle", "Description", 5, 4);
        Product albeni = new Product("albeni", "Description", 5, 4);
        Product metro = new Product("metro", "Description", 5, 4);
        Product hobby = new Product("hobby", "Description", 5, 4);
        chocolates.add(tadelle);
        chocolates.add(albeni);
        chocolates.add(metro);
        chocolates.add(hobby);
        snackSubCategories.put("Chocolate", chocolates);
        categories.put("Snack", snackSubCategories);

        List<Product> milks = new ArrayList<>();
        Product fullFat = new Product("fullFat", "Description", 5, 4);
        Product lowFat = new Product("lowFat", "Description", 5, 4);
        Product lactoFree = new Product("lactoFree", "Description", 5, 4);
        milks.add(fullFat);
        milks.add(lowFat);
        milks.add(lactoFree);
        breakfastSubCategories.put("Milk", milks);

        List<Product> delicatessen = new ArrayList<>();
        Product cheddar = new Product("cheddar", "Description", 5, 4);
        Product cheese = new Product("cheese", "Description", 5, 4);
        Product salami = new Product("salami", "Description", 5, 4);
        Product sausage = new Product("sausage", "Description", 5, 4);
        Product olive = new Product("olive", "Description", 5, 4);
        delicatessen.add(cheddar);
        delicatessen.add(cheese);
        delicatessen.add(salami);
        delicatessen.add(sausage);
        delicatessen.add(olive);
        breakfastSubCategories.put("Delicatessen", delicatessen);
        categories.put("Breakfast", breakfastSubCategories);

        System.out.println("Main Menu");
        for (Map.Entry<String, HashMap<String, List<Product>>> entry : categories.entrySet()){
            System.out.println(entry.getKey());
        }
        Scanner scanner = new Scanner(System.in);
        String categorySelection = scanner.next();
        Map<String, List<Product>> subCategories = categories.get(categorySelection);
        for (Map.Entry<String, List<Product>> entry : subCategories.entrySet()){
            System.out.println(entry.getKey());
        }
        String subCategorySelection = scanner.next();
        List<Product> products = subCategories.get(subCategorySelection);
        for (Product product : products) {
            System.out.println(product.name);
        }
        String productSelection = scanner.next();
    }
}

class Product{
    public String name;
    public String description;
    public double price;
    public double reducedPrice;

    public Product(String name, String description, double price, double reducedPrice) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.reducedPrice = reducedPrice;
    }
}

class User{
    public String name;
    public String username;
    public String password;
    public String phone;
    public String address;

    public User(String name, String username, String password, String phone, String address) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.address = address;
    }
}
