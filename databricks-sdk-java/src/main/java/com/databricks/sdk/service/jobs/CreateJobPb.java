// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

@Generated
class CreateJobPb {
  @JsonProperty("access_control_list")
  private Collection<JobAccessControlRequest> accessControlList;

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

  @JsonProperty("test_marshall_message")
  private TestMarshallMessage testMarshallMessage;

  @JsonProperty("timeout_seconds")
  private Long timeoutSeconds;

  @JsonProperty("trigger")
  private TriggerSettings trigger;

  @JsonProperty("webhook_notifications")
  private WebhookNotifications webhookNotifications;

  @JsonProperty("well_known")
  private AllWellKnown wellKnown;

  public CreateJobPb setAccessControlList(Collection<JobAccessControlRequest> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<JobAccessControlRequest> getAccessControlList() {
    return accessControlList;
  }

  public CreateJobPb setBudgetPolicyId(String budgetPolicyId) {
    this.budgetPolicyId = budgetPolicyId;
    return this;
  }

  public String getBudgetPolicyId() {
    return budgetPolicyId;
  }

  public CreateJobPb setContinuous(Continuous continuous) {
    this.continuous = continuous;
    return this;
  }

  public Continuous getContinuous() {
    return continuous;
  }

  public CreateJobPb setDeployment(JobDeployment deployment) {
    this.deployment = deployment;
    return this;
  }

  public JobDeployment getDeployment() {
    return deployment;
  }

  public CreateJobPb setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public CreateJobPb setEditMode(JobEditMode editMode) {
    this.editMode = editMode;
    return this;
  }

  public JobEditMode getEditMode() {
    return editMode;
  }

  public CreateJobPb setEmailNotifications(JobEmailNotifications emailNotifications) {
    this.emailNotifications = emailNotifications;
    return this;
  }

  public JobEmailNotifications getEmailNotifications() {
    return emailNotifications;
  }

  public CreateJobPb setEnvironments(Collection<JobEnvironment> environments) {
    this.environments = environments;
    return this;
  }

  public Collection<JobEnvironment> getEnvironments() {
    return environments;
  }

  public CreateJobPb setFormat(Format format) {
    this.format = format;
    return this;
  }

  public Format getFormat() {
    return format;
  }

  public CreateJobPb setGitSource(GitSource gitSource) {
    this.gitSource = gitSource;
    return this;
  }

  public GitSource getGitSource() {
    return gitSource;
  }

  public CreateJobPb setHealth(JobsHealthRules health) {
    this.health = health;
    return this;
  }

  public JobsHealthRules getHealth() {
    return health;
  }

  public CreateJobPb setJobClusters(Collection<JobCluster> jobClusters) {
    this.jobClusters = jobClusters;
    return this;
  }

  public Collection<JobCluster> getJobClusters() {
    return jobClusters;
  }

  public CreateJobPb setMaxConcurrentRuns(Long maxConcurrentRuns) {
    this.maxConcurrentRuns = maxConcurrentRuns;
    return this;
  }

  public Long getMaxConcurrentRuns() {
    return maxConcurrentRuns;
  }

  public CreateJobPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateJobPb setNotificationSettings(JobNotificationSettings notificationSettings) {
    this.notificationSettings = notificationSettings;
    return this;
  }

  public JobNotificationSettings getNotificationSettings() {
    return notificationSettings;
  }

  public CreateJobPb setParameters(Collection<JobParameterDefinition> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Collection<JobParameterDefinition> getParameters() {
    return parameters;
  }

  public CreateJobPb setPerformanceTarget(PerformanceTarget performanceTarget) {
    this.performanceTarget = performanceTarget;
    return this;
  }

  public PerformanceTarget getPerformanceTarget() {
    return performanceTarget;
  }

  public CreateJobPb setQueue(QueueSettings queue) {
    this.queue = queue;
    return this;
  }

  public QueueSettings getQueue() {
    return queue;
  }

  public CreateJobPb setRunAs(JobRunAs runAs) {
    this.runAs = runAs;
    return this;
  }

  public JobRunAs getRunAs() {
    return runAs;
  }

  public CreateJobPb setSchedule(CronSchedule schedule) {
    this.schedule = schedule;
    return this;
  }

  public CronSchedule getSchedule() {
    return schedule;
  }

  public CreateJobPb setTags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public Map<String, String> getTags() {
    return tags;
  }

  public CreateJobPb setTasks(Collection<Task> tasks) {
    this.tasks = tasks;
    return this;
  }

  public Collection<Task> getTasks() {
    return tasks;
  }

  public CreateJobPb setTestMarshallMessage(TestMarshallMessage testMarshallMessage) {
    this.testMarshallMessage = testMarshallMessage;
    return this;
  }

  public TestMarshallMessage getTestMarshallMessage() {
    return testMarshallMessage;
  }

  public CreateJobPb setTimeoutSeconds(Long timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

  public Long getTimeoutSeconds() {
    return timeoutSeconds;
  }

  public CreateJobPb setTrigger(TriggerSettings trigger) {
    this.trigger = trigger;
    return this;
  }

  public TriggerSettings getTrigger() {
    return trigger;
  }

  public CreateJobPb setWebhookNotifications(WebhookNotifications webhookNotifications) {
    this.webhookNotifications = webhookNotifications;
    return this;
  }

  public WebhookNotifications getWebhookNotifications() {
    return webhookNotifications;
  }

  public CreateJobPb setWellKnown(AllWellKnown wellKnown) {
    this.wellKnown = wellKnown;
    return this;
  }

  public AllWellKnown getWellKnown() {
    return wellKnown;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateJobPb that = (CreateJobPb) o;
    return Objects.equals(accessControlList, that.accessControlList)
        && Objects.equals(budgetPolicyId, that.budgetPolicyId)
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
        && Objects.equals(testMarshallMessage, that.testMarshallMessage)
        && Objects.equals(timeoutSeconds, that.timeoutSeconds)
        && Objects.equals(trigger, that.trigger)
        && Objects.equals(webhookNotifications, that.webhookNotifications)
        && Objects.equals(wellKnown, that.wellKnown);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accessControlList,
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
        testMarshallMessage,
        timeoutSeconds,
        trigger,
        webhookNotifications,
        wellKnown);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateJobPb.class)
        .add("accessControlList", accessControlList)
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
        .add("testMarshallMessage", testMarshallMessage)
        .add("timeoutSeconds", timeoutSeconds)
        .add("trigger", trigger)
        .add("webhookNotifications", webhookNotifications)
        .add("wellKnown", wellKnown)
        .toString();
  }
}
