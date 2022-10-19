package org.example.repository.primary;

import org.example.entity.PermissionMstr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface PrimaryPermissionMstrRepository extends JpaRepository<PermissionMstr,Integer>
{

    List<PermissionMstr> findByCompanyMstrSeqAndStatus(long companyMstrSeq, Character status);

}
