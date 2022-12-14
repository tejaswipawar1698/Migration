package org.example.entity;
// Generated 3 Aug, 2020 6:56:49 PM by Hibernate Tools 4.0.1.Final

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * DocumentKit generated by hbm2java
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "document_kit", uniqueConstraints = @UniqueConstraint(columnNames = {
		"COMPANY_MSTR_SEQ", "DOCUMENT_KIT_CD" }))
public class DocumentKit extends BaseEntity implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "DOCUMENT_KIT_SEQ", unique = true, nullable = false)
	private Long documentKitSeq;
	@Column(name = "COMPANY_MSTR_SEQ", nullable = false)
	private Long companyMstrSeq;
	@Column(name = "CLIENT_DOCUMENT_KIT_CD")
	private String clientDocumentKitCd;
	@Column(name = "DOCUMENT_KIT_NAME")
	private String documentKitName;
	@Column(name = "DOCUMENT_KIT_CD")
	private String documentKitCd;
  	@Column(name = "ALLOW_BGV")
  	private Boolean allowBGV;
  	@Column(name = "FINAL_STATUS_CD")
  	private String finalStatusCd;
	@Column(name = "REQUEST_TEMPLATE_CD")
	private String requestTemplateCd;
	@Column(name = "REMAINDER_TEMPLATE_CD")
	private String remainderTemplateCd;
  	@Column(name = "INTERNAL_STATUS")
	private String internalStatus;
	@Column(name = "DESCRIPTION")
	private String kitDescription;
}
