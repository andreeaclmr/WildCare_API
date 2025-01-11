package com.example.WildCare_API.family;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "family")
public class Family {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(nullable = false)
    private long id;

    @Column(nullable = false)
    private String familyName;

    @Column(nullable = false)
    private String description;

    public Family(String description, String familyName, long id) {
        this.description = description;
        this.familyName = familyName;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Family () {}
}











