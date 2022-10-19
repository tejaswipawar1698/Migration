package org.example.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created by suyog on 28/9/20.
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "template_mstr")
public class TemplateMstr extends BaseEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "TEMPLATE_MSTR_SEQ", unique = true, nullable = false)
    Long templateMstrSeq;

    @Column(name = "COMPANY_MSTR_SEQ", nullable = false)
    private Long companyMstrSeq;

    @Column(name = "TEMPLATE_CD", length = 200)
    private String templateCd;

    @Column(name = "TEMPLATE_CONTENT", length = 200)
    private String templateContent;

}
