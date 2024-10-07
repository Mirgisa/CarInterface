public class MainCar {
        public static void main(String[] args) {
                Car1 toyota = new FourDoorToyota1("289",2020,"Diesel","Toyota");
                Car1 bmw = new FourDoorBMW1("539",2022,"petrol","Bmw");
                Car1 ford = new FourDoorFord1("301",2019,"Diesel","Ford");
                Car1 hyundai = new FourDoorHyundai1("111",2024,"Petrol","Hyundai");
                System.out.println(toyota);
                System.out.println(bmw);
                System.out.println(ford);
                System.out.println(hyundai);
                toyota.run();
                toyota.repair();
                toyota.stop();

                Car1 toyota1 = new TwoDoorToyota1("289 ",2, "Japan","Toyota");
                Car1 bmw1 = new TwoDoorBMW1("539",8,"Uk ","BMW");
                Car1 ford1 = new TwoDoorFord1("301",10,"German","Ford");
                Car1 hyundai1 = new TwoDoorHyundai1("111",5,"Turkey","Hyundai");

                System.out.println(toyota1);
                System.out.println(bmw1);
                System.out.println(ford1);
                System.out.println(hyundai1);
                toyota1.run();
                toyota1.repair();
                toyota1.stop();

                bmw1.run();
                bmw1.repair();
                bmw1.stop();

                ford1.run();
                ford1.repair();
                ford1.stop();

                hyundai1.run();
                hyundai1.repair();
                hyundai1.stop();

        }
}

