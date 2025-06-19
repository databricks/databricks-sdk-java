// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

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

@Generated
@JsonSerialize(using = RestoreRunsResponse.RestoreRunsResponseSerializer.class)
@JsonDeserialize(using = RestoreRunsResponse.RestoreRunsResponseDeserializer.class)
public class RestoreRunsResponse {
  /** The number of runs restored. */
  private Long runsRestored;

  public RestoreRunsResponse setRunsRestored(Long runsRestored) {
    this.runsRestored = runsRestored;
    return this;
  }

  public Long getRunsRestored() {
    return runsRestored;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RestoreRunsResponse that = (RestoreRunsResponse) o;
    return Objects.equals(runsRestored, that.runsRestored);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runsRestored);
  }

  @Override
  public String toString() {
    return new ToStringer(RestoreRunsResponse.class).add("runsRestored", runsRestored).toString();
  }

  RestoreRunsResponsePb toPb() {
    RestoreRunsResponsePb pb = new RestoreRunsResponsePb();
    pb.setRunsRestored(runsRestored);

    return pb;
  }

  static RestoreRunsResponse fromPb(RestoreRunsResponsePb pb) {
    RestoreRunsResponse model = new RestoreRunsResponse();
    model.setRunsRestored(pb.getRunsRestored());

    return model;
  }

  public static class RestoreRunsResponseSerializer extends JsonSerializer<RestoreRunsResponse> {
    @Override
    public void serialize(RestoreRunsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RestoreRunsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RestoreRunsResponseDeserializer
      extends JsonDeserializer<RestoreRunsResponse> {
    @Override
    public RestoreRunsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RestoreRunsResponsePb pb = mapper.readValue(p, RestoreRunsResponsePb.class);
      return RestoreRunsResponse.fromPb(pb);
    }
  }
}
