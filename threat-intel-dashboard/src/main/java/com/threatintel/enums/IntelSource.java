package com.threatintel.enums;

/**
 * External threat intelligence data sources
 */
public enum IntelSource {
    VIRUSTOTAL("VirusTotal", "https://www.virustotal.com", 0.4),
    ABUSEIPDB("AbuseIPDB", "https://www.abuseipdb.com", 0.3),
    URLHAUS("URLhaus", "https://urlhaus.abuse.ch", 0.2),
    ALIENVAULT_OTX("AlienVault OTX", "https://otx.alienvault.com", 0.1),
    INTERNAL("Internal", "Internal threat database", 0.0);

    private final String displayName;
    private final String url;
    private final double weight;

    IntelSource(String displayName, String url, double weight) {
        this.displayName = displayName;
        this.url = url;
        this.weight = weight;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getUrl() {
        return url;
    }

    public double getWeight() {
        return weight;
    }
}