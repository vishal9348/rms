package com.vishal.rms.dto;

import com.vishal.rms.entity.HotelContactInfo;
import lombok.Data;

@Data
public class HotelDTO {
    private Long id;
    private String name;
    private String city;
    private String[] photos;
    private String[] amenities;
    private HotelContactInfo contactInfo;
    private Boolean active;
}
