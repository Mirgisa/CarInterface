
public interface Car {


        void run();
        void stop();
        void repair();
    }
abstract class FourDoorCar implements Car {
        protected String model;
        protected int year;
        protected String engineType;

        public FourDoorCar(String model,int year,String engineType) {
                this.model = model;
                this.year =year;
                this.engineType= engineType;
        }
        @Override
        public void run() {
                System.out.println(model + " is running." +"Year :"+year+ " Engine Type :"+ engineType);
        }

        @Override
        public void stop() {
                System.out.println(model + " has stopped."+"Year :"+year+ " Engine Type :"+ engineType);
        }

        @Override
        public void repair() {
                System.out.println(model + " is being repaired."+"Year :"+year+ " Engine Type :"+ engineType);
        }
}
class FourDoorToyota extends FourDoorCar {
        public FourDoorToyota() {
                super("Toyota Four Door",2020,"Diesel");
        }

}
// FourDoorBMW class extending FourDoorCar
class FourDoorBMW extends FourDoorCar {
        public FourDoorBMW() {
                super("BMW Four Door",2018,"Petrol");
        }

}
// FourDoorFord class extending FourDoorCar
class FourDoorFord extends FourDoorCar {
        public FourDoorFord() {
                super("Ford Four Door",2019,"Flat");
        }
}
// FourDoorHyundai class extending FourDoorCar
class FourDoorHyundai extends FourDoorCar {
        public FourDoorHyundai() {
                super("Hyundai Four Door",2021,"Petrol");
        }
}
// Abstract class for TwoDoorCar
abstract class TwoDoorCar implements Car {
        protected String model;
        protected int seat;
        protected String country;


        public TwoDoorCar(String model,int seat,String country) {
                this.model = model;
                this.seat =seat;
                this.country= country;
        }

        // Implement the common methods for TwoDoor cars
        @Override
        public void run() {
                System.out.println(model + " is running. "+"It has "+seat+" seats"+ "Made in "+country);
        }

        @Override
        public void stop() {
                System.out.println(model + " has stopped."+"It has "+seat+" seats"+ "Made in "+country);
        }

        @Override
        public void repair() {
                System.out.println(model + " is being repaired."+"It has "+seat+" seats"+ "Made in "+country);
        }
}
// TwoDoorToyota class extending TwoDoorCar
class TwoDoorToyota extends TwoDoorCar {
        public TwoDoorToyota() {
                super("Toyota Two Door",4,"Japan");
        }
}
// TwoDoorBMW class extending TwoDoorCar
class TwoDoorBMW extends TwoDoorCar {
        public TwoDoorBMW() {
                super("BMW Two Door",5,"Italy");
        }
}
// TwoDoorFord class extending TwoDoorCar
class TwoDoorFord extends TwoDoorCar {
        public TwoDoorFord() {
                super("Ford Two Door",6,"Uk");
        }
}
// TwoDoorHyundai class extending TwoDoorCar
class TwoDoorHyundai extends TwoDoorCar {
        public TwoDoorHyundai() {
                super("Hyundai Two Door",8,"china");
        }

}

