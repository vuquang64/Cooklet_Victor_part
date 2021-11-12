package com.example.cooklet_victor_work;

public class ReipeData {
    //Recipe recipe=new Recipe();
    String r1_step[]={"step1","step2","step3"};
    String[] prepare={"Beef","Tomato","Onion","Shallot","Garlic","Corn Starch", "Sugar", "Broth mix", "Oil", "Fish sauce"};
    double[] value={300,500,100,60,20,25,30,15,45,30};
    String[] measurement={"g","g","g","g","g","g","g","g","ml","ml"};
    Recipe r1=new Recipe("stick", 0001, 4.5, "Beef", "Cooked Beef ", r1_step, false,prepare,value,measurement);
}
