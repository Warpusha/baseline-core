package com.baseline.salescore.repository;

import com.baseline.salescore.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompositionRepository extends JpaRepository<Item, Long> {
}
