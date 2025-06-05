// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

@Generated
class PipelineSpecPb {
  @JsonProperty("budget_policy_id")
  private String budgetPolicyId;

  @JsonProperty("catalog")
  private String catalog;

  @JsonProperty("channel")
  private String channel;

  @JsonProperty("clusters")
  private Collection<PipelineCluster> clusters;

  @JsonProperty("configuration")
  private Map<String, String> configuration;

  @JsonProperty("continuous")
  private Boolean continuous;

  @JsonProperty("deployment")
  private PipelineDeployment deployment;

  @JsonProperty("development")
  private Boolean development;

  @JsonProperty("edition")
  private String edition;

  @JsonProperty("event_log")
  private EventLogSpec eventLog;

  @JsonProperty("filters")
  private Filters filters;

  @JsonProperty("gateway_definition")
  private IngestionGatewayPipelineDefinition gatewayDefinition;

  @JsonProperty("id")
  private String id;

  @JsonProperty("ingestion_definition")
  private IngestionPipelineDefinition ingestionDefinition;

  @JsonProperty("libraries")
  private Collection<PipelineLibrary> libraries;

  @JsonProperty("name")
  private String name;

  @JsonProperty("notifications")
  private Collection<Notifications> notifications;

  @JsonProperty("photon")
  private Boolean photon;

  @JsonProperty("restart_window")
  private RestartWindow restartWindow;

  @JsonProperty("root_path")
  private String rootPath;

  @JsonProperty("schema")
  private String schema;

  @JsonProperty("serverless")
  private Boolean serverless;

  @JsonProperty("storage")
  private String storage;

  @JsonProperty("tags")
  private Map<String, String> tags;

  @JsonProperty("target")
  private String target;

  @JsonProperty("trigger")
  private PipelineTrigger trigger;

  public PipelineSpecPb setBudgetPolicyId(String budgetPolicyId) {
    this.budgetPolicyId = budgetPolicyId;
    return this;
  }

  public String getBudgetPolicyId() {
    return budgetPolicyId;
  }

  public PipelineSpecPb setCatalog(String catalog) {
    this.catalog = catalog;
    return this;
  }

  public String getCatalog() {
    return catalog;
  }

  public PipelineSpecPb setChannel(String channel) {
    this.channel = channel;
    return this;
  }

  public String getChannel() {
    return channel;
  }

  public PipelineSpecPb setClusters(Collection<PipelineCluster> clusters) {
    this.clusters = clusters;
    return this;
  }

  public Collection<PipelineCluster> getClusters() {
    return clusters;
  }

  public PipelineSpecPb setConfiguration(Map<String, String> configuration) {
    this.configuration = configuration;
    return this;
  }

  public Map<String, String> getConfiguration() {
    return configuration;
  }

  public PipelineSpecPb setContinuous(Boolean continuous) {
    this.continuous = continuous;
    return this;
  }

  public Boolean getContinuous() {
    return continuous;
  }

  public PipelineSpecPb setDeployment(PipelineDeployment deployment) {
    this.deployment = deployment;
    return this;
  }

  public PipelineDeployment getDeployment() {
    return deployment;
  }

  public PipelineSpecPb setDevelopment(Boolean development) {
    this.development = development;
    return this;
  }

  public Boolean getDevelopment() {
    return development;
  }

  public PipelineSpecPb setEdition(String edition) {
    this.edition = edition;
    return this;
  }

  public String getEdition() {
    return edition;
  }

  public PipelineSpecPb setEventLog(EventLogSpec eventLog) {
    this.eventLog = eventLog;
    return this;
  }

  public EventLogSpec getEventLog() {
    return eventLog;
  }

  public PipelineSpecPb setFilters(Filters filters) {
    this.filters = filters;
    return this;
  }

  public Filters getFilters() {
    return filters;
  }

  public PipelineSpecPb setGatewayDefinition(IngestionGatewayPipelineDefinition gatewayDefinition) {
    this.gatewayDefinition = gatewayDefinition;
    return this;
  }

  public IngestionGatewayPipelineDefinition getGatewayDefinition() {
    return gatewayDefinition;
  }

  public PipelineSpecPb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public PipelineSpecPb setIngestionDefinition(IngestionPipelineDefinition ingestionDefinition) {
    this.ingestionDefinition = ingestionDefinition;
    return this;
  }

  public IngestionPipelineDefinition getIngestionDefinition() {
    return ingestionDefinition;
  }

  public PipelineSpecPb setLibraries(Collection<PipelineLibrary> libraries) {
    this.libraries = libraries;
    return this;
  }

  public Collection<PipelineLibrary> getLibraries() {
    return libraries;
  }

  public PipelineSpecPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public PipelineSpecPb setNotifications(Collection<Notifications> notifications) {
    this.notifications = notifications;
    return this;
  }

  public Collection<Notifications> getNotifications() {
    return notifications;
  }

  public PipelineSpecPb setPhoton(Boolean photon) {
    this.photon = photon;
    return this;
  }

  public Boolean getPhoton() {
    return photon;
  }

  public PipelineSpecPb setRestartWindow(RestartWindow restartWindow) {
    this.restartWindow = restartWindow;
    return this;
  }

  public RestartWindow getRestartWindow() {
    return restartWindow;
  }

  public PipelineSpecPb setRootPath(String rootPath) {
    this.rootPath = rootPath;
    return this;
  }

  public String getRootPath() {
    return rootPath;
  }

  public PipelineSpecPb setSchema(String schema) {
    this.schema = schema;
    return this;
  }

  public String getSchema() {
    return schema;
  }

  public PipelineSpecPb setServerless(Boolean serverless) {
    this.serverless = serverless;
    return this;
  }

  public Boolean getServerless() {
    return serverless;
  }

  public PipelineSpecPb setStorage(String storage) {
    this.storage = storage;
    return this;
  }

  public String getStorage() {
    return storage;
  }

  public PipelineSpecPb setTags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public Map<String, String> getTags() {
    return tags;
  }

  public PipelineSpecPb setTarget(String target) {
    this.target = target;
    return this;
  }

  public String getTarget() {
    return target;
  }

  public PipelineSpecPb setTrigger(PipelineTrigger trigger) {
    this.trigger = trigger;
    return this;
  }

  public PipelineTrigger getTrigger() {
    return trigger;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PipelineSpecPb that = (PipelineSpecPb) o;
    return Objects.equals(budgetPolicyId, that.budgetPolicyId)
        && Objects.equals(catalog, that.catalog)
        && Objects.equals(channel, that.channel)
        && Objects.equals(clusters, that.clusters)
        && Objects.equals(configuration, that.configuration)
        && Objects.equals(continuous, that.continuous)
        && Objects.equals(deployment, that.deployment)
        && Objects.equals(development, that.development)
        && Objects.equals(edition, that.edition)
        && Objects.equals(eventLog, that.eventLog)
        && Objects.equals(filters, that.filters)
        && Objects.equals(gatewayDefinition, that.gatewayDefinition)
        && Objects.equals(id, that.id)
        && Objects.equals(ingestionDefinition, that.ingestionDefinition)
        && Objects.equals(libraries, that.libraries)
        && Objects.equals(name, that.name)
        && Objects.equals(notifications, that.notifications)
        && Objects.equals(photon, that.photon)
        && Objects.equals(restartWindow, that.restartWindow)
        && Objects.equals(rootPath, that.rootPath)
        && Objects.equals(schema, that.schema)
        && Objects.equals(serverless, that.serverless)
        && Objects.equals(storage, that.storage)
        && Objects.equals(tags, that.tags)
        && Objects.equals(target, that.target)
        && Objects.equals(trigger, that.trigger);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        budgetPolicyId,
        catalog,
        channel,
        clusters,
        configuration,
        continuous,
        deployment,
        development,
        edition,
        eventLog,
        filters,
        gatewayDefinition,
        id,
        ingestionDefinition,
        libraries,
        name,
        notifications,
        photon,
        restartWindow,
        rootPath,
        schema,
        serverless,
        storage,
        tags,
        target,
        trigger);
  }

  @Override
  public String toString() {
    return new ToStringer(PipelineSpecPb.class)
        .add("budgetPolicyId", budgetPolicyId)
        .add("catalog", catalog)
        .add("channel", channel)
        .add("clusters", clusters)
        .add("configuration", configuration)
        .add("continuous", continuous)
        .add("deployment", deployment)
        .add("development", development)
        .add("edition", edition)
        .add("eventLog", eventLog)
        .add("filters", filters)
        .add("gatewayDefinition", gatewayDefinition)
        .add("id", id)
        .add("ingestionDefinition", ingestionDefinition)
        .add("libraries", libraries)
        .add("name", name)
        .add("notifications", notifications)
        .add("photon", photon)
        .add("restartWindow", restartWindow)
        .add("rootPath", rootPath)
        .add("schema", schema)
        .add("serverless", serverless)
        .add("storage", storage)
        .add("tags", tags)
        .add("target", target)
        .add("trigger", trigger)
        .toString();
  }
}
