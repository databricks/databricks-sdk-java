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

/** List installations for a listing */
@Generated
@JsonSerialize(using = ListInstallationsRequest.ListInstallationsRequestSerializer.class)
@JsonDeserialize(using = ListInstallationsRequest.ListInstallationsRequestDeserializer.class)
public class ListInstallationsRequest {
  /** */
  private String listingId;

  /** */
  private Long pageSize;

  /** */
  private String pageToken;

  public ListInstallationsRequest setListingId(String listingId) {
    this.listingId = listingId;
    return this;
  }

  public String getListingId() {
    return listingId;
  }

  public ListInstallationsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListInstallationsRequest setPageToken(String pageToken) {
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
    ListInstallationsRequest that = (ListInstallationsRequest) o;
    return Objects.equals(listingId, that.listingId)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listingId, pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListInstallationsRequest.class)
        .add("listingId", listingId)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }

  ListInstallationsRequestPb toPb() {
    ListInstallationsRequestPb pb = new ListInstallationsRequestPb();
    pb.setListingId(listingId);
    pb.setPageSize(pageSize);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListInstallationsRequest fromPb(ListInstallationsRequestPb pb) {
    ListInstallationsRequest model = new ListInstallationsRequest();
    model.setListingId(pb.getListingId());
    model.setPageSize(pb.getPageSize());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListInstallationsRequestSerializer
      extends JsonSerializer<ListInstallationsRequest> {
    @Override
    public void serialize(
        ListInstallationsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListInstallationsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListInstallationsRequestDeserializer
      extends JsonDeserializer<ListInstallationsRequest> {
    @Override
    public ListInstallationsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListInstallationsRequestPb pb = mapper.readValue(p, ListInstallationsRequestPb.class);
      return ListInstallationsRequest.fromPb(pb);
    }
  }
}
