package org.example.repository.secondary;

import org.example.entity.TemplateMstr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by suyog on 28/9/20.
 */
@Repository
public interface SecondaryTemplateMstrRepository extends JpaRepository<TemplateMstr, Long> {

    TemplateMstr findByCompanyMstrSeqAndTemplateCdAndStatus(Long companyMstrSeq, String templateCd, char status);
}
