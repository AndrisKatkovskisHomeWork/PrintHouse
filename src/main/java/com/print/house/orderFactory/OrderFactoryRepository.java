package com.print.house.orderFactory;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface OrderFactoryRepository extends PagingAndSortingRepository<OrderFactory, Integer> {
//    List<Booking> findByDayAndBicycle(Day d, Bicycle b);
}