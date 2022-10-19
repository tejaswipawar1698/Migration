package org.example.repository.primary;

import org.example.entity.OptionsTemplateOptionsMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrimaryOptionsTemplateOptionsMapRepository extends JpaRepository<OptionsTemplateOptionsMap, Long>{

   List<OptionsTemplateOptionsMap> findByCompanyMstrSeqAndStatus(Long companyMstrSeq,Character status);
}
