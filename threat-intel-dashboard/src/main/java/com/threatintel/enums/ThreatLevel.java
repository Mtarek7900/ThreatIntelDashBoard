package com.threatintel.enums;

/**
 * Threat severity levels based on composite threat score
 */
public enum ThreatLevel {
    CLEAN(0, 20, "Clean", "No threats detected"),
    LOW(21, 40, "Low", "Minimal threat indicators"),
    MEDIUM(41, 60, "Medium", "Moderate threat level"),
    HIGH(61, 80, "High", "Significant threat detected"),
    CRITICAL(81, 100, "Critical", "Severe threat - immediate action required");

    private final int minScore;
    private final int maxScore;
    private final String displayName;
    private final String description;

    ThreatLevel(int minScore, int maxScore, String displayName, String description) {
        this.minScore = minScore;
        this.maxScore = maxScore;
        this.displayName = displayName;
        this.description = description;
    }

    public int getMinScore() {
        return minScore;
    }

    public int getMaxScore() {
        return maxScore;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getDescription() {
        return description;
    }

    /**
     * Determine threat level from a numeric score (0-100)
     */
    public static ThreatLevel fromScore(int score) {
        for (ThreatLevel level : values()) {
            if (score >= level.minScore && score <= level.maxScore) {
                return level;
            }
        }
        return CLEAN; // Default fallback
    }
}