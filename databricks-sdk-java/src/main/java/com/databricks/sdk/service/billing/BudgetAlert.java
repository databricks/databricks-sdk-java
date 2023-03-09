// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class BudgetAlert {
    /**
     * List of email addresses to be notified when budget percentage is exceeded
     * in the given period.
     */
    @JsonProperty("email_notifications")
    private java.util.List<String> emailNotifications;
    
    /**
     * Percentage of the target amount used in the currect period that will
     * trigger a notification.
     */
    @JsonProperty("min_percentage")
    private Long minPercentage;
    
    public BudgetAlert setEmailNotifications(java.util.List<String> emailNotifications) {
        this.emailNotifications = emailNotifications;
        return this;
    }

    public java.util.List<String> getEmailNotifications() {
        return emailNotifications;
    }
    
    public BudgetAlert setMinPercentage(Long minPercentage) {
        this.minPercentage = minPercentage;
        return this;
    }

    public Long getMinPercentage() {
        return minPercentage;
    }
    
}
