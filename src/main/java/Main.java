import model.Food;
import model.Apple;
import model.Meat;
import static model.constants.Color.GREEN_APPLE;
import static model.constants.Color.RED_APPLE;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        Meat meat_1 = new Meat(5, 100, false);
        Apple apple_red = new Apple(10, 50, RED_APPLE);
        Apple apple_green = new Apple(8, 60, GREEN_APPLE);
        Food[] food_array = {meat_1, apple_red, apple_green};
        ShoppingCart cart = new ShoppingCart(food_array);
        System.out.println("Общая сумма товаров без скидки: " + cart.getSumWithoutDiscount());
        System.out.println("Общая сумма товаров со скидкой: " + cart.getSumWithDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + cart.getSumVegWithoutDiscount());

    }

}



