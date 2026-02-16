package com.vishal.rms.repository;

import com.vishal.rms.entity.Hotel;
import com.vishal.rms.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepo extends JpaRepository<Hotel, Long> {
    List<Hotel> findByOwner(User user);
}
