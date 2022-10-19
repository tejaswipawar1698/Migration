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
@Table(name = "vendor_mstr")
@Audited(targetAuditMode = NOT_AUDITED)
public class VendorMstr extends BaseEntity implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "VENDOR_MSTR_SEQ", unique = true, nullable = false)
    private Long vendorMstrSeq;
    @Column(name = "COMPANY_MSTR_SEQ")
    private Long companyMstrSeq;
    @Column(name = "TYPE")
    private String type;
    @Column(name = "COUNTRY")
    private String country;
    @Column(name = "NAME")
    private String name;
    @Column(name = "EXTERNAL_ID")
    private String externalId;
    @Column(name = "DEFAULT_EMAIL_ID")
    private String defaultEmailId;

}
