package com.spdb.aop;

/**
 * @Author Yang Qi
 * @Date 2020/8/26 14:21
 */
class Car extends Vehicle
{
    public static void main (String[] args)
    {
        Car c = new  Car();
        c.run();
    }
    private final void run()
    {
        System. out. println ("Car");
    }
}
class Vehicle
{
    private final void run()
    {
        System. out. println("Vehicle");
    }
}

