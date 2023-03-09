// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class JobSettings {
    /**
     * An optional continuous property for this job. The continuous property
     * will ensure that there is always one run executing. Only one of
     * `schedule` and `continuous` can be used.
     */
    @JsonProperty("continuous")
    private Continuous continuous;
    
    /**
     * An optional set of email addresses that is notified when runs of this job
     * begin or complete as well as when this job is deleted. The default
     * behavior is to not send any emails.
     */
    @JsonProperty("email_notifications")
    private JobEmailNotifications emailNotifications;
    
    /**
     * Used to tell what is the format of the job. This field is ignored in
     * Create/Update/Reset calls. When using the Jobs API 2.1 this value is
     * always set to `"MULTI_TASK"`.
     */
    @JsonProperty("format")
    private JobSettingsFormat format;
    
    /**
     * An optional specification for a remote repository containing the
     * notebooks used by this job's notebook tasks.
     */
    @JsonProperty("git_source")
    private GitSource gitSource;
    
    /**
     * A list of job cluster specifications that can be shared and reused by
     * tasks of this job. Libraries cannot be declared in a shared job cluster.
     * You must declare dependent libraries in task settings.
     */
    @JsonProperty("job_clusters")
    private java.util.List<JobCluster> jobClusters;
    
    /**
     * An optional maximum allowed number of concurrent runs of the job.
     * 
     * Set this value if you want to be able to execute multiple runs of the
     * same job concurrently. This is useful for example if you trigger your job
     * on a frequent schedule and want to allow consecutive runs to overlap with
     * each other, or if you want to trigger multiple runs which differ by their
     * input parameters.
     * 
     * This setting affects only new runs. For example, suppose the job’s
     * concurrency is 4 and there are 4 concurrent active runs. Then setting the
     * concurrency to 3 won’t kill any of the active runs. However, from then
     * on, new runs are skipped unless there are fewer than 3 active runs.
     * 
     * This value cannot exceed 1000\. Setting this value to 0 causes all new
     * runs to be skipped. The default behavior is to allow only 1 concurrent
     * run.
     */
    @JsonProperty("max_concurrent_runs")
    private Long maxConcurrentRuns;
    
    /**
     * An optional name for the job.
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * An optional periodic schedule for this job. The default behavior is that
     * the job only runs when triggered by clicking “Run Now” in the Jobs UI
     * or sending an API request to `runNow`.
     */
    @JsonProperty("schedule")
    private CronSchedule schedule;
    
    /**
     * A map of tags associated with the job. These are forwarded to the cluster
     * as cluster tags for jobs clusters, and are subject to the same
     * limitations as cluster tags. A maximum of 25 tags can be added to the
     * job.
     */
    @JsonProperty("tags")
    private Map<String,String> tags;
    
    /**
     * A list of task specifications to be executed by this job.
     */
    @JsonProperty("tasks")
    private java.util.List<JobTaskSettings> tasks;
    
    /**
     * An optional timeout applied to each run of this job. The default behavior
     * is to have no timeout.
     */
    @JsonProperty("timeout_seconds")
    private Long timeoutSeconds;
    
    /**
     * Trigger settings for the job. Can be used to trigger a run when new files
     * arrive in an external location. The default behavior is that the job runs
     * only when triggered by clicking “Run Now” in the Jobs UI or sending
     * an API request to `runNow`.
     */
    @JsonProperty("trigger")
    private TriggerSettings trigger;
    
    /**
     * A collection of system notification IDs to notify when the run begins or
     * completes. The default behavior is to not send any system notifications.
     */
    @JsonProperty("webhook_notifications")
    private JobWebhookNotifications webhookNotifications;
    
    public JobSettings setContinuous(Continuous continuous) {
        this.continuous = continuous;
        return this;
    }

    public Continuous getContinuous() {
        return continuous;
    }
    
    public JobSettings setEmailNotifications(JobEmailNotifications emailNotifications) {
        this.emailNotifications = emailNotifications;
        return this;
    }

    public JobEmailNotifications getEmailNotifications() {
        return emailNotifications;
    }
    
    public JobSettings setFormat(JobSettingsFormat format) {
        this.format = format;
        return this;
    }

    public JobSettingsFormat getFormat() {
        return format;
    }
    
    public JobSettings setGitSource(GitSource gitSource) {
        this.gitSource = gitSource;
        return this;
    }

    public GitSource getGitSource() {
        return gitSource;
    }
    
    public JobSettings setJobClusters(java.util.List<JobCluster> jobClusters) {
        this.jobClusters = jobClusters;
        return this;
    }

    public java.util.List<JobCluster> getJobClusters() {
        return jobClusters;
    }
    
    public JobSettings setMaxConcurrentRuns(Long maxConcurrentRuns) {
        this.maxConcurrentRuns = maxConcurrentRuns;
        return this;
    }

    public Long getMaxConcurrentRuns() {
        return maxConcurrentRuns;
    }
    
    public JobSettings setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public JobSettings setSchedule(CronSchedule schedule) {
        this.schedule = schedule;
        return this;
    }

    public CronSchedule getSchedule() {
        return schedule;
    }
    
    public JobSettings setTags(Map<String,String> tags) {
        this.tags = tags;
        return this;
    }

    public Map<String,String> getTags() {
        return tags;
    }
    
    public JobSettings setTasks(java.util.List<JobTaskSettings> tasks) {
        this.tasks = tasks;
        return this;
    }

    public java.util.List<JobTaskSettings> getTasks() {
        return tasks;
    }
    
    public JobSettings setTimeoutSeconds(Long timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }

    public Long getTimeoutSeconds() {
        return timeoutSeconds;
    }
    
    public JobSettings setTrigger(TriggerSettings trigger) {
        this.trigger = trigger;
        return this;
    }

    public TriggerSettings getTrigger() {
        return trigger;
    }
    
    public JobSettings setWebhookNotifications(JobWebhookNotifications webhookNotifications) {
        this.webhookNotifications = webhookNotifications;
        return this;
    }

    public JobWebhookNotifications getWebhookNotifications() {
        return webhookNotifications;
    }
    
}
