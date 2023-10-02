// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

@Generated
public class JobSettings {
  /** A list of compute requirements that can be referenced by tasks of this job. */
  @JsonProperty("compute")
  private Collection<JobCompute> compute;

  /**
   * An optional continuous property for this job. The continuous property will ensure that there is
   * always one run executing. Only one of `schedule` and `continuous` can be used.
   */
  @JsonProperty("continuous")
  private Continuous continuous;

  /**
   * An optional set of email addresses that is notified when runs of this job begin or complete as
   * well as when this job is deleted. The default behavior is to not send any emails.
   */
  @JsonProperty("email_notifications")
  private JobEmailNotifications emailNotifications;

  /**
   * Used to tell what is the format of the job. This field is ignored in Create/Update/Reset calls.
   * When using the Jobs API 2.1 this value is always set to `"MULTI_TASK"`.
   */
  @JsonProperty("format")
  private Format format;

  /**
   * An optional specification for a remote Git repository containing the source code used by tasks.
   * Version-controlled source code is supported by notebook, dbt, Python script, and SQL File
   * tasks.
   *
   * <p>If `git_source` is set, these tasks retrieve the file from the remote repository by default.
   * However, this behavior can be overridden by setting `source` to `WORKSPACE` on the task.
   *
   * <p>Note: dbt and SQL File tasks support only version-controlled sources. If dbt or SQL File
   * tasks are used, `git_source` must be defined on the job.
   */
  @JsonProperty("git_source")
  private GitSource gitSource;

  /** An optional set of health rules that can be defined for this job. */
  @JsonProperty("health")
  private JobsHealthRules health;

  /**
   * A list of job cluster specifications that can be shared and reused by tasks of this job.
   * Libraries cannot be declared in a shared job cluster. You must declare dependent libraries in
   * task settings.
   */
  @JsonProperty("job_clusters")
  private Collection<JobCluster> jobClusters;

  /**
   * An optional maximum allowed number of concurrent runs of the job.
   *
   * <p>Set this value if you want to be able to execute multiple runs of the same job concurrently.
   * This is useful for example if you trigger your job on a frequent schedule and want to allow
   * consecutive runs to overlap with each other, or if you want to trigger multiple runs which
   * differ by their input parameters.
   *
   * <p>This setting affects only new runs. For example, suppose the job’s concurrency is 4 and
   * there are 4 concurrent active runs. Then setting the concurrency to 3 won’t kill any of the
   * active runs. However, from then on, new runs are skipped unless there are fewer than 3 active
   * runs.
   *
   * <p>This value cannot exceed 1000\. Setting this value to 0 causes all new runs to be skipped.
   * The default behavior is to allow only 1 concurrent run.
   */
  @JsonProperty("max_concurrent_runs")
  private Long maxConcurrentRuns;

  /** An optional name for the job. The maximum length is 4096 bytes in UTF-8 encoding. */
  @JsonProperty("name")
  private String name;

  /**
   * Optional notification settings that are used when sending notifications to each of the
   * `email_notifications` and `webhook_notifications` for this job.
   */
  @JsonProperty("notification_settings")
  private JobNotificationSettings notificationSettings;

  /** Job-level parameter definitions */
  @JsonProperty("parameters")
  private Collection<JobParameterDefinition> parameters;

  /** The queue settings of the job. */
  @JsonProperty("queue")
  private QueueSettings queue;

  /**
   * Write-only setting, available only in Create/Update/Reset and Submit calls. Specifies the user
   * or service principal that the job runs as. If not specified, the job runs as the user who
   * created the job.
   *
   * <p>Only `user_name` or `service_principal_name` can be specified. If both are specified, an
   * error is thrown.
   */
  @JsonProperty("run_as")
  private JobRunAs runAs;

  /**
   * An optional periodic schedule for this job. The default behavior is that the job only runs when
   * triggered by clicking “Run Now” in the Jobs UI or sending an API request to `runNow`.
   */
  @JsonProperty("schedule")
  private CronSchedule schedule;

  /**
   * A map of tags associated with the job. These are forwarded to the cluster as cluster tags for
   * jobs clusters, and are subject to the same limitations as cluster tags. A maximum of 25 tags
   * can be added to the job.
   */
  @JsonProperty("tags")
  private Map<String, String> tags;

  /** A list of task specifications to be executed by this job. */
  @JsonProperty("tasks")
  private Collection<Task> tasks;

  /**
   * An optional timeout applied to each run of this job. The default behavior is to have no
   * timeout.
   */
  @JsonProperty("timeout_seconds")
  private Long timeoutSeconds;

  /**
   * Trigger settings for the job. Can be used to trigger a run when new files arrive in an external
   * location. The default behavior is that the job runs only when triggered by clicking “Run Now”
   * in the Jobs UI or sending an API request to `runNow`.
   */
  @JsonProperty("trigger")
  private TriggerSettings trigger;

  /**
   * A collection of system notification IDs to notify when the run begins or completes. The default
   * behavior is to not send any system notifications.
   */
  @JsonProperty("webhook_notifications")
  private WebhookNotifications webhookNotifications;

  public JobSettings setCompute(Collection<JobCompute> compute) {
    this.compute = compute;
    return this;
  }

  public Collection<JobCompute> getCompute() {
    return compute;
  }

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

  public JobSettings setFormat(Format format) {
    this.format = format;
    return this;
  }

  public Format getFormat() {
    return format;
  }

  public JobSettings setGitSource(GitSource gitSource) {
    this.gitSource = gitSource;
    return this;
  }

  public GitSource getGitSource() {
    return gitSource;
  }

  public JobSettings setHealth(JobsHealthRules health) {
    this.health = health;
    return this;
  }

  public JobsHealthRules getHealth() {
    return health;
  }

  public JobSettings setJobClusters(Collection<JobCluster> jobClusters) {
    this.jobClusters = jobClusters;
    return this;
  }

  public Collection<JobCluster> getJobClusters() {
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

  public JobSettings setNotificationSettings(JobNotificationSettings notificationSettings) {
    this.notificationSettings = notificationSettings;
    return this;
  }

  public JobNotificationSettings getNotificationSettings() {
    return notificationSettings;
  }

  public JobSettings setParameters(Collection<JobParameterDefinition> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Collection<JobParameterDefinition> getParameters() {
    return parameters;
  }

  public JobSettings setQueue(QueueSettings queue) {
    this.queue = queue;
    return this;
  }

  public QueueSettings getQueue() {
    return queue;
  }

  public JobSettings setRunAs(JobRunAs runAs) {
    this.runAs = runAs;
    return this;
  }

  public JobRunAs getRunAs() {
    return runAs;
  }

  public JobSettings setSchedule(CronSchedule schedule) {
    this.schedule = schedule;
    return this;
  }

  public CronSchedule getSchedule() {
    return schedule;
  }

  public JobSettings setTags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public Map<String, String> getTags() {
    return tags;
  }

  public JobSettings setTasks(Collection<Task> tasks) {
    this.tasks = tasks;
    return this;
  }

  public Collection<Task> getTasks() {
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

  public JobSettings setWebhookNotifications(WebhookNotifications webhookNotifications) {
    this.webhookNotifications = webhookNotifications;
    return this;
  }

  public WebhookNotifications getWebhookNotifications() {
    return webhookNotifications;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JobSettings that = (JobSettings) o;
    return Objects.equals(compute, that.compute)
        && Objects.equals(continuous, that.continuous)
        && Objects.equals(emailNotifications, that.emailNotifications)
        && Objects.equals(format, that.format)
        && Objects.equals(gitSource, that.gitSource)
        && Objects.equals(health, that.health)
        && Objects.equals(jobClusters, that.jobClusters)
        && Objects.equals(maxConcurrentRuns, that.maxConcurrentRuns)
        && Objects.equals(name, that.name)
        && Objects.equals(notificationSettings, that.notificationSettings)
        && Objects.equals(parameters, that.parameters)
        && Objects.equals(queue, that.queue)
        && Objects.equals(runAs, that.runAs)
        && Objects.equals(schedule, that.schedule)
        && Objects.equals(tags, that.tags)
        && Objects.equals(tasks, that.tasks)
        && Objects.equals(timeoutSeconds, that.timeoutSeconds)
        && Objects.equals(trigger, that.trigger)
        && Objects.equals(webhookNotifications, that.webhookNotifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        compute,
        continuous,
        emailNotifications,
        format,
        gitSource,
        health,
        jobClusters,
        maxConcurrentRuns,
        name,
        notificationSettings,
        parameters,
        queue,
        runAs,
        schedule,
        tags,
        tasks,
        timeoutSeconds,
        trigger,
        webhookNotifications);
  }

  @Override
  public String toString() {
    return new ToStringer(JobSettings.class)
        .add("compute", compute)
        .add("continuous", continuous)
        .add("emailNotifications", emailNotifications)
        .add("format", format)
        .add("gitSource", gitSource)
        .add("health", health)
        .add("jobClusters", jobClusters)
        .add("maxConcurrentRuns", maxConcurrentRuns)
        .add("name", name)
        .add("notificationSettings", notificationSettings)
        .add("parameters", parameters)
        .add("queue", queue)
        .add("runAs", runAs)
        .add("schedule", schedule)
        .add("tags", tags)
        .add("tasks", tasks)
        .add("timeoutSeconds", timeoutSeconds)
        .add("trigger", trigger)
        .add("webhookNotifications", webhookNotifications)
        .toString();
  }
}
