package org.example.repository.primary;

import org.example.entity.StaticFileMstr;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by suyog on 28/7/20.
 */
public interface PrimaryStaticFileMstrRepository extends JpaRepository<StaticFileMstr, Long> {

    List<StaticFileMstr> findAllByCompanyMstrSeqAndStatus(Long companyMstrSeq,Character status);
}
