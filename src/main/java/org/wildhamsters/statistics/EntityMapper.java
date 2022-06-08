package org.wildhamsters.statistics;

/**
 * @author Piotr Chowaniec
 */
class EntityMapper implements Mapper<MatchStatisticsEntity, SingleMatchStatistics> {

    @Override
    public SingleMatchStatistics map(MatchStatisticsEntity entity) {
        return new SingleMatchStatistics(
                entity.getId(),
                entity.getMatchId(),
                entity.getAccurateShots(),
                entity.getMissedShots(),
                entity.getRounds(),
                entity.getStartTime(),
                entity.getFinishTime());
    }
}
