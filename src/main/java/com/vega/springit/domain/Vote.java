package com.vega.springit.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
public class Vote extends Auditable {

    public Vote(short direction, Link link) {
        this.direction = direction;
        this.link = link;
    }

    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private Short direction;

    @NonNull
    @ManyToOne
    private Link link;

}
