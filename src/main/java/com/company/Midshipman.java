package com.company;

public final class Midshipman extends Rank {

    private String subdivision;
    final String typeArmy = "Marine Corps";
    private String badge;
    private String category;
    Midshipman(){
    }
    public Midshipman(String typeArmy, String name, String category, String badge, String subdivision) {
        super(name);
        this.badge = badge;
        this.subdivision = subdivision;
        this.category = category;
    }

    public String getBadge() {
        return badge;
    }

    public String getSubdivision() {
        return subdivision;
    }

    public String getCategory() {
        return category;
    }

    public String getTypeArmy() {
        return typeArmy;
    }

    public void setBadge(String badge) {
        this.badge = badge;
    }


    public void setSubdivision(String subdivision) {
        this.subdivision = subdivision;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String toString() {
        return "name:" + getName() + " , typeArmy: " + typeArmy + ", subdivision:" + subdivision + ", badge:" + badge + ", category:" + category;
    }

    public void display() {
    }
}
