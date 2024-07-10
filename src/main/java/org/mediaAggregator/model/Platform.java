package org.mediaAggregator.model;

import jakarta.persistence.*;
import lombok.Getter;
import java.util.Set;


@Entity
public class Platform {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Getter
    private String platformName;
    @Getter
    private long platformId;

    @OneToMany (mappedBy = "platform")
    private Set<Post> posts;

    public Platform() {};

    public Platform(String platformName, long platformId) {
        this.platformName = platformName;
        this.platformId = platformId;
    }
}
