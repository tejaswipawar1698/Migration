package org.example.repository.primary;

import org.example.entity.ClientExternalRoundMapping;
import org.example.entity.ClientExternalRoundMapping;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PrimaryClientExternalRoundMappingRepository extends JpaRepository<ClientExternalRoundMapping, Long> {

   List<ClientExternalRoundMapping> findAllByCompanyMstrSeqAndStatus(Integer companyMstrSeq,Character status);
}
