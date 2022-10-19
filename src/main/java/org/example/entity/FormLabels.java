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
@Table(name = "form_labels")
public class FormLabels extends BaseEntity implements Serializable{

	@Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "FORM_LABEL_SEQ", unique = true, nullable = false)
	private Long formLabelSeq;

	@Column(name = "COMPANY_MSTR_SEQ", nullable =  false)
	private Long companyMstrSeq;

	@Column(name="LABEL")
	private String label;

	@Column(name="LABEL_RECRUITER")
	private String labelRecruiter;

	@Column(name="LABEL_PREVIEW")
	private String labelPreview;

	@Column(name = "PREVIEW_PRIORITY")
	private Integer previewPriority;
}
