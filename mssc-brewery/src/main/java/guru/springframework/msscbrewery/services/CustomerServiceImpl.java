package guru.springframework.msscbrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import guru.springframework.msscbrewery.web.model.BeerDto;
import guru.springframework.msscbrewery.web.model.CustomerDto;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDto getCustomerById(UUID customerId) {
		return CustomerDto.builder().id(UUID.randomUUID()).name("Simon Jordan").build();
	}

	@Override
	public CustomerDto saveNewCustomer(CustomerDto customerDto) {
		// TODO Auto-generated method stub
		return CustomerDto.builder().id(UUID.randomUUID()).build();	
		}
	
	@Override
	public void deleteById(UUID beerId) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateCustomer(UUID customerId, CustomerDto customerDto) {
		// TODO Auto-generated method stub
		
	}
	
	
}
