package com.springboot.task04.repository;

import com.springboot.task04.entity.Price;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository extends JpaRepository<Price, Long> {

}
