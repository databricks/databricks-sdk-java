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

/** Represents a LoggedModel or Registered Model Version input to a Run. */
@Generated
@JsonSerialize(using = ModelInput.ModelInputSerializer.class)
@JsonDeserialize(using = ModelInput.ModelInputDeserializer.class)
public class ModelInput {
  /** The unique identifier of the model. */
  private String modelId;

  public ModelInput setModelId(String modelId) {
    this.modelId = modelId;
    return this;
  }

  public String getModelId() {
    return modelId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ModelInput that = (ModelInput) o;
    return Objects.equals(modelId, that.modelId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelId);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelInput.class).add("modelId", modelId).toString();
  }

  ModelInputPb toPb() {
    ModelInputPb pb = new ModelInputPb();
    pb.setModelId(modelId);

    return pb;
  }

  static ModelInput fromPb(ModelInputPb pb) {
    ModelInput model = new ModelInput();
    model.setModelId(pb.getModelId());

    return model;
  }

  public static class ModelInputSerializer extends JsonSerializer<ModelInput> {
    @Override
    public void serialize(ModelInput value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ModelInputPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ModelInputDeserializer extends JsonDeserializer<ModelInput> {
    @Override
    public ModelInput deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ModelInputPb pb = mapper.readValue(p, ModelInputPb.class);
      return ModelInput.fromPb(pb);
    }
  }
}
