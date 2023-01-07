package activities;

public class Activity1 {

        public static void main(String[] args) {
            Car SUV = new Car();
            SUV.make = 2014;
            SUV.color = "Black";
            SUV.transmission = "Manual";

            //Using Car class method
            SUV.displayCharacterstics();
            SUV.accelerate();
            SUV.brake();
        }


}


