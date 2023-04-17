package com.prototype;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String input= sc.next();

        if(input.equalsIgnoreCase("car")){
            Car car= new Car();
            car.setType((String) VehicleType.CAR);
        }
    }
}
