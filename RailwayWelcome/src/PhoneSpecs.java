
// This class demonstrates Java primitive data types using phone specifications.
public class PhoneSpecs {

    public static void main(String[] args) {

        // byte: Suitable for small integer values such as the number of SIM slots.
        byte simSlots = 2;

        // short: Suitable for small whole numbers such as battery capacity in mAh.
        short batteryCapacity = 5000;

        // int: Suitable for whole numbers such as phone storage in GB.
        int storage = 256;

        // long: Suitable for large integer values such as a phone's IMEI number.
        long imeiNumber = 123456789012345L;

        // float: Suitable for decimal values with single precision, such as screen size.
        float screenSize = 6.7f;

        // double: Suitable for decimal values requiring more precision, such as phone price.
        double phonePrice = 45999.99;

        // char: Suitable for storing a single character such as the phone's grade.
        char phoneGrade = 'A';

        // boolean: Suitable for storing true or false values such as 5G support.
        boolean supports5G = true;

        // String: Suitable for storing text such as the phone's brand and model.
        String phoneName = "Samsung Galaxy S Series";

        // Print all phone specifications.
        System.out.println("----- Phone Specifications -----");
        System.out.println("SIM Slots: " + simSlots);
        System.out.println("Battery Capacity: " + batteryCapacity + " mAh");
        System.out.println("Storage: " + storage + " GB");
        System.out.println("IMEI Number: " + imeiNumber);
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("Phone Price: Rs. " + phonePrice);
        System.out.println("Phone Grade: " + phoneGrade);
        System.out.println("5G Support: " + supports5G);
        System.out.println("Phone Name: " + phoneName);

    }
}
