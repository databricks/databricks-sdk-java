// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class JobEmailNotifications {
    /**
     * If true, do not send email to recipients specified in `on_failure` if the
     * run is skipped.
     */
    @JsonProperty("no_alert_for_skipped_runs")
    private Boolean noAlertForSkippedRuns;
    
    /**
     * A list of email addresses to be notified when a run unsuccessfully
     * completes. A run is considered to have completed unsuccessfully if it
     * ends with an `INTERNAL_ERROR` `life_cycle_state` or a `SKIPPED`,
     * `FAILED`, or `TIMED_OUT` result_state. If this is not specified on job
     * creation, reset, or update the list is empty, and notifications are not
     * sent.
     */
    @JsonProperty("on_failure")
    private java.util.List<String> onFailure;
    
    /**
     * A list of email addresses to be notified when a run begins. If not
     * specified on job creation, reset, or update, the list is empty, and
     * notifications are not sent.
     */
    @JsonProperty("on_start")
    private java.util.List<String> onStart;
    
    /**
     * A list of email addresses to be notified when a run successfully
     * completes. A run is considered to have completed successfully if it ends
     * with a `TERMINATED` `life_cycle_state` and a `SUCCESSFUL` result_state.
     * If not specified on job creation, reset, or update, the list is empty,
     * and notifications are not sent.
     */
    @JsonProperty("on_success")
    private java.util.List<String> onSuccess;
    
    public JobEmailNotifications setNoAlertForSkippedRuns(Boolean noAlertForSkippedRuns) {
        this.noAlertForSkippedRuns = noAlertForSkippedRuns;
        return this;
    }

    public Boolean getNoAlertForSkippedRuns() {
        return noAlertForSkippedRuns;
    }
    
    public JobEmailNotifications setOnFailure(java.util.List<String> onFailure) {
        this.onFailure = onFailure;
        return this;
    }

    public java.util.List<String> getOnFailure() {
        return onFailure;
    }
    
    public JobEmailNotifications setOnStart(java.util.List<String> onStart) {
        this.onStart = onStart;
        return this;
    }

    public java.util.List<String> getOnStart() {
        return onStart;
    }
    
    public JobEmailNotifications setOnSuccess(java.util.List<String> onSuccess) {
        this.onSuccess = onSuccess;
        return this;
    }

    public java.util.List<String> getOnSuccess() {
        return onSuccess;
    }
    
}
