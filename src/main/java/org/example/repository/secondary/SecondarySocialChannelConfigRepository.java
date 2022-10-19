package org.example.repository.secondary;

import org.example.entity.SocialChannelConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SecondarySocialChannelConfigRepository extends JpaRepository<SocialChannelConfig, Long> {

    List<SocialChannelConfig> findByCompanyMstrSeqAndStatus(Long companyMstrSeq, Character status);
}
