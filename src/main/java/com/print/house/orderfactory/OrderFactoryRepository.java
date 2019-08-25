package com.print.house.orderfactory;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface OrderFactoryRepository extends PagingAndSortingRepository<OrderFactory, Integer> {
//    List<Booking> findByDayAndBicycle(Day d, Bicycle b);
}