package com.example.crud_gv.Repository;

import com.example.crud_gv.Model.Entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepository extends JpaRepository<Status, Integer> {
}
