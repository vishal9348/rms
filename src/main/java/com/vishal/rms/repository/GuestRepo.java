package com.vishal.rms.repository;

import com.vishal.rms.dto.GuestDTO;
import com.vishal.rms.entity.Guest;
import com.vishal.rms.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GuestRepo extends JpaRepository<Guest, Long> {
    List<GuestDTO> findByUser(User user);
}
