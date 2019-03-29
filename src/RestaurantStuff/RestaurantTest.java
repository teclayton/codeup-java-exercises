package RestaurantStuff;

public class RestaurantTest {
    public static void main(String[] args) {

        RestaurantDish dish = new RestaurantDish();

        dish.nameOfDish = "Pizza Casserole";
        dish.costInCents = 1000;
        dish.wouldRecommend = false;

        System.out.println(dish.nameOfDish);
        System.out.println(dish.costInCents);
        System.out.println(dish.wouldRecommend);

        dish.eat();

    }
}
