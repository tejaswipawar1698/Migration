package org.example.entity;
// Generated 22 Jun, 2020 5:01:42 PM by Hibernate Tools 4.0.1.Final

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
@Table(name = "template_options")
public class TemplateOptions extends BaseEntity implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "TEMPLATE_OPTION_SEQ", unique = true, nullable = false)
	private Long templateOptionSeq;
	@Column(name = "COMPANY_MSTR_SEQ", nullable = false)
	private Long companyMstrSeq;
	@Column(name = "FIELD_GROUP_MEMBER_SEQ")
	private Long fieldGroupMembers;
	@Column(name = "REQUIRED")
	private Boolean required;
	@Column(name = "DISABLED")
	private Boolean disabled;
	@Column(name = "TYPE")
	private String type;
	@Column(name = "LABEL")
	private String label;
	@Column(name = "PLACEHOLDER")
	private String placeholder;
	@Column(name = "MAX_ITEMS")
	private String maxItems;
	@Column(name = "APPEARENCE")
	private String appearence;
	@Column(name = "DESCRIPTION")
	private String description;
	@Column(name = "ADD_TEXT")
	private String addText;
	@Column(name = "ADD_LABEL", length = 500)
	private String addLabel;
	@Column(name = "ASTER_TEXT")
	private String asterText;
	@Column(name = "CHECKBOX")
	private Boolean checkbox;
	@Column(name = "OPTIONAL_CHECKBOX_TEXT")
  	private String optionalCheckboxText;
	@Column(name = "HIDE_DELETE")
	private String hideDelete;
	@Column(name = "COLOR")
	private String color;
	@Column(name = "MAX_LENGTH", length = 20)
	private String maxLength;
	@Column(name = "POINT1")
	private String point1;
	@Column(name = "POINT2")
	private String point2;
	@Column(name = "POINT3")
	private String point3;
	@Column(name = "MULTIPLE")
	private boolean multiple;
	@Column(name = "ASTERISK")
	private Boolean asterisk;
	@Column(name = "SHOW_LINE")
	private Boolean showLine;
	@Column(name = "ERROR_MESSAGE")
	private String errorMessage;
	@Column(name = "PATTERN")
	private String pattern;
	@Column(name = "MIN_RANGE")
	private Long min;
	@Column(name = "MAX_RANGE")
	private Long max;


}
