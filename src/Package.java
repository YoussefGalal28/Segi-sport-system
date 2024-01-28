/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segisportsystem;

public class Package {
    private String name;
    private Facility facility;
    private double price;
    private int hour;

    public Package(String name, Facility facility, double price, int hour) {
        this.name = name;
        this.facility = facility;
        this.price = price;
        this.hour = hour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "Package -> " +
                "name = '" + name + '\'' +
                ", facility = " + facility +
                ", price = RM" + price +
                ", hour = " + hour;
    }
}

