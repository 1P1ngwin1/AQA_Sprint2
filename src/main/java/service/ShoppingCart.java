package service;
import model.Food;

public class ShoppingCart {

    Food[] sc_food_array;
    public ShoppingCart(Food[] ext_food_array){
        this.sc_food_array = new Food[ext_food_array.length];
        for (int i = 0; i < ext_food_array.length; i++){
            sc_food_array[i] = ext_food_array[i];
        }
    }

    public double getSumWithoutDiscount(){
        double sum = 0;
        for(int i = 0; i < sc_food_array.length; i++){
            sum = sum + (sc_food_array[i].getPrice() *  sc_food_array[i].getAmount());
        }
        return sum;
    }


    public double getSumWithDiscount(){
        double sum = 0;
        double discount = 0;
        for(int i = 0; i < sc_food_array.length; i++){
            discount = sc_food_array[i].getPrice() * sc_food_array[i].getDiscount() / 100;
            sum = sum + ((sc_food_array[i].getPrice() - discount) * sc_food_array[i].getAmount());

        }
        return sum;
    }


    public double getSumVegWithoutDiscount(){
        double sum = 0;
        for(int i = 0; i < sc_food_array.length; i++) {
            if (sc_food_array[i].isVegetarian()) {
                sum = sum + (sc_food_array[i].getPrice() * sc_food_array[i].getAmount());
            }
        }
        return sum;
    }

}