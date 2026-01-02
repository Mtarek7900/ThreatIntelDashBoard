package com.threatintel.enums;

/**
 * Types of Indicators of Compromise that can be analyzed
 */
public enum IocType {
    IP_ADDRESS("IP Address"),
    DOMAIN("Domain"),
    URL("URL"),
    FILE_HASH_MD5("File Hash (MD5)"),
    FILE_HASH_SHA1("File Hash (SHA-1)"),
    FILE_HASH_SHA256("File Hash (SHA-256)"),
    EMAIL("Email Address");

    private final String displayName;

    IocType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}