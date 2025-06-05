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
@JsonSerialize(using = DockerBasicAuth.DockerBasicAuthSerializer.class)
@JsonDeserialize(using = DockerBasicAuth.DockerBasicAuthDeserializer.class)
public class DockerBasicAuth {
  /** Password of the user */
  private String password;

  /** Name of the user */
  private String username;

  public DockerBasicAuth setPassword(String password) {
    this.password = password;
    return this;
  }

  public String getPassword() {
    return password;
  }

  public DockerBasicAuth setUsername(String username) {
    this.username = username;
    return this;
  }

  public String getUsername() {
    return username;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DockerBasicAuth that = (DockerBasicAuth) o;
    return Objects.equals(password, that.password) && Objects.equals(username, that.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, username);
  }

  @Override
  public String toString() {
    return new ToStringer(DockerBasicAuth.class)
        .add("password", password)
        .add("username", username)
        .toString();
  }

  DockerBasicAuthPb toPb() {
    DockerBasicAuthPb pb = new DockerBasicAuthPb();
    pb.setPassword(password);
    pb.setUsername(username);

    return pb;
  }

  static DockerBasicAuth fromPb(DockerBasicAuthPb pb) {
    DockerBasicAuth model = new DockerBasicAuth();
    model.setPassword(pb.getPassword());
    model.setUsername(pb.getUsername());

    return model;
  }

  public static class DockerBasicAuthSerializer extends JsonSerializer<DockerBasicAuth> {
    @Override
    public void serialize(DockerBasicAuth value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DockerBasicAuthPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DockerBasicAuthDeserializer extends JsonDeserializer<DockerBasicAuth> {
    @Override
    public DockerBasicAuth deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DockerBasicAuthPb pb = mapper.readValue(p, DockerBasicAuthPb.class);
      return DockerBasicAuth.fromPb(pb);
    }
  }
}
