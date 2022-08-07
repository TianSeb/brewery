package com.tianseb.brewery.services;

import com.tianseb.brewery.web.model.CustomerDto;
import java.util.UUID;
public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
