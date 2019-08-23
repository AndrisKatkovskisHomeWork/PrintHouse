package com.print.house.orderFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderFactoryService {

//    @Autowired
//    UserRepository userRepository;

    @Autowired
    OrderFactoryRepository orderFactoryRepository;

    public List<OrderFactory> getAllOrderFactorys() {
        List<OrderFactory> orderFactorys = new ArrayList<>();
        orderFactoryRepository.findAll().forEach(orderFactorys::add);
        return orderFactorys;
    }

    public void addOrderFactory(OrderFactory orderFactory) {
        orderFactory.setEmail(SecurityContextHolder.getContext().getAuthentication().getName());
        orderFactoryRepository.save(orderFactory);
    }

    public void deleteOrderFactory(int id) {
        orderFactoryRepository.deleteById(id);
    }


}