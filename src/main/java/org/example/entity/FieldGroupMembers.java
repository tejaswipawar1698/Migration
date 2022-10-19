package org.example.entity;
// Generated 22 Jun, 2020 5:01:42 PM by Hibernate Tools 4.0.1.Final

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;
import static org.hibernate.envers.RelationTargetAuditMode.NOT_AUDITED;

/**
 * FieldGroupMembers generated by hbm2java
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "field_group_members")
public class FieldGroupMembers extends BaseEntity implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "FIELD_GROUP_MEMBER_SEQ", unique = true, nullable = false)
	private Long fieldGroupMemberSeq;
	@Column(name = "PARENT_FIELD_GROUP_MEMBER_SEQ")
	private Long parentFieldGroupMemberSeq;
	@Column(name = "COMPANY_MSTR_SEQ", nullable = false)
	private Long companyMstrSeq;
	@Column(name = "FIELD_KEY")
	private String fieldKey;
	@Column(name = "FIELD_TYPE")
	private String fieldType;
	@Column(name = "CLASSNAME")
	private String classname;
	@Column(name = "DEFAULT_VALUE", nullable = true)
	private String defaultValue;
	@Column(name="FIELD_GROUP_CLASSNAME")
	private String fieldGroupClassName;
	@Column(name = "HIDE", nullable = true)
	private Boolean hide;
	@Column(name = "HIDE_EXPRESSION")
	private String hideExpression;
	@Column(name = "PRIORITY")
	private Integer priority;

}
