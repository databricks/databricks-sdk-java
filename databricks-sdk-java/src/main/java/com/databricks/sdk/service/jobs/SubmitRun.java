// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class SubmitRun {
  /** List of permissions to set on the job. */
  @JsonProperty("access_control_list")
  private Collection<Object /* MISSING TYPE */> accessControlList;

  /**
   * An optional specification for a remote repository containing the notebooks used by this job's
   * notebook tasks.
   */
  @JsonProperty("git_source")
  private GitSource gitSource;

  /**
   * An optional token that can be used to guarantee the idempotency of job run requests. If a run
   * with the provided token already exists, the request does not create a new run but returns the
   * ID of the existing run instead. If a run with the provided token is deleted, an error is
   * returned.
   *
   * <p>If you specify the idempotency token, upon failure you can retry until the request succeeds.
   * Databricks guarantees that exactly one run is launched with that idempotency token.
   *
   * <p>This token must have at most 64 characters.
   *
   * <p>For more information, see [How to ensure idempotency for jobs].
   *
   * <p>[How to ensure idempotency for jobs]: https://kb.databricks.com/jobs/jobs-idempotency.html
   */
  @JsonProperty("idempotency_token")
  private String idempotencyToken;

  /** An optional name for the run. The default value is `Untitled`. */
  @JsonProperty("run_name")
  private String runName;

  /** */
  @JsonProperty("tasks")
  private Collection<RunSubmitTaskSettings> tasks;

  /**
   * An optional timeout applied to each run of this job. The default behavior is to have no
   * timeout.
   */
  @JsonProperty("timeout_seconds")
  private Long timeoutSeconds;

  /**
   * A collection of system notification IDs to notify when the run begins or completes. The default
   * behavior is to not send any system notifications.
   */
  @JsonProperty("webhook_notifications")
  private JobWebhookNotifications webhookNotifications;

  public SubmitRun setAccessControlList(Collection<Object /* MISSING TYPE */> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<Object /* MISSING TYPE */> getAccessControlList() {
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

  public SubmitRun setTasks(Collection<RunSubmitTaskSettings> tasks) {
    this.tasks = tasks;
    return this;
  }

  public Collection<RunSubmitTaskSettings> getTasks() {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubmitRun that = (SubmitRun) o;
    return Objects.equals(accessControlList, that.accessControlList)
        && Objects.equals(gitSource, that.gitSource)
        && Objects.equals(idempotencyToken, that.idempotencyToken)
        && Objects.equals(runName, that.runName)
        && Objects.equals(tasks, that.tasks)
        && Objects.equals(timeoutSeconds, that.timeoutSeconds)
        && Objects.equals(webhookNotifications, that.webhookNotifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accessControlList,
        gitSource,
        idempotencyToken,
        runName,
        tasks,
        timeoutSeconds,
        webhookNotifications);
  }

  @Override
  public String toString() {
    return new ToStringer(SubmitRun.class)
        .add("accessControlList", accessControlList)
        .add("gitSource", gitSource)
        .add("idempotencyToken", idempotencyToken)
        .add("runName", runName)
        .add("tasks", tasks)
        .add("timeoutSeconds", timeoutSeconds)
        .add("webhookNotifications", webhookNotifications)
        .toString();
  }
}
