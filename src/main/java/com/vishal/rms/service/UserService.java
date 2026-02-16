package com.vishal.rms.service;

import com.vishal.rms.dto.ProfileUpdateRequestDTO;
import com.vishal.rms.dto.UserDto;
import com.vishal.rms.entity.User;

public interface UserService {
    User getUserById(Long id);

    void updateProfile(ProfileUpdateRequestDTO profileUpdateRequestDto);

    UserDto getMyProfile();
}
