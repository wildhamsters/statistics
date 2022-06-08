package org.wildhamsters.statistics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Piotr Chowaniec
 */
@Service
public class StatisticsService {

    private final MatchStatisticsRepository repository;

    @Autowired
    public StatisticsService(MatchStatisticsRepository repository) {
        this.repository = repository;
    }

    StatisticsDTO getAllStatistics() {
        return new StatisticsDTO(getMatchStatisticsList());
    }

    List<SingleMatchStatistics> getMatchStatisticsList() {
        var statisticsList = new ArrayList<SingleMatchStatistics>();
        var mapper = new EntityMapper();
        for (MatchStatisticsEntity entity : repository.findAll()) {
            statisticsList.add(mapper.map(entity));
        }
        return statisticsList;
    }
}
