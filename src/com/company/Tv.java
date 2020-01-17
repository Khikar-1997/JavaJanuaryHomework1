package com.company;

public class Tv {
    private int channel;
    private int volumeLevel;
    private boolean on;

    public Tv(int channel, int volumeLevel, boolean on) {
        this.channel = channel;
        this.volumeLevel = volumeLevel;
        this.on = on;
    }

    public Tv() {
    }

    public void turnOnOrOffTv() {
        if (on) {
            System.out.println("Tv is turn on" + " and have " + this.channel + " channel, " + "volume level is " + this.volumeLevel + ".");
        } else {
            System.out.println("Tv is turn off.");
        }
    }

    //region Getter and Setter
    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
    //endregion
}
