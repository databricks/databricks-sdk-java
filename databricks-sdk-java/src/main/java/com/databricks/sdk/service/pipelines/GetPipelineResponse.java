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
import java.util.Objects;

@Generated
@JsonSerialize(using = GetPipelineResponse.GetPipelineResponseSerializer.class)
@JsonDeserialize(using = GetPipelineResponse.GetPipelineResponseDeserializer.class)
public class GetPipelineResponse {
  /** An optional message detailing the cause of the pipeline state. */
  private String cause;

  /** The ID of the cluster that the pipeline is running on. */
  private String clusterId;

  /** The username of the pipeline creator. */
  private String creatorUserName;

  /** Serverless budget policy ID of this pipeline. */
  private String effectiveBudgetPolicyId;

  /** The health of a pipeline. */
  private GetPipelineResponseHealth health;

  /** The last time the pipeline settings were modified or created. */
  private Long lastModified;

  /** Status of the latest updates for the pipeline. Ordered with the newest update first. */
  private Collection<UpdateStateInfo> latestUpdates;

  /** A human friendly identifier for the pipeline, taken from the `spec`. */
  private String name;

  /** The ID of the pipeline. */
  private String pipelineId;

  /** Username of the user that the pipeline will run on behalf of. */
  private String runAsUserName;

  /** The pipeline specification. This field is not returned when called by `ListPipelines`. */
  private PipelineSpec spec;

  /** The pipeline state. */
  private PipelineState state;

  public GetPipelineResponse setCause(String cause) {
    this.cause = cause;
    return this;
  }

  public String getCause() {
    return cause;
  }

  public GetPipelineResponse setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public GetPipelineResponse setCreatorUserName(String creatorUserName) {
    this.creatorUserName = creatorUserName;
    return this;
  }

  public String getCreatorUserName() {
    return creatorUserName;
  }

  public GetPipelineResponse setEffectiveBudgetPolicyId(String effectiveBudgetPolicyId) {
    this.effectiveBudgetPolicyId = effectiveBudgetPolicyId;
    return this;
  }

  public String getEffectiveBudgetPolicyId() {
    return effectiveBudgetPolicyId;
  }

  public GetPipelineResponse setHealth(GetPipelineResponseHealth health) {
    this.health = health;
    return this;
  }

  public GetPipelineResponseHealth getHealth() {
    return health;
  }

  public GetPipelineResponse setLastModified(Long lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  public Long getLastModified() {
    return lastModified;
  }

  public GetPipelineResponse setLatestUpdates(Collection<UpdateStateInfo> latestUpdates) {
    this.latestUpdates = latestUpdates;
    return this;
  }

  public Collection<UpdateStateInfo> getLatestUpdates() {
    return latestUpdates;
  }

  public GetPipelineResponse setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public GetPipelineResponse setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

  public String getPipelineId() {
    return pipelineId;
  }

  public GetPipelineResponse setRunAsUserName(String runAsUserName) {
    this.runAsUserName = runAsUserName;
    return this;
  }

  public String getRunAsUserName() {
    return runAsUserName;
  }

  public GetPipelineResponse setSpec(PipelineSpec spec) {
    this.spec = spec;
    return this;
  }

  public PipelineSpec getSpec() {
    return spec;
  }

  public GetPipelineResponse setState(PipelineState state) {
    this.state = state;
    return this;
  }

  public PipelineState getState() {
    return state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetPipelineResponse that = (GetPipelineResponse) o;
    return Objects.equals(cause, that.cause)
        && Objects.equals(clusterId, that.clusterId)
        && Objects.equals(creatorUserName, that.creatorUserName)
        && Objects.equals(effectiveBudgetPolicyId, that.effectiveBudgetPolicyId)
        && Objects.equals(health, that.health)
        && Objects.equals(lastModified, that.lastModified)
        && Objects.equals(latestUpdates, that.latestUpdates)
        && Objects.equals(name, that.name)
        && Objects.equals(pipelineId, that.pipelineId)
        && Objects.equals(runAsUserName, that.runAsUserName)
        && Objects.equals(spec, that.spec)
        && Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        cause,
        clusterId,
        creatorUserName,
        effectiveBudgetPolicyId,
        health,
        lastModified,
        latestUpdates,
        name,
        pipelineId,
        runAsUserName,
        spec,
        state);
  }

  @Override
  public String toString() {
    return new ToStringer(GetPipelineResponse.class)
        .add("cause", cause)
        .add("clusterId", clusterId)
        .add("creatorUserName", creatorUserName)
        .add("effectiveBudgetPolicyId", effectiveBudgetPolicyId)
        .add("health", health)
        .add("lastModified", lastModified)
        .add("latestUpdates", latestUpdates)
        .add("name", name)
        .add("pipelineId", pipelineId)
        .add("runAsUserName", runAsUserName)
        .add("spec", spec)
        .add("state", state)
        .toString();
  }

  GetPipelineResponsePb toPb() {
    GetPipelineResponsePb pb = new GetPipelineResponsePb();
    pb.setCause(cause);
    pb.setClusterId(clusterId);
    pb.setCreatorUserName(creatorUserName);
    pb.setEffectiveBudgetPolicyId(effectiveBudgetPolicyId);
    pb.setHealth(health);
    pb.setLastModified(lastModified);
    pb.setLatestUpdates(latestUpdates);
    pb.setName(name);
    pb.setPipelineId(pipelineId);
    pb.setRunAsUserName(runAsUserName);
    pb.setSpec(spec);
    pb.setState(state);

    return pb;
  }

  static GetPipelineResponse fromPb(GetPipelineResponsePb pb) {
    GetPipelineResponse model = new GetPipelineResponse();
    model.setCause(pb.getCause());
    model.setClusterId(pb.getClusterId());
    model.setCreatorUserName(pb.getCreatorUserName());
    model.setEffectiveBudgetPolicyId(pb.getEffectiveBudgetPolicyId());
    model.setHealth(pb.getHealth());
    model.setLastModified(pb.getLastModified());
    model.setLatestUpdates(pb.getLatestUpdates());
    model.setName(pb.getName());
    model.setPipelineId(pb.getPipelineId());
    model.setRunAsUserName(pb.getRunAsUserName());
    model.setSpec(pb.getSpec());
    model.setState(pb.getState());

    return model;
  }

  public static class GetPipelineResponseSerializer extends JsonSerializer<GetPipelineResponse> {
    @Override
    public void serialize(GetPipelineResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetPipelineResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetPipelineResponseDeserializer
      extends JsonDeserializer<GetPipelineResponse> {
    @Override
    public GetPipelineResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetPipelineResponsePb pb = mapper.readValue(p, GetPipelineResponsePb.class);
      return GetPipelineResponse.fromPb(pb);
    }
  }
}
