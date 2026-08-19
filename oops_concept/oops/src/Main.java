

public  class Main {
    public static void main(String[] args){
        System.out.println("Hello World!");
        Order order=new Order(123,"Pending");
    }
}
class Order {
    int orderId;
    String orderStatus;
    Order(int orderId){
        this.orderId=orderId;
        System.out.println("orderId:"+orderId);

    }
    Order(int orderId,String orderStatus ){
        this(orderId);
        this.orderStatus=orderStatus;
        System.out.println("Order status:"+orderStatus);
    }

}