package org.example.repository.secondary;

import org.example.entity.Options;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SecondaryOptionsRepository extends JpaRepository<Options,Long> {

    List<Options> findByCompanyMstrSeqAndValueAndClientCdAndStatus(Long companyMstrSeq,String value,String clientCd,Character status);

}
