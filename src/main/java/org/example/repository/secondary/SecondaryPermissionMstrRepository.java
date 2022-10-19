package org.example.repository.secondary;

import org.example.entity.PermissionMstr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface SecondaryPermissionMstrRepository extends JpaRepository<PermissionMstr,Integer> {

    List<PermissionMstr> findByCompanyMstrSeqAndPermissionCdAndStatus(Long companyMstrSeq,String permissionCd,Character status);

}
