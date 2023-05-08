package com.example.SpringBoot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBoot.model.Location;

public interface LocationRepository extends JpaRepository<Location,Long>{

}
