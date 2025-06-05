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
@JsonSerialize(using = CreateLoggedModelRequest.CreateLoggedModelRequestSerializer.class)
@JsonDeserialize(using = CreateLoggedModelRequest.CreateLoggedModelRequestDeserializer.class)
public class CreateLoggedModelRequest {
  /** The ID of the experiment that owns the model. */
  private String experimentId;

  /** The type of the model, such as ``"Agent"``, ``"Classifier"``, ``"LLM"``. */
  private String modelType;

  /** The name of the model (optional). If not specified one will be generated. */
  private String name;

  /** Parameters attached to the model. */
  private Collection<LoggedModelParameter> params;

  /** The ID of the run that created the model. */
  private String sourceRunId;

  /** Tags attached to the model. */
  private Collection<LoggedModelTag> tags;

  public CreateLoggedModelRequest setExperimentId(String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

  public String getExperimentId() {
    return experimentId;
  }

  public CreateLoggedModelRequest setModelType(String modelType) {
    this.modelType = modelType;
    return this;
  }

  public String getModelType() {
    return modelType;
  }

  public CreateLoggedModelRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateLoggedModelRequest setParams(Collection<LoggedModelParameter> params) {
    this.params = params;
    return this;
  }

  public Collection<LoggedModelParameter> getParams() {
    return params;
  }

  public CreateLoggedModelRequest setSourceRunId(String sourceRunId) {
    this.sourceRunId = sourceRunId;
    return this;
  }

  public String getSourceRunId() {
    return sourceRunId;
  }

  public CreateLoggedModelRequest setTags(Collection<LoggedModelTag> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<LoggedModelTag> getTags() {
    return tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateLoggedModelRequest that = (CreateLoggedModelRequest) o;
    return Objects.equals(experimentId, that.experimentId)
        && Objects.equals(modelType, that.modelType)
        && Objects.equals(name, that.name)
        && Objects.equals(params, that.params)
        && Objects.equals(sourceRunId, that.sourceRunId)
        && Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experimentId, modelType, name, params, sourceRunId, tags);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateLoggedModelRequest.class)
        .add("experimentId", experimentId)
        .add("modelType", modelType)
        .add("name", name)
        .add("params", params)
        .add("sourceRunId", sourceRunId)
        .add("tags", tags)
        .toString();
  }

  CreateLoggedModelRequestPb toPb() {
    CreateLoggedModelRequestPb pb = new CreateLoggedModelRequestPb();
    pb.setExperimentId(experimentId);
    pb.setModelType(modelType);
    pb.setName(name);
    pb.setParams(params);
    pb.setSourceRunId(sourceRunId);
    pb.setTags(tags);

    return pb;
  }

  static CreateLoggedModelRequest fromPb(CreateLoggedModelRequestPb pb) {
    CreateLoggedModelRequest model = new CreateLoggedModelRequest();
    model.setExperimentId(pb.getExperimentId());
    model.setModelType(pb.getModelType());
    model.setName(pb.getName());
    model.setParams(pb.getParams());
    model.setSourceRunId(pb.getSourceRunId());
    model.setTags(pb.getTags());

    return model;
  }

  public static class CreateLoggedModelRequestSerializer
      extends JsonSerializer<CreateLoggedModelRequest> {
    @Override
    public void serialize(
        CreateLoggedModelRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateLoggedModelRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateLoggedModelRequestDeserializer
      extends JsonDeserializer<CreateLoggedModelRequest> {
    @Override
    public CreateLoggedModelRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateLoggedModelRequestPb pb = mapper.readValue(p, CreateLoggedModelRequestPb.class);
      return CreateLoggedModelRequest.fromPb(pb);
    }
  }
}
