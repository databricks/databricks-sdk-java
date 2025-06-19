// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

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
@JsonSerialize(using = DockerImage.DockerImageSerializer.class)
@JsonDeserialize(using = DockerImage.DockerImageDeserializer.class)
public class DockerImage {
  /** Basic auth with username and password */
  private DockerBasicAuth basicAuth;

  /** URL of the docker image. */
  private String url;

  public DockerImage setBasicAuth(DockerBasicAuth basicAuth) {
    this.basicAuth = basicAuth;
    return this;
  }

  public DockerBasicAuth getBasicAuth() {
    return basicAuth;
  }

  public DockerImage setUrl(String url) {
    this.url = url;
    return this;
  }

  public String getUrl() {
    return url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DockerImage that = (DockerImage) o;
    return Objects.equals(basicAuth, that.basicAuth) && Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basicAuth, url);
  }

  @Override
  public String toString() {
    return new ToStringer(DockerImage.class).add("basicAuth", basicAuth).add("url", url).toString();
  }

  DockerImagePb toPb() {
    DockerImagePb pb = new DockerImagePb();
    pb.setBasicAuth(basicAuth);
    pb.setUrl(url);

    return pb;
  }

  static DockerImage fromPb(DockerImagePb pb) {
    DockerImage model = new DockerImage();
    model.setBasicAuth(pb.getBasicAuth());
    model.setUrl(pb.getUrl());

    return model;
  }

  public static class DockerImageSerializer extends JsonSerializer<DockerImage> {
    @Override
    public void serialize(DockerImage value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DockerImagePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DockerImageDeserializer extends JsonDeserializer<DockerImage> {
    @Override
    public DockerImage deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DockerImagePb pb = mapper.readValue(p, DockerImagePb.class);
      return DockerImage.fromPb(pb);
    }
  }
}
