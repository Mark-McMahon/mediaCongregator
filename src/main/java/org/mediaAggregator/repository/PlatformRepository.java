package org.mediaAggregator.repository;
import org.mediaAggregator.model.Platform;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PlatformRepository extends JpaRepository<Platform, Long> {
}
