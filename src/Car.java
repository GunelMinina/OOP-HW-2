import java.util.ArrayList;
/*
Напишите класс Car.
В классе должна храниться следующая информация:
название автомобиля - model;
год выпуска - year;
стоимость - price;
цвет - color;
объем двигателя - power.
 */


public class Car {
   private String model;
   private int year;
    private double price;
    private String color;
    private double power;
    private boolean indrive = false;
    private ArrayList<String> RoadList = new ArrayList<>();


   Car( String model, int year, double price, String color, double power){
    this.model=model;
    this.year=year;
    this.price=price;
    this.color=color;
    this.power=power;

   }

   public void getInfo(){
      System.out.println(this.model+ " " + this.year+ " " + this.price+ " " + this.color+ " " + this.power+ " ");
   }
   public String getModel(){
       return this.model;
   }

   public void setModel(String model){
        this.model = model;
   }

   public void start(){
       this.indrive = true;
   }
    public void stop(){
        this.indrive = false;
    }
    private void road(String address){
       if (this.indrive){
           System.out.println(this.model + " едет по адресу: " + address);
       } else {
           System.out.println("Никуда не едем. Заведите двигатель.");
       }
   }
    public void addRoadList(String street){
       this.RoadList.add(street);
    }

    public void printRoadList(){
        System.out.println(this.RoadList);
    }

    public void drive(){
       this.start();
       for (String address : this.RoadList)
       {
           this.road(address);
       }
       this.stop();
    }
    }