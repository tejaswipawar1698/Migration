package org.example.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;
import static org.hibernate.envers.RelationTargetAuditMode.NOT_AUDITED;

/**
 * Created by suyog on 28/7/20.
 */
@Getter
@Setter
@Entity
@Table(name = "static_file_mstr")
@Audited(targetAuditMode = NOT_AUDITED)
public class StaticFileMstr extends BaseEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "STATIC_FILE_MSTR_SEQ", unique = true, nullable = false)
    private Long staticFileMstrSeq;
    @Column(name = "COMPANY_MSTR_SEQ", length = 20)
    private Integer companyMstrSeq;
    @Column(name = "FILE_NAME", length = 200)
    private String fileName;
    @Column(name = "DOCUMENT_TYPE", length = 200)
    private String documentType;
    @Column(name = "DIRECTORY", length = 200)
    private String directory;
    @Column(name = "SUB_DIRECTORY", length = 200)
    private String subDirectory;

}
