// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

@Generated
public class ClonePipelineRequest {
  /** If false, deployment will fail if name conflicts with that of another pipeline. */
  @JsonProperty("allow_duplicate_names")
  private Boolean allowDuplicateNames;

  /** Budget policy of this pipeline. */
  @JsonProperty("budget_policy_id")
  private String budgetPolicyId;

  /**
   * A catalog in Unity Catalog to publish data from this pipeline to. If `target` is specified,
   * tables in this pipeline are published to a `target` schema inside `catalog` (for example,
   * `catalog`.`target`.`table`). If `target` is not specified, no data is published to Unity
   * Catalog.
   */
  @JsonProperty("catalog")
  private String catalog;

  /** DLT Release Channel that specifies which version to use. */
  @JsonProperty("channel")
  private String channel;

  /** Cluster settings for this pipeline deployment. */
  @JsonProperty("clusters")
  private Collection<PipelineCluster> clusters;

  /** String-String configuration for this pipeline execution. */
  @JsonProperty("configuration")
  private Map<String, String> configuration;

  /** Whether the pipeline is continuous or triggered. This replaces `trigger`. */
  @JsonProperty("continuous")
  private Boolean continuous;

  /** Deployment type of this pipeline. */
  @JsonProperty("deployment")
  private PipelineDeployment deployment;

  /** Whether the pipeline is in Development mode. Defaults to false. */
  @JsonProperty("development")
  private Boolean development;

  /** Pipeline product edition. */
  @JsonProperty("edition")
  private String edition;

  /** Environment specification for this pipeline used to install dependencies. */
  @JsonProperty("environment")
  private PipelinesEnvironment environment;

  /** Event log configuration for this pipeline */
  @JsonProperty("event_log")
  private EventLogSpec eventLog;

  /**
   * If present, the last-modified time of the pipeline settings before the clone. If the settings
   * were modified after that time, then the request will fail with a conflict.
   */
  @JsonProperty("expected_last_modified")
  private Long expectedLastModified;

  /** Filters on which Pipeline packages to include in the deployed graph. */
  @JsonProperty("filters")
  private Filters filters;

  /** The definition of a gateway pipeline to support change data capture. */
  @JsonProperty("gateway_definition")
  private IngestionGatewayPipelineDefinition gatewayDefinition;

  /** Unique identifier for this pipeline. */
  @JsonProperty("id")
  private String id;

  /**
   * The configuration for a managed ingestion pipeline. These settings cannot be used with the
   * 'libraries', 'schema', 'target', or 'catalog' settings.
   */
  @JsonProperty("ingestion_definition")
  private IngestionPipelineDefinition ingestionDefinition;

  /** Libraries or code needed by this deployment. */
  @JsonProperty("libraries")
  private Collection<PipelineLibrary> libraries;

  /** Friendly identifier for this pipeline. */
  @JsonProperty("name")
  private String name;

  /** List of notification settings for this pipeline. */
  @JsonProperty("notifications")
  private Collection<Notifications> notifications;

  /** Whether Photon is enabled for this pipeline. */
  @JsonProperty("photon")
  private Boolean photon;

  /** Source pipeline to clone from */
  @JsonIgnore private String pipelineId;

  /** Restart window of this pipeline. */
  @JsonProperty("restart_window")
  private RestartWindow restartWindow;

  /**
   * Root path for this pipeline. This is used as the root directory when editing the pipeline in
   * the Databricks user interface and it is added to sys.path when executing Python sources during
   * pipeline execution.
   */
  @JsonProperty("root_path")
  private String rootPath;

  /** The default schema (database) where tables are read from or published to. */
  @JsonProperty("schema")
  private String schema;

  /** Whether serverless compute is enabled for this pipeline. */
  @JsonProperty("serverless")
  private Boolean serverless;

  /** DBFS root directory for storing checkpoints and tables. */
  @JsonProperty("storage")
  private String storage;

  /**
   * A map of tags associated with the pipeline. These are forwarded to the cluster as cluster tags,
   * and are therefore subject to the same limitations. A maximum of 25 tags can be added to the
   * pipeline.
   */
  @JsonProperty("tags")
  private Map<String, String> tags;

  /**
   * Target schema (database) to add tables in this pipeline to. Exactly one of `schema` or `target`
   * must be specified. To publish to Unity Catalog, also specify `catalog`. This legacy field is
   * deprecated for pipeline creation in favor of the `schema` field.
   */
  @JsonProperty("target")
  private String target;

  /** Which pipeline trigger to use. Deprecated: Use `continuous` instead. */
  @JsonProperty("trigger")
  private PipelineTrigger trigger;

  /** Usage policy of this pipeline. */
  @JsonProperty("usage_policy_id")
  private String usagePolicyId;

  public ClonePipelineRequest setAllowDuplicateNames(Boolean allowDuplicateNames) {
    this.allowDuplicateNames = allowDuplicateNames;
    return this;
  }

  public Boolean getAllowDuplicateNames() {
    return allowDuplicateNames;
  }

  public ClonePipelineRequest setBudgetPolicyId(String budgetPolicyId) {
    this.budgetPolicyId = budgetPolicyId;
    return this;
  }

  public String getBudgetPolicyId() {
    return budgetPolicyId;
  }

  public ClonePipelineRequest setCatalog(String catalog) {
    this.catalog = catalog;
    return this;
  }

  public String getCatalog() {
    return catalog;
  }

  public ClonePipelineRequest setChannel(String channel) {
    this.channel = channel;
    return this;
  }

  public String getChannel() {
    return channel;
  }

  public ClonePipelineRequest setClusters(Collection<PipelineCluster> clusters) {
    this.clusters = clusters;
    return this;
  }

  public Collection<PipelineCluster> getClusters() {
    return clusters;
  }

  public ClonePipelineRequest setConfiguration(Map<String, String> configuration) {
    this.configuration = configuration;
    return this;
  }

  public Map<String, String> getConfiguration() {
    return configuration;
  }

  public ClonePipelineRequest setContinuous(Boolean continuous) {
    this.continuous = continuous;
    return this;
  }

  public Boolean getContinuous() {
    return continuous;
  }

  public ClonePipelineRequest setDeployment(PipelineDeployment deployment) {
    this.deployment = deployment;
    return this;
  }

  public PipelineDeployment getDeployment() {
    return deployment;
  }

  public ClonePipelineRequest setDevelopment(Boolean development) {
    this.development = development;
    return this;
  }

  public Boolean getDevelopment() {
    return development;
  }

  public ClonePipelineRequest setEdition(String edition) {
    this.edition = edition;
    return this;
  }

  public String getEdition() {
    return edition;
  }

  public ClonePipelineRequest setEnvironment(PipelinesEnvironment environment) {
    this.environment = environment;
    return this;
  }

  public PipelinesEnvironment getEnvironment() {
    return environment;
  }

  public ClonePipelineRequest setEventLog(EventLogSpec eventLog) {
    this.eventLog = eventLog;
    return this;
  }

  public EventLogSpec getEventLog() {
    return eventLog;
  }

  public ClonePipelineRequest setExpectedLastModified(Long expectedLastModified) {
    this.expectedLastModified = expectedLastModified;
    return this;
  }

  public Long getExpectedLastModified() {
    return expectedLastModified;
  }

  public ClonePipelineRequest setFilters(Filters filters) {
    this.filters = filters;
    return this;
  }

  public Filters getFilters() {
    return filters;
  }

  public ClonePipelineRequest setGatewayDefinition(
      IngestionGatewayPipelineDefinition gatewayDefinition) {
    this.gatewayDefinition = gatewayDefinition;
    return this;
  }

  public IngestionGatewayPipelineDefinition getGatewayDefinition() {
    return gatewayDefinition;
  }

  public ClonePipelineRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public ClonePipelineRequest setIngestionDefinition(
      IngestionPipelineDefinition ingestionDefinition) {
    this.ingestionDefinition = ingestionDefinition;
    return this;
  }

  public IngestionPipelineDefinition getIngestionDefinition() {
    return ingestionDefinition;
  }

  public ClonePipelineRequest setLibraries(Collection<PipelineLibrary> libraries) {
    this.libraries = libraries;
    return this;
  }

  public Collection<PipelineLibrary> getLibraries() {
    return libraries;
  }

  public ClonePipelineRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ClonePipelineRequest setNotifications(Collection<Notifications> notifications) {
    this.notifications = notifications;
    return this;
  }

  public Collection<Notifications> getNotifications() {
    return notifications;
  }

  public ClonePipelineRequest setPhoton(Boolean photon) {
    this.photon = photon;
    return this;
  }

  public Boolean getPhoton() {
    return photon;
  }

  public ClonePipelineRequest setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

  public String getPipelineId() {
    return pipelineId;
  }

  public ClonePipelineRequest setRestartWindow(RestartWindow restartWindow) {
    this.restartWindow = restartWindow;
    return this;
  }

  public RestartWindow getRestartWindow() {
    return restartWindow;
  }

  public ClonePipelineRequest setRootPath(String rootPath) {
    this.rootPath = rootPath;
    return this;
  }

  public String getRootPath() {
    return rootPath;
  }

  public ClonePipelineRequest setSchema(String schema) {
    this.schema = schema;
    return this;
  }

  public String getSchema() {
    return schema;
  }

  public ClonePipelineRequest setServerless(Boolean serverless) {
    this.serverless = serverless;
    return this;
  }

  public Boolean getServerless() {
    return serverless;
  }

  public ClonePipelineRequest setStorage(String storage) {
    this.storage = storage;
    return this;
  }

  public String getStorage() {
    return storage;
  }

  public ClonePipelineRequest setTags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public Map<String, String> getTags() {
    return tags;
  }

  public ClonePipelineRequest setTarget(String target) {
    this.target = target;
    return this;
  }

  public String getTarget() {
    return target;
  }

  public ClonePipelineRequest setTrigger(PipelineTrigger trigger) {
    this.trigger = trigger;
    return this;
  }

  public PipelineTrigger getTrigger() {
    return trigger;
  }

  public ClonePipelineRequest setUsagePolicyId(String usagePolicyId) {
    this.usagePolicyId = usagePolicyId;
    return this;
  }

  public String getUsagePolicyId() {
    return usagePolicyId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClonePipelineRequest that = (ClonePipelineRequest) o;
    return Objects.equals(allowDuplicateNames, that.allowDuplicateNames)
        && Objects.equals(budgetPolicyId, that.budgetPolicyId)
        && Objects.equals(catalog, that.catalog)
        && Objects.equals(channel, that.channel)
        && Objects.equals(clusters, that.clusters)
        && Objects.equals(configuration, that.configuration)
        && Objects.equals(continuous, that.continuous)
        && Objects.equals(deployment, that.deployment)
        && Objects.equals(development, that.development)
        && Objects.equals(edition, that.edition)
        && Objects.equals(environment, that.environment)
        && Objects.equals(eventLog, that.eventLog)
        && Objects.equals(expectedLastModified, that.expectedLastModified)
        && Objects.equals(filters, that.filters)
        && Objects.equals(gatewayDefinition, that.gatewayDefinition)
        && Objects.equals(id, that.id)
        && Objects.equals(ingestionDefinition, that.ingestionDefinition)
        && Objects.equals(libraries, that.libraries)
        && Objects.equals(name, that.name)
        && Objects.equals(notifications, that.notifications)
        && Objects.equals(photon, that.photon)
        && Objects.equals(pipelineId, that.pipelineId)
        && Objects.equals(restartWindow, that.restartWindow)
        && Objects.equals(rootPath, that.rootPath)
        && Objects.equals(schema, that.schema)
        && Objects.equals(serverless, that.serverless)
        && Objects.equals(storage, that.storage)
        && Objects.equals(tags, that.tags)
        && Objects.equals(target, that.target)
        && Objects.equals(trigger, that.trigger)
        && Objects.equals(usagePolicyId, that.usagePolicyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        allowDuplicateNames,
        budgetPolicyId,
        catalog,
        channel,
        clusters,
        configuration,
        continuous,
        deployment,
        development,
        edition,
        environment,
        eventLog,
        expectedLastModified,
        filters,
        gatewayDefinition,
        id,
        ingestionDefinition,
        libraries,
        name,
        notifications,
        photon,
        pipelineId,
        restartWindow,
        rootPath,
        schema,
        serverless,
        storage,
        tags,
        target,
        trigger,
        usagePolicyId);
  }

  @Override
  public String toString() {
    return new ToStringer(ClonePipelineRequest.class)
        .add("allowDuplicateNames", allowDuplicateNames)
        .add("budgetPolicyId", budgetPolicyId)
        .add("catalog", catalog)
        .add("channel", channel)
        .add("clusters", clusters)
        .add("configuration", configuration)
        .add("continuous", continuous)
        .add("deployment", deployment)
        .add("development", development)
        .add("edition", edition)
        .add("environment", environment)
        .add("eventLog", eventLog)
        .add("expectedLastModified", expectedLastModified)
        .add("filters", filters)
        .add("gatewayDefinition", gatewayDefinition)
        .add("id", id)
        .add("ingestionDefinition", ingestionDefinition)
        .add("libraries", libraries)
        .add("name", name)
        .add("notifications", notifications)
        .add("photon", photon)
        .add("pipelineId", pipelineId)
        .add("restartWindow", restartWindow)
        .add("rootPath", rootPath)
        .add("schema", schema)
        .add("serverless", serverless)
        .add("storage", storage)
        .add("tags", tags)
        .add("target", target)
        .add("trigger", trigger)
        .add("usagePolicyId", usagePolicyId)
        .toString();
  }
}
