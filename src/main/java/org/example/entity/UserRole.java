package org.example.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;
import static org.hibernate.envers.RelationTargetAuditMode.NOT_AUDITED;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="user_role")
public class UserRole extends BaseEntity implements java.io.Serializable{
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "USER_ROLE_SEQ", unique = true, nullable = false)
    private Long userRoleSeq;
    @Column(name = "COMPANY_MSTR_SEQ", nullable = false)
    private Long companyMstrSeq;
    @Column(name = "USER_ROLE_CD", nullable = false, length = 20)
    private String userRoleCd;
    @Column(name = "USER_ROLE_DESC", length = 100)
    private String userRoleDesc;
    @Column(name = "ALLOW_OTP", length = 1)
    private Character allowOtp;


}
