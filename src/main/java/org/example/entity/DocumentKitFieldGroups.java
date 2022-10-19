package org.example.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;
import static org.hibernate.envers.RelationTargetAuditMode.NOT_AUDITED;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "document_kit_field_groups")
public class DocumentKitFieldGroups extends BaseEntity implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "DOCUMENT_KIT_FIELD_GROUP_SEQ", unique = true, nullable = false)
	private Long documentKitFieldGroupSeq;
	@Column(name="FIELD_GROUP_MEMBER_SEQ", nullable = true)
	private Long fieldGroupMemberSeq;
	@Column(name = "COMPANY_MSTR_SEQ", nullable = false)
	private Long companyMstrSeq;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DOCUMENT_KIT_LABEL_SEQ", nullable =  false)
	private DocumentKitFormLabels documentKitFormLabels;
	@Column(name="ADD_IN_ARRAY", nullable = false)
	private boolean addInArray;
	@Column(name="HIDE_EXPRESSION")
	private String hideExpression;
	@Column(name="INTERNAL_SUB_SECTION_CD")
	private String internalSubSectionCd;
	@Column(name="PRIORITY", nullable = false)
	private int priority;
}
