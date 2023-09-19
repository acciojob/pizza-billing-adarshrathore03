package com.driver;

public class Pizza {

    private int billPrice;
    private Boolean isVeg;
    private String bill;//take care of total bill string format
    private int cheesePrice;
    private int toppingPrice;
    private int paperBagPrice;
    private boolean isCheeseAdded;
    private boolean isToppingAdded;
    private boolean isPaperBagAdded;
    private boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.billPrice = 300;
            this.toppingPrice = 70;
        }
        else{
            this.billPrice = 400;
            this.toppingPrice = 120;
        }
        this.cheesePrice = 80;
        this.paperBagPrice = 20;

        this.bill = "Base Price Of The Pizza: "+this.billPrice+"\n";

    }

    public int getPrice(){
        return this.billPrice;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheeseAdded){
            this.billPrice = this.billPrice +cheesePrice;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingAdded){
            this.billPrice = this.billPrice +toppingPrice;
            isToppingAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isPaperBagAdded){
            this.billPrice = this.billPrice + paperBagPrice;
            isPaperBagAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated){
            if(isCheeseAdded){
                this.bill = this.bill+"Extra Cheese Added: "+this.cheesePrice+"\n";
            }
            if(isToppingAdded){
                this.bill = this.bill+"Extra Toppings Added: "+this.toppingPrice+"\n";
            }
            if(isPaperBagAdded){
                this.bill = this.bill+"Paperbag Added: "+this.paperBagPrice+"\n";
            }

            this.bill = this.bill+"Total Price: "+this.billPrice;
        }
        return this.bill;
    }
}
