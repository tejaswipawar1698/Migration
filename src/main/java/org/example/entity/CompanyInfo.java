 package org.example.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * CurrencyMstr generated by hbm2java
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "company_info")
public class CompanyInfo extends BaseEntity implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "COMPANY_INFO_SEQ", unique = true, nullable = false)
	private Long companyInfoSeq;
    @Column(name = "COMPANY_MSTR_SEQ", nullable = false)
    private Long companyMstrSeq;
    @Column(name = "COMPANY_CD", nullable = false, length = 50)
    private String companyCd;
    @Column(name = "TITLE", nullable = false, length = 50)
    private String title;
    @Column(name = "COMPANY_URL", nullable = false, length = 50)
    private String companyUrl;
    @Column(name = "ABOUT_US", nullable = false, length = 5000)
	private String aboutUs;
    @Column(name = "GALLERY_IMAGES", nullable = false, length = 5000)
	private String galleryImages;
}
