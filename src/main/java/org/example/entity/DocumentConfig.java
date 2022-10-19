package org.example.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;
import static org.hibernate.envers.RelationTargetAuditMode.NOT_AUDITED;

/**
 * Created by suyog on 23/7/20.
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table( name = "document_config")
@Audited(targetAuditMode = NOT_AUDITED)
public class DocumentConfig extends BaseEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "DOCUMENT_CONFIG_SEQ", unique = true, nullable = false)
    Long documentConfigSeq;

    @Column(name = "COMPANY_MSTR_SEQ", nullable = false)
    private Long companyMstrSeq;

    @Column(name = "DOCUMENT_KIT_SEQ", nullable = false)
    private Long documentKitSeq;

    @Column(name = "DOCUMENT_CATEGORY", length = 200)
    private String documentCategory;

    @Column(name = "DOCUMENT_SUB_CATEGORY")
    String documentSubCategory;

    @Column(name = "DOCUMENT_CD")
    private String documentCd;

    @Column(name = "REQUIRED")
    private boolean required;

    @Column(name = "MAX_LIMIT")
    private Integer maxLimit;

    @Column(name = "FILE_FORMATS")
    private String fileFormats;

}

