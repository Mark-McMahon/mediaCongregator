package org.mediaAggregator.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Profile {
    @Id
    @GeneratedValue
    private long Id;
    private String username;

    @OneToMany (mappedBy = "profile")
    private Set<Post> posts;

    @ManyToMany (mappedBy = "following")
    private Set<User> followers;



}
