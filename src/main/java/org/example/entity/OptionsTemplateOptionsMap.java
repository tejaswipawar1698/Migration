package org.example.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;
import static org.hibernate.envers.RelationTargetAuditMode.NOT_AUDITED;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "options_template_options_map")
public class OptionsTemplateOptionsMap extends BaseEntity implements Serializable{

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "OPTION_TEMPLATE_OPTION_MAP_SEQ", unique = true, nullable = false)
    private Long validatorsMstrSeq;

   @Column(name = "TEMPLATE_OPTION_SEQ", nullable = false)
    private Long templateOptions;

    @Column(name = "COMPANY_MSTR_SEQ", nullable =  false)
    private Long companyMstrSeq;

    @Column(name = "OPTION_SEQ", nullable = false)
    private Long options;

}
