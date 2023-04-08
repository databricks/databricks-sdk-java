// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

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
  private java.util.List<PipelineCluster> clusters;

  /** String-String configuration for this pipeline execution. */
  @JsonProperty("configuration")
  private Map<String, String> configuration;

  /** Whether the pipeline is continuous or triggered. This replaces `trigger`. */
  @JsonProperty("continuous")
  private Boolean continuous;

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

  /** Unique identifier for this pipeline. */
  @JsonProperty("id")
  private String id;

  /** Libraries or code needed by this deployment. */
  @JsonProperty("libraries")
  private java.util.List<PipelineLibrary> libraries;

  /** Friendly identifier for this pipeline. */
  @JsonProperty("name")
  private String name;

  /** Whether Photon is enabled for this pipeline. */
  @JsonProperty("photon")
  private Boolean photon;

  /** Unique identifier for this pipeline. */
  @JsonProperty("pipeline_id")
  private String pipelineId;

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

  public EditPipeline setClusters(java.util.List<PipelineCluster> clusters) {
    this.clusters = clusters;
    return this;
  }

  public java.util.List<PipelineCluster> getClusters() {
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

  public EditPipeline setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public EditPipeline setLibraries(java.util.List<PipelineLibrary> libraries) {
    this.libraries = libraries;
    return this;
  }

  public java.util.List<PipelineLibrary> getLibraries() {
    return libraries;
  }

  public EditPipeline setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
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
}
