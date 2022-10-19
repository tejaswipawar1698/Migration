package org.example.repository.primary;

import jdk.dynalink.linker.LinkerServices;
import org.example.entity.Options;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PrimaryOptionsRepository extends JpaRepository<Options,Long> {

    List<Options> findByCompanyMstrSeqAndStatus(Long companyMstrSeq,Character status);
}
