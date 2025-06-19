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
import java.util.Objects;

/** Represents a LoggedModel output of a Run. */
@Generated
@JsonSerialize(using = ModelOutput.ModelOutputSerializer.class)
@JsonDeserialize(using = ModelOutput.ModelOutputDeserializer.class)
public class ModelOutput {
  /** The unique identifier of the model. */
  private String modelId;

  /** The step at which the model was produced. */
  private Long step;

  public ModelOutput setModelId(String modelId) {
    this.modelId = modelId;
    return this;
  }

  public String getModelId() {
    return modelId;
  }

  public ModelOutput setStep(Long step) {
    this.step = step;
    return this;
  }

  public Long getStep() {
    return step;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ModelOutput that = (ModelOutput) o;
    return Objects.equals(modelId, that.modelId) && Objects.equals(step, that.step);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelId, step);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelOutput.class).add("modelId", modelId).add("step", step).toString();
  }

  ModelOutputPb toPb() {
    ModelOutputPb pb = new ModelOutputPb();
    pb.setModelId(modelId);
    pb.setStep(step);

    return pb;
  }

  static ModelOutput fromPb(ModelOutputPb pb) {
    ModelOutput model = new ModelOutput();
    model.setModelId(pb.getModelId());
    model.setStep(pb.getStep());

    return model;
  }

  public static class ModelOutputSerializer extends JsonSerializer<ModelOutput> {
    @Override
    public void serialize(ModelOutput value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ModelOutputPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ModelOutputDeserializer extends JsonDeserializer<ModelOutput> {
    @Override
    public ModelOutput deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ModelOutputPb pb = mapper.readValue(p, ModelOutputPb.class);
      return ModelOutput.fromPb(pb);
    }
  }
}
