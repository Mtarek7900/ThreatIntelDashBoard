package com.threatintel.enums;

/**
 * Categories of threats detected
 */
public enum ThreatCategory {
    MALWARE("Malware", "Malicious software"),
    PHISHING("Phishing", "Fraudulent attempt to obtain sensitive information"),
    COMMAND_AND_CONTROL("C2", "Command and Control server"),
    BOTNET("Botnet", "Network of compromised devices"),
    RANSOMWARE("Ransomware", "Malware that encrypts data for ransom"),
    CRYPTOMINING("Cryptomining", "Unauthorized cryptocurrency mining"),
    SPAM("Spam", "Unsolicited bulk messages"),
    SCANNING("Scanning", "Network reconnaissance activity"),
    EXPLOIT("Exploit", "Vulnerability exploitation attempt"),
    TROJAN("Trojan", "Malware disguised as legitimate software"),
    APT("APT", "Advanced Persistent Threat"),
    DDOS("DDoS", "Distributed Denial of Service"),
    DATA_EXFILTRATION("Data Exfiltration", "Unauthorized data transfer"),
    SUSPICIOUS("Suspicious", "Unusual or potentially malicious activity"),
    UNKNOWN("Unknown", "Unclassified threat");

    private final String displayName;
    private final String description;

    ThreatCategory(String displayName, String description) {
        this.displayName = displayName;
        this.description = description;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getDescription() {
        return description;
    }
}