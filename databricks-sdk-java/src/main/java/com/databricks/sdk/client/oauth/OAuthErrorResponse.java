package com.databricks.sdk.client.oauth;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OAuthErrorResponse {
    @JsonProperty("error")
    private String error;

    @JsonProperty("errorCode")
    private String errorCode;

    @JsonProperty("errorSummary")
    private String errorSummary;

    @JsonProperty("error_description")
    private String errorDescription;

    public String getErrorCode() {
        if (errorCode != null) {
            return errorCode;
        }
        if (error != null) {
            return error;
        }
        return "unknown";
    }

    public String getErrorSummary() {
        if (errorSummary != null) {
            return errorSummary;
        }
        if (errorDescription != null) {
            return errorDescription;
        }
        return "unknown";
    }
}
