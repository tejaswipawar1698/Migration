package org.example.entity;
// Generated 3 Aug, 2020 6:56:49 PM by Hibernate Tools 4.0.1.Final

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;
import static org.hibernate.envers.RelationTargetAuditMode.NOT_AUDITED;

/**
 * RequestTransitionMstr generated by hbm2java
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "request_transition_mstr")
public class RequestTransitionMstr extends BaseEntity implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "REQUEST_TRANSITION_SEQ", unique = true, nullable = false)
	private Long requestTransitionSeq;
	@Column(name = "ACTION_SEQ")
	private Long actionsMstr;
	@Column(name = "CURRENT_REQUEST_STATUS_SEQ")
	private Long currentRequestStatus;
	@Column(name = "NEXT_REQUEST_STATUS_SEQ")
	private Long nextRequestStatus;
	@Column(name = "COMPANY_MSTR_SEQ", nullable = false)
	private Long companyMstrSeq;


}
