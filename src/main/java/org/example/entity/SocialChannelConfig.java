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
@Table(name = "social_channel_config")
public class SocialChannelConfig extends BaseEntity implements java.io.Serializable{

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "SOCIAL_CHANNEL_CONFIG_SEQ", unique = true, nullable = false)
    private Long socialChannelConfigSeq;
    @Column(name = "COMPANY_MSTR_SEQ", nullable = false)
    private Long companyMstrSeq;
    @Column(name = "CHANNEL_CD", nullable = false, length = 20)
    private String channelCd;
    @Column(name = "CHANNEL_DESC", nullable = false, length = 50)
    private String channelDesc;
    @Column(name = "SOCIAL_URL", nullable = false, length = 100)
    private String socialUrl;
    @Column(name = "CHANNEL_PRIORITY")
    private Integer channelPriority;
}
