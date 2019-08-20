package com.javarush.task.task17.task1714;

/* 
Comparable
*/

public class Beach implements Comparable<Beach>{
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public static synchronized void main(String[] args) {

    }

    @Override
    public synchronized int compareTo(Beach beach) {
        int resDist;
        int resQuality;
        if(this.distance - beach.distance > 0){
            resDist = -1;
        }else if (this.distance - beach.distance == 0){
            resDist = 0;
        }else {resDist = 1;}
        if(this.quality - beach.quality > 0){
            resQuality = 1;
        }else if (this.quality - beach.quality == 0){
            resQuality = 0;
        }else {resQuality = -1;}
        return resDist + resQuality;
    }
}
