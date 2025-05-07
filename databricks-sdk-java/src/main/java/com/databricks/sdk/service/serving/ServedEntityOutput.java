// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

@Generated
public class ServedEntityOutput {
  /** */
  @JsonProperty("creation_timestamp")
  private Long creationTimestamp;

  /** */
  @JsonProperty("creator")
  private String creator;

  /**
   * The name of the entity to be served. The entity may be a model in the Databricks Model
   * Registry, a model in the Unity Catalog (UC), or a function of type FEATURE_SPEC in the UC. If
   * it is a UC object, the full name of the object should be given in the form of
   * **catalog_name.schema_name.model_name**.
   */
  @JsonProperty("entity_name")
  private String entityName;

  /** */
  @JsonProperty("entity_version")
  private String entityVersion;

  /**
   * An object containing a set of optional, user-specified environment variable key-value pairs
   * used for serving this entity. Note: this is an experimental feature and subject to change.
   * Example entity environment variables that refer to Databricks secrets: `{"OPENAI_API_KEY":
   * "{{secrets/my_scope/my_key}}", "DATABRICKS_TOKEN": "{{secrets/my_scope2/my_key2}}"}`
   */
  @JsonProperty("environment_vars")
  private Map<String, String> environmentVars;

  /**
   * The external model to be served. NOTE: Only one of external_model and (entity_name,
   * entity_version, workload_size, workload_type, and scale_to_zero_enabled) can be specified with
   * the latter set being used for custom model serving for a Databricks registered model. For an
   * existing endpoint with external_model, it cannot be updated to an endpoint without
   * external_model. If the endpoint is created without external_model, users cannot update it to
   * add external_model later. The task type of all external models within an endpoint must be the
   * same.
   */
  @JsonProperty("external_model")
  private ExternalModel externalModel;

  /**
   * All fields are not sensitive as they are hard-coded in the system and made available to
   * customers.
   */
  @JsonProperty("foundation_model")
  private FoundationModel foundationModel;

  /** ARN of the instance profile that the served entity uses to access AWS resources. */
  @JsonProperty("instance_profile_arn")
  private String instanceProfileArn;

  /** The maximum tokens per second that the endpoint can scale up to. */
  @JsonProperty("max_provisioned_throughput")
  private Long maxProvisionedThroughput;

  /** The minimum tokens per second that the endpoint can scale down to. */
  @JsonProperty("min_provisioned_throughput")
  private Long minProvisionedThroughput;

  /**
   * The name of a served entity. It must be unique across an endpoint. A served entity name can
   * consist of alphanumeric characters, dashes, and underscores. If not specified for an external
   * model, this field defaults to external_model.name, with '.' and ':' replaced with '-', and if
   * not specified for other entities, it defaults to entity_name-entity_version.
   */
  @JsonProperty("name")
  private String name;

  /** Whether the compute resources for the served entity should scale down to zero. */
  @JsonProperty("scale_to_zero_enabled")
  private Boolean scaleToZeroEnabled;

  /** */
  @JsonProperty("state")
  private ServedModelState state;

  /**
   * The workload size of the served entity. The workload size corresponds to a range of provisioned
   * concurrency that the compute autoscales between. A single unit of provisioned concurrency can
   * process one request at a time. Valid workload sizes are "Small" (4 - 4 provisioned
   * concurrency), "Medium" (8 - 16 provisioned concurrency), and "Large" (16 - 64 provisioned
   * concurrency). Additional custom workload sizes can also be used when available in the
   * workspace. If scale-to-zero is enabled, the lower bound of the provisioned concurrency for each
   * workload size is 0.
   */
  @JsonProperty("workload_size")
  private String workloadSize;

  /**
   * The workload type of the served entity. The workload type selects which type of compute to use
   * in the endpoint. The default value for this parameter is "CPU". For deep learning workloads,
   * GPU acceleration is available by selecting workload types like GPU_SMALL and others. See the
   * available [GPU types].
   *
   * <p>[GPU types]:
   * https://docs.databricks.com/en/machine-learning/model-serving/create-manage-serving-endpoints.html#gpu-workload-types
   */
  @JsonProperty("workload_type")
  private ServingModelWorkloadType workloadType;

  public ServedEntityOutput setCreationTimestamp(Long creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  public Long getCreationTimestamp() {
    return creationTimestamp;
  }

  public ServedEntityOutput setCreator(String creator) {
    this.creator = creator;
    return this;
  }

  public String getCreator() {
    return creator;
  }

  public ServedEntityOutput setEntityName(String entityName) {
    this.entityName = entityName;
    return this;
  }

  public String getEntityName() {
    return entityName;
  }

  public ServedEntityOutput setEntityVersion(String entityVersion) {
    this.entityVersion = entityVersion;
    return this;
  }

  public String getEntityVersion() {
    return entityVersion;
  }

  public ServedEntityOutput setEnvironmentVars(Map<String, String> environmentVars) {
    this.environmentVars = environmentVars;
    return this;
  }

  public Map<String, String> getEnvironmentVars() {
    return environmentVars;
  }

  public ServedEntityOutput setExternalModel(ExternalModel externalModel) {
    this.externalModel = externalModel;
    return this;
  }

  public ExternalModel getExternalModel() {
    return externalModel;
  }

  public ServedEntityOutput setFoundationModel(FoundationModel foundationModel) {
    this.foundationModel = foundationModel;
    return this;
  }

  public FoundationModel getFoundationModel() {
    return foundationModel;
  }

  public ServedEntityOutput setInstanceProfileArn(String instanceProfileArn) {
    this.instanceProfileArn = instanceProfileArn;
    return this;
  }

  public String getInstanceProfileArn() {
    return instanceProfileArn;
  }

  public ServedEntityOutput setMaxProvisionedThroughput(Long maxProvisionedThroughput) {
    this.maxProvisionedThroughput = maxProvisionedThroughput;
    return this;
  }

  public Long getMaxProvisionedThroughput() {
    return maxProvisionedThroughput;
  }

  public ServedEntityOutput setMinProvisionedThroughput(Long minProvisionedThroughput) {
    this.minProvisionedThroughput = minProvisionedThroughput;
    return this;
  }

  public Long getMinProvisionedThroughput() {
    return minProvisionedThroughput;
  }

  public ServedEntityOutput setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ServedEntityOutput setScaleToZeroEnabled(Boolean scaleToZeroEnabled) {
    this.scaleToZeroEnabled = scaleToZeroEnabled;
    return this;
  }

  public Boolean getScaleToZeroEnabled() {
    return scaleToZeroEnabled;
  }

  public ServedEntityOutput setState(ServedModelState state) {
    this.state = state;
    return this;
  }

  public ServedModelState getState() {
    return state;
  }

  public ServedEntityOutput setWorkloadSize(String workloadSize) {
    this.workloadSize = workloadSize;
    return this;
  }

  public String getWorkloadSize() {
    return workloadSize;
  }

  public ServedEntityOutput setWorkloadType(ServingModelWorkloadType workloadType) {
    this.workloadType = workloadType;
    return this;
  }

  public ServingModelWorkloadType getWorkloadType() {
    return workloadType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ServedEntityOutput that = (ServedEntityOutput) o;
    return Objects.equals(creationTimestamp, that.creationTimestamp)
        && Objects.equals(creator, that.creator)
        && Objects.equals(entityName, that.entityName)
        && Objects.equals(entityVersion, that.entityVersion)
        && Objects.equals(environmentVars, that.environmentVars)
        && Objects.equals(externalModel, that.externalModel)
        && Objects.equals(foundationModel, that.foundationModel)
        && Objects.equals(instanceProfileArn, that.instanceProfileArn)
        && Objects.equals(maxProvisionedThroughput, that.maxProvisionedThroughput)
        && Objects.equals(minProvisionedThroughput, that.minProvisionedThroughput)
        && Objects.equals(name, that.name)
        && Objects.equals(scaleToZeroEnabled, that.scaleToZeroEnabled)
        && Objects.equals(state, that.state)
        && Objects.equals(workloadSize, that.workloadSize)
        && Objects.equals(workloadType, that.workloadType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        creationTimestamp,
        creator,
        entityName,
        entityVersion,
        environmentVars,
        externalModel,
        foundationModel,
        instanceProfileArn,
        maxProvisionedThroughput,
        minProvisionedThroughput,
        name,
        scaleToZeroEnabled,
        state,
        workloadSize,
        workloadType);
  }

  @Override
  public String toString() {
    return new ToStringer(ServedEntityOutput.class)
        .add("creationTimestamp", creationTimestamp)
        .add("creator", creator)
        .add("entityName", entityName)
        .add("entityVersion", entityVersion)
        .add("environmentVars", environmentVars)
        .add("externalModel", externalModel)
        .add("foundationModel", foundationModel)
        .add("instanceProfileArn", instanceProfileArn)
        .add("maxProvisionedThroughput", maxProvisionedThroughput)
        .add("minProvisionedThroughput", minProvisionedThroughput)
        .add("name", name)
        .add("scaleToZeroEnabled", scaleToZeroEnabled)
        .add("state", state)
        .add("workloadSize", workloadSize)
        .add("workloadType", workloadType)
        .toString();
  }
}
