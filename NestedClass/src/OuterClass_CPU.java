public class OuterClass_CPU {

    double price;

    // nested class
    class NestedClass_Processor {
        // members of nested class
        double cores;
        String manufacturer;

        double getCache(){
            return 4.3;
        }
    }

    // nested protected class
    protected class NestedClass_RAM {

        // members of protected nested class
        double memory;
        String manufacturer;

        double getClockSpeed() {
            return 5.5;
        }
    }
}
