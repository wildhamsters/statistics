package org.wildhamsters.statistics;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Piotr Chowaniec
 */
@Repository
public interface MatchStatisticsRepository extends CrudRepository<MatchStatisticsEntity, Long> {

    MatchStatisticsEntity save(MatchStatisticsEntity entity);

    List<MatchStatisticsEntity> findAll();
}
