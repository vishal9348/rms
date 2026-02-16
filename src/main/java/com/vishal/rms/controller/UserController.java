package com.vishal.rms.controller;

import com.vishal.rms.dto.ProfileUpdateRequestDTO;
import com.vishal.rms.dto.UserDto;
import com.vishal.rms.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
@SecurityRequirement(name = "BearerAuth")
@Tag(name = "User Profile", description = "Manage user profiles and bookings")
public class UserController {

    private final UserService userService;

//    booking and guest

    @PatchMapping("/profile")
    @Operation(summary = "Update my profile", description = "Allows a user to update their profile details.", tags = {"User Profile"})
    public ResponseEntity<Void> updateProfile(@RequestBody ProfileUpdateRequestDTO profileUpdateRequestDto) {
        userService.updateProfile(profileUpdateRequestDto);

        return ResponseEntity.noContent().build();
    }

    @GetMapping("/profile")
    @Operation(summary = "Get my profile", description = "Retrieves the current user's profile details.", tags = {"User Profile"})
    public ResponseEntity<UserDto> getMyProfile() {
        return ResponseEntity.ok(userService.getMyProfile());
    }
}
