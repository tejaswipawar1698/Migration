package org.example.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;
import static org.hibernate.envers.RelationTargetAuditMode.NOT_AUDITED;

/**
 * Created by suyog on 18/8/20.
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table( name = "email_template_config")
@Audited(targetAuditMode = NOT_AUDITED)
public class EmailTemplateConfig extends BaseEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "EMAIL_TEMPLATE_CONFIG_SEQ", unique = true, nullable = false)
    Long emailTemplateConfigSeq;

    @Column(name = "COMPANY_MSTR_SEQ", nullable = false)
    private Long companyMstrSeq;

    @Column(name = "EVENT_NAME")
    private String eventName;

    @Column(name = "INTERNAL_TEMPLATE_CD")
    private String internalTemplateCd;

    @Column(name = "EMAIL_SUBJECT")
    private String emailSubject;

    @Column(name = "FROM_ADDR")
    private String fromAddr;

    @Column(name = "FROM_LABEL")
    private String fromLabel;

    @Column(name = "TOPIC_NAME")
    private String topicName;

    @Column(name = "PARTITION")
    private Integer partition;

}
