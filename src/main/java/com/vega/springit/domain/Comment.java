package com.vega.springit.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Getter @Setter
@ToString
@Data
@NoArgsConstructor
public class Comment extends Auditable {

    @Id
    @GeneratedValue
    private Long id;
    private String body;

    // link
    @ManyToOne
    private Link link;

    public Comment(@NonNull String body, @NonNull Link link) {
        this.body = body;
        this.link = link;
    }

}
