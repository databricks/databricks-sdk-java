// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

@Generated
public class EditPipeline {
  /**
   * If false, deployment will fail if name has changed and conflicts the name of another pipeline.
   */
  @JsonProperty("allow_duplicate_names")
  private Boolean allowDuplicateNames;

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

  /**
   * If present, the last-modified time of the pipeline settings before the edit. If the settings
   * were modified after that time, then the request will fail with a conflict.
   */
  @JsonProperty("expected_last_modified")
  private Long expectedLastModified;

  /** Filters on which Pipeline packages to include in the deployed graph. */
  @JsonProperty("filters")
  private Filters filters;

  /** The definition of a gateway pipeline to support CDC. */
  @JsonProperty("gateway_definition")
  private IngestionGatewayPipelineDefinition gatewayDefinition;

  /** Unique identifier for this pipeline. */
  @JsonProperty("id")
  private String id;

  /**
   * The configuration for a managed ingestion pipeline. These settings cannot be used with the
   * 'libraries', 'target' or 'catalog' settings.
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

  /** Unique identifier for this pipeline. */
  @JsonProperty("pipeline_id")
  private String pipelineId;

  /** Whether serverless compute is enabled for this pipeline. */
  @JsonProperty("serverless")
  private Boolean serverless;

  /** DBFS root directory for storing checkpoints and tables. */
  @JsonProperty("storage")
  private String storage;

  /**
   * Target schema (database) to add tables in this pipeline to. If not specified, no data is
   * published to the Hive metastore or Unity Catalog. To publish to Unity Catalog, also specify
   * `catalog`.
   */
  @JsonProperty("target")
  private String target;

  /** Which pipeline trigger to use. Deprecated: Use `continuous` instead. */
  @JsonProperty("trigger")
  private PipelineTrigger trigger;

  public EditPipeline setAllowDuplicateNames(Boolean allowDuplicateNames) {
    this.allowDuplicateNames = allowDuplicateNames;
    return this;
  }

  public Boolean getAllowDuplicateNames() {
    return allowDuplicateNames;
  }

  public EditPipeline setCatalog(String catalog) {
    this.catalog = catalog;
    return this;
  }

  public String getCatalog() {
    return catalog;
  }

  public EditPipeline setChannel(String channel) {
    this.channel = channel;
    return this;
  }

  public String getChannel() {
    return channel;
  }

  public EditPipeline setClusters(Collection<PipelineCluster> clusters) {
    this.clusters = clusters;
    return this;
  }

  public Collection<PipelineCluster> getClusters() {
    return clusters;
  }

  public EditPipeline setConfiguration(Map<String, String> configuration) {
    this.configuration = configuration;
    return this;
  }

  public Map<String, String> getConfiguration() {
    return configuration;
  }

  public EditPipeline setContinuous(Boolean continuous) {
    this.continuous = continuous;
    return this;
  }

  public Boolean getContinuous() {
    return continuous;
  }

  public EditPipeline setDeployment(PipelineDeployment deployment) {
    this.deployment = deployment;
    return this;
  }

  public PipelineDeployment getDeployment() {
    return deployment;
  }

  public EditPipeline setDevelopment(Boolean development) {
    this.development = development;
    return this;
  }

  public Boolean getDevelopment() {
    return development;
  }

  public EditPipeline setEdition(String edition) {
    this.edition = edition;
    return this;
  }

  public String getEdition() {
    return edition;
  }

  public EditPipeline setExpectedLastModified(Long expectedLastModified) {
    this.expectedLastModified = expectedLastModified;
    return this;
  }

  public Long getExpectedLastModified() {
    return expectedLastModified;
  }

  public EditPipeline setFilters(Filters filters) {
    this.filters = filters;
    return this;
  }

  public Filters getFilters() {
    return filters;
  }

  public EditPipeline setGatewayDefinition(IngestionGatewayPipelineDefinition gatewayDefinition) {
    this.gatewayDefinition = gatewayDefinition;
    return this;
  }

  public IngestionGatewayPipelineDefinition getGatewayDefinition() {
    return gatewayDefinition;
  }

  public EditPipeline setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public EditPipeline setIngestionDefinition(IngestionPipelineDefinition ingestionDefinition) {
    this.ingestionDefinition = ingestionDefinition;
    return this;
  }

  public IngestionPipelineDefinition getIngestionDefinition() {
    return ingestionDefinition;
  }

  public EditPipeline setLibraries(Collection<PipelineLibrary> libraries) {
    this.libraries = libraries;
    return this;
  }

  public Collection<PipelineLibrary> getLibraries() {
    return libraries;
  }

  public EditPipeline setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public EditPipeline setNotifications(Collection<Notifications> notifications) {
    this.notifications = notifications;
    return this;
  }

  public Collection<Notifications> getNotifications() {
    return notifications;
  }

  public EditPipeline setPhoton(Boolean photon) {
    this.photon = photon;
    return this;
  }

  public Boolean getPhoton() {
    return photon;
  }

  public EditPipeline setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

  public String getPipelineId() {
    return pipelineId;
  }

  public EditPipeline setServerless(Boolean serverless) {
    this.serverless = serverless;
    return this;
  }

  public Boolean getServerless() {
    return serverless;
  }

  public EditPipeline setStorage(String storage) {
    this.storage = storage;
    return this;
  }

  public String getStorage() {
    return storage;
  }

  public EditPipeline setTarget(String target) {
    this.target = target;
    return this;
  }

  public String getTarget() {
    return target;
  }

  public EditPipeline setTrigger(PipelineTrigger trigger) {
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
    EditPipeline that = (EditPipeline) o;
    return Objects.equals(allowDuplicateNames, that.allowDuplicateNames)
        && Objects.equals(catalog, that.catalog)
        && Objects.equals(channel, that.channel)
        && Objects.equals(clusters, that.clusters)
        && Objects.equals(configuration, that.configuration)
        && Objects.equals(continuous, that.continuous)
        && Objects.equals(deployment, that.deployment)
        && Objects.equals(development, that.development)
        && Objects.equals(edition, that.edition)
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
        && Objects.equals(serverless, that.serverless)
        && Objects.equals(storage, that.storage)
        && Objects.equals(target, that.target)
        && Objects.equals(trigger, that.trigger);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        allowDuplicateNames,
        catalog,
        channel,
        clusters,
        configuration,
        continuous,
        deployment,
        development,
        edition,
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
        serverless,
        storage,
        target,
        trigger);
  }

  @Override
  public String toString() {
    return new ToStringer(EditPipeline.class)
        .add("allowDuplicateNames", allowDuplicateNames)
        .add("catalog", catalog)
        .add("channel", channel)
        .add("clusters", clusters)
        .add("configuration", configuration)
        .add("continuous", continuous)
        .add("deployment", deployment)
        .add("development", development)
        .add("edition", edition)
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
        .add("serverless", serverless)
        .add("storage", storage)
        .add("target", target)
        .add("trigger", trigger)
        .toString();
  }
}
