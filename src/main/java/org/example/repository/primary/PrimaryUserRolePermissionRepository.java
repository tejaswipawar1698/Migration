package org.example.repository.primary;



import org.example.entity.UserRolePermissions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PrimaryUserRolePermissionRepository extends JpaRepository<UserRolePermissions,Integer> {

    List<UserRolePermissions> findByUserRoleCdAndStatus(String userRoleCd, char status);

    List<UserRolePermissions> findByUserRoleCdAndCompanyMstrSeqAndStatus(String userRoleCd,  Integer companyMstrSeq, char status);

    List<UserRolePermissions> findByCompanyMstrSeqAndStatus(Long companyMstrSeq,Character status);


}
