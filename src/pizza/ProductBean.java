/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizza;

/**
 *
 * @author dedsec
 */
public class ProductBean {
    private int id;
    private String name;
    private float price;
    private int qauntity;
    private String date;
    
    public ProductBean(int id,String name,float price,int qauntity,String date){
        this.id=id;
        this.name=name;
        this.price=price;
        this.qauntity=qauntity;
        this.date=date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setFees(float price) {
        this.price = price;
    }
    public String getDate() {
        return date;
    }
     
    public void setQuantity(int quantity){
        this.qauntity = quantity;
    }
    public int getQuantity(){
         return qauntity;
    }
   
    
}
