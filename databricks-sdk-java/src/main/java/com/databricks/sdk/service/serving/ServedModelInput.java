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
@JsonSerialize(using = ServedModelInput.ServedModelInputSerializer.class)
@JsonDeserialize(using = ServedModelInput.ServedModelInputDeserializer.class)
public class ServedModelInput {
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

  /** The maximum tokens per second that the endpoint can scale up to. */
  private Long maxProvisionedThroughput;

  /**
   * The minimum provisioned concurrency that the endpoint can scale down to. Do not use if
   * workload_size is specified.
   */
  private Long minProvisionedConcurrency;

  /** The minimum tokens per second that the endpoint can scale down to. */
  private Long minProvisionedThroughput;

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
  private ServedModelInputWorkloadType workloadType;

  public ServedModelInput setEnvironmentVars(Map<String, String> environmentVars) {
    this.environmentVars = environmentVars;
    return this;
  }

  public Map<String, String> getEnvironmentVars() {
    return environmentVars;
  }

  public ServedModelInput setInstanceProfileArn(String instanceProfileArn) {
    this.instanceProfileArn = instanceProfileArn;
    return this;
  }

  public String getInstanceProfileArn() {
    return instanceProfileArn;
  }

  public ServedModelInput setMaxProvisionedConcurrency(Long maxProvisionedConcurrency) {
    this.maxProvisionedConcurrency = maxProvisionedConcurrency;
    return this;
  }

  public Long getMaxProvisionedConcurrency() {
    return maxProvisionedConcurrency;
  }

  public ServedModelInput setMaxProvisionedThroughput(Long maxProvisionedThroughput) {
    this.maxProvisionedThroughput = maxProvisionedThroughput;
    return this;
  }

  public Long getMaxProvisionedThroughput() {
    return maxProvisionedThroughput;
  }

  public ServedModelInput setMinProvisionedConcurrency(Long minProvisionedConcurrency) {
    this.minProvisionedConcurrency = minProvisionedConcurrency;
    return this;
  }

  public Long getMinProvisionedConcurrency() {
    return minProvisionedConcurrency;
  }

  public ServedModelInput setMinProvisionedThroughput(Long minProvisionedThroughput) {
    this.minProvisionedThroughput = minProvisionedThroughput;
    return this;
  }

  public Long getMinProvisionedThroughput() {
    return minProvisionedThroughput;
  }

  public ServedModelInput setModelName(String modelName) {
    this.modelName = modelName;
    return this;
  }

  public String getModelName() {
    return modelName;
  }

  public ServedModelInput setModelVersion(String modelVersion) {
    this.modelVersion = modelVersion;
    return this;
  }

  public String getModelVersion() {
    return modelVersion;
  }

  public ServedModelInput setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ServedModelInput setProvisionedModelUnits(Long provisionedModelUnits) {
    this.provisionedModelUnits = provisionedModelUnits;
    return this;
  }

  public Long getProvisionedModelUnits() {
    return provisionedModelUnits;
  }

  public ServedModelInput setScaleToZeroEnabled(Boolean scaleToZeroEnabled) {
    this.scaleToZeroEnabled = scaleToZeroEnabled;
    return this;
  }

  public Boolean getScaleToZeroEnabled() {
    return scaleToZeroEnabled;
  }

  public ServedModelInput setWorkloadSize(String workloadSize) {
    this.workloadSize = workloadSize;
    return this;
  }

  public String getWorkloadSize() {
    return workloadSize;
  }

  public ServedModelInput setWorkloadType(ServedModelInputWorkloadType workloadType) {
    this.workloadType = workloadType;
    return this;
  }

  public ServedModelInputWorkloadType getWorkloadType() {
    return workloadType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ServedModelInput that = (ServedModelInput) o;
    return Objects.equals(environmentVars, that.environmentVars)
        && Objects.equals(instanceProfileArn, that.instanceProfileArn)
        && Objects.equals(maxProvisionedConcurrency, that.maxProvisionedConcurrency)
        && Objects.equals(maxProvisionedThroughput, that.maxProvisionedThroughput)
        && Objects.equals(minProvisionedConcurrency, that.minProvisionedConcurrency)
        && Objects.equals(minProvisionedThroughput, that.minProvisionedThroughput)
        && Objects.equals(modelName, that.modelName)
        && Objects.equals(modelVersion, that.modelVersion)
        && Objects.equals(name, that.name)
        && Objects.equals(provisionedModelUnits, that.provisionedModelUnits)
        && Objects.equals(scaleToZeroEnabled, that.scaleToZeroEnabled)
        && Objects.equals(workloadSize, that.workloadSize)
        && Objects.equals(workloadType, that.workloadType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        environmentVars,
        instanceProfileArn,
        maxProvisionedConcurrency,
        maxProvisionedThroughput,
        minProvisionedConcurrency,
        minProvisionedThroughput,
        modelName,
        modelVersion,
        name,
        provisionedModelUnits,
        scaleToZeroEnabled,
        workloadSize,
        workloadType);
  }

  @Override
  public String toString() {
    return new ToStringer(ServedModelInput.class)
        .add("environmentVars", environmentVars)
        .add("instanceProfileArn", instanceProfileArn)
        .add("maxProvisionedConcurrency", maxProvisionedConcurrency)
        .add("maxProvisionedThroughput", maxProvisionedThroughput)
        .add("minProvisionedConcurrency", minProvisionedConcurrency)
        .add("minProvisionedThroughput", minProvisionedThroughput)
        .add("modelName", modelName)
        .add("modelVersion", modelVersion)
        .add("name", name)
        .add("provisionedModelUnits", provisionedModelUnits)
        .add("scaleToZeroEnabled", scaleToZeroEnabled)
        .add("workloadSize", workloadSize)
        .add("workloadType", workloadType)
        .toString();
  }

  ServedModelInputPb toPb() {
    ServedModelInputPb pb = new ServedModelInputPb();
    pb.setEnvironmentVars(environmentVars);
    pb.setInstanceProfileArn(instanceProfileArn);
    pb.setMaxProvisionedConcurrency(maxProvisionedConcurrency);
    pb.setMaxProvisionedThroughput(maxProvisionedThroughput);
    pb.setMinProvisionedConcurrency(minProvisionedConcurrency);
    pb.setMinProvisionedThroughput(minProvisionedThroughput);
    pb.setModelName(modelName);
    pb.setModelVersion(modelVersion);
    pb.setName(name);
    pb.setProvisionedModelUnits(provisionedModelUnits);
    pb.setScaleToZeroEnabled(scaleToZeroEnabled);
    pb.setWorkloadSize(workloadSize);
    pb.setWorkloadType(workloadType);

    return pb;
  }

  static ServedModelInput fromPb(ServedModelInputPb pb) {
    ServedModelInput model = new ServedModelInput();
    model.setEnvironmentVars(pb.getEnvironmentVars());
    model.setInstanceProfileArn(pb.getInstanceProfileArn());
    model.setMaxProvisionedConcurrency(pb.getMaxProvisionedConcurrency());
    model.setMaxProvisionedThroughput(pb.getMaxProvisionedThroughput());
    model.setMinProvisionedConcurrency(pb.getMinProvisionedConcurrency());
    model.setMinProvisionedThroughput(pb.getMinProvisionedThroughput());
    model.setModelName(pb.getModelName());
    model.setModelVersion(pb.getModelVersion());
    model.setName(pb.getName());
    model.setProvisionedModelUnits(pb.getProvisionedModelUnits());
    model.setScaleToZeroEnabled(pb.getScaleToZeroEnabled());
    model.setWorkloadSize(pb.getWorkloadSize());
    model.setWorkloadType(pb.getWorkloadType());

    return model;
  }

  public static class ServedModelInputSerializer extends JsonSerializer<ServedModelInput> {
    @Override
    public void serialize(ServedModelInput value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ServedModelInputPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ServedModelInputDeserializer extends JsonDeserializer<ServedModelInput> {
    @Override
    public ServedModelInput deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ServedModelInputPb pb = mapper.readValue(p, ServedModelInputPb.class);
      return ServedModelInput.fromPb(pb);
    }
  }
}
