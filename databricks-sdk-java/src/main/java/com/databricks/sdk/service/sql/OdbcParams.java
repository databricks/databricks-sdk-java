// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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
@JsonSerialize(using = OdbcParams.OdbcParamsSerializer.class)
@JsonDeserialize(using = OdbcParams.OdbcParamsDeserializer.class)
public class OdbcParams {
  /** */
  private String hostname;

  /** */
  private String path;

  /** */
  private Long port;

  /** */
  private String protocol;

  public OdbcParams setHostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

  public String getHostname() {
    return hostname;
  }

  public OdbcParams setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }

  public OdbcParams setPort(Long port) {
    this.port = port;
    return this;
  }

  public Long getPort() {
    return port;
  }

  public OdbcParams setProtocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

  public String getProtocol() {
    return protocol;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OdbcParams that = (OdbcParams) o;
    return Objects.equals(hostname, that.hostname)
        && Objects.equals(path, that.path)
        && Objects.equals(port, that.port)
        && Objects.equals(protocol, that.protocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostname, path, port, protocol);
  }

  @Override
  public String toString() {
    return new ToStringer(OdbcParams.class)
        .add("hostname", hostname)
        .add("path", path)
        .add("port", port)
        .add("protocol", protocol)
        .toString();
  }

  OdbcParamsPb toPb() {
    OdbcParamsPb pb = new OdbcParamsPb();
    pb.setHostname(hostname);
    pb.setPath(path);
    pb.setPort(port);
    pb.setProtocol(protocol);

    return pb;
  }

  static OdbcParams fromPb(OdbcParamsPb pb) {
    OdbcParams model = new OdbcParams();
    model.setHostname(pb.getHostname());
    model.setPath(pb.getPath());
    model.setPort(pb.getPort());
    model.setProtocol(pb.getProtocol());

    return model;
  }

  public static class OdbcParamsSerializer extends JsonSerializer<OdbcParams> {
    @Override
    public void serialize(OdbcParams value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      OdbcParamsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class OdbcParamsDeserializer extends JsonDeserializer<OdbcParams> {
    @Override
    public OdbcParams deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      OdbcParamsPb pb = mapper.readValue(p, OdbcParamsPb.class);
      return OdbcParams.fromPb(pb);
    }
  }
}
