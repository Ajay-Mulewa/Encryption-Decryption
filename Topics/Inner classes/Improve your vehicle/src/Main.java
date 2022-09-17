class Vehicle {

    private String name;

    Vehicle (String name) {
        this.name = name;
    }

    class Engine {

        private final int horsePower;
        
        Engine (int horsePower) {
            this.horsePower = horsePower;
        }

        void start() {
            System.out.println("RRRrrrrrrr....");
        }

        void printHorsePower() {
            System.out.printf("Vehicle %s has %d horsepower.%n", Vehicle.this.name, this.horsePower);
        }
    }
}

// this code should work
class EnjoyVehicle {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Dixi");
        Vehicle.Engine engine = vehicle.new Engine(15);
        engine.printHorsePower();
    }
}
