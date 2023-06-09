package htwberlin.demo.web.api;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

import java.time.LocalDateTime;

@Entity
public class Plant {
    private String name;
    private String description;
    private int wateringIntervalDays;

    public LocalDateTime getNextWateringTime() {
        return nextWateringTime;
    }

    public void setNextWateringTime(LocalDateTime nextWateringTime) {
        this.nextWateringTime = nextWateringTime;
    }

    private LocalDateTime nextWateringTime;


    @Lob
    private byte[] image;
    @Id
    private Long id;

    public Plant() {
    }

    public Plant(String name, String description, int wateringIntervalDays, long id) {
        this.name = name;
        this.description = description;
        this.wateringIntervalDays = wateringIntervalDays;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getWateringIntervalDays() {
        return wateringIntervalDays;
    }

    public void setWateringIntervalDays(int wateringIntervalDays) {
        this.wateringIntervalDays = wateringIntervalDays;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}