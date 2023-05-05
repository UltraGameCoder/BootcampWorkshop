package com.example.bootcamp_workshop;

import com.example.bootcamp_workshop.model.Customer;
import com.example.bootcamp_workshop.model.Invoice;
import com.example.bootcamp_workshop.model.InvoiceDetails;
import com.example.bootcamp_workshop.model.Product;
import com.example.bootcamp_workshop.repository.CustomerRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class BootcampWorkshopApplication implements ApplicationRunner {

	@Autowired
	private CustomerRepository customerRepository;

	public static void main(String[] args) {
		SpringApplication.run(BootcampWorkshopApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		ObjectMapper objectMapper = new ObjectMapper();
		InputStream inputStream = getClass().getResourceAsStream("/data.json");
		HashMap<String, JsonNode> data = objectMapper.readValue(inputStream, HashMap.class);

		List<Customer> customers = objectMapper.convertValue(data.get("customer"), new TypeReference<List<Customer>>() {});
		System.out.println("Customers: " + customers);

		customerRepository.saveAll(customers);
	}
}
