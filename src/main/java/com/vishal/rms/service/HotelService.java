package com.vishal.rms.service;

import com.vishal.rms.dto.HotelDTO;
import com.vishal.rms.dto.HotelInfoDto;

import java.util.List;

public interface HotelService {
    HotelDTO createNewHotel(HotelDTO hotelDto);
    HotelDTO getHotelById(Long id);
    HotelDTO updateHotelById(Long id, HotelDTO hotelDto);
    void deleteHotelById(Long id);
    void activateHotel(Long hotelId);
    HotelInfoDto getHotelInfoById(Long hotelId);
    List<HotelDTO> getAllHotels();
}
