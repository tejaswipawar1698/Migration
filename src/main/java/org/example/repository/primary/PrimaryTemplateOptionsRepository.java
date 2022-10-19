package org.example.repository.primary;

import org.example.entity.TemplateOptions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrimaryTemplateOptionsRepository extends JpaRepository<TemplateOptions, Long> {

    List<TemplateOptions> findByCompanyMstrSeqAndStatus(Long companyMstrSeq,Character status);

}

