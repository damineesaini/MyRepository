package com.IntroductionJava1;

enum HouseType
{
    Flat, Floor, Villa, Bunglow
}

public class ques9demo {
    HouseType house;

    public ques9demo(HouseType house)
    {
        this.house = house;
    }

    public int getPrice()
    {
        switch (house)
        {
            case Flat:
                return 200000;
            case Floor:
                return 1400000;
            case Villa:
                return 5000000;
            case Bunglow:
                return 20000000;
            default:
                return -1;
        }
    }


    public static void main(String[] args)
    {
        String house_type="Villa";
        ques9demo object = new ques9demo(HouseType.valueOf(house_type));
        System.out.println("Price for " + house_type + " : Rs." + object.getPrice());
    }
}
