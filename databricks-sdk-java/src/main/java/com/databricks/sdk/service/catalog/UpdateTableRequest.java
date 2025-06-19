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

/** Update a table owner. */
@Generated
@JsonSerialize(using = UpdateTableRequest.UpdateTableRequestSerializer.class)
@JsonDeserialize(using = UpdateTableRequest.UpdateTableRequestDeserializer.class)
public class UpdateTableRequest {
  /** Full name of the table. */
  private String fullName;

  /** */
  private String owner;

  public UpdateTableRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public UpdateTableRequest setOwner(String owner) {
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
    UpdateTableRequest that = (UpdateTableRequest) o;
    return Objects.equals(fullName, that.fullName) && Objects.equals(owner, that.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, owner);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateTableRequest.class)
        .add("fullName", fullName)
        .add("owner", owner)
        .toString();
  }

  UpdateTableRequestPb toPb() {
    UpdateTableRequestPb pb = new UpdateTableRequestPb();
    pb.setFullName(fullName);
    pb.setOwner(owner);

    return pb;
  }

  static UpdateTableRequest fromPb(UpdateTableRequestPb pb) {
    UpdateTableRequest model = new UpdateTableRequest();
    model.setFullName(pb.getFullName());
    model.setOwner(pb.getOwner());

    return model;
  }

  public static class UpdateTableRequestSerializer extends JsonSerializer<UpdateTableRequest> {
    @Override
    public void serialize(UpdateTableRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateTableRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateTableRequestDeserializer extends JsonDeserializer<UpdateTableRequest> {
    @Override
    public UpdateTableRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateTableRequestPb pb = mapper.readValue(p, UpdateTableRequestPb.class);
      return UpdateTableRequest.fromPb(pb);
    }
  }
}
