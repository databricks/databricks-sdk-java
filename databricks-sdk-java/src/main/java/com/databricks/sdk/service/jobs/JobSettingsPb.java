// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

@Generated
class JobSettingsPb {
  @JsonProperty("budget_policy_id")
  private String budgetPolicyId;

  @JsonProperty("continuous")
  private Continuous continuous;

  @JsonProperty("deployment")
  private JobDeployment deployment;

  @JsonProperty("description")
  private String description;

  @JsonProperty("edit_mode")
  private JobEditMode editMode;

  @JsonProperty("email_notifications")
  private JobEmailNotifications emailNotifications;

  @JsonProperty("environments")
  private Collection<JobEnvironment> environments;

  @JsonProperty("format")
  private Format format;

  @JsonProperty("git_source")
  private GitSource gitSource;

  @JsonProperty("health")
  private JobsHealthRules health;

  @JsonProperty("job_clusters")
  private Collection<JobCluster> jobClusters;

  @JsonProperty("max_concurrent_runs")
  private Long maxConcurrentRuns;

  @JsonProperty("name")
  private String name;

  @JsonProperty("notification_settings")
  private JobNotificationSettings notificationSettings;

  @JsonProperty("parameters")
  private Collection<JobParameterDefinition> parameters;

  @JsonProperty("performance_target")
  private PerformanceTarget performanceTarget;

  @JsonProperty("queue")
  private QueueSettings queue;

  @JsonProperty("run_as")
  private JobRunAs runAs;

  @JsonProperty("schedule")
  private CronSchedule schedule;

  @JsonProperty("tags")
  private Map<String, String> tags;

  @JsonProperty("tasks")
  private Collection<Task> tasks;

  @JsonProperty("timeout_seconds")
  private Long timeoutSeconds;

  @JsonProperty("trigger")
  private TriggerSettings trigger;

  @JsonProperty("webhook_notifications")
  private WebhookNotifications webhookNotifications;

  public JobSettingsPb setBudgetPolicyId(String budgetPolicyId) {
    this.budgetPolicyId = budgetPolicyId;
    return this;
  }

  public String getBudgetPolicyId() {
    return budgetPolicyId;
  }

  public JobSettingsPb setContinuous(Continuous continuous) {
    this.continuous = continuous;
    return this;
  }

  public Continuous getContinuous() {
    return continuous;
  }

  public JobSettingsPb setDeployment(JobDeployment deployment) {
    this.deployment = deployment;
    return this;
  }

  public JobDeployment getDeployment() {
    return deployment;
  }

  public JobSettingsPb setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public JobSettingsPb setEditMode(JobEditMode editMode) {
    this.editMode = editMode;
    return this;
  }

  public JobEditMode getEditMode() {
    return editMode;
  }

  public JobSettingsPb setEmailNotifications(JobEmailNotifications emailNotifications) {
    this.emailNotifications = emailNotifications;
    return this;
  }

  public JobEmailNotifications getEmailNotifications() {
    return emailNotifications;
  }

  public JobSettingsPb setEnvironments(Collection<JobEnvironment> environments) {
    this.environments = environments;
    return this;
  }

  public Collection<JobEnvironment> getEnvironments() {
    return environments;
  }

  public JobSettingsPb setFormat(Format format) {
    this.format = format;
    return this;
  }

  public Format getFormat() {
    return format;
  }

  public JobSettingsPb setGitSource(GitSource gitSource) {
    this.gitSource = gitSource;
    return this;
  }

  public GitSource getGitSource() {
    return gitSource;
  }

  public JobSettingsPb setHealth(JobsHealthRules health) {
    this.health = health;
    return this;
  }

  public JobsHealthRules getHealth() {
    return health;
  }

  public JobSettingsPb setJobClusters(Collection<JobCluster> jobClusters) {
    this.jobClusters = jobClusters;
    return this;
  }

  public Collection<JobCluster> getJobClusters() {
    return jobClusters;
  }

  public JobSettingsPb setMaxConcurrentRuns(Long maxConcurrentRuns) {
    this.maxConcurrentRuns = maxConcurrentRuns;
    return this;
  }

  public Long getMaxConcurrentRuns() {
    return maxConcurrentRuns;
  }

  public JobSettingsPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public JobSettingsPb setNotificationSettings(JobNotificationSettings notificationSettings) {
    this.notificationSettings = notificationSettings;
    return this;
  }

  public JobNotificationSettings getNotificationSettings() {
    return notificationSettings;
  }

  public JobSettingsPb setParameters(Collection<JobParameterDefinition> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Collection<JobParameterDefinition> getParameters() {
    return parameters;
  }

  public JobSettingsPb setPerformanceTarget(PerformanceTarget performanceTarget) {
    this.performanceTarget = performanceTarget;
    return this;
  }

  public PerformanceTarget getPerformanceTarget() {
    return performanceTarget;
  }

  public JobSettingsPb setQueue(QueueSettings queue) {
    this.queue = queue;
    return this;
  }

  public QueueSettings getQueue() {
    return queue;
  }

  public JobSettingsPb setRunAs(JobRunAs runAs) {
    this.runAs = runAs;
    return this;
  }

  public JobRunAs getRunAs() {
    return runAs;
  }

  public JobSettingsPb setSchedule(CronSchedule schedule) {
    this.schedule = schedule;
    return this;
  }

  public CronSchedule getSchedule() {
    return schedule;
  }

  public JobSettingsPb setTags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public Map<String, String> getTags() {
    return tags;
  }

  public JobSettingsPb setTasks(Collection<Task> tasks) {
    this.tasks = tasks;
    return this;
  }

  public Collection<Task> getTasks() {
    return tasks;
  }

  public JobSettingsPb setTimeoutSeconds(Long timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

  public Long getTimeoutSeconds() {
    return timeoutSeconds;
  }

  public JobSettingsPb setTrigger(TriggerSettings trigger) {
    this.trigger = trigger;
    return this;
  }

  public TriggerSettings getTrigger() {
    return trigger;
  }

  public JobSettingsPb setWebhookNotifications(WebhookNotifications webhookNotifications) {
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
    JobSettingsPb that = (JobSettingsPb) o;
    return Objects.equals(budgetPolicyId, that.budgetPolicyId)
        && Objects.equals(continuous, that.continuous)
        && Objects.equals(deployment, that.deployment)
        && Objects.equals(description, that.description)
        && Objects.equals(editMode, that.editMode)
        && Objects.equals(emailNotifications, that.emailNotifications)
        && Objects.equals(environments, that.environments)
        && Objects.equals(format, that.format)
        && Objects.equals(gitSource, that.gitSource)
        && Objects.equals(health, that.health)
        && Objects.equals(jobClusters, that.jobClusters)
        && Objects.equals(maxConcurrentRuns, that.maxConcurrentRuns)
        && Objects.equals(name, that.name)
        && Objects.equals(notificationSettings, that.notificationSettings)
        && Objects.equals(parameters, that.parameters)
        && Objects.equals(performanceTarget, that.performanceTarget)
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
        budgetPolicyId,
        continuous,
        deployment,
        description,
        editMode,
        emailNotifications,
        environments,
        format,
        gitSource,
        health,
        jobClusters,
        maxConcurrentRuns,
        name,
        notificationSettings,
        parameters,
        performanceTarget,
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
    return new ToStringer(JobSettingsPb.class)
        .add("budgetPolicyId", budgetPolicyId)
        .add("continuous", continuous)
        .add("deployment", deployment)
        .add("description", description)
        .add("editMode", editMode)
        .add("emailNotifications", emailNotifications)
        .add("environments", environments)
        .add("format", format)
        .add("gitSource", gitSource)
        .add("health", health)
        .add("jobClusters", jobClusters)
        .add("maxConcurrentRuns", maxConcurrentRuns)
        .add("name", name)
        .add("notificationSettings", notificationSettings)
        .add("parameters", parameters)
        .add("performanceTarget", performanceTarget)
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
