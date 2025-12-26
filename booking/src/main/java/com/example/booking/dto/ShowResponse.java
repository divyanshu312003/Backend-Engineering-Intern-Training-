package com.example.booking.dto;

import java.time.LocalDateTime;

public class ShowResponse {

    private Long showId;
    private String eventName;
    private String venueName;
    private LocalDateTime startTime;

    public ShowResponse(Long showId, String eventName, String venueName, LocalDateTime startTime) {
        this.showId = showId;
        this.eventName = eventName;
        this.venueName = venueName;
        this.startTime = startTime;
    }

    public Long getShowId() { return showId; }
}
