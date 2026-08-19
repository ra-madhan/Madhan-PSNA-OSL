
enum orderStatusS{
    PENDING,SHIPPED,DELIVERED,CANCELLED,REFUNDED
}
public  class Main {
    public static void main(String[] args){
        System.out.println("Hello World!");
        Order order=new Order(123,orderStatusS.REFUNDED,989);
        //order.orderPrice=9684154;
        //order.setOrderprice(9999999);
    }
}

class Order {
    public  int orderId;
    public orderStatusS orderStatus;
    private int orderPrice;

    public int getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }

    Order(int orderId, orderStatusS orderStatus, int orderPrice){
        this.orderId=orderId;
        this.orderStatus=orderStatus;
        this.orderPrice=orderPrice;
        System.out.println("Your order id:"+orderId+" is "+orderStatus +" value is "+orderPrice);

    }
}