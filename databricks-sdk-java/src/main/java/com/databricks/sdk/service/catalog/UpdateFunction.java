// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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
@JsonSerialize(using = UpdateFunction.UpdateFunctionSerializer.class)
@JsonDeserialize(using = UpdateFunction.UpdateFunctionDeserializer.class)
public class UpdateFunction {
  /**
   * The fully-qualified name of the function (of the form
   * __catalog_name__.__schema_name__.__function__name__).
   */
  private String name;

  /** Username of current owner of function. */
  private String owner;

  public UpdateFunction setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateFunction setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateFunction that = (UpdateFunction) o;
    return Objects.equals(name, that.name) && Objects.equals(owner, that.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, owner);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateFunction.class).add("name", name).add("owner", owner).toString();
  }

  UpdateFunctionPb toPb() {
    UpdateFunctionPb pb = new UpdateFunctionPb();
    pb.setName(name);
    pb.setOwner(owner);

    return pb;
  }

  static UpdateFunction fromPb(UpdateFunctionPb pb) {
    UpdateFunction model = new UpdateFunction();
    model.setName(pb.getName());
    model.setOwner(pb.getOwner());

    return model;
  }

  public static class UpdateFunctionSerializer extends JsonSerializer<UpdateFunction> {
    @Override
    public void serialize(UpdateFunction value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateFunctionPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateFunctionDeserializer extends JsonDeserializer<UpdateFunction> {
    @Override
    public UpdateFunction deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateFunctionPb pb = mapper.readValue(p, UpdateFunctionPb.class);
      return UpdateFunction.fromPb(pb);
    }
  }
}
