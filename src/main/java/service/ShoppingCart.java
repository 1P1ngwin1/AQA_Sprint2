package service;
import model.Food;

public class ShoppingCart {

    Food[] scFoodArray;

    public ShoppingCart(Food[] extFoodArray){
        this.scFoodArray = new Food[extFoodArray.length];
        for (int i = 0; i < extFoodArray.length; i++){
            scFoodArray[i] = extFoodArray[i];
        }
    }

    public double getSumWithoutDiscount(){
        double sum = 0;
        for (Food food : scFoodArray) {
            sum += food.getPrice() * food.getAmount();
        }
        return sum;
    }

    public double getSumWithDiscount(){
        double sum = 0;
        for (Food food : scFoodArray) {
            double discount = food.getPrice() * food.getDiscount() / 100;
            sum += (food.getPrice() - discount) * food.getAmount();
        }
        return sum;
    }

    public double getSumVegWithoutDiscount(){
        double sum = 0;
        for (Food food : scFoodArray) {
            if (food.isVegetarian()) {
                sum += food.getPrice() * food.getAmount();
            }
        }
        return sum;
    }
}