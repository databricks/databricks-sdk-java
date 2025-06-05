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
import java.util.Objects;

@Generated
@JsonSerialize(using = ServedModelSpec.ServedModelSpecSerializer.class)
@JsonDeserialize(using = ServedModelSpec.ServedModelSpecDeserializer.class)
public class ServedModelSpec {
  /** Only one of model_name and entity_name should be populated */
  private String modelName;

  /** Only one of model_version and entity_version should be populated */
  private String modelVersion;

  /** */
  private String name;

  public ServedModelSpec setModelName(String modelName) {
    this.modelName = modelName;
    return this;
  }

  public String getModelName() {
    return modelName;
  }

  public ServedModelSpec setModelVersion(String modelVersion) {
    this.modelVersion = modelVersion;
    return this;
  }

  public String getModelVersion() {
    return modelVersion;
  }

  public ServedModelSpec setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ServedModelSpec that = (ServedModelSpec) o;
    return Objects.equals(modelName, that.modelName)
        && Objects.equals(modelVersion, that.modelVersion)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelName, modelVersion, name);
  }

  @Override
  public String toString() {
    return new ToStringer(ServedModelSpec.class)
        .add("modelName", modelName)
        .add("modelVersion", modelVersion)
        .add("name", name)
        .toString();
  }

  ServedModelSpecPb toPb() {
    ServedModelSpecPb pb = new ServedModelSpecPb();
    pb.setModelName(modelName);
    pb.setModelVersion(modelVersion);
    pb.setName(name);

    return pb;
  }

  static ServedModelSpec fromPb(ServedModelSpecPb pb) {
    ServedModelSpec model = new ServedModelSpec();
    model.setModelName(pb.getModelName());
    model.setModelVersion(pb.getModelVersion());
    model.setName(pb.getName());

    return model;
  }

  public static class ServedModelSpecSerializer extends JsonSerializer<ServedModelSpec> {
    @Override
    public void serialize(ServedModelSpec value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ServedModelSpecPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ServedModelSpecDeserializer extends JsonDeserializer<ServedModelSpec> {
    @Override
    public ServedModelSpec deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ServedModelSpecPb pb = mapper.readValue(p, ServedModelSpecPb.class);
      return ServedModelSpec.fromPb(pb);
    }
  }
}
