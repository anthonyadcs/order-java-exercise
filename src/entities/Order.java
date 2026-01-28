package entities;

import entities.enums.OrderStatus;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private final Date moment;
    private OrderStatus status;
    private final Client client;
    private List<OrderItem> orderItems = new ArrayList<>();

    public Order(OrderStatus status, Client client){
        this.moment = new Date();
        this.client = client;
        setStatus(status);
    }

    //METODO PARA ADICIONAR ITEM DA LISTA DE ITENS
    public void addItem(OrderItem item){
        orderItems.add(item);
    }

    //METODO PARA REMOVER ITEM DA LISTA DE ITENS
    public void removeItem(OrderItem item){
        orderItems.remove(item);
    }

    //METODO PARA CALCULAR O TOTAL DO VALOR DO PEDIDO
    public Double total() {
        double sum = 0;

        for(OrderItem order : orderItems){
            sum += order.subTotal();
        }

        return sum;
    }

    //METODO TOSTRING FORMATADO DE ACORDO COM OS OBJETIVOS DO EXERCÍCIO
    @Override
    public String toString() {
        //FORMATADOR DE DATAS PARA RECONHECER E FORMATAR O PADRÃO "DD/MM/YYYY HH:mm"
        DateTimeFormatter momentFmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        //FORMATADOR DE DATAS PARA RECONHECER E FORMATAR O PADRÃO "DD/MM/YYYY"
        DateTimeFormatter birthDateFmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        //FORMATAÇÃO DA DATA DO MOMENTO EM QUE FOI FEITA A COMPRA
        String formattedMoment = getMoment()
                .toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime()
                .format(momentFmt);
        Client client = getClient();

        //FORMATAÇÃO DA DATA DA DATA DE ANIVERSÁRIO DO CLIENTE
        String formattedClientBirthDate = getClient()
                .getBirthDate()
                .toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate()
                .format(birthDateFmt);

        //STRING QUE ARMAZENA TODOS OS ELEMENTOS
        StringBuilder formattedOrderItems = new StringBuilder();
        for(OrderItem orderItem : orderItems){
            formattedOrderItems.append(orderItem);
        }

        return "Order moment: " + formattedMoment + "\n"
                + "Order status: " + getStatus() + "\n"
                + "Client: " + client.getName() + " - (" + formattedClientBirthDate + ") - " + client.getEmail() + "\n"
                + "Order items: " + formattedOrderItems + "\n"
                + "Total price: $" + String.format("%.2f", total());
    }

    //GETTERS E SETERS
    public Client getClient() {
        return client;
    }

    public Date getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
}
