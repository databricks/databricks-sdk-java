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
@JsonSerialize(using = ServedEntityInput.ServedEntityInputSerializer.class)
@JsonDeserialize(using = ServedEntityInput.ServedEntityInputDeserializer.class)
public class ServedEntityInput {
  /**
   * The name of the entity to be served. The entity may be a model in the Databricks Model
   * Registry, a model in the Unity Catalog (UC), or a function of type FEATURE_SPEC in the UC. If
   * it is a UC object, the full name of the object should be given in the form of
   * **catalog_name.schema_name.model_name**.
   */
  private String entityName;

  /** */
  private String entityVersion;

  /**
   * An object containing a set of optional, user-specified environment variable key-value pairs
   * used for serving this entity. Note: this is an experimental feature and subject to change.
   * Example entity environment variables that refer to Databricks secrets: `{"OPENAI_API_KEY":
   * "{{secrets/my_scope/my_key}}", "DATABRICKS_TOKEN": "{{secrets/my_scope2/my_key2}}"}`
   */
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
  private ExternalModel externalModel;

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
  private ServingModelWorkloadType workloadType;

  public ServedEntityInput setEntityName(String entityName) {
    this.entityName = entityName;
    return this;
  }

  public String getEntityName() {
    return entityName;
  }

  public ServedEntityInput setEntityVersion(String entityVersion) {
    this.entityVersion = entityVersion;
    return this;
  }

  public String getEntityVersion() {
    return entityVersion;
  }

  public ServedEntityInput setEnvironmentVars(Map<String, String> environmentVars) {
    this.environmentVars = environmentVars;
    return this;
  }

  public Map<String, String> getEnvironmentVars() {
    return environmentVars;
  }

  public ServedEntityInput setExternalModel(ExternalModel externalModel) {
    this.externalModel = externalModel;
    return this;
  }

  public ExternalModel getExternalModel() {
    return externalModel;
  }

  public ServedEntityInput setInstanceProfileArn(String instanceProfileArn) {
    this.instanceProfileArn = instanceProfileArn;
    return this;
  }

  public String getInstanceProfileArn() {
    return instanceProfileArn;
  }

  public ServedEntityInput setMaxProvisionedConcurrency(Long maxProvisionedConcurrency) {
    this.maxProvisionedConcurrency = maxProvisionedConcurrency;
    return this;
  }

  public Long getMaxProvisionedConcurrency() {
    return maxProvisionedConcurrency;
  }

  public ServedEntityInput setMaxProvisionedThroughput(Long maxProvisionedThroughput) {
    this.maxProvisionedThroughput = maxProvisionedThroughput;
    return this;
  }

  public Long getMaxProvisionedThroughput() {
    return maxProvisionedThroughput;
  }

  public ServedEntityInput setMinProvisionedConcurrency(Long minProvisionedConcurrency) {
    this.minProvisionedConcurrency = minProvisionedConcurrency;
    return this;
  }

  public Long getMinProvisionedConcurrency() {
    return minProvisionedConcurrency;
  }

  public ServedEntityInput setMinProvisionedThroughput(Long minProvisionedThroughput) {
    this.minProvisionedThroughput = minProvisionedThroughput;
    return this;
  }

  public Long getMinProvisionedThroughput() {
    return minProvisionedThroughput;
  }

  public ServedEntityInput setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ServedEntityInput setProvisionedModelUnits(Long provisionedModelUnits) {
    this.provisionedModelUnits = provisionedModelUnits;
    return this;
  }

  public Long getProvisionedModelUnits() {
    return provisionedModelUnits;
  }

  public ServedEntityInput setScaleToZeroEnabled(Boolean scaleToZeroEnabled) {
    this.scaleToZeroEnabled = scaleToZeroEnabled;
    return this;
  }

  public Boolean getScaleToZeroEnabled() {
    return scaleToZeroEnabled;
  }

  public ServedEntityInput setWorkloadSize(String workloadSize) {
    this.workloadSize = workloadSize;
    return this;
  }

  public String getWorkloadSize() {
    return workloadSize;
  }

  public ServedEntityInput setWorkloadType(ServingModelWorkloadType workloadType) {
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
    ServedEntityInput that = (ServedEntityInput) o;
    return Objects.equals(entityName, that.entityName)
        && Objects.equals(entityVersion, that.entityVersion)
        && Objects.equals(environmentVars, that.environmentVars)
        && Objects.equals(externalModel, that.externalModel)
        && Objects.equals(instanceProfileArn, that.instanceProfileArn)
        && Objects.equals(maxProvisionedConcurrency, that.maxProvisionedConcurrency)
        && Objects.equals(maxProvisionedThroughput, that.maxProvisionedThroughput)
        && Objects.equals(minProvisionedConcurrency, that.minProvisionedConcurrency)
        && Objects.equals(minProvisionedThroughput, that.minProvisionedThroughput)
        && Objects.equals(name, that.name)
        && Objects.equals(provisionedModelUnits, that.provisionedModelUnits)
        && Objects.equals(scaleToZeroEnabled, that.scaleToZeroEnabled)
        && Objects.equals(workloadSize, that.workloadSize)
        && Objects.equals(workloadType, that.workloadType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        entityName,
        entityVersion,
        environmentVars,
        externalModel,
        instanceProfileArn,
        maxProvisionedConcurrency,
        maxProvisionedThroughput,
        minProvisionedConcurrency,
        minProvisionedThroughput,
        name,
        provisionedModelUnits,
        scaleToZeroEnabled,
        workloadSize,
        workloadType);
  }

  @Override
  public String toString() {
    return new ToStringer(ServedEntityInput.class)
        .add("entityName", entityName)
        .add("entityVersion", entityVersion)
        .add("environmentVars", environmentVars)
        .add("externalModel", externalModel)
        .add("instanceProfileArn", instanceProfileArn)
        .add("maxProvisionedConcurrency", maxProvisionedConcurrency)
        .add("maxProvisionedThroughput", maxProvisionedThroughput)
        .add("minProvisionedConcurrency", minProvisionedConcurrency)
        .add("minProvisionedThroughput", minProvisionedThroughput)
        .add("name", name)
        .add("provisionedModelUnits", provisionedModelUnits)
        .add("scaleToZeroEnabled", scaleToZeroEnabled)
        .add("workloadSize", workloadSize)
        .add("workloadType", workloadType)
        .toString();
  }

  ServedEntityInputPb toPb() {
    ServedEntityInputPb pb = new ServedEntityInputPb();
    pb.setEntityName(entityName);
    pb.setEntityVersion(entityVersion);
    pb.setEnvironmentVars(environmentVars);
    pb.setExternalModel(externalModel);
    pb.setInstanceProfileArn(instanceProfileArn);
    pb.setMaxProvisionedConcurrency(maxProvisionedConcurrency);
    pb.setMaxProvisionedThroughput(maxProvisionedThroughput);
    pb.setMinProvisionedConcurrency(minProvisionedConcurrency);
    pb.setMinProvisionedThroughput(minProvisionedThroughput);
    pb.setName(name);
    pb.setProvisionedModelUnits(provisionedModelUnits);
    pb.setScaleToZeroEnabled(scaleToZeroEnabled);
    pb.setWorkloadSize(workloadSize);
    pb.setWorkloadType(workloadType);

    return pb;
  }

  static ServedEntityInput fromPb(ServedEntityInputPb pb) {
    ServedEntityInput model = new ServedEntityInput();
    model.setEntityName(pb.getEntityName());
    model.setEntityVersion(pb.getEntityVersion());
    model.setEnvironmentVars(pb.getEnvironmentVars());
    model.setExternalModel(pb.getExternalModel());
    model.setInstanceProfileArn(pb.getInstanceProfileArn());
    model.setMaxProvisionedConcurrency(pb.getMaxProvisionedConcurrency());
    model.setMaxProvisionedThroughput(pb.getMaxProvisionedThroughput());
    model.setMinProvisionedConcurrency(pb.getMinProvisionedConcurrency());
    model.setMinProvisionedThroughput(pb.getMinProvisionedThroughput());
    model.setName(pb.getName());
    model.setProvisionedModelUnits(pb.getProvisionedModelUnits());
    model.setScaleToZeroEnabled(pb.getScaleToZeroEnabled());
    model.setWorkloadSize(pb.getWorkloadSize());
    model.setWorkloadType(pb.getWorkloadType());

    return model;
  }

  public static class ServedEntityInputSerializer extends JsonSerializer<ServedEntityInput> {
    @Override
    public void serialize(ServedEntityInput value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ServedEntityInputPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ServedEntityInputDeserializer extends JsonDeserializer<ServedEntityInput> {
    @Override
    public ServedEntityInput deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ServedEntityInputPb pb = mapper.readValue(p, ServedEntityInputPb.class);
      return ServedEntityInput.fromPb(pb);
    }
  }
}
