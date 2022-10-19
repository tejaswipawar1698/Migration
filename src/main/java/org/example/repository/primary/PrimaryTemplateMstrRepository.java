package org.example.repository.primary;

import org.example.entity.TemplateMstr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by suyog on 28/9/20.
 */
@Repository
public interface PrimaryTemplateMstrRepository extends JpaRepository<TemplateMstr, Long> {


    List<TemplateMstr> findByCompanyMstrSeqAndStatus(Long companyMstrSeq, char status);
}
