import model.Food;
import model.Apple;
import model.Meat;
import static model.constants.Color.GREEN_APPLE;
import static model.constants.Color.RED_APPLE;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        Meat meat_1 = new Meat(5, 100, false);
        Apple appleRed = new Apple(10, 50, RED_APPLE);
        Apple appleGreen = new Apple(8, 60, GREEN_APPLE);
        Food[] foodArray = {meat_1, appleRed, appleGreen};
        ShoppingCart cart = new ShoppingCart(foodArray);
        System.out.printf("Общая сумма товаров без скидки: %.1f \nОбщая сумма товаров со скидкой: %.1f \nСумма всех вегетарианских продуктов без скидки: %.1f", cart.getSumWithoutDiscount(), cart.getSumWithDiscount(), cart.getSumVegWithoutDiscount());
    }

}



