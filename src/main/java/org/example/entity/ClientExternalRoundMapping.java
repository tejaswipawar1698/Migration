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
@Table(name = "client_external_round_mapping", uniqueConstraints = @UniqueConstraint(columnNames = {
        "COMPANY_MSTR_SEQ", "EXTERNAL_ROUND_CODE","EXTERNAL_SUB_ROUND_CODE" }))
public class ClientExternalRoundMapping extends BaseEntity implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "CLIENT_EXTERNAL_ROUND_MAPPING_SEQ", unique = true, nullable = false)
    private Long clientExternalRoundMappingSeq;
    @Column(name = "COMPANY_MSTR_SEQ", nullable = false)
    private Integer companyMstrSeq;
    @Column(name = "EXTERNAL_ROUND_CODE", nullable = false, length = 50)
    private String externalRoundCode;
    @Column(name = "EXTERNAL_SUB_ROUND_CODE", nullable = false, length = 50)
    private String externalSubRoundCode;
}
