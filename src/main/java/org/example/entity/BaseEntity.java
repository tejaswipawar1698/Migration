package org.example.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
@NoArgsConstructor
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "STATUS", nullable = false, length = 1)
    private char status;

    @Column(name = "CREATED_BY")
    private Long createdBy;

    @CreationTimestamp
    @Column(name = "CREATE_DTTM", length = 19)
    protected LocalDateTime createDttm;

    @Column(name = "UPDATED_BY")
    private Long updatedBy;

    @UpdateTimestamp
    @Column(name = "UPDATE_DTTM", length = 19)
    protected LocalDateTime updateDttm;

}
