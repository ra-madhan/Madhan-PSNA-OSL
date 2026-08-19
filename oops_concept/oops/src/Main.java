
enum orderStatusS{
    PENDING,SHIPPED,DELIVERED,CANCELLED,REFUNDED
}
public  class Main {
    public static void main(String[] args){
        System.out.println("Hello World!");
        Order order=new Order(123,orderStatusS.REFUNDED);
    }
}

class Order {
    public  int orderId;
    public orderStatusS orderStatus;

    Order(int orderId,orderStatusS orderStatus){
        this.orderId=orderId;
        this.orderStatus=orderStatus;
        System.out.println("Your order id:"+orderId+" is "+orderStatus);

    }
}