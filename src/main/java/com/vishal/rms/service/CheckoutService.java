package com.vishal.rms.service;

import com.vishal.rms.entity.Booking;

public interface CheckoutService {
    String getCheckoutSession(Booking booking, String successUrl, String failureUrl);
}
