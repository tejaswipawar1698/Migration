package org.example.repository.secondary;

import org.example.entity.ActionsMstr;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActionRepository extends JpaRepository<ActionsMstr,Long>
{
    List<ActionsMstr> findByCompanyMstrSeqAndActionCdAndStatus(Long companyMstrSeq,String actionCd,Character status);

}
