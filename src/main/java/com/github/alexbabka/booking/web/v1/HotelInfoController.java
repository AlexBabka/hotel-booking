package com.github.alexbabka.booking.web.v1;

import com.github.alexbabka.booking.bean.Hotel;
import com.github.alexbabka.booking.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1")
public class HotelInfoController {
    private HotelService hotelService;

    @Autowired
    public HotelInfoController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping(path = "hotels")
    public List<Hotel> getHotels() {
        return hotelService.findHotels();
    }
}
