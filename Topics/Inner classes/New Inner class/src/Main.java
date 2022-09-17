class Vehicle {

    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    class Engine {

        void start() {
            System.out.println("RRRrrrrrrr....");
        }

    }

    class Body {

        private String colour;

        public Body(String colour) {
            this.colour = colour;
        }

        void printColor() {
            System.out.println("Vehicle " + Vehicle.this.name + " has " + this.colour + " body.");
        }
    }
}

// this code should work
class EnjoyVehicle {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Dixi");
        Vehicle.Body body = vehicle.new Body("red");
        body.printColor();
    }
}