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

/** List external locations */
@Generated
@JsonSerialize(using = ListExternalLocationsRequest.ListExternalLocationsRequestSerializer.class)
@JsonDeserialize(
    using = ListExternalLocationsRequest.ListExternalLocationsRequestDeserializer.class)
public class ListExternalLocationsRequest {
  /**
   * Whether to include external locations in the response for which the principal can only access
   * selective metadata for
   */
  private Boolean includeBrowse;

  /**
   * Maximum number of external locations to return. If not set, all the external locations are
   * returned (not recommended). - when set to a value greater than 0, the page length is the
   * minimum of this value and a server configured value; - when set to 0, the page length is set to
   * a server configured value (recommended); - when set to a value less than 0, an invalid
   * parameter error is returned;
   */
  private Long maxResults;

  /** Opaque pagination token to go to next page based on previous query. */
  private String pageToken;

  public ListExternalLocationsRequest setIncludeBrowse(Boolean includeBrowse) {
    this.includeBrowse = includeBrowse;
    return this;
  }

  public Boolean getIncludeBrowse() {
    return includeBrowse;
  }

  public ListExternalLocationsRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListExternalLocationsRequest setPageToken(String pageToken) {
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
    ListExternalLocationsRequest that = (ListExternalLocationsRequest) o;
    return Objects.equals(includeBrowse, that.includeBrowse)
        && Objects.equals(maxResults, that.maxResults)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeBrowse, maxResults, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListExternalLocationsRequest.class)
        .add("includeBrowse", includeBrowse)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .toString();
  }

  ListExternalLocationsRequestPb toPb() {
    ListExternalLocationsRequestPb pb = new ListExternalLocationsRequestPb();
    pb.setIncludeBrowse(includeBrowse);
    pb.setMaxResults(maxResults);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListExternalLocationsRequest fromPb(ListExternalLocationsRequestPb pb) {
    ListExternalLocationsRequest model = new ListExternalLocationsRequest();
    model.setIncludeBrowse(pb.getIncludeBrowse());
    model.setMaxResults(pb.getMaxResults());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListExternalLocationsRequestSerializer
      extends JsonSerializer<ListExternalLocationsRequest> {
    @Override
    public void serialize(
        ListExternalLocationsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListExternalLocationsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListExternalLocationsRequestDeserializer
      extends JsonDeserializer<ListExternalLocationsRequest> {
    @Override
    public ListExternalLocationsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListExternalLocationsRequestPb pb = mapper.readValue(p, ListExternalLocationsRequestPb.class);
      return ListExternalLocationsRequest.fromPb(pb);
    }
  }
}
