package org.example.car;

public class GearBox {

    public final GearBoxType type;


    public GearBox(GearBoxType type) {
        this.type = type;
    }


    public GearBoxType getType() {
        return type;
    }
}
