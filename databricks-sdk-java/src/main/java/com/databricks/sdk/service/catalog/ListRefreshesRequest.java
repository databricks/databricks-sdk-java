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

/** List refreshes */
@Generated
@JsonSerialize(using = ListRefreshesRequest.ListRefreshesRequestSerializer.class)
@JsonDeserialize(using = ListRefreshesRequest.ListRefreshesRequestDeserializer.class)
public class ListRefreshesRequest {
  /** Full name of the table. */
  private String tableName;

  public ListRefreshesRequest setTableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  public String getTableName() {
    return tableName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListRefreshesRequest that = (ListRefreshesRequest) o;
    return Objects.equals(tableName, that.tableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableName);
  }

  @Override
  public String toString() {
    return new ToStringer(ListRefreshesRequest.class).add("tableName", tableName).toString();
  }

  ListRefreshesRequestPb toPb() {
    ListRefreshesRequestPb pb = new ListRefreshesRequestPb();
    pb.setTableName(tableName);

    return pb;
  }

  static ListRefreshesRequest fromPb(ListRefreshesRequestPb pb) {
    ListRefreshesRequest model = new ListRefreshesRequest();
    model.setTableName(pb.getTableName());

    return model;
  }

  public static class ListRefreshesRequestSerializer extends JsonSerializer<ListRefreshesRequest> {
    @Override
    public void serialize(
        ListRefreshesRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListRefreshesRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListRefreshesRequestDeserializer
      extends JsonDeserializer<ListRefreshesRequest> {
    @Override
    public ListRefreshesRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListRefreshesRequestPb pb = mapper.readValue(p, ListRefreshesRequestPb.class);
      return ListRefreshesRequest.fromPb(pb);
    }
  }
}
