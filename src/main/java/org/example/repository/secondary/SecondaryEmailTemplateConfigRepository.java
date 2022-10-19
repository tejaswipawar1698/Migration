package org.example.repository.secondary;

import org.example.entity.EmailTemplateConfig;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecondaryEmailTemplateConfigRepository extends CrudRepository<EmailTemplateConfig, Long> {


}
