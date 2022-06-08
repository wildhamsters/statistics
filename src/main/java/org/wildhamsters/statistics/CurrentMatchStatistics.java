package org.wildhamsters.statistics;

import java.time.LocalDateTime;

/**
 * @author Piotr Chowaniec
 */
record CurrentMatchStatistics(String matchId,
                              LocalDateTime startTime,
                              int accurateShots,
                              int missedShots,
                              int rounds,
                              LocalDateTime finishTime) {
}
