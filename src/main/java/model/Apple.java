package model;
import static model.constants.Color.*;
import static model.constants.Discount.*;

public class Apple extends Food {
    public String color;

    public Apple(int extAmount, double extPrice, String color) {
        super(extAmount, extPrice, true);
        this.color = color;

    }
    @Override
    public double getDiscount() {
        if (this.color.equals(RED_APPLE)) {
            return DISCOUNT_60;
        }
        return DISCOUNT_0;
    }

}
