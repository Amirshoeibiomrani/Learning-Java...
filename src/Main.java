//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Car car = new Car();
//        int a = 10;
//        int b = 5;
//        car.printSum(a,b);
//
//        car.printSum(15,35 );
        int sum = car.getSum(5,50,35);
        System.out.println(sum/2);
    }
}