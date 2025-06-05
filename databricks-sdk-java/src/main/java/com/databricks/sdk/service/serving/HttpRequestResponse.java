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
@JsonSerialize(using = HttpRequestResponse.HttpRequestResponseSerializer.class)
@JsonDeserialize(using = HttpRequestResponse.HttpRequestResponseDeserializer.class)
public class HttpRequestResponse {
  /** */
  private InputStream contents;

  public HttpRequestResponse setContents(InputStream contents) {
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
    HttpRequestResponse that = (HttpRequestResponse) o;
    return Objects.equals(contents, that.contents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contents);
  }

  @Override
  public String toString() {
    return new ToStringer(HttpRequestResponse.class).add("contents", contents).toString();
  }

  HttpRequestResponsePb toPb() {
    HttpRequestResponsePb pb = new HttpRequestResponsePb();
    pb.setContents(contents);

    return pb;
  }

  static HttpRequestResponse fromPb(HttpRequestResponsePb pb) {
    HttpRequestResponse model = new HttpRequestResponse();
    model.setContents(pb.getContents());

    return model;
  }

  public static class HttpRequestResponseSerializer extends JsonSerializer<HttpRequestResponse> {
    @Override
    public void serialize(HttpRequestResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      HttpRequestResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class HttpRequestResponseDeserializer
      extends JsonDeserializer<HttpRequestResponse> {
    @Override
    public HttpRequestResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      HttpRequestResponsePb pb = mapper.readValue(p, HttpRequestResponsePb.class);
      return HttpRequestResponse.fromPb(pb);
    }
  }
}
