// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

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
@JsonSerialize(using = GenieListSpacesResponse.GenieListSpacesResponseSerializer.class)
@JsonDeserialize(using = GenieListSpacesResponse.GenieListSpacesResponseDeserializer.class)
public class GenieListSpacesResponse {
  /** Token to get the next page of results */
  private String nextPageToken;

  /** List of Genie spaces */
  private Collection<GenieSpace> spaces;

  public GenieListSpacesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public GenieListSpacesResponse setSpaces(Collection<GenieSpace> spaces) {
    this.spaces = spaces;
    return this;
  }

  public Collection<GenieSpace> getSpaces() {
    return spaces;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieListSpacesResponse that = (GenieListSpacesResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken) && Objects.equals(spaces, that.spaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, spaces);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieListSpacesResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("spaces", spaces)
        .toString();
  }

  GenieListSpacesResponsePb toPb() {
    GenieListSpacesResponsePb pb = new GenieListSpacesResponsePb();
    pb.setNextPageToken(nextPageToken);
    pb.setSpaces(spaces);

    return pb;
  }

  static GenieListSpacesResponse fromPb(GenieListSpacesResponsePb pb) {
    GenieListSpacesResponse model = new GenieListSpacesResponse();
    model.setNextPageToken(pb.getNextPageToken());
    model.setSpaces(pb.getSpaces());

    return model;
  }

  public static class GenieListSpacesResponseSerializer
      extends JsonSerializer<GenieListSpacesResponse> {
    @Override
    public void serialize(
        GenieListSpacesResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GenieListSpacesResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GenieListSpacesResponseDeserializer
      extends JsonDeserializer<GenieListSpacesResponse> {
    @Override
    public GenieListSpacesResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GenieListSpacesResponsePb pb = mapper.readValue(p, GenieListSpacesResponsePb.class);
      return GenieListSpacesResponse.fromPb(pb);
    }
  }
}
