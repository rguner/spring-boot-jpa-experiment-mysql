package com.guner.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;
import org.hibernate.annotations.Where;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UuidTest {

    @Id
    @UuidGenerator
    @Column(name = "uuid_test_id", nullable = false, length = 36)
    private UUID uuidTestId;

    @Column(name = "detail_id", nullable = false, length = 36)
    private UUID detailId;

    @Column(name = "msisdn", nullable = false)
    private String msisdn;
}
