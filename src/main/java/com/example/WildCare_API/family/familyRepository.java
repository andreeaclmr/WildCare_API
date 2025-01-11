package com.example.WildCare_API.family;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface familyRepository extends JpaRepository <Family, Long> {
}
