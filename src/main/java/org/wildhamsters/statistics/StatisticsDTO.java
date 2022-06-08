package org.wildhamsters.statistics;

import java.util.List;

/**
 * @author Piotr Chowaniec
 */
public record StatisticsDTO(List<SingleMatchStatistics> singleMatchStatisticsList) {

    public StatisticsDTO(List<SingleMatchStatistics> singleMatchStatisticsList) {
        this.singleMatchStatisticsList = singleMatchStatisticsList;
    }
}
