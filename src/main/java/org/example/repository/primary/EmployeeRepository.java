package org.example.repository.primary;

import org.example.entity.CardsMstr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<CardsMstr,Long>
{

    @Query
    List<CardsMstr> findAllByCompanyMstrSeqAndStatus(Integer companyMstrSeq, Character status);

}
