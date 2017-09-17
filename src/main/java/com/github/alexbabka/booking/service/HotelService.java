package com.github.alexbabka.booking.service;

import com.github.alexbabka.booking.bean.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class HotelService {
    public List<Hotel> findHotels() {
        return IntStream.range(0, 1000)
                .mapToObj(value -> new Hotel("Name" + value, "Location" + value))
                .collect(Collectors.toList());
    }
}
