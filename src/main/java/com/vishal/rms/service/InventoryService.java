package com.vishal.rms.service;

import com.vishal.rms.dto.HotelPriceDTO;
import com.vishal.rms.dto.HotelSearchRequest;
import com.vishal.rms.dto.InventoryDTO;
import com.vishal.rms.dto.UpdateInventoryRequestDTO;
import com.vishal.rms.entity.Room;
import org.springframework.data.domain.Page;

import java.nio.file.AccessDeniedException;
import java.util.List;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteAllInventories(Room room);

    Page<HotelPriceDTO> searchHotels(HotelSearchRequest hotelSearchRequest);

    List<InventoryDTO> getAllInventoryByRoom(Long roomId) throws AccessDeniedException;

    void updateInventory(Long roomId, UpdateInventoryRequestDTO updateInventoryRequestDto) throws AccessDeniedException;
}
