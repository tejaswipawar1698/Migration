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
@Table(name = "reason_mstr_translation")
public class ReasonMstrTranslation extends BaseEntity implements java.io.Serializable{

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "REASON_MSTR_TRANSLATION_SEQ", unique = true, nullable = false)
    private Long reasonMstrSeq;

    @Column(name="COMPANY_MSTR_SEQ", nullable = false)
    private Long companyMstrSeq;

    @Column(name = "REASON_MSTR_SEQ")
    private Long reasonMstr;

    @Column(name = "TRANSLATION_MSTR_SEQ")
    private Long translationMstr;

    @Column(name = "DESCRIPTION")
    private String description;
}
