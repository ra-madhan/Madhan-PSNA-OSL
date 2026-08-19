

public  class Main {
    public static void main(String[] args){
        System.out.println("Hello World!");
        Order order=new Order(123,"Pending");
    }
}
class Order {
    int orderId;
    String orderStatus;
    Order(int orderId,String orderStatus){
        this.orderId=orderId;
        this.orderStatus=orderStatus;
        System.out.println("Your order id:"+orderId+" is "+orderStatus);

    }
}