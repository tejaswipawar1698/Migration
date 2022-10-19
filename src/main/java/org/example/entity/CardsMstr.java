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
@Table(name = "cards_mstr")
public class CardsMstr extends BaseEntity implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "CARD_MSTR_SEQ", unique = true,nullable = true)
    private Long cardMstrSeq;
    @Column(name = "COMPANY_MSTR_SEQ")
    private Integer companyMstrSeq;
    @Column(name = "CARD_CD",  length = 50)
    private String cardCd;
    @Column(name = "CARD_DESC",  length = 100)
    private String cardDesc;
    @Column(name = "CARD_NAME",  length = 100)
    private String cardName;
    @Column(name = "CARD_TYPE",  length = 100)
    private String cardType;
    @Column(name = "IS_VISIBLE")
    private Boolean isVisible;
    @Column(name = "PRIORITY")
    private Integer priority;



}
