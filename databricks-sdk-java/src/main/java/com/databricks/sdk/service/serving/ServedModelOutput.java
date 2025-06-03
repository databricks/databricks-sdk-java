// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

@Generated
public class ServedModelOutput {
  /** */
  @JsonProperty("creation_timestamp")
  private Long creationTimestamp;

  /** */
  @JsonProperty("creator")
  private String creator;

  /**
   * An object containing a set of optional, user-specified environment variable key-value pairs
   * used for serving this entity. Note: this is an experimental feature and subject to change.
   * Example entity environment variables that refer to Databricks secrets: `{"OPENAI_API_KEY":
   * "{{secrets/my_scope/my_key}}", "DATABRICKS_TOKEN": "{{secrets/my_scope2/my_key2}}"}`
   */
  @JsonProperty("environment_vars")
  private Map<String, String> environmentVars;

  /** ARN of the instance profile that the served entity uses to access AWS resources. */
  @JsonProperty("instance_profile_arn")
  private String instanceProfileArn;

  /** */
  @JsonProperty("model_name")
  private String modelName;

  /** */
  @JsonProperty("model_version")
  private String modelVersion;

  /**
   * The name of a served entity. It must be unique across an endpoint. A served entity name can
   * consist of alphanumeric characters, dashes, and underscores. If not specified for an external
   * model, this field defaults to external_model.name, with '.' and ':' replaced with '-', and if
   * not specified for other entities, it defaults to entity_name-entity_version.
   */
  @JsonProperty("name")
  private String name;

  /** The number of model units provisioned. */
  @JsonProperty("provisioned_model_units")
  private Long provisionedModelUnits;

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

  public ServedModelOutput setCreationTimestamp(Long creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  public Long getCreationTimestamp() {
    return creationTimestamp;
  }

  public ServedModelOutput setCreator(String creator) {
    this.creator = creator;
    return this;
  }

  public String getCreator() {
    return creator;
  }

  public ServedModelOutput setEnvironmentVars(Map<String, String> environmentVars) {
    this.environmentVars = environmentVars;
    return this;
  }

  public Map<String, String> getEnvironmentVars() {
    return environmentVars;
  }

  public ServedModelOutput setInstanceProfileArn(String instanceProfileArn) {
    this.instanceProfileArn = instanceProfileArn;
    return this;
  }

  public String getInstanceProfileArn() {
    return instanceProfileArn;
  }

  public ServedModelOutput setModelName(String modelName) {
    this.modelName = modelName;
    return this;
  }

  public String getModelName() {
    return modelName;
  }

  public ServedModelOutput setModelVersion(String modelVersion) {
    this.modelVersion = modelVersion;
    return this;
  }

  public String getModelVersion() {
    return modelVersion;
  }

  public ServedModelOutput setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ServedModelOutput setProvisionedModelUnits(Long provisionedModelUnits) {
    this.provisionedModelUnits = provisionedModelUnits;
    return this;
  }

  public Long getProvisionedModelUnits() {
    return provisionedModelUnits;
  }

  public ServedModelOutput setScaleToZeroEnabled(Boolean scaleToZeroEnabled) {
    this.scaleToZeroEnabled = scaleToZeroEnabled;
    return this;
  }

  public Boolean getScaleToZeroEnabled() {
    return scaleToZeroEnabled;
  }

  public ServedModelOutput setState(ServedModelState state) {
    this.state = state;
    return this;
  }

  public ServedModelState getState() {
    return state;
  }

  public ServedModelOutput setWorkloadSize(String workloadSize) {
    this.workloadSize = workloadSize;
    return this;
  }

  public String getWorkloadSize() {
    return workloadSize;
  }

  public ServedModelOutput setWorkloadType(ServingModelWorkloadType workloadType) {
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
    ServedModelOutput that = (ServedModelOutput) o;
    return Objects.equals(creationTimestamp, that.creationTimestamp)
        && Objects.equals(creator, that.creator)
        && Objects.equals(environmentVars, that.environmentVars)
        && Objects.equals(instanceProfileArn, that.instanceProfileArn)
        && Objects.equals(modelName, that.modelName)
        && Objects.equals(modelVersion, that.modelVersion)
        && Objects.equals(name, that.name)
        && Objects.equals(provisionedModelUnits, that.provisionedModelUnits)
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
        environmentVars,
        instanceProfileArn,
        modelName,
        modelVersion,
        name,
        provisionedModelUnits,
        scaleToZeroEnabled,
        state,
        workloadSize,
        workloadType);
  }

  @Override
  public String toString() {
    return new ToStringer(ServedModelOutput.class)
        .add("creationTimestamp", creationTimestamp)
        .add("creator", creator)
        .add("environmentVars", environmentVars)
        .add("instanceProfileArn", instanceProfileArn)
        .add("modelName", modelName)
        .add("modelVersion", modelVersion)
        .add("name", name)
        .add("provisionedModelUnits", provisionedModelUnits)
        .add("scaleToZeroEnabled", scaleToZeroEnabled)
        .add("state", state)
        .add("workloadSize", workloadSize)
        .add("workloadType", workloadType)
        .toString();
  }
}
