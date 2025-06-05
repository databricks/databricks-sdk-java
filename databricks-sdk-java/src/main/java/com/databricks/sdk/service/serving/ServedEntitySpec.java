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
@JsonSerialize(using = ServedEntitySpec.ServedEntitySpecSerializer.class)
@JsonDeserialize(using = ServedEntitySpec.ServedEntitySpecDeserializer.class)
public class ServedEntitySpec {
  /** */
  private String entityName;

  /** */
  private String entityVersion;

  /** */
  private ExternalModel externalModel;

  /**
   * All fields are not sensitive as they are hard-coded in the system and made available to
   * customers.
   */
  private FoundationModel foundationModel;

  /** */
  private String name;

  public ServedEntitySpec setEntityName(String entityName) {
    this.entityName = entityName;
    return this;
  }

  public String getEntityName() {
    return entityName;
  }

  public ServedEntitySpec setEntityVersion(String entityVersion) {
    this.entityVersion = entityVersion;
    return this;
  }

  public String getEntityVersion() {
    return entityVersion;
  }

  public ServedEntitySpec setExternalModel(ExternalModel externalModel) {
    this.externalModel = externalModel;
    return this;
  }

  public ExternalModel getExternalModel() {
    return externalModel;
  }

  public ServedEntitySpec setFoundationModel(FoundationModel foundationModel) {
    this.foundationModel = foundationModel;
    return this;
  }

  public FoundationModel getFoundationModel() {
    return foundationModel;
  }

  public ServedEntitySpec setName(String name) {
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
    ServedEntitySpec that = (ServedEntitySpec) o;
    return Objects.equals(entityName, that.entityName)
        && Objects.equals(entityVersion, that.entityVersion)
        && Objects.equals(externalModel, that.externalModel)
        && Objects.equals(foundationModel, that.foundationModel)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityName, entityVersion, externalModel, foundationModel, name);
  }

  @Override
  public String toString() {
    return new ToStringer(ServedEntitySpec.class)
        .add("entityName", entityName)
        .add("entityVersion", entityVersion)
        .add("externalModel", externalModel)
        .add("foundationModel", foundationModel)
        .add("name", name)
        .toString();
  }

  ServedEntitySpecPb toPb() {
    ServedEntitySpecPb pb = new ServedEntitySpecPb();
    pb.setEntityName(entityName);
    pb.setEntityVersion(entityVersion);
    pb.setExternalModel(externalModel);
    pb.setFoundationModel(foundationModel);
    pb.setName(name);

    return pb;
  }

  static ServedEntitySpec fromPb(ServedEntitySpecPb pb) {
    ServedEntitySpec model = new ServedEntitySpec();
    model.setEntityName(pb.getEntityName());
    model.setEntityVersion(pb.getEntityVersion());
    model.setExternalModel(pb.getExternalModel());
    model.setFoundationModel(pb.getFoundationModel());
    model.setName(pb.getName());

    return model;
  }

  public static class ServedEntitySpecSerializer extends JsonSerializer<ServedEntitySpec> {
    @Override
    public void serialize(ServedEntitySpec value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ServedEntitySpecPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ServedEntitySpecDeserializer extends JsonDeserializer<ServedEntitySpec> {
    @Override
    public ServedEntitySpec deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ServedEntitySpecPb pb = mapper.readValue(p, ServedEntitySpecPb.class);
      return ServedEntitySpec.fromPb(pb);
    }
  }
}
