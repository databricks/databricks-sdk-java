// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

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

/** List all installations */
@Generated
@JsonSerialize(using = ListAllInstallationsRequest.ListAllInstallationsRequestSerializer.class)
@JsonDeserialize(using = ListAllInstallationsRequest.ListAllInstallationsRequestDeserializer.class)
public class ListAllInstallationsRequest {
  /** */
  private Long pageSize;

  /** */
  private String pageToken;

  public ListAllInstallationsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListAllInstallationsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListAllInstallationsRequest that = (ListAllInstallationsRequest) o;
    return Objects.equals(pageSize, that.pageSize) && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListAllInstallationsRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }

  ListAllInstallationsRequestPb toPb() {
    ListAllInstallationsRequestPb pb = new ListAllInstallationsRequestPb();
    pb.setPageSize(pageSize);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListAllInstallationsRequest fromPb(ListAllInstallationsRequestPb pb) {
    ListAllInstallationsRequest model = new ListAllInstallationsRequest();
    model.setPageSize(pb.getPageSize());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListAllInstallationsRequestSerializer
      extends JsonSerializer<ListAllInstallationsRequest> {
    @Override
    public void serialize(
        ListAllInstallationsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListAllInstallationsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListAllInstallationsRequestDeserializer
      extends JsonDeserializer<ListAllInstallationsRequest> {
    @Override
    public ListAllInstallationsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListAllInstallationsRequestPb pb = mapper.readValue(p, ListAllInstallationsRequestPb.class);
      return ListAllInstallationsRequest.fromPb(pb);
    }
  }
}
