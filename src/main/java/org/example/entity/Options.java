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
@Table(name = "options")
public class Options extends BaseEntity implements Serializable {
	
	@Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "OPTION_SEQ", unique = true, nullable = false)
	private Long optionSeq;
	
	@Column(name="COMPANY_MSTR_SEQ", nullable = false)
	private Long companyMstrSeq;

	@Column(name="VALUE")
	private String value;

	@Column(name="LABEL")
	private String label;
	
	@Column(name="CLIENT_CD")
	private String clientCd;
	
	@Column(name="GROUP_CLASS")
	private String groupClass;

	@Column(name="INTERNAL_STATUS")
	private String internalStatus;

}
