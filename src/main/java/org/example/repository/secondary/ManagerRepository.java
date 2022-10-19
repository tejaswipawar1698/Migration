package org.example.repository.secondary;

import org.example.entity.CardsMstr;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ManagerRepository  extends JpaRepository<CardsMstr,Long>
{
    List<CardsMstr> findAllByCompanyMstrSeqAndStatus(Integer companyMstrSeq, Character status);


}
