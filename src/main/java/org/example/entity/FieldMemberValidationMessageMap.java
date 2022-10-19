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
@Table(name = "field_member_validation_message_map")
public class FieldMemberValidationMessageMap extends  BaseEntity implements Serializable{


    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "FIELD_MEMBER_VALIDATION_MESSAGES_MAP", unique = true, nullable = false)
    private Long fieldMemberValidationMessagesMapSeq;

    @Column(name = "COMPANY_MSTR_SEQ", nullable =  false)
    private Long companyMstrSeq;

   @Column(name = "FIELD_GROUP_MEMBER_SEQ", nullable = false)
    private Long fieldGroupMembers;

    @Column(name = "VALIDATOR_MSTR_SEQ", nullable = false)
    private Long validatorMstr;

    @Column(name = "VALIDATION_MESSAGE")
    private String validationMessage;

    @Column(name = "API_FIELD_VALIDATION")
    private boolean apiFieldValidation;

}
