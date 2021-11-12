package com.example.cooklet_victor_work;

public class Dataset {

    private int[] images_beef = {R.drawable.type_beef, R.drawable.type_beef, R.drawable.type_beef, R.drawable.type_beef, R.drawable.type_beef, R.drawable.type_beef, R.drawable.type_beef, R.drawable.type_beef, R.drawable.type_beef, R.drawable.type_beef, R.drawable.type_beef, R.drawable.type_beef, R.drawable.type_beef, R.drawable.type_beef};

    private int[] images_fish = {R.drawable.type_fish, R.drawable.type_fish, R.drawable.type_fish, R.drawable.type_fish, R.drawable.type_fish, R.drawable.type_fish, R.drawable.type_fish, R.drawable.type_fish, R.drawable.type_fish, R.drawable.type_fish, R.drawable.type_fish, R.drawable.type_fish, R.drawable.type_fish, R.drawable.type_fish};

    private int[] image_chicken = {R.drawable.type_chicken, R.drawable.type_chicken, R.drawable.type_chicken, R.drawable.type_chicken, R.drawable.type_chicken, R.drawable.type_chicken, R.drawable.type_chicken, R.drawable.type_chicken, R.drawable.type_chicken, R.drawable.type_chicken, R.drawable.type_chicken, R.drawable.type_chicken, R.drawable.type_chicken, R.drawable.type_chicken};

    private int[] image_pork = {R.drawable.type_pork, R.drawable.type_pork, R.drawable.type_pork, R.drawable.type_pork, R.drawable.type_pork, R.drawable.type_pork, R.drawable.type_pork, R.drawable.type_pork, R.drawable.type_pork, R.drawable.type_pork, R.drawable.type_pork, R.drawable.type_pork, R.drawable.type_pork, R.drawable.type_pork};

    private int[] image_lamp = {R.drawable.type_lamp, R.drawable.type_lamp, R.drawable.type_lamp, R.drawable.type_lamp, R.drawable.type_lamp, R.drawable.type_lamp, R.drawable.type_lamp, R.drawable.type_lamp, R.drawable.type_lamp, R.drawable.type_lamp, R.drawable.type_lamp, R.drawable.type_lamp, R.drawable.type_lamp, R.drawable.type_lamp};

    private int[] image_duck = {R.drawable.type_duck, R.drawable.type_duck, R.drawable.type_duck, R.drawable.type_duck, R.drawable.type_duck, R.drawable.type_duck, R.drawable.type_duck, R.drawable.type_duck, R.drawable.type_duck, R.drawable.type_duck, R.drawable.type_duck, R.drawable.type_duck, R.drawable.type_duck, R.drawable.type_duck};

    private int[] image_vegetable = {R.drawable.type_vegetable, R.drawable.type_vegetable, R.drawable.type_vegetable, R.drawable.type_vegetable, R.drawable.type_vegetable, R.drawable.type_vegetable, R.drawable.type_vegetable, R.drawable.type_vegetable, R.drawable.type_vegetable, R.drawable.type_vegetable, R.drawable.type_vegetable, R.drawable.type_vegetable, R.drawable.type_vegetable, R.drawable.type_vegetable};

    int[][] image_list = {images_beef, images_fish, image_chicken, image_duck, image_lamp, image_pork, image_vegetable};

    public Dataset(){

    };

    public Dataset(int[] images_beef, int[] images_fish, int[] image_chicken, int[] image_pork, int[] image_lamp, int[] image_duck, int[] image_vegetable, int[][] image_list) {
        this.images_beef = images_beef;
        this.images_fish = images_fish;
        this.image_chicken = image_chicken;
        this.image_pork = image_pork;
        this.image_lamp = image_lamp;
        this.image_duck = image_duck;
        this.image_vegetable = image_vegetable;
        this.image_list = image_list;
    }

    public int[][] getImage_list() {
        return image_list;
    }

    public void setImage_list(int[][] image_list) {
        this.image_list = image_list;
    }

    public int[] getImages_beef() {
        return images_beef;
    }

    public void setImages_beef(int[] images_beef) {
        this.images_beef = images_beef;
    }

    public int[] getImages_fish() {
        return images_fish;
    }

    public void setImages_fish(int[] images_fish) {
        this.images_fish = images_fish;
    }

    public int[] getImage_chicken() {
        return image_chicken;
    }

    public void setImage_chicken(int[] image_chicken) {
        this.image_chicken = image_chicken;
    }

    public int[] getImage_pork() {
        return image_pork;
    }

    public void setImage_pork(int[] image_pork) {
        this.image_pork = image_pork;
    }

    public int[] getImage_lamp() {
        return image_lamp;
    }

    public void setImage_lamp(int[] image_lamp) {
        this.image_lamp = image_lamp;
    }

    public int[] getImage_duck() {
        return image_duck;
    }

    public void setImage_duck(int[] image_duck) {
        this.image_duck = image_duck;
    }

    public int[] getImage_vegetable() {
        return image_vegetable;
    }

    public void setImage_vegetable(int[] image_vegetable) {
        this.image_vegetable = image_vegetable;
    }
}
