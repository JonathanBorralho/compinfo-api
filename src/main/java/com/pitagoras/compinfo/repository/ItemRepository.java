package com.pitagoras.compinfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pitagoras.compinfo.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
