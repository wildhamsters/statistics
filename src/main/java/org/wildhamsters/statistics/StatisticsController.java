package org.wildhamsters.statistics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Piotr Chowaniec
 */
@RestController
public class StatisticsController {

    private final StatisticsService service;

    @Autowired
    public StatisticsController(StatisticsService service) {
        this.service = service;
    }

    @GetMapping
    public StatisticsDTO readAllStatistics() {
        return service.getAllStatistics();
    }

    @PostMapping
    public void saveCurrentMatchStatistics(@RequestBody CurrentMatchStatistics currentMatchStatistics) {
        service.saveCurrentMatchStatistics(currentMatchStatistics);
    }
}
