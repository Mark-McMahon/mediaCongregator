package org.mediaAggregator.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.mediaAggregator.model.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long>{
}
