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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = ListCatalogsResponse.ListCatalogsResponseSerializer.class)
@JsonDeserialize(using = ListCatalogsResponse.ListCatalogsResponseDeserializer.class)
public class ListCatalogsResponse {
  /** An array of catalog information objects. */
  private Collection<CatalogInfo> catalogs;

  /**
   * Opaque token to retrieve the next page of results. Absent if there are no more pages.
   * __page_token__ should be set to this value for the next request (for the next page of results).
   */
  private String nextPageToken;

  public ListCatalogsResponse setCatalogs(Collection<CatalogInfo> catalogs) {
    this.catalogs = catalogs;
    return this;
  }

  public Collection<CatalogInfo> getCatalogs() {
    return catalogs;
  }

  public ListCatalogsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListCatalogsResponse that = (ListCatalogsResponse) o;
    return Objects.equals(catalogs, that.catalogs)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogs, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListCatalogsResponse.class)
        .add("catalogs", catalogs)
        .add("nextPageToken", nextPageToken)
        .toString();
  }

  ListCatalogsResponsePb toPb() {
    ListCatalogsResponsePb pb = new ListCatalogsResponsePb();
    pb.setCatalogs(catalogs);
    pb.setNextPageToken(nextPageToken);

    return pb;
  }

  static ListCatalogsResponse fromPb(ListCatalogsResponsePb pb) {
    ListCatalogsResponse model = new ListCatalogsResponse();
    model.setCatalogs(pb.getCatalogs());
    model.setNextPageToken(pb.getNextPageToken());

    return model;
  }

  public static class ListCatalogsResponseSerializer extends JsonSerializer<ListCatalogsResponse> {
    @Override
    public void serialize(
        ListCatalogsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListCatalogsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListCatalogsResponseDeserializer
      extends JsonDeserializer<ListCatalogsResponse> {
    @Override
    public ListCatalogsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListCatalogsResponsePb pb = mapper.readValue(p, ListCatalogsResponsePb.class);
      return ListCatalogsResponse.fromPb(pb);
    }
  }
}
