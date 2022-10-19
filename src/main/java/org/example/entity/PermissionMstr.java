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
@Table(name = "permissions_mstr")
public class PermissionMstr extends BaseEntity implements java.io.Serializable{

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "PERMISSION_SEQ", unique = true, nullable = false)
    private Integer permissionSeq;
    @Column(name = "COMPANY_MSTR_SEQ", nullable = false)
    private Long companyMstrSeq;
    @Column(name = "PERMISSION_CD", nullable = false, length = 50)
    private String permissionCd;
    @Column(name = "PERSMISSION_DESC", nullable = false, length = 50)
    private String persmissionDesc;

}
