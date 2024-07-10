package org.mediaAggregator.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.mediaAggregator.model.Post;

public interface PostRepository extends JpaRepository<Post, Long>{
}
