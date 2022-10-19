package org.example.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "user_role_permissions")
public class UserRolePermissions extends BaseEntity implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "USER_ROLE_PERMISSION_SEQ", unique = true, nullable = false)
    private Integer userRolePermissionSeq;
    @Column(name = "COMPANY_MSTR_SEQ")
    private Long companyMstrSeq;
    @Column(name = "USER_ROLE_CD")
    private String userRoleCd;
    @Column(name = "PERMISSION_SEQ")
    private Integer permissionSeq;

}
