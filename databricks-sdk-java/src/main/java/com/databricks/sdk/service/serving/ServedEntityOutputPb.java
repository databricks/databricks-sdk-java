// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

@Generated
class ServedEntityOutputPb {
  @JsonProperty("creation_timestamp")
  private Long creationTimestamp;

  @JsonProperty("creator")
  private String creator;

  @JsonProperty("entity_name")
  private String entityName;

  @JsonProperty("entity_version")
  private String entityVersion;

  @JsonProperty("environment_vars")
  private Map<String, String> environmentVars;

  @JsonProperty("external_model")
  private ExternalModel externalModel;

  @JsonProperty("foundation_model")
  private FoundationModel foundationModel;

  @JsonProperty("instance_profile_arn")
  private String instanceProfileArn;

  @JsonProperty("max_provisioned_concurrency")
  private Long maxProvisionedConcurrency;

  @JsonProperty("max_provisioned_throughput")
  private Long maxProvisionedThroughput;

  @JsonProperty("min_provisioned_concurrency")
  private Long minProvisionedConcurrency;

  @JsonProperty("min_provisioned_throughput")
  private Long minProvisionedThroughput;

  @JsonProperty("name")
  private String name;

  @JsonProperty("provisioned_model_units")
  private Long provisionedModelUnits;

  @JsonProperty("scale_to_zero_enabled")
  private Boolean scaleToZeroEnabled;

  @JsonProperty("state")
  private ServedModelState state;

  @JsonProperty("workload_size")
  private String workloadSize;

  @JsonProperty("workload_type")
  private ServingModelWorkloadType workloadType;

  public ServedEntityOutputPb setCreationTimestamp(Long creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  public Long getCreationTimestamp() {
    return creationTimestamp;
  }

  public ServedEntityOutputPb setCreator(String creator) {
    this.creator = creator;
    return this;
  }

  public String getCreator() {
    return creator;
  }

  public ServedEntityOutputPb setEntityName(String entityName) {
    this.entityName = entityName;
    return this;
  }

  public String getEntityName() {
    return entityName;
  }

  public ServedEntityOutputPb setEntityVersion(String entityVersion) {
    this.entityVersion = entityVersion;
    return this;
  }

  public String getEntityVersion() {
    return entityVersion;
  }

  public ServedEntityOutputPb setEnvironmentVars(Map<String, String> environmentVars) {
    this.environmentVars = environmentVars;
    return this;
  }

  public Map<String, String> getEnvironmentVars() {
    return environmentVars;
  }

  public ServedEntityOutputPb setExternalModel(ExternalModel externalModel) {
    this.externalModel = externalModel;
    return this;
  }

  public ExternalModel getExternalModel() {
    return externalModel;
  }

  public ServedEntityOutputPb setFoundationModel(FoundationModel foundationModel) {
    this.foundationModel = foundationModel;
    return this;
  }

  public FoundationModel getFoundationModel() {
    return foundationModel;
  }

  public ServedEntityOutputPb setInstanceProfileArn(String instanceProfileArn) {
    this.instanceProfileArn = instanceProfileArn;
    return this;
  }

  public String getInstanceProfileArn() {
    return instanceProfileArn;
  }

  public ServedEntityOutputPb setMaxProvisionedConcurrency(Long maxProvisionedConcurrency) {
    this.maxProvisionedConcurrency = maxProvisionedConcurrency;
    return this;
  }

  public Long getMaxProvisionedConcurrency() {
    return maxProvisionedConcurrency;
  }

  public ServedEntityOutputPb setMaxProvisionedThroughput(Long maxProvisionedThroughput) {
    this.maxProvisionedThroughput = maxProvisionedThroughput;
    return this;
  }

  public Long getMaxProvisionedThroughput() {
    return maxProvisionedThroughput;
  }

  public ServedEntityOutputPb setMinProvisionedConcurrency(Long minProvisionedConcurrency) {
    this.minProvisionedConcurrency = minProvisionedConcurrency;
    return this;
  }

  public Long getMinProvisionedConcurrency() {
    return minProvisionedConcurrency;
  }

  public ServedEntityOutputPb setMinProvisionedThroughput(Long minProvisionedThroughput) {
    this.minProvisionedThroughput = minProvisionedThroughput;
    return this;
  }

  public Long getMinProvisionedThroughput() {
    return minProvisionedThroughput;
  }

  public ServedEntityOutputPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ServedEntityOutputPb setProvisionedModelUnits(Long provisionedModelUnits) {
    this.provisionedModelUnits = provisionedModelUnits;
    return this;
  }

  public Long getProvisionedModelUnits() {
    return provisionedModelUnits;
  }

  public ServedEntityOutputPb setScaleToZeroEnabled(Boolean scaleToZeroEnabled) {
    this.scaleToZeroEnabled = scaleToZeroEnabled;
    return this;
  }

  public Boolean getScaleToZeroEnabled() {
    return scaleToZeroEnabled;
  }

  public ServedEntityOutputPb setState(ServedModelState state) {
    this.state = state;
    return this;
  }

  public ServedModelState getState() {
    return state;
  }

  public ServedEntityOutputPb setWorkloadSize(String workloadSize) {
    this.workloadSize = workloadSize;
    return this;
  }

  public String getWorkloadSize() {
    return workloadSize;
  }

  public ServedEntityOutputPb setWorkloadType(ServingModelWorkloadType workloadType) {
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
    ServedEntityOutputPb that = (ServedEntityOutputPb) o;
    return Objects.equals(creationTimestamp, that.creationTimestamp)
        && Objects.equals(creator, that.creator)
        && Objects.equals(entityName, that.entityName)
        && Objects.equals(entityVersion, that.entityVersion)
        && Objects.equals(environmentVars, that.environmentVars)
        && Objects.equals(externalModel, that.externalModel)
        && Objects.equals(foundationModel, that.foundationModel)
        && Objects.equals(instanceProfileArn, that.instanceProfileArn)
        && Objects.equals(maxProvisionedConcurrency, that.maxProvisionedConcurrency)
        && Objects.equals(maxProvisionedThroughput, that.maxProvisionedThroughput)
        && Objects.equals(minProvisionedConcurrency, that.minProvisionedConcurrency)
        && Objects.equals(minProvisionedThroughput, that.minProvisionedThroughput)
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
        entityName,
        entityVersion,
        environmentVars,
        externalModel,
        foundationModel,
        instanceProfileArn,
        maxProvisionedConcurrency,
        maxProvisionedThroughput,
        minProvisionedConcurrency,
        minProvisionedThroughput,
        name,
        provisionedModelUnits,
        scaleToZeroEnabled,
        state,
        workloadSize,
        workloadType);
  }

  @Override
  public String toString() {
    return new ToStringer(ServedEntityOutputPb.class)
        .add("creationTimestamp", creationTimestamp)
        .add("creator", creator)
        .add("entityName", entityName)
        .add("entityVersion", entityVersion)
        .add("environmentVars", environmentVars)
        .add("externalModel", externalModel)
        .add("foundationModel", foundationModel)
        .add("instanceProfileArn", instanceProfileArn)
        .add("maxProvisionedConcurrency", maxProvisionedConcurrency)
        .add("maxProvisionedThroughput", maxProvisionedThroughput)
        .add("minProvisionedConcurrency", minProvisionedConcurrency)
        .add("minProvisionedThroughput", minProvisionedThroughput)
        .add("name", name)
        .add("provisionedModelUnits", provisionedModelUnits)
        .add("scaleToZeroEnabled", scaleToZeroEnabled)
        .add("state", state)
        .add("workloadSize", workloadSize)
        .add("workloadType", workloadType)
        .toString();
  }
}
