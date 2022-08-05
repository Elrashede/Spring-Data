package com.example.springdata.Repositories;

import com.example.springdata.model.Bag;
import org.springframework.data.repository.CrudRepository;

public interface BagRepository extends CrudRepository<Bag,Long> {
}
