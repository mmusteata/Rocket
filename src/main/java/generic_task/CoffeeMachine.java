package generic_task;

//    Write generic DataTransfer class for aggregating two objects. Use it in passing two coffees from CoffeeMachine
//    (with method .makeCoffee(), that creates two types of coffee, for example, an Coffee and a Waiter)
//    to class Waiter with method .serveCoffee. Use these classes in flow, where coffee will be created and
//    passed to clients (just call related methods, I dont expect much logic in here)

import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine {

   private static List<String> coffeeList = new ArrayList<>();
   private static Coffee<String> coffeeType = new Coffee<>(coffeeList);

    public static void makeCoffee(){
        for (int i = 0; i < coffeeList.size() ; i++) {
            coffeeType.setT(coffeeList);
        }
    }

    public static List<String> orderCoffee(String ... coffee){
        for (int i = 0; i < coffee.length ; i++) {
            coffeeList.add(coffee[i]);
        }
        return coffeeList;
    }

    public static void serveCoffee(){
        coffeeType.getT();
    }
}
