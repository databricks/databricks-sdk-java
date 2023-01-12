// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class HttpUrlSpecWithoutSecret {
    /**
     * Enable/disable SSL certificate validation. Default is true. For
     * self-signed certificates, this field must be false AND the destination
     * server must disable certificate validation as well. For security
     * purposes, it is encouraged to perform secret validation with the
     * HMAC-encoded portion of the payload and acknowledge the risk associated
     * with disabling hostname validation whereby it becomes more likely that
     * requests can be maliciously routed to an unintended host.
     */
    @JsonProperty("enable_ssl_verification")
    private Boolean enableSslVerification;
    
    /**
     * External HTTPS URL called on event trigger (by using a POST request).
     */
    @JsonProperty("url")
    private String url;
    
    public HttpUrlSpecWithoutSecret setEnableSslVerification(Boolean enableSslVerification) {
        this.enableSslVerification = enableSslVerification;
        return this;
    }

    public Boolean getEnableSslVerification() {
        return enableSslVerification;
    }
    
    public HttpUrlSpecWithoutSecret setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getUrl() {
        return url;
    }
    
}
