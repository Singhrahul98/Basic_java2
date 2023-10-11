package com.samplepage.Relevel.OOPS;

class Dream {
    private int milage;
    private int speed;

    public void setDetail (int milage, int speed){
        this.speed = speed;
        this.milage = milage;
    }


    public void setMilage(int m){
        this.milage=m;
    }

    public void setSpeed(int speed){
        this.speed=speed;
    }

    public int getMilage(){
        return this.milage;
    }

    public int getspeed(){
        return this.speed;
    }
}

 public class Classes1 {
    public static void main(String[] args) {

        Dream bmw = new Dream();
        Dream i10 = new Dream();
        Dream auidi = new Dream();

        auidi.setDetail(10, 120);
        bmw.setMilage(12);
        bmw.setSpeed(150);
        i10.setMilage(15);
        i10.setSpeed(70);

        System.out.println(bmw.getMilage());
        System.out.println(bmw.getspeed());
        System.out.println(i10.getMilage());
        System.out.println(i10.getspeed());
        
    }

}
