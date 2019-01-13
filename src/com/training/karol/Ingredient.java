package com.training.karol;

public class Ingredient {

    private  String ingredientType;
    private int amount;

    public String getIngredientType() {
        return ingredientType;
    }

    public void setIngredientType(String ingredientType) {
        this.ingredientType = ingredientType;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Ingredient(String ingredientType, int amount) {
        this.ingredientType = ingredientType;
        this.amount = amount;
    }
}
