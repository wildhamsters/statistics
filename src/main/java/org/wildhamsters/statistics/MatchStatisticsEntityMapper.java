package org.wildhamsters.statistics;

/**
 * @author Piotr Chowaniec
 */
class MatchStatisticsEntityMapper implements Mapper<CurrentMatchStatistics, MatchStatisticsEntity> {

    @Override
    public MatchStatisticsEntity map(CurrentMatchStatistics stats) {
        MatchStatisticsEntity entity = new MatchStatisticsEntity();
        entity.setMatchId(stats.matchId());
        entity.setAccurateShots(stats.accurateShots());
        entity.setMissedShots(stats.missedShots());
        entity.setRounds(stats.rounds());
        entity.setStartTime(stats.startTime());
        entity.setFinishTime(stats.finishTime());
        return entity;
    }
}
