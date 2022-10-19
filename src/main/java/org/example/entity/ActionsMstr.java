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
@Table(name = "actions_mstr")
public class ActionsMstr extends BaseEntity implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "ACTION_SEQ", unique = true, nullable = false)
    private Long actionSeq;
    @Column(name = "COMPANY_MSTR_SEQ", nullable = false)
    private Long companyMstrSeq;
    @Column(name = "ACTION_CD")
    private String actionCd;
    @Column(name = "SEND_COMMENTS_TO")
    private String sendCommentsTo;

}
