package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        AlarmDoor_Class A_Door = new AlarmDoor_Class();

        final String White_Color = "white";
        A_Door.door_color = White_Color;

        final double High_A = 210.0;
        final double Wide_B = 125.5;
        A_Door.door_high = High_A;
        A_Door.door_wide = Wide_B;

        A_Door.Open_Door();
        A_Door.Close_Door();
        A_Door.Call_Alarm();
    }
}
