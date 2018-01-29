package com.will.wingsotr.repos;

import com.will.wingsotr.models.MenuItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends CrudRepository<MenuItem, Long> {
    List<MenuItem> findAllByCategory(String categoryName);
}
