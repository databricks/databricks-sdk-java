// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class SubmitRun {
    /**
     * List of permissions to set on the job.
     */
    @JsonProperty("access_control_list")
    private java.util.List<Object /* MISSING TYPE */> accessControlList;
    
    /**
     * An optional specification for a remote repository containing the
     * notebooks used by this job's notebook tasks.
     */
    @JsonProperty("git_source")
    private GitSource gitSource;
    
    /**
     * An optional token that can be used to guarantee the idempotency of job
     * run requests. If a run with the provided token already exists, the
     * request does not create a new run but returns the ID of the existing run
     * instead. If a run with the provided token is deleted, an error is
     * returned.
     * 
     * If you specify the idempotency token, upon failure you can retry until
     * the request succeeds. Databricks guarantees that exactly one run is
     * launched with that idempotency token.
     * 
     * This token must have at most 64 characters.
     * 
     * For more information, see [How to ensure idempotency for jobs].
     * 
     * [How to ensure idempotency for jobs]: https://kb.databricks.com/jobs/jobs-idempotency.html
     */
    @JsonProperty("idempotency_token")
    private String idempotencyToken;
    
    /**
     * An optional name for the run. The default value is `Untitled`.
     */
    @JsonProperty("run_name")
    private String runName;
    
    /**
     
     */
    @JsonProperty("tasks")
    private java.util.List<RunSubmitTaskSettings> tasks;
    
    /**
     * An optional timeout applied to each run of this job. The default behavior
     * is to have no timeout.
     */
    @JsonProperty("timeout_seconds")
    private Long timeoutSeconds;
    
    /**
     * A collection of system notification IDs to notify when the run begins or
     * completes. The default behavior is to not send any system notifications.
     */
    @JsonProperty("webhook_notifications")
    private JobWebhookNotifications webhookNotifications;
    
    public SubmitRun setAccessControlList(java.util.List<Object /* MISSING TYPE */> accessControlList) {
        this.accessControlList = accessControlList;
        return this;
    }

    public java.util.List<Object /* MISSING TYPE */> getAccessControlList() {
        return accessControlList;
    }
    
    public SubmitRun setGitSource(GitSource gitSource) {
        this.gitSource = gitSource;
        return this;
    }

    public GitSource getGitSource() {
        return gitSource;
    }
    
    public SubmitRun setIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
        return this;
    }

    public String getIdempotencyToken() {
        return idempotencyToken;
    }
    
    public SubmitRun setRunName(String runName) {
        this.runName = runName;
        return this;
    }

    public String getRunName() {
        return runName;
    }
    
    public SubmitRun setTasks(java.util.List<RunSubmitTaskSettings> tasks) {
        this.tasks = tasks;
        return this;
    }

    public java.util.List<RunSubmitTaskSettings> getTasks() {
        return tasks;
    }
    
    public SubmitRun setTimeoutSeconds(Long timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }

    public Long getTimeoutSeconds() {
        return timeoutSeconds;
    }
    
    public SubmitRun setWebhookNotifications(JobWebhookNotifications webhookNotifications) {
        this.webhookNotifications = webhookNotifications;
        return this;
    }

    public JobWebhookNotifications getWebhookNotifications() {
        return webhookNotifications;
    }
    
}
