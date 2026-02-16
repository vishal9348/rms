package com.vishal.rms.service;

import com.stripe.model.Event;
import com.vishal.rms.dto.BookingDTO;
import com.vishal.rms.dto.BookingRequest;
import com.vishal.rms.dto.GuestDTO;
import com.vishal.rms.dto.HotelReportDTO;
import com.vishal.rms.enums.BookingStatus;

import java.nio.file.AccessDeniedException;
import java.time.LocalDate;
import java.util.List;

public interface BookingService {

    BookingDTO initialiseBooking(BookingRequest bookingRequest);

    BookingDTO addGuests(Long bookingId, List<GuestDTO> guestDtoList);

    String initiatePayments(Long bookingId);

    void capturePayment(Event event);

    void cancelBooking(Long bookingId);

    BookingStatus getBookingStatus(Long bookingId);

    List<BookingDTO> getAllBookingsByHotelId(Long hotelId) throws AccessDeniedException;

    HotelReportDTO getHotelReport(Long hotelId, LocalDate startDate, LocalDate endDate) throws AccessDeniedException;

    List<BookingDTO> getMyBookings();
}
