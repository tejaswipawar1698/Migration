package org.example.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table( name = "request_verification_config")
public class RequestVerificationConfig extends BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "REQUEST_VERIFICATION_CONFIG_SEQ", unique = true, nullable = false)
    private Long requestVerificationConfigSeq;

    @Column(name = "COMPANY_MSTR_SEQ", nullable = false)
    private Long companyMstrSeq;

    @Column(name = "USER_ROLE_SEQ")
    private Long userRole;

   @Column(name = "PREVIOUS_USER_ROLE_SEQ")
    private Long previousUserRole;

    @Column(name = "NEXT_USER_ROLE_SEQ")
    private Long nextUserRole;

    @Column(name = "DEPENDENT")
    private String dependent;

    @Column(name = "SHOW_REPORTS")
    private String showReports;

}
