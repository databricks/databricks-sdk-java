// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

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
import java.util.Map;
import java.util.Objects;

@Generated
@JsonSerialize(using = EditPipeline.EditPipelineSerializer.class)
@JsonDeserialize(using = EditPipeline.EditPipelineDeserializer.class)
public class EditPipeline {
  /**
   * If false, deployment will fail if name has changed and conflicts the name of another pipeline.
   */
  private Boolean allowDuplicateNames;

  /** Budget policy of this pipeline. */
  private String budgetPolicyId;

  /**
   * A catalog in Unity Catalog to publish data from this pipeline to. If `target` is specified,
   * tables in this pipeline are published to a `target` schema inside `catalog` (for example,
   * `catalog`.`target`.`table`). If `target` is not specified, no data is published to Unity
   * Catalog.
   */
  private String catalog;

  /** DLT Release Channel that specifies which version to use. */
  private String channel;

  /** Cluster settings for this pipeline deployment. */
  private Collection<PipelineCluster> clusters;

  /** String-String configuration for this pipeline execution. */
  private Map<String, String> configuration;

  /** Whether the pipeline is continuous or triggered. This replaces `trigger`. */
  private Boolean continuous;

  /** Deployment type of this pipeline. */
  private PipelineDeployment deployment;

  /** Whether the pipeline is in Development mode. Defaults to false. */
  private Boolean development;

  /** Pipeline product edition. */
  private String edition;

  /** Event log configuration for this pipeline */
  private EventLogSpec eventLog;

  /**
   * If present, the last-modified time of the pipeline settings before the edit. If the settings
   * were modified after that time, then the request will fail with a conflict.
   */
  private Long expectedLastModified;

  /** Filters on which Pipeline packages to include in the deployed graph. */
  private Filters filters;

  /** The definition of a gateway pipeline to support change data capture. */
  private IngestionGatewayPipelineDefinition gatewayDefinition;

  /** Unique identifier for this pipeline. */
  private String id;

  /**
   * The configuration for a managed ingestion pipeline. These settings cannot be used with the
   * 'libraries', 'schema', 'target', or 'catalog' settings.
   */
  private IngestionPipelineDefinition ingestionDefinition;

  /** Libraries or code needed by this deployment. */
  private Collection<PipelineLibrary> libraries;

  /** Friendly identifier for this pipeline. */
  private String name;

  /** List of notification settings for this pipeline. */
  private Collection<Notifications> notifications;

  /** Whether Photon is enabled for this pipeline. */
  private Boolean photon;

  /** Unique identifier for this pipeline. */
  private String pipelineId;

  /** Restart window of this pipeline. */
  private RestartWindow restartWindow;

  /**
   * Root path for this pipeline. This is used as the root directory when editing the pipeline in
   * the Databricks user interface and it is added to sys.path when executing Python sources during
   * pipeline execution.
   */
  private String rootPath;

  /**
   * Write-only setting, available only in Create/Update calls. Specifies the user or service
   * principal that the pipeline runs as. If not specified, the pipeline runs as the user who
   * created the pipeline.
   *
   * <p>Only `user_name` or `service_principal_name` can be specified. If both are specified, an
   * error is thrown.
   */
  private RunAs runAs;

  /** The default schema (database) where tables are read from or published to. */
  private String schema;

  /** Whether serverless compute is enabled for this pipeline. */
  private Boolean serverless;

  /** DBFS root directory for storing checkpoints and tables. */
  private String storage;

  /**
   * A map of tags associated with the pipeline. These are forwarded to the cluster as cluster tags,
   * and are therefore subject to the same limitations. A maximum of 25 tags can be added to the
   * pipeline.
   */
  private Map<String, String> tags;

  /**
   * Target schema (database) to add tables in this pipeline to. Exactly one of `schema` or `target`
   * must be specified. To publish to Unity Catalog, also specify `catalog`. This legacy field is
   * deprecated for pipeline creation in favor of the `schema` field.
   */
  private String target;

  /** Which pipeline trigger to use. Deprecated: Use `continuous` instead. */
  private PipelineTrigger trigger;

  public EditPipeline setAllowDuplicateNames(Boolean allowDuplicateNames) {
    this.allowDuplicateNames = allowDuplicateNames;
    return this;
  }

  public Boolean getAllowDuplicateNames() {
    return allowDuplicateNames;
  }

  public EditPipeline setBudgetPolicyId(String budgetPolicyId) {
    this.budgetPolicyId = budgetPolicyId;
    return this;
  }

  public String getBudgetPolicyId() {
    return budgetPolicyId;
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

  public EditPipeline setEventLog(EventLogSpec eventLog) {
    this.eventLog = eventLog;
    return this;
  }

  public EventLogSpec getEventLog() {
    return eventLog;
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

  public EditPipeline setRestartWindow(RestartWindow restartWindow) {
    this.restartWindow = restartWindow;
    return this;
  }

  public RestartWindow getRestartWindow() {
    return restartWindow;
  }

  public EditPipeline setRootPath(String rootPath) {
    this.rootPath = rootPath;
    return this;
  }

  public String getRootPath() {
    return rootPath;
  }

  public EditPipeline setRunAs(RunAs runAs) {
    this.runAs = runAs;
    return this;
  }

  public RunAs getRunAs() {
    return runAs;
  }

  public EditPipeline setSchema(String schema) {
    this.schema = schema;
    return this;
  }

  public String getSchema() {
    return schema;
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

  public EditPipeline setTags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public Map<String, String> getTags() {
    return tags;
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
        && Objects.equals(budgetPolicyId, that.budgetPolicyId)
        && Objects.equals(catalog, that.catalog)
        && Objects.equals(channel, that.channel)
        && Objects.equals(clusters, that.clusters)
        && Objects.equals(configuration, that.configuration)
        && Objects.equals(continuous, that.continuous)
        && Objects.equals(deployment, that.deployment)
        && Objects.equals(development, that.development)
        && Objects.equals(edition, that.edition)
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
        && Objects.equals(runAs, that.runAs)
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
        runAs,
        schema,
        serverless,
        storage,
        tags,
        target,
        trigger);
  }

  @Override
  public String toString() {
    return new ToStringer(EditPipeline.class)
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
        .add("runAs", runAs)
        .add("schema", schema)
        .add("serverless", serverless)
        .add("storage", storage)
        .add("tags", tags)
        .add("target", target)
        .add("trigger", trigger)
        .toString();
  }

  EditPipelinePb toPb() {
    EditPipelinePb pb = new EditPipelinePb();
    pb.setAllowDuplicateNames(allowDuplicateNames);
    pb.setBudgetPolicyId(budgetPolicyId);
    pb.setCatalog(catalog);
    pb.setChannel(channel);
    pb.setClusters(clusters);
    pb.setConfiguration(configuration);
    pb.setContinuous(continuous);
    pb.setDeployment(deployment);
    pb.setDevelopment(development);
    pb.setEdition(edition);
    pb.setEventLog(eventLog);
    pb.setExpectedLastModified(expectedLastModified);
    pb.setFilters(filters);
    pb.setGatewayDefinition(gatewayDefinition);
    pb.setId(id);
    pb.setIngestionDefinition(ingestionDefinition);
    pb.setLibraries(libraries);
    pb.setName(name);
    pb.setNotifications(notifications);
    pb.setPhoton(photon);
    pb.setPipelineId(pipelineId);
    pb.setRestartWindow(restartWindow);
    pb.setRootPath(rootPath);
    pb.setRunAs(runAs);
    pb.setSchema(schema);
    pb.setServerless(serverless);
    pb.setStorage(storage);
    pb.setTags(tags);
    pb.setTarget(target);
    pb.setTrigger(trigger);

    return pb;
  }

  static EditPipeline fromPb(EditPipelinePb pb) {
    EditPipeline model = new EditPipeline();
    model.setAllowDuplicateNames(pb.getAllowDuplicateNames());
    model.setBudgetPolicyId(pb.getBudgetPolicyId());
    model.setCatalog(pb.getCatalog());
    model.setChannel(pb.getChannel());
    model.setClusters(pb.getClusters());
    model.setConfiguration(pb.getConfiguration());
    model.setContinuous(pb.getContinuous());
    model.setDeployment(pb.getDeployment());
    model.setDevelopment(pb.getDevelopment());
    model.setEdition(pb.getEdition());
    model.setEventLog(pb.getEventLog());
    model.setExpectedLastModified(pb.getExpectedLastModified());
    model.setFilters(pb.getFilters());
    model.setGatewayDefinition(pb.getGatewayDefinition());
    model.setId(pb.getId());
    model.setIngestionDefinition(pb.getIngestionDefinition());
    model.setLibraries(pb.getLibraries());
    model.setName(pb.getName());
    model.setNotifications(pb.getNotifications());
    model.setPhoton(pb.getPhoton());
    model.setPipelineId(pb.getPipelineId());
    model.setRestartWindow(pb.getRestartWindow());
    model.setRootPath(pb.getRootPath());
    model.setRunAs(pb.getRunAs());
    model.setSchema(pb.getSchema());
    model.setServerless(pb.getServerless());
    model.setStorage(pb.getStorage());
    model.setTags(pb.getTags());
    model.setTarget(pb.getTarget());
    model.setTrigger(pb.getTrigger());

    return model;
  }

  public static class EditPipelineSerializer extends JsonSerializer<EditPipeline> {
    @Override
    public void serialize(EditPipeline value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      EditPipelinePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EditPipelineDeserializer extends JsonDeserializer<EditPipeline> {
    @Override
    public EditPipeline deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EditPipelinePb pb = mapper.readValue(p, EditPipelinePb.class);
      return EditPipeline.fromPb(pb);
    }
  }
}
