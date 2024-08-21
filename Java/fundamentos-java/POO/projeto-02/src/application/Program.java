

package application;

import entities.Order;
import entities.enums.OrderStatus;

import java.util.*;

public class Program {



	public static void main(String[] args) {


		Order order = new Order(1080,new Date(), OrderStatus.PENDING_PAYMENT);

		System.out.println(order);

	}




}
