package entities;

import entities.enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	private Date moment;
	private Client client;
	private OrderStatus status;
	private List<OrderItem> items=new ArrayList<>();

	public Order(Date moment, OrderStatus status,Client client) {
		this.moment = moment;
		this.status = status;
		this.client=client;
	}

	public Date getMoment() {
		return moment;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getItems() {
		return items;
	}



	public void addItem(OrderItem item){
		items.add(item);

	}

	public void removeItem(OrderItem item){
		items.remove(item);
	}

	public double total(){
		Double sum=0.0;
		for(OrderItem item:items){
			sum+=item.subTotal();
		}
		return sum;
	}

	@Override
	public String toString() {
		return "Order{" +
				"moment=" + moment +
				", client=" + client +
				", status=" + status +
				", items=" + items +
				'}';
	}
}
