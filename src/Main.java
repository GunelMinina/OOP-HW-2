public class Main {
    public static void main(String[] args) {
        Car car = new Car("toyota", 2020, 10000, "red", 200);
        car.getInfo();
        car.start();
        car.stop();
        car.setModel("Skoda");
        System.out.println(car.getModel());
        car.addRoadList("Строителей, 15");
        car.addRoadList("Ленина, 25");
        car.addRoadList("Циолковского, 3");
        car.printRoadList();
        car.drive();
    }
}