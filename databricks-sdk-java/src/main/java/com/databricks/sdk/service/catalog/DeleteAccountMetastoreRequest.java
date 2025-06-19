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

/** Delete a metastore */
@Generated
@JsonSerialize(using = DeleteAccountMetastoreRequest.DeleteAccountMetastoreRequestSerializer.class)
@JsonDeserialize(
    using = DeleteAccountMetastoreRequest.DeleteAccountMetastoreRequestDeserializer.class)
public class DeleteAccountMetastoreRequest {
  /** Force deletion even if the metastore is not empty. Default is false. */
  private Boolean force;

  /** Unity Catalog metastore ID */
  private String metastoreId;

  public DeleteAccountMetastoreRequest setForce(Boolean force) {
    this.force = force;
    return this;
  }

  public Boolean getForce() {
    return force;
  }

  public DeleteAccountMetastoreRequest setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteAccountMetastoreRequest that = (DeleteAccountMetastoreRequest) o;
    return Objects.equals(force, that.force) && Objects.equals(metastoreId, that.metastoreId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(force, metastoreId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteAccountMetastoreRequest.class)
        .add("force", force)
        .add("metastoreId", metastoreId)
        .toString();
  }

  DeleteAccountMetastoreRequestPb toPb() {
    DeleteAccountMetastoreRequestPb pb = new DeleteAccountMetastoreRequestPb();
    pb.setForce(force);
    pb.setMetastoreId(metastoreId);

    return pb;
  }

  static DeleteAccountMetastoreRequest fromPb(DeleteAccountMetastoreRequestPb pb) {
    DeleteAccountMetastoreRequest model = new DeleteAccountMetastoreRequest();
    model.setForce(pb.getForce());
    model.setMetastoreId(pb.getMetastoreId());

    return model;
  }

  public static class DeleteAccountMetastoreRequestSerializer
      extends JsonSerializer<DeleteAccountMetastoreRequest> {
    @Override
    public void serialize(
        DeleteAccountMetastoreRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteAccountMetastoreRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteAccountMetastoreRequestDeserializer
      extends JsonDeserializer<DeleteAccountMetastoreRequest> {
    @Override
    public DeleteAccountMetastoreRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteAccountMetastoreRequestPb pb =
          mapper.readValue(p, DeleteAccountMetastoreRequestPb.class);
      return DeleteAccountMetastoreRequest.fromPb(pb);
    }
  }
}
