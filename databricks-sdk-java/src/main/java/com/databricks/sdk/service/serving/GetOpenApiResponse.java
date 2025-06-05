// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

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
import java.io.InputStream;
import java.util.Objects;

@Generated
@JsonSerialize(using = GetOpenApiResponse.GetOpenApiResponseSerializer.class)
@JsonDeserialize(using = GetOpenApiResponse.GetOpenApiResponseDeserializer.class)
public class GetOpenApiResponse {
  /** */
  private InputStream contents;

  public GetOpenApiResponse setContents(InputStream contents) {
    this.contents = contents;
    return this;
  }

  public InputStream getContents() {
    return contents;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetOpenApiResponse that = (GetOpenApiResponse) o;
    return Objects.equals(contents, that.contents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contents);
  }

  @Override
  public String toString() {
    return new ToStringer(GetOpenApiResponse.class).add("contents", contents).toString();
  }

  GetOpenApiResponsePb toPb() {
    GetOpenApiResponsePb pb = new GetOpenApiResponsePb();
    pb.setContents(contents);

    return pb;
  }

  static GetOpenApiResponse fromPb(GetOpenApiResponsePb pb) {
    GetOpenApiResponse model = new GetOpenApiResponse();
    model.setContents(pb.getContents());

    return model;
  }

  public static class GetOpenApiResponseSerializer extends JsonSerializer<GetOpenApiResponse> {
    @Override
    public void serialize(GetOpenApiResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetOpenApiResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetOpenApiResponseDeserializer extends JsonDeserializer<GetOpenApiResponse> {
    @Override
    public GetOpenApiResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetOpenApiResponsePb pb = mapper.readValue(p, GetOpenApiResponsePb.class);
      return GetOpenApiResponse.fromPb(pb);
    }
  }
}
