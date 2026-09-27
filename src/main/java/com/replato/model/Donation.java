package com.replato.model;

public class Donation {
    private Long id;
    private String foodName;
    private String category;
    private int quantity;
    private String location;
    private String availableUntil;
    private String description;
    private String status;
    private String donorName;

    public Donation() {}

    public Donation(Long id, String foodName, String category, int quantity,
                    String location, String availableUntil, String description,
                    String status, String donorName) {
        this.id = id;
        this.foodName = foodName;
        this.category = category;
        this.quantity = quantity;
        this.location = location;
        this.availableUntil = availableUntil;
        this.description = description;
        this.status = status;
        this.donorName = donorName;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getFoodName() { return foodName; }
    public void setFoodName(String foodName) { this.foodName = foodName; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
    public String getAvailableUntil() { return availableUntil; }
    public void setAvailableUntil(String availableUntil) { this.availableUntil = availableUntil; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getDonorName() { return donorName; }
    public void setDonorName(String donorName) { this.donorName = donorName; }
}
