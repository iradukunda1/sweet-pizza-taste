/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizza;

/**
 *
 * @author dedsec
 */
public class OrderBean {
    private int id;
    private String type;
    private String size;
    private float price;
    private float amount; 
    private String orderstatus;
    private int qauntity;
    private final String date;
    
    public OrderBean(int id,String type,String size,float price,float amount, String status,int qauntity ,String date){
        this.id=id;
        this.type=type;
        this.price=price;
        this.qauntity=qauntity;
        this.amount=amount;
        this.size=size;
        this.orderstatus=status;
        this.date=date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
     
    public void setSIze(String size){
        this.size = size;
    }
    public String  getSize(){
         return size;
    } 
    public void setStatus(String status){
        this.orderstatus = status;
    }
    
     public String getOrderStatus() {
         return orderstatus;
    }
   
    public void setAmount(float amount){
        this.amount = amount;
    }
    
    public int getAmount(){
         return (int) amount;
    }
   
    
}
