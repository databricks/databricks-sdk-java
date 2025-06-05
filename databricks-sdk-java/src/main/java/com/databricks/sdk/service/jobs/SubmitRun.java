// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = SubmitRun.SubmitRunSerializer.class)
@JsonDeserialize(using = SubmitRun.SubmitRunDeserializer.class)
public class SubmitRun {
  /** List of permissions to set on the job. */
  private Collection<JobAccessControlRequest> accessControlList;

  /**
   * The user specified id of the budget policy to use for this one-time run. If not specified, the
   * run will be not be attributed to any budget policy.
   */
  private String budgetPolicyId;

  /** An optional set of email addresses notified when the run begins or completes. */
  private JobEmailNotifications emailNotifications;

  /**
   * A list of task execution environment specifications that can be referenced by tasks of this
   * run.
   */
  private Collection<JobEnvironment> environments;

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
  private GitSource gitSource;

  /** An optional set of health rules that can be defined for this job. */
  private JobsHealthRules health;

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
  private String idempotencyToken;

  /**
   * Optional notification settings that are used when sending notifications to each of the
   * `email_notifications` and `webhook_notifications` for this run.
   */
  private JobNotificationSettings notificationSettings;

  /** The queue settings of the one-time run. */
  private QueueSettings queue;

  /**
   * Specifies the user or service principal that the job runs as. If not specified, the job runs as
   * the user who submits the request.
   */
  private JobRunAs runAs;

  /** An optional name for the run. The default value is `Untitled`. */
  private String runName;

  /** */
  private Collection<SubmitTask> tasks;

  /** An optional timeout applied to each run of this job. A value of `0` means no timeout. */
  private Long timeoutSeconds;

  /** A collection of system notification IDs to notify when the run begins or completes. */
  private WebhookNotifications webhookNotifications;

  public SubmitRun setAccessControlList(Collection<JobAccessControlRequest> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<JobAccessControlRequest> getAccessControlList() {
    return accessControlList;
  }

  public SubmitRun setBudgetPolicyId(String budgetPolicyId) {
    this.budgetPolicyId = budgetPolicyId;
    return this;
  }

  public String getBudgetPolicyId() {
    return budgetPolicyId;
  }

  public SubmitRun setEmailNotifications(JobEmailNotifications emailNotifications) {
    this.emailNotifications = emailNotifications;
    return this;
  }

  public JobEmailNotifications getEmailNotifications() {
    return emailNotifications;
  }

  public SubmitRun setEnvironments(Collection<JobEnvironment> environments) {
    this.environments = environments;
    return this;
  }

  public Collection<JobEnvironment> getEnvironments() {
    return environments;
  }

  public SubmitRun setGitSource(GitSource gitSource) {
    this.gitSource = gitSource;
    return this;
  }

  public GitSource getGitSource() {
    return gitSource;
  }

  public SubmitRun setHealth(JobsHealthRules health) {
    this.health = health;
    return this;
  }

  public JobsHealthRules getHealth() {
    return health;
  }

  public SubmitRun setIdempotencyToken(String idempotencyToken) {
    this.idempotencyToken = idempotencyToken;
    return this;
  }

  public String getIdempotencyToken() {
    return idempotencyToken;
  }

  public SubmitRun setNotificationSettings(JobNotificationSettings notificationSettings) {
    this.notificationSettings = notificationSettings;
    return this;
  }

  public JobNotificationSettings getNotificationSettings() {
    return notificationSettings;
  }

  public SubmitRun setQueue(QueueSettings queue) {
    this.queue = queue;
    return this;
  }

  public QueueSettings getQueue() {
    return queue;
  }

  public SubmitRun setRunAs(JobRunAs runAs) {
    this.runAs = runAs;
    return this;
  }

  public JobRunAs getRunAs() {
    return runAs;
  }

  public SubmitRun setRunName(String runName) {
    this.runName = runName;
    return this;
  }

  public String getRunName() {
    return runName;
  }

  public SubmitRun setTasks(Collection<SubmitTask> tasks) {
    this.tasks = tasks;
    return this;
  }

  public Collection<SubmitTask> getTasks() {
    return tasks;
  }

  public SubmitRun setTimeoutSeconds(Long timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

  public Long getTimeoutSeconds() {
    return timeoutSeconds;
  }

  public SubmitRun setWebhookNotifications(WebhookNotifications webhookNotifications) {
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
    SubmitRun that = (SubmitRun) o;
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
    return new ToStringer(SubmitRun.class)
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

  SubmitRunPb toPb() {
    SubmitRunPb pb = new SubmitRunPb();
    pb.setAccessControlList(accessControlList);
    pb.setBudgetPolicyId(budgetPolicyId);
    pb.setEmailNotifications(emailNotifications);
    pb.setEnvironments(environments);
    pb.setGitSource(gitSource);
    pb.setHealth(health);
    pb.setIdempotencyToken(idempotencyToken);
    pb.setNotificationSettings(notificationSettings);
    pb.setQueue(queue);
    pb.setRunAs(runAs);
    pb.setRunName(runName);
    pb.setTasks(tasks);
    pb.setTimeoutSeconds(timeoutSeconds);
    pb.setWebhookNotifications(webhookNotifications);

    return pb;
  }

  static SubmitRun fromPb(SubmitRunPb pb) {
    SubmitRun model = new SubmitRun();
    model.setAccessControlList(pb.getAccessControlList());
    model.setBudgetPolicyId(pb.getBudgetPolicyId());
    model.setEmailNotifications(pb.getEmailNotifications());
    model.setEnvironments(pb.getEnvironments());
    model.setGitSource(pb.getGitSource());
    model.setHealth(pb.getHealth());
    model.setIdempotencyToken(pb.getIdempotencyToken());
    model.setNotificationSettings(pb.getNotificationSettings());
    model.setQueue(pb.getQueue());
    model.setRunAs(pb.getRunAs());
    model.setRunName(pb.getRunName());
    model.setTasks(pb.getTasks());
    model.setTimeoutSeconds(pb.getTimeoutSeconds());
    model.setWebhookNotifications(pb.getWebhookNotifications());

    return model;
  }

  public static class SubmitRunSerializer extends JsonSerializer<SubmitRun> {
    @Override
    public void serialize(SubmitRun value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SubmitRunPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SubmitRunDeserializer extends JsonDeserializer<SubmitRun> {
    @Override
    public SubmitRun deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SubmitRunPb pb = mapper.readValue(p, SubmitRunPb.class);
      return SubmitRun.fromPb(pb);
    }
  }
}
