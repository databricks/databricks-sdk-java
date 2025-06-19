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
@JsonSerialize(using = PtServedModel.PtServedModelSerializer.class)
@JsonDeserialize(using = PtServedModel.PtServedModelDeserializer.class)
public class PtServedModel {
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
   * The name of a served entity. It must be unique across an endpoint. A served entity name can
   * consist of alphanumeric characters, dashes, and underscores. If not specified for an external
   * model, this field defaults to external_model.name, with '.' and ':' replaced with '-', and if
   * not specified for other entities, it defaults to entity_name-entity_version.
   */
  private String name;

  /** The number of model units to be provisioned. */
  private Long provisionedModelUnits;

  public PtServedModel setEntityName(String entityName) {
    this.entityName = entityName;
    return this;
  }

  public String getEntityName() {
    return entityName;
  }

  public PtServedModel setEntityVersion(String entityVersion) {
    this.entityVersion = entityVersion;
    return this;
  }

  public String getEntityVersion() {
    return entityVersion;
  }

  public PtServedModel setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public PtServedModel setProvisionedModelUnits(Long provisionedModelUnits) {
    this.provisionedModelUnits = provisionedModelUnits;
    return this;
  }

  public Long getProvisionedModelUnits() {
    return provisionedModelUnits;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PtServedModel that = (PtServedModel) o;
    return Objects.equals(entityName, that.entityName)
        && Objects.equals(entityVersion, that.entityVersion)
        && Objects.equals(name, that.name)
        && Objects.equals(provisionedModelUnits, that.provisionedModelUnits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityName, entityVersion, name, provisionedModelUnits);
  }

  @Override
  public String toString() {
    return new ToStringer(PtServedModel.class)
        .add("entityName", entityName)
        .add("entityVersion", entityVersion)
        .add("name", name)
        .add("provisionedModelUnits", provisionedModelUnits)
        .toString();
  }

  PtServedModelPb toPb() {
    PtServedModelPb pb = new PtServedModelPb();
    pb.setEntityName(entityName);
    pb.setEntityVersion(entityVersion);
    pb.setName(name);
    pb.setProvisionedModelUnits(provisionedModelUnits);

    return pb;
  }

  static PtServedModel fromPb(PtServedModelPb pb) {
    PtServedModel model = new PtServedModel();
    model.setEntityName(pb.getEntityName());
    model.setEntityVersion(pb.getEntityVersion());
    model.setName(pb.getName());
    model.setProvisionedModelUnits(pb.getProvisionedModelUnits());

    return model;
  }

  public static class PtServedModelSerializer extends JsonSerializer<PtServedModel> {
    @Override
    public void serialize(PtServedModel value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PtServedModelPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PtServedModelDeserializer extends JsonDeserializer<PtServedModel> {
    @Override
    public PtServedModel deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PtServedModelPb pb = mapper.readValue(p, PtServedModelPb.class);
      return PtServedModel.fromPb(pb);
    }
  }
}
