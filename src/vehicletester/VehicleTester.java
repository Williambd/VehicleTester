/**
 * Created by Williambd
 * on 2019-05-01
 * as a project for class
 */
package vehicletester;

import java.util.Scanner;

/**
 *
 * @author lidea9928
 */
public class VehicleTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicle car1 = new Vehicle(7.5, 60.0, 60.0, 0.0,3,4.9);
        System.out.println("What is the price of gas today in $/L");
        Scanner sc = new Scanner(System.in);
        car1.setGasPrice(sc.nextDouble());
        //Show Vehicle Info
        System.out.println(car1);

        //Drive car for 100km
        car1.driveVehicle(100.0);
        System.out.println(car1);

        //Drive car for 450 kms
        car1.driveVehicle(450.0);
        System.out.println(car1);

        //Try to drive 1000 km - runs out of gas
        car1.driveVehicle(1000.0);
        System.out.println(car1);

        //Add 25L of gas
        car1.addFuel(25.0);
        System.out.println(car1);

        //Try to add 100 L of gas
        car1.addFuel(100.0);
        System.out.println(car1);
    }

}
