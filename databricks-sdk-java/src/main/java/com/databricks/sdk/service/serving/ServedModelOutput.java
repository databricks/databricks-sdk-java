// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

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
import java.util.Map;
import java.util.Objects;

@Generated
@JsonSerialize(using = ServedModelOutput.ServedModelOutputSerializer.class)
@JsonDeserialize(using = ServedModelOutput.ServedModelOutputDeserializer.class)
public class ServedModelOutput {
  /** */
  private Long creationTimestamp;

  /** */
  private String creator;

  /**
   * An object containing a set of optional, user-specified environment variable key-value pairs
   * used for serving this entity. Note: this is an experimental feature and subject to change.
   * Example entity environment variables that refer to Databricks secrets: `{"OPENAI_API_KEY":
   * "{{secrets/my_scope/my_key}}", "DATABRICKS_TOKEN": "{{secrets/my_scope2/my_key2}}"}`
   */
  private Map<String, String> environmentVars;

  /** ARN of the instance profile that the served entity uses to access AWS resources. */
  private String instanceProfileArn;

  /**
   * The maximum provisioned concurrency that the endpoint can scale up to. Do not use if
   * workload_size is specified.
   */
  private Long maxProvisionedConcurrency;

  /**
   * The minimum provisioned concurrency that the endpoint can scale down to. Do not use if
   * workload_size is specified.
   */
  private Long minProvisionedConcurrency;

  /** */
  private String modelName;

  /** */
  private String modelVersion;

  /**
   * The name of a served entity. It must be unique across an endpoint. A served entity name can
   * consist of alphanumeric characters, dashes, and underscores. If not specified for an external
   * model, this field defaults to external_model.name, with '.' and ':' replaced with '-', and if
   * not specified for other entities, it defaults to entity_name-entity_version.
   */
  private String name;

  /** The number of model units provisioned. */
  private Long provisionedModelUnits;

  /** Whether the compute resources for the served entity should scale down to zero. */
  private Boolean scaleToZeroEnabled;

  /** */
  private ServedModelState state;

  /**
   * The workload size of the served entity. The workload size corresponds to a range of provisioned
   * concurrency that the compute autoscales between. A single unit of provisioned concurrency can
   * process one request at a time. Valid workload sizes are "Small" (4 - 4 provisioned
   * concurrency), "Medium" (8 - 16 provisioned concurrency), and "Large" (16 - 64 provisioned
   * concurrency). Additional custom workload sizes can also be used when available in the
   * workspace. If scale-to-zero is enabled, the lower bound of the provisioned concurrency for each
   * workload size is 0. Do not use if min_provisioned_concurrency and max_provisioned_concurrency
   * are specified.
   */
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

  public ServedModelOutput setMaxProvisionedConcurrency(Long maxProvisionedConcurrency) {
    this.maxProvisionedConcurrency = maxProvisionedConcurrency;
    return this;
  }

  public Long getMaxProvisionedConcurrency() {
    return maxProvisionedConcurrency;
  }

  public ServedModelOutput setMinProvisionedConcurrency(Long minProvisionedConcurrency) {
    this.minProvisionedConcurrency = minProvisionedConcurrency;
    return this;
  }

  public Long getMinProvisionedConcurrency() {
    return minProvisionedConcurrency;
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
        && Objects.equals(maxProvisionedConcurrency, that.maxProvisionedConcurrency)
        && Objects.equals(minProvisionedConcurrency, that.minProvisionedConcurrency)
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
        maxProvisionedConcurrency,
        minProvisionedConcurrency,
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
        .add("maxProvisionedConcurrency", maxProvisionedConcurrency)
        .add("minProvisionedConcurrency", minProvisionedConcurrency)
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

  ServedModelOutputPb toPb() {
    ServedModelOutputPb pb = new ServedModelOutputPb();
    pb.setCreationTimestamp(creationTimestamp);
    pb.setCreator(creator);
    pb.setEnvironmentVars(environmentVars);
    pb.setInstanceProfileArn(instanceProfileArn);
    pb.setMaxProvisionedConcurrency(maxProvisionedConcurrency);
    pb.setMinProvisionedConcurrency(minProvisionedConcurrency);
    pb.setModelName(modelName);
    pb.setModelVersion(modelVersion);
    pb.setName(name);
    pb.setProvisionedModelUnits(provisionedModelUnits);
    pb.setScaleToZeroEnabled(scaleToZeroEnabled);
    pb.setState(state);
    pb.setWorkloadSize(workloadSize);
    pb.setWorkloadType(workloadType);

    return pb;
  }

  static ServedModelOutput fromPb(ServedModelOutputPb pb) {
    ServedModelOutput model = new ServedModelOutput();
    model.setCreationTimestamp(pb.getCreationTimestamp());
    model.setCreator(pb.getCreator());
    model.setEnvironmentVars(pb.getEnvironmentVars());
    model.setInstanceProfileArn(pb.getInstanceProfileArn());
    model.setMaxProvisionedConcurrency(pb.getMaxProvisionedConcurrency());
    model.setMinProvisionedConcurrency(pb.getMinProvisionedConcurrency());
    model.setModelName(pb.getModelName());
    model.setModelVersion(pb.getModelVersion());
    model.setName(pb.getName());
    model.setProvisionedModelUnits(pb.getProvisionedModelUnits());
    model.setScaleToZeroEnabled(pb.getScaleToZeroEnabled());
    model.setState(pb.getState());
    model.setWorkloadSize(pb.getWorkloadSize());
    model.setWorkloadType(pb.getWorkloadType());

    return model;
  }

  public static class ServedModelOutputSerializer extends JsonSerializer<ServedModelOutput> {
    @Override
    public void serialize(ServedModelOutput value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ServedModelOutputPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ServedModelOutputDeserializer extends JsonDeserializer<ServedModelOutput> {
    @Override
    public ServedModelOutput deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ServedModelOutputPb pb = mapper.readValue(p, ServedModelOutputPb.class);
      return ServedModelOutput.fromPb(pb);
    }
  }
}
