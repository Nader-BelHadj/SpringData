package com.fst.SpringData.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.fst.SpringData.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}
