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

/** List catalogs */
@Generated
@JsonSerialize(using = ListCatalogsRequest.ListCatalogsRequestSerializer.class)
@JsonDeserialize(using = ListCatalogsRequest.ListCatalogsRequestDeserializer.class)
public class ListCatalogsRequest {
  /**
   * Whether to include catalogs in the response for which the principal can only access selective
   * metadata for
   */
  private Boolean includeBrowse;

  /**
   * Maximum number of catalogs to return. - when set to 0, the page length is set to a server
   * configured value (recommended); - when set to a value greater than 0, the page length is the
   * minimum of this value and a server configured value; - when set to a value less than 0, an
   * invalid parameter error is returned; - If not set, all valid catalogs are returned (not
   * recommended). - Note: The number of returned catalogs might be less than the specified
   * max_results size, even zero. The only definitive indication that no further catalogs can be
   * fetched is when the next_page_token is unset from the response.
   */
  private Long maxResults;

  /** Opaque pagination token to go to next page based on previous query. */
  private String pageToken;

  public ListCatalogsRequest setIncludeBrowse(Boolean includeBrowse) {
    this.includeBrowse = includeBrowse;
    return this;
  }

  public Boolean getIncludeBrowse() {
    return includeBrowse;
  }

  public ListCatalogsRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListCatalogsRequest setPageToken(String pageToken) {
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
    ListCatalogsRequest that = (ListCatalogsRequest) o;
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
    return new ToStringer(ListCatalogsRequest.class)
        .add("includeBrowse", includeBrowse)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .toString();
  }

  ListCatalogsRequestPb toPb() {
    ListCatalogsRequestPb pb = new ListCatalogsRequestPb();
    pb.setIncludeBrowse(includeBrowse);
    pb.setMaxResults(maxResults);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListCatalogsRequest fromPb(ListCatalogsRequestPb pb) {
    ListCatalogsRequest model = new ListCatalogsRequest();
    model.setIncludeBrowse(pb.getIncludeBrowse());
    model.setMaxResults(pb.getMaxResults());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListCatalogsRequestSerializer extends JsonSerializer<ListCatalogsRequest> {
    @Override
    public void serialize(ListCatalogsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListCatalogsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListCatalogsRequestDeserializer
      extends JsonDeserializer<ListCatalogsRequest> {
    @Override
    public ListCatalogsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListCatalogsRequestPb pb = mapper.readValue(p, ListCatalogsRequestPb.class);
      return ListCatalogsRequest.fromPb(pb);
    }
  }
}
