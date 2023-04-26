// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

/**
 * <p>JobSettings class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class JobSettings {
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
  private JobSettingsFormat format;

  /**
   * An optional specification for a remote repository containing the notebooks used by this job's
   * notebook tasks.
   */
  @JsonProperty("git_source")
  private GitSource gitSource;

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

  /** An optional name for the job. */
  @JsonProperty("name")
  private String name;

  /**
   * Optional notification settings that are used when sending notifications to each of the
   * `email_notifications` and `webhook_notifications` for this job.
   */
  @JsonProperty("notification_settings")
  private JobNotificationSettings notificationSettings;

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
  private Collection<JobTaskSettings> tasks;

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
  private JobWebhookNotifications webhookNotifications;

  /**
   * <p>Setter for the field <code>continuous</code>.</p>
   *
   * @param continuous a {@link com.databricks.sdk.service.jobs.Continuous} object
   * @return a {@link com.databricks.sdk.service.jobs.JobSettings} object
   */
  public JobSettings setContinuous(Continuous continuous) {
    this.continuous = continuous;
    return this;
  }

  /**
   * <p>Getter for the field <code>continuous</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.Continuous} object
   */
  public Continuous getContinuous() {
    return continuous;
  }

  /**
   * <p>Setter for the field <code>emailNotifications</code>.</p>
   *
   * @param emailNotifications a {@link com.databricks.sdk.service.jobs.JobEmailNotifications} object
   * @return a {@link com.databricks.sdk.service.jobs.JobSettings} object
   */
  public JobSettings setEmailNotifications(JobEmailNotifications emailNotifications) {
    this.emailNotifications = emailNotifications;
    return this;
  }

  /**
   * <p>Getter for the field <code>emailNotifications</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.JobEmailNotifications} object
   */
  public JobEmailNotifications getEmailNotifications() {
    return emailNotifications;
  }

  /**
   * <p>Setter for the field <code>format</code>.</p>
   *
   * @param format a {@link com.databricks.sdk.service.jobs.JobSettingsFormat} object
   * @return a {@link com.databricks.sdk.service.jobs.JobSettings} object
   */
  public JobSettings setFormat(JobSettingsFormat format) {
    this.format = format;
    return this;
  }

  /**
   * <p>Getter for the field <code>format</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.JobSettingsFormat} object
   */
  public JobSettingsFormat getFormat() {
    return format;
  }

  /**
   * <p>Setter for the field <code>gitSource</code>.</p>
   *
   * @param gitSource a {@link com.databricks.sdk.service.jobs.GitSource} object
   * @return a {@link com.databricks.sdk.service.jobs.JobSettings} object
   */
  public JobSettings setGitSource(GitSource gitSource) {
    this.gitSource = gitSource;
    return this;
  }

  /**
   * <p>Getter for the field <code>gitSource</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.GitSource} object
   */
  public GitSource getGitSource() {
    return gitSource;
  }

  /**
   * <p>Setter for the field <code>jobClusters</code>.</p>
   *
   * @param jobClusters a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.jobs.JobSettings} object
   */
  public JobSettings setJobClusters(Collection<JobCluster> jobClusters) {
    this.jobClusters = jobClusters;
    return this;
  }

  /**
   * <p>Getter for the field <code>jobClusters</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<JobCluster> getJobClusters() {
    return jobClusters;
  }

  /**
   * <p>Setter for the field <code>maxConcurrentRuns</code>.</p>
   *
   * @param maxConcurrentRuns a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.JobSettings} object
   */
  public JobSettings setMaxConcurrentRuns(Long maxConcurrentRuns) {
    this.maxConcurrentRuns = maxConcurrentRuns;
    return this;
  }

  /**
   * <p>Getter for the field <code>maxConcurrentRuns</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getMaxConcurrentRuns() {
    return maxConcurrentRuns;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.JobSettings} object
   */
  public JobSettings setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getter for the field <code>name</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * <p>Setter for the field <code>notificationSettings</code>.</p>
   *
   * @param notificationSettings a {@link com.databricks.sdk.service.jobs.JobNotificationSettings} object
   * @return a {@link com.databricks.sdk.service.jobs.JobSettings} object
   */
  public JobSettings setNotificationSettings(JobNotificationSettings notificationSettings) {
    this.notificationSettings = notificationSettings;
    return this;
  }

  /**
   * <p>Getter for the field <code>notificationSettings</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.JobNotificationSettings} object
   */
  public JobNotificationSettings getNotificationSettings() {
    return notificationSettings;
  }

  /**
   * <p>Setter for the field <code>schedule</code>.</p>
   *
   * @param schedule a {@link com.databricks.sdk.service.jobs.CronSchedule} object
   * @return a {@link com.databricks.sdk.service.jobs.JobSettings} object
   */
  public JobSettings setSchedule(CronSchedule schedule) {
    this.schedule = schedule;
    return this;
  }

  /**
   * <p>Getter for the field <code>schedule</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.CronSchedule} object
   */
  public CronSchedule getSchedule() {
    return schedule;
  }

  /**
   * <p>Setter for the field <code>tags</code>.</p>
   *
   * @param tags a {@link java.util.Map} object
   * @return a {@link com.databricks.sdk.service.jobs.JobSettings} object
   */
  public JobSettings setTags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  /**
   * <p>Getter for the field <code>tags</code>.</p>
   *
   * @return a {@link java.util.Map} object
   */
  public Map<String, String> getTags() {
    return tags;
  }

  /**
   * <p>Setter for the field <code>tasks</code>.</p>
   *
   * @param tasks a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.jobs.JobSettings} object
   */
  public JobSettings setTasks(Collection<JobTaskSettings> tasks) {
    this.tasks = tasks;
    return this;
  }

  /**
   * <p>Getter for the field <code>tasks</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<JobTaskSettings> getTasks() {
    return tasks;
  }

  /**
   * <p>Setter for the field <code>timeoutSeconds</code>.</p>
   *
   * @param timeoutSeconds a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.JobSettings} object
   */
  public JobSettings setTimeoutSeconds(Long timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

  /**
   * <p>Getter for the field <code>timeoutSeconds</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getTimeoutSeconds() {
    return timeoutSeconds;
  }

  /**
   * <p>Setter for the field <code>trigger</code>.</p>
   *
   * @param trigger a {@link com.databricks.sdk.service.jobs.TriggerSettings} object
   * @return a {@link com.databricks.sdk.service.jobs.JobSettings} object
   */
  public JobSettings setTrigger(TriggerSettings trigger) {
    this.trigger = trigger;
    return this;
  }

  /**
   * <p>Getter for the field <code>trigger</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.TriggerSettings} object
   */
  public TriggerSettings getTrigger() {
    return trigger;
  }

  /**
   * <p>Setter for the field <code>webhookNotifications</code>.</p>
   *
   * @param webhookNotifications a {@link com.databricks.sdk.service.jobs.JobWebhookNotifications} object
   * @return a {@link com.databricks.sdk.service.jobs.JobSettings} object
   */
  public JobSettings setWebhookNotifications(JobWebhookNotifications webhookNotifications) {
    this.webhookNotifications = webhookNotifications;
    return this;
  }

  /**
   * <p>Getter for the field <code>webhookNotifications</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.JobWebhookNotifications} object
   */
  public JobWebhookNotifications getWebhookNotifications() {
    return webhookNotifications;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JobSettings that = (JobSettings) o;
    return Objects.equals(continuous, that.continuous)
        && Objects.equals(emailNotifications, that.emailNotifications)
        && Objects.equals(format, that.format)
        && Objects.equals(gitSource, that.gitSource)
        && Objects.equals(jobClusters, that.jobClusters)
        && Objects.equals(maxConcurrentRuns, that.maxConcurrentRuns)
        && Objects.equals(name, that.name)
        && Objects.equals(notificationSettings, that.notificationSettings)
        && Objects.equals(schedule, that.schedule)
        && Objects.equals(tags, that.tags)
        && Objects.equals(tasks, that.tasks)
        && Objects.equals(timeoutSeconds, that.timeoutSeconds)
        && Objects.equals(trigger, that.trigger)
        && Objects.equals(webhookNotifications, that.webhookNotifications);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        continuous,
        emailNotifications,
        format,
        gitSource,
        jobClusters,
        maxConcurrentRuns,
        name,
        notificationSettings,
        schedule,
        tags,
        tasks,
        timeoutSeconds,
        trigger,
        webhookNotifications);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(JobSettings.class)
        .add("continuous", continuous)
        .add("emailNotifications", emailNotifications)
        .add("format", format)
        .add("gitSource", gitSource)
        .add("jobClusters", jobClusters)
        .add("maxConcurrentRuns", maxConcurrentRuns)
        .add("name", name)
        .add("notificationSettings", notificationSettings)
        .add("schedule", schedule)
        .add("tags", tags)
        .add("tasks", tasks)
        .add("timeoutSeconds", timeoutSeconds)
        .add("trigger", trigger)
        .add("webhookNotifications", webhookNotifications)
        .toString();
  }
}
