/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fuzzylogictest;

/**
 *
 * @author macbookpro
 */
public class RuleQueryString {
    private String service,tip,food,weight;
    private Boolean serviceIsNotBol,tipIsNotBol,foodIsNotBol,conOrIsBol,conAndIsBol;

    public RuleQueryString() {
        this.serviceIsNotBol = false;
        this.tipIsNotBol = false;
        this.foodIsNotBol = false;
        this.conOrIsBol=false;
                this.conAndIsBol=false;

    }
   
    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
        
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public Boolean getServiceIsNotBol() {
        return serviceIsNotBol;
    }

    public void setServiceIsNotBol(Boolean serviceIsNotBol) {
        this.serviceIsNotBol = serviceIsNotBol;
    }

    public Boolean getTipIsNotBol() {
        return tipIsNotBol;
    }

    public void setTipIsNotBol(Boolean tipIsNotBol) {
        this.tipIsNotBol = tipIsNotBol;
    }

    public Boolean getFoodIsNotBol() {
        return foodIsNotBol;
    }

    public void setFoodIsNotBol(Boolean foodIsNotBol) {
        this.foodIsNotBol = foodIsNotBol;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Boolean getConOrIsBol() {
        return conOrIsBol;
    }

    public void setConOrIsBol(Boolean conOrIsBol) {
        this.conOrIsBol = conOrIsBol;
    }

    public Boolean getConAndIsBol() {
        return conAndIsBol;
    }

    public void setConAndIsBol(Boolean conAndIsBol) {
        this.conAndIsBol = conAndIsBol;
    }
  
}
