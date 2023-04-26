// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

/**
 * <p>PipelineSpec class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class PipelineSpec {
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

  /** Whether the pipeline is in Development mode. Defaults to false. */
  @JsonProperty("development")
  private Boolean development;

  /** Pipeline product edition. */
  @JsonProperty("edition")
  private String edition;

  /** Filters on which Pipeline packages to include in the deployed graph. */
  @JsonProperty("filters")
  private Filters filters;

  /** Unique identifier for this pipeline. */
  @JsonProperty("id")
  private String id;

  /** Libraries or code needed by this deployment. */
  @JsonProperty("libraries")
  private Collection<PipelineLibrary> libraries;

  /** Friendly identifier for this pipeline. */
  @JsonProperty("name")
  private String name;

  /** Whether Photon is enabled for this pipeline. */
  @JsonProperty("photon")
  private Boolean photon;

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

  /**
   * <p>Setter for the field <code>catalog</code>.</p>
   *
   * @param catalog a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.PipelineSpec} object
   */
  public PipelineSpec setCatalog(String catalog) {
    this.catalog = catalog;
    return this;
  }

  /**
   * <p>Getter for the field <code>catalog</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCatalog() {
    return catalog;
  }

  /**
   * <p>Setter for the field <code>channel</code>.</p>
   *
   * @param channel a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.PipelineSpec} object
   */
  public PipelineSpec setChannel(String channel) {
    this.channel = channel;
    return this;
  }

  /**
   * <p>Getter for the field <code>channel</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getChannel() {
    return channel;
  }

  /**
   * <p>Setter for the field <code>clusters</code>.</p>
   *
   * @param clusters a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.pipelines.PipelineSpec} object
   */
  public PipelineSpec setClusters(Collection<PipelineCluster> clusters) {
    this.clusters = clusters;
    return this;
  }

  /**
   * <p>Getter for the field <code>clusters</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<PipelineCluster> getClusters() {
    return clusters;
  }

  /**
   * <p>Setter for the field <code>configuration</code>.</p>
   *
   * @param configuration a {@link java.util.Map} object
   * @return a {@link com.databricks.sdk.service.pipelines.PipelineSpec} object
   */
  public PipelineSpec setConfiguration(Map<String, String> configuration) {
    this.configuration = configuration;
    return this;
  }

  /**
   * <p>Getter for the field <code>configuration</code>.</p>
   *
   * @return a {@link java.util.Map} object
   */
  public Map<String, String> getConfiguration() {
    return configuration;
  }

  /**
   * <p>Setter for the field <code>continuous</code>.</p>
   *
   * @param continuous a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.pipelines.PipelineSpec} object
   */
  public PipelineSpec setContinuous(Boolean continuous) {
    this.continuous = continuous;
    return this;
  }

  /**
   * <p>Getter for the field <code>continuous</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getContinuous() {
    return continuous;
  }

  /**
   * <p>Setter for the field <code>development</code>.</p>
   *
   * @param development a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.pipelines.PipelineSpec} object
   */
  public PipelineSpec setDevelopment(Boolean development) {
    this.development = development;
    return this;
  }

  /**
   * <p>Getter for the field <code>development</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getDevelopment() {
    return development;
  }

  /**
   * <p>Setter for the field <code>edition</code>.</p>
   *
   * @param edition a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.PipelineSpec} object
   */
  public PipelineSpec setEdition(String edition) {
    this.edition = edition;
    return this;
  }

  /**
   * <p>Getter for the field <code>edition</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getEdition() {
    return edition;
  }

  /**
   * <p>Setter for the field <code>filters</code>.</p>
   *
   * @param filters a {@link com.databricks.sdk.service.pipelines.Filters} object
   * @return a {@link com.databricks.sdk.service.pipelines.PipelineSpec} object
   */
  public PipelineSpec setFilters(Filters filters) {
    this.filters = filters;
    return this;
  }

  /**
   * <p>Getter for the field <code>filters</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.pipelines.Filters} object
   */
  public Filters getFilters() {
    return filters;
  }

  /**
   * <p>Setter for the field <code>id</code>.</p>
   *
   * @param id a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.PipelineSpec} object
   */
  public PipelineSpec setId(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>Getter for the field <code>id</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getId() {
    return id;
  }

  /**
   * <p>Setter for the field <code>libraries</code>.</p>
   *
   * @param libraries a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.pipelines.PipelineSpec} object
   */
  public PipelineSpec setLibraries(Collection<PipelineLibrary> libraries) {
    this.libraries = libraries;
    return this;
  }

  /**
   * <p>Getter for the field <code>libraries</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<PipelineLibrary> getLibraries() {
    return libraries;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.PipelineSpec} object
   */
  public PipelineSpec setName(String name) {
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
   * <p>Setter for the field <code>photon</code>.</p>
   *
   * @param photon a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.pipelines.PipelineSpec} object
   */
  public PipelineSpec setPhoton(Boolean photon) {
    this.photon = photon;
    return this;
  }

  /**
   * <p>Getter for the field <code>photon</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getPhoton() {
    return photon;
  }

  /**
   * <p>Setter for the field <code>storage</code>.</p>
   *
   * @param storage a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.PipelineSpec} object
   */
  public PipelineSpec setStorage(String storage) {
    this.storage = storage;
    return this;
  }

  /**
   * <p>Getter for the field <code>storage</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getStorage() {
    return storage;
  }

  /**
   * <p>Setter for the field <code>target</code>.</p>
   *
   * @param target a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.PipelineSpec} object
   */
  public PipelineSpec setTarget(String target) {
    this.target = target;
    return this;
  }

  /**
   * <p>Getter for the field <code>target</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getTarget() {
    return target;
  }

  /**
   * <p>Setter for the field <code>trigger</code>.</p>
   *
   * @param trigger a {@link com.databricks.sdk.service.pipelines.PipelineTrigger} object
   * @return a {@link com.databricks.sdk.service.pipelines.PipelineSpec} object
   */
  public PipelineSpec setTrigger(PipelineTrigger trigger) {
    this.trigger = trigger;
    return this;
  }

  /**
   * <p>Getter for the field <code>trigger</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.pipelines.PipelineTrigger} object
   */
  public PipelineTrigger getTrigger() {
    return trigger;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PipelineSpec that = (PipelineSpec) o;
    return Objects.equals(catalog, that.catalog)
        && Objects.equals(channel, that.channel)
        && Objects.equals(clusters, that.clusters)
        && Objects.equals(configuration, that.configuration)
        && Objects.equals(continuous, that.continuous)
        && Objects.equals(development, that.development)
        && Objects.equals(edition, that.edition)
        && Objects.equals(filters, that.filters)
        && Objects.equals(id, that.id)
        && Objects.equals(libraries, that.libraries)
        && Objects.equals(name, that.name)
        && Objects.equals(photon, that.photon)
        && Objects.equals(storage, that.storage)
        && Objects.equals(target, that.target)
        && Objects.equals(trigger, that.trigger);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        catalog,
        channel,
        clusters,
        configuration,
        continuous,
        development,
        edition,
        filters,
        id,
        libraries,
        name,
        photon,
        storage,
        target,
        trigger);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(PipelineSpec.class)
        .add("catalog", catalog)
        .add("channel", channel)
        .add("clusters", clusters)
        .add("configuration", configuration)
        .add("continuous", continuous)
        .add("development", development)
        .add("edition", edition)
        .add("filters", filters)
        .add("id", id)
        .add("libraries", libraries)
        .add("name", name)
        .add("photon", photon)
        .add("storage", storage)
        .add("target", target)
        .add("trigger", trigger)
        .toString();
  }
}
