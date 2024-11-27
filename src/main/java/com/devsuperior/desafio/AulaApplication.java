package com.devsuperior.desafio;

import com.devsuperior.entities.Order;
import com.devsuperior.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.devsuperior"})
public class AulaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);
	}

	@Autowired
	OrderService orderService;

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Pedido 1");

		Order pedido1 = new Order(1034, 800.0, 10.0);

		System.out.println(pedido1.toString());

		System.out.println("valor total: " + orderService.total(pedido1));
	}
}
