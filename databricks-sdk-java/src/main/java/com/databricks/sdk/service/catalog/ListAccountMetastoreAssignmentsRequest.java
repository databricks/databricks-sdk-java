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

/** Get all workspaces assigned to a metastore */
@Generated
@JsonSerialize(
    using =
        ListAccountMetastoreAssignmentsRequest.ListAccountMetastoreAssignmentsRequestSerializer
            .class)
@JsonDeserialize(
    using =
        ListAccountMetastoreAssignmentsRequest.ListAccountMetastoreAssignmentsRequestDeserializer
            .class)
public class ListAccountMetastoreAssignmentsRequest {
  /** Unity Catalog metastore ID */
  private String metastoreId;

  public ListAccountMetastoreAssignmentsRequest setMetastoreId(String metastoreId) {
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
    ListAccountMetastoreAssignmentsRequest that = (ListAccountMetastoreAssignmentsRequest) o;
    return Objects.equals(metastoreId, that.metastoreId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metastoreId);
  }

  @Override
  public String toString() {
    return new ToStringer(ListAccountMetastoreAssignmentsRequest.class)
        .add("metastoreId", metastoreId)
        .toString();
  }

  ListAccountMetastoreAssignmentsRequestPb toPb() {
    ListAccountMetastoreAssignmentsRequestPb pb = new ListAccountMetastoreAssignmentsRequestPb();
    pb.setMetastoreId(metastoreId);

    return pb;
  }

  static ListAccountMetastoreAssignmentsRequest fromPb(
      ListAccountMetastoreAssignmentsRequestPb pb) {
    ListAccountMetastoreAssignmentsRequest model = new ListAccountMetastoreAssignmentsRequest();
    model.setMetastoreId(pb.getMetastoreId());

    return model;
  }

  public static class ListAccountMetastoreAssignmentsRequestSerializer
      extends JsonSerializer<ListAccountMetastoreAssignmentsRequest> {
    @Override
    public void serialize(
        ListAccountMetastoreAssignmentsRequest value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      ListAccountMetastoreAssignmentsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListAccountMetastoreAssignmentsRequestDeserializer
      extends JsonDeserializer<ListAccountMetastoreAssignmentsRequest> {
    @Override
    public ListAccountMetastoreAssignmentsRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListAccountMetastoreAssignmentsRequestPb pb =
          mapper.readValue(p, ListAccountMetastoreAssignmentsRequestPb.class);
      return ListAccountMetastoreAssignmentsRequest.fromPb(pb);
    }
  }
}
