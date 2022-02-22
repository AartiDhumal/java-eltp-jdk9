package com.vehicle;

import Vehicle.Type.VehicleType.VehicleType;
import VehiclePrice.VehiclePrice.VehiclePrice;

public class Main {
    public static void main(String[] args) {
        VehicleType obj_vt=new VehicleType();
        VehiclePrice obj_vp=new VehiclePrice();
        System.out.println("Price is:: "+obj_vp.price);
        System.out.println("Speed is "+obj_vt.speed+" "+"Mileage is:: "+obj_vt.mileage+" "+"Name is:: "+obj_vt.name);
    }
}
