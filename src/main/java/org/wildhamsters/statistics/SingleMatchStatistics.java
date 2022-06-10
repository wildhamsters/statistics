package org.wildhamsters.statistics;

import java.time.LocalDateTime;

/**
 * @author Piotr Chowaniec
 */
record SingleMatchStatistics(Integer id,
                                    String matchId,
                                    int accurateShots,
                                    int missedShots,
                                    int rounds,
                                    LocalDateTime startTime,
                                    LocalDateTime finishTime) {
}
