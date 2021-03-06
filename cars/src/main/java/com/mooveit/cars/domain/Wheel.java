package com.mooveit.cars.domain;

import com.mooveit.cars.domain.enums.WheelTypeEnum;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "WHEELS")
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Wheel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "size")
    private String size;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private WheelTypeEnum type;
}
