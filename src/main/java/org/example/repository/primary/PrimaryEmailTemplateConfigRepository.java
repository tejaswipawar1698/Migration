package org.example.repository.primary;

import org.example.entity.EmailTemplateConfig;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrimaryEmailTemplateConfigRepository extends CrudRepository<EmailTemplateConfig, Long> {

   List<EmailTemplateConfig> findAllByCompanyMstrSeqAndStatus(Long companyMstrSeq, Character status);
}
