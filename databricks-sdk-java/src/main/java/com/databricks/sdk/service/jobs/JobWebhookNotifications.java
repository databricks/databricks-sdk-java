// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class JobWebhookNotifications {
    /**
     * An optional list of system notification IDs to call when the run fails. A
     * maximum of 3 destinations can be specified for the `on_failure` property.
     */
    @JsonProperty("on_failure")
    private java.util.List<JobWebhookNotificationsOnFailureItem> onFailure;
    
    /**
     * An optional list of system notification IDs to call when the run starts.
     * A maximum of 3 destinations can be specified for the `on_start` property.
     */
    @JsonProperty("on_start")
    private java.util.List<JobWebhookNotificationsOnStartItem> onStart;
    
    /**
     * An optional list of system notification IDs to call when the run
     * completes successfully. A maximum of 3 destinations can be specified for
     * the `on_success` property.
     */
    @JsonProperty("on_success")
    private java.util.List<JobWebhookNotificationsOnSuccessItem> onSuccess;
    
    public JobWebhookNotifications setOnFailure(java.util.List<JobWebhookNotificationsOnFailureItem> onFailure) {
        this.onFailure = onFailure;
        return this;
    }

    public java.util.List<JobWebhookNotificationsOnFailureItem> getOnFailure() {
        return onFailure;
    }
    
    public JobWebhookNotifications setOnStart(java.util.List<JobWebhookNotificationsOnStartItem> onStart) {
        this.onStart = onStart;
        return this;
    }

    public java.util.List<JobWebhookNotificationsOnStartItem> getOnStart() {
        return onStart;
    }
    
    public JobWebhookNotifications setOnSuccess(java.util.List<JobWebhookNotificationsOnSuccessItem> onSuccess) {
        this.onSuccess = onSuccess;
        return this;
    }

    public java.util.List<JobWebhookNotificationsOnSuccessItem> getOnSuccess() {
        return onSuccess;
    }
    
}
