package org.example.repository.primary;

import org.example.entity.ActionsMstr;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActionMstrRepository extends JpaRepository<ActionsMstr,Long>
{
    List<ActionsMstr> findAllByCompanyMstrSeqAndStatus(Long companyMstrSeq, Character status);
}
