// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

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
@JsonSerialize(using = ModelVersionDatabricks.ModelVersionDatabricksSerializer.class)
@JsonDeserialize(using = ModelVersionDatabricks.ModelVersionDatabricksDeserializer.class)
public class ModelVersionDatabricks {
  /** Creation time of the object, as a Unix timestamp in milliseconds. */
  private Long creationTimestamp;

  /**
   * Stage of the model version. Valid values are:
   *
   * <p>* `None`: The initial stage of a model version.
   *
   * <p>* `Staging`: Staging or pre-production stage.
   *
   * <p>* `Production`: Production stage.
   *
   * <p>* `Archived`: Archived stage.
   */
  private Stage currentStage;

  /** User-specified description for the object. */
  private String description;

  /** Time of the object at last update, as a Unix timestamp in milliseconds. */
  private Long lastUpdatedTimestamp;

  /** Name of the model. */
  private String name;

  /**
   * Permission level of the requesting user on the object. For what is allowed at each level, see
   * [MLflow Model permissions](..).
   */
  private PermissionLevel permissionLevel;

  /** Unique identifier for the MLflow tracking run associated with the source model artifacts. */
  private String runId;

  /**
   * URL of the run associated with the model artifacts. This field is set at model version creation
   * time only for model versions whose source run is from a tracking server that is different from
   * the registry server.
   */
  private String runLink;

  /**
   * URI that indicates the location of the source model artifacts. This is used when creating the
   * model version.
   */
  private String source;

  /**
   * The status of the model version. Valid values are: * `PENDING_REGISTRATION`: Request to
   * register a new model version is pending as server performs background tasks.
   *
   * <p>* `FAILED_REGISTRATION`: Request to register a new model version has failed.
   *
   * <p>* `READY`: Model version is ready for use.
   */
  private Status status;

  /** Details on the current status, for example why registration failed. */
  private String statusMessage;

  /** Array of tags that are associated with the model version. */
  private Collection<ModelVersionTag> tags;

  /** The username of the user that created the object. */
  private String userId;

  /** Version of the model. */
  private String version;

  public ModelVersionDatabricks setCreationTimestamp(Long creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  public Long getCreationTimestamp() {
    return creationTimestamp;
  }

  public ModelVersionDatabricks setCurrentStage(Stage currentStage) {
    this.currentStage = currentStage;
    return this;
  }

  public Stage getCurrentStage() {
    return currentStage;
  }

  public ModelVersionDatabricks setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public ModelVersionDatabricks setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  public Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  public ModelVersionDatabricks setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ModelVersionDatabricks setPermissionLevel(PermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public PermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  public ModelVersionDatabricks setRunId(String runId) {
    this.runId = runId;
    return this;
  }

  public String getRunId() {
    return runId;
  }

  public ModelVersionDatabricks setRunLink(String runLink) {
    this.runLink = runLink;
    return this;
  }

  public String getRunLink() {
    return runLink;
  }

  public ModelVersionDatabricks setSource(String source) {
    this.source = source;
    return this;
  }

  public String getSource() {
    return source;
  }

  public ModelVersionDatabricks setStatus(Status status) {
    this.status = status;
    return this;
  }

  public Status getStatus() {
    return status;
  }

  public ModelVersionDatabricks setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

  public String getStatusMessage() {
    return statusMessage;
  }

  public ModelVersionDatabricks setTags(Collection<ModelVersionTag> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<ModelVersionTag> getTags() {
    return tags;
  }

  public ModelVersionDatabricks setUserId(String userId) {
    this.userId = userId;
    return this;
  }

  public String getUserId() {
    return userId;
  }

  public ModelVersionDatabricks setVersion(String version) {
    this.version = version;
    return this;
  }

  public String getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ModelVersionDatabricks that = (ModelVersionDatabricks) o;
    return Objects.equals(creationTimestamp, that.creationTimestamp)
        && Objects.equals(currentStage, that.currentStage)
        && Objects.equals(description, that.description)
        && Objects.equals(lastUpdatedTimestamp, that.lastUpdatedTimestamp)
        && Objects.equals(name, that.name)
        && Objects.equals(permissionLevel, that.permissionLevel)
        && Objects.equals(runId, that.runId)
        && Objects.equals(runLink, that.runLink)
        && Objects.equals(source, that.source)
        && Objects.equals(status, that.status)
        && Objects.equals(statusMessage, that.statusMessage)
        && Objects.equals(tags, that.tags)
        && Objects.equals(userId, that.userId)
        && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        creationTimestamp,
        currentStage,
        description,
        lastUpdatedTimestamp,
        name,
        permissionLevel,
        runId,
        runLink,
        source,
        status,
        statusMessage,
        tags,
        userId,
        version);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelVersionDatabricks.class)
        .add("creationTimestamp", creationTimestamp)
        .add("currentStage", currentStage)
        .add("description", description)
        .add("lastUpdatedTimestamp", lastUpdatedTimestamp)
        .add("name", name)
        .add("permissionLevel", permissionLevel)
        .add("runId", runId)
        .add("runLink", runLink)
        .add("source", source)
        .add("status", status)
        .add("statusMessage", statusMessage)
        .add("tags", tags)
        .add("userId", userId)
        .add("version", version)
        .toString();
  }

  ModelVersionDatabricksPb toPb() {
    ModelVersionDatabricksPb pb = new ModelVersionDatabricksPb();
    pb.setCreationTimestamp(creationTimestamp);
    pb.setCurrentStage(currentStage);
    pb.setDescription(description);
    pb.setLastUpdatedTimestamp(lastUpdatedTimestamp);
    pb.setName(name);
    pb.setPermissionLevel(permissionLevel);
    pb.setRunId(runId);
    pb.setRunLink(runLink);
    pb.setSource(source);
    pb.setStatus(status);
    pb.setStatusMessage(statusMessage);
    pb.setTags(tags);
    pb.setUserId(userId);
    pb.setVersion(version);

    return pb;
  }

  static ModelVersionDatabricks fromPb(ModelVersionDatabricksPb pb) {
    ModelVersionDatabricks model = new ModelVersionDatabricks();
    model.setCreationTimestamp(pb.getCreationTimestamp());
    model.setCurrentStage(pb.getCurrentStage());
    model.setDescription(pb.getDescription());
    model.setLastUpdatedTimestamp(pb.getLastUpdatedTimestamp());
    model.setName(pb.getName());
    model.setPermissionLevel(pb.getPermissionLevel());
    model.setRunId(pb.getRunId());
    model.setRunLink(pb.getRunLink());
    model.setSource(pb.getSource());
    model.setStatus(pb.getStatus());
    model.setStatusMessage(pb.getStatusMessage());
    model.setTags(pb.getTags());
    model.setUserId(pb.getUserId());
    model.setVersion(pb.getVersion());

    return model;
  }

  public static class ModelVersionDatabricksSerializer
      extends JsonSerializer<ModelVersionDatabricks> {
    @Override
    public void serialize(
        ModelVersionDatabricks value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ModelVersionDatabricksPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ModelVersionDatabricksDeserializer
      extends JsonDeserializer<ModelVersionDatabricks> {
    @Override
    public ModelVersionDatabricks deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ModelVersionDatabricksPb pb = mapper.readValue(p, ModelVersionDatabricksPb.class);
      return ModelVersionDatabricks.fromPb(pb);
    }
  }
}
