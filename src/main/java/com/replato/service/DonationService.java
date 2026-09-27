package com.replato.service;

import com.replato.model.Donation;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class DonationService {

    private final List<Donation> donations = new ArrayList<>();
    private final AtomicLong counter = new AtomicLong(1);

    public DonationService() {
        // Seed sample data so the app isn't empty
        donations.add(new Donation(counter.getAndIncrement(), "Meal Boxes",
                "Cooked Food", 50, "Jaipur", "9:00 PM",
                "Fresh veg thali", "PENDING", "Spice Court"));
        donations.add(new Donation(counter.getAndIncrement(), "Bread Loaves",
                "Bakery", 30, "Jaipur", "7:00 PM",
                "Whole wheat bread", "PENDING", "Sunrise Bakery"));
    }

    public List<Donation> getAll() {
        return donations;
    }

    public List<Donation> getAvailable() {
        return donations.stream()
                .filter(d -> "PENDING".equals(d.getStatus()))
                .toList();
    }

    public Donation getById(Long id) {
        return donations.stream()
                .filter(d -> d.getId().equals(id))
                .findFirst().orElse(null);
    }

    public Donation create(Donation d) {
        d.setId(counter.getAndIncrement());
        if (d.getStatus() == null) d.setStatus("PENDING");
        donations.add(d);
        return d;
    }
}