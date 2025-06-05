// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class SubmitRunPb {
  @JsonProperty("access_control_list")
  private Collection<JobAccessControlRequest> accessControlList;

  @JsonProperty("budget_policy_id")
  private String budgetPolicyId;

  @JsonProperty("email_notifications")
  private JobEmailNotifications emailNotifications;

  @JsonProperty("environments")
  private Collection<JobEnvironment> environments;

  @JsonProperty("git_source")
  private GitSource gitSource;

  @JsonProperty("health")
  private JobsHealthRules health;

  @JsonProperty("idempotency_token")
  private String idempotencyToken;

  @JsonProperty("notification_settings")
  private JobNotificationSettings notificationSettings;

  @JsonProperty("queue")
  private QueueSettings queue;

  @JsonProperty("run_as")
  private JobRunAs runAs;

  @JsonProperty("run_name")
  private String runName;

  @JsonProperty("tasks")
  private Collection<SubmitTask> tasks;

  @JsonProperty("timeout_seconds")
  private Long timeoutSeconds;

  @JsonProperty("webhook_notifications")
  private WebhookNotifications webhookNotifications;

  public SubmitRunPb setAccessControlList(Collection<JobAccessControlRequest> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<JobAccessControlRequest> getAccessControlList() {
    return accessControlList;
  }

  public SubmitRunPb setBudgetPolicyId(String budgetPolicyId) {
    this.budgetPolicyId = budgetPolicyId;
    return this;
  }

  public String getBudgetPolicyId() {
    return budgetPolicyId;
  }

  public SubmitRunPb setEmailNotifications(JobEmailNotifications emailNotifications) {
    this.emailNotifications = emailNotifications;
    return this;
  }

  public JobEmailNotifications getEmailNotifications() {
    return emailNotifications;
  }

  public SubmitRunPb setEnvironments(Collection<JobEnvironment> environments) {
    this.environments = environments;
    return this;
  }

  public Collection<JobEnvironment> getEnvironments() {
    return environments;
  }

  public SubmitRunPb setGitSource(GitSource gitSource) {
    this.gitSource = gitSource;
    return this;
  }

  public GitSource getGitSource() {
    return gitSource;
  }

  public SubmitRunPb setHealth(JobsHealthRules health) {
    this.health = health;
    return this;
  }

  public JobsHealthRules getHealth() {
    return health;
  }

  public SubmitRunPb setIdempotencyToken(String idempotencyToken) {
    this.idempotencyToken = idempotencyToken;
    return this;
  }

  public String getIdempotencyToken() {
    return idempotencyToken;
  }

  public SubmitRunPb setNotificationSettings(JobNotificationSettings notificationSettings) {
    this.notificationSettings = notificationSettings;
    return this;
  }

  public JobNotificationSettings getNotificationSettings() {
    return notificationSettings;
  }

  public SubmitRunPb setQueue(QueueSettings queue) {
    this.queue = queue;
    return this;
  }

  public QueueSettings getQueue() {
    return queue;
  }

  public SubmitRunPb setRunAs(JobRunAs runAs) {
    this.runAs = runAs;
    return this;
  }

  public JobRunAs getRunAs() {
    return runAs;
  }

  public SubmitRunPb setRunName(String runName) {
    this.runName = runName;
    return this;
  }

  public String getRunName() {
    return runName;
  }

  public SubmitRunPb setTasks(Collection<SubmitTask> tasks) {
    this.tasks = tasks;
    return this;
  }

  public Collection<SubmitTask> getTasks() {
    return tasks;
  }

  public SubmitRunPb setTimeoutSeconds(Long timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

  public Long getTimeoutSeconds() {
    return timeoutSeconds;
  }

  public SubmitRunPb setWebhookNotifications(WebhookNotifications webhookNotifications) {
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
    SubmitRunPb that = (SubmitRunPb) o;
    return Objects.equals(accessControlList, that.accessControlList)
        && Objects.equals(budgetPolicyId, that.budgetPolicyId)
        && Objects.equals(emailNotifications, that.emailNotifications)
        && Objects.equals(environments, that.environments)
        && Objects.equals(gitSource, that.gitSource)
        && Objects.equals(health, that.health)
        && Objects.equals(idempotencyToken, that.idempotencyToken)
        && Objects.equals(notificationSettings, that.notificationSettings)
        && Objects.equals(queue, that.queue)
        && Objects.equals(runAs, that.runAs)
        && Objects.equals(runName, that.runName)
        && Objects.equals(tasks, that.tasks)
        && Objects.equals(timeoutSeconds, that.timeoutSeconds)
        && Objects.equals(webhookNotifications, that.webhookNotifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accessControlList,
        budgetPolicyId,
        emailNotifications,
        environments,
        gitSource,
        health,
        idempotencyToken,
        notificationSettings,
        queue,
        runAs,
        runName,
        tasks,
        timeoutSeconds,
        webhookNotifications);
  }

  @Override
  public String toString() {
    return new ToStringer(SubmitRunPb.class)
        .add("accessControlList", accessControlList)
        .add("budgetPolicyId", budgetPolicyId)
        .add("emailNotifications", emailNotifications)
        .add("environments", environments)
        .add("gitSource", gitSource)
        .add("health", health)
        .add("idempotencyToken", idempotencyToken)
        .add("notificationSettings", notificationSettings)
        .add("queue", queue)
        .add("runAs", runAs)
        .add("runName", runName)
        .add("tasks", tasks)
        .add("timeoutSeconds", timeoutSeconds)
        .add("webhookNotifications", webhookNotifications)
        .toString();
  }
}
