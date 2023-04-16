package com.databricks.sdk.client;

import com.databricks.sdk.client.oauth.ClientCredentials;
import com.databricks.sdk.client.oauth.RefreshableTokenSource;
import com.databricks.sdk.client.oauth.Token;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class CliTokenSource extends RefreshableTokenSource {
    private final List<String> cmd;
    private final String tokenTypeField;
    private final String accessTokenField;
    private final String expiryField;

    public CliTokenSource(List<String> cmd, String tokenTypeField, String accessTokenField, String expiryField) {
        this.cmd = cmd;
        this.tokenTypeField = tokenTypeField;
        this.accessTokenField = accessTokenField;
        this.expiryField = expiryField;
    }

    private static LocalDateTime parseExpiry(String expiry) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSS");
        LocalDateTime dateTime = LocalDateTime.parse(expiry, formatter);
        return dateTime;
    }

    @Override
    public Token refresh() {
        try {
            Process process = new ProcessBuilder(cmd).start();
            String output = new String(process.getInputStream().readAllBytes());
            int exitCode = process.waitFor();
            if (exitCode != 0) {
                throw new IOException("Command returned non-zero exit code");
            }
            JsonNode jsonNode = new ObjectMapper().readTree(output);
            String tokenType = jsonNode.get(tokenTypeField).asText();
            String accessToken = jsonNode.get(accessTokenField).asText();
            String expiry = jsonNode.get(expiryField).asText();
            LocalDateTime expiresOn = parseExpiry(expiry);
            return new Token(accessToken, tokenType, expiresOn);
        } catch (Exception e) {
            throw new DatabricksException("Error executing command: " + e.getMessage(), e);
        }
    }
}

