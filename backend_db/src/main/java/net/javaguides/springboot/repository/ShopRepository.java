package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import net.javaguides.springboot.entity.Shop;
import net.javaguides.springboot.entity.ShopProduct;
import java.util.List;
@Repository
public interface ShopRepository extends JpaRepository<Shop, Long>{
   
  
}
