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

/** Details about a Channel. */
@Generated
@JsonSerialize(using = ChannelInfo.ChannelInfoSerializer.class)
@JsonDeserialize(using = ChannelInfo.ChannelInfoDeserializer.class)
public class ChannelInfo {
  /** DB SQL Version the Channel is mapped to. */
  private String dbsqlVersion;

  /** Name of the channel */
  private ChannelName name;

  public ChannelInfo setDbsqlVersion(String dbsqlVersion) {
    this.dbsqlVersion = dbsqlVersion;
    return this;
  }

  public String getDbsqlVersion() {
    return dbsqlVersion;
  }

  public ChannelInfo setName(ChannelName name) {
    this.name = name;
    return this;
  }

  public ChannelName getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ChannelInfo that = (ChannelInfo) o;
    return Objects.equals(dbsqlVersion, that.dbsqlVersion) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbsqlVersion, name);
  }

  @Override
  public String toString() {
    return new ToStringer(ChannelInfo.class)
        .add("dbsqlVersion", dbsqlVersion)
        .add("name", name)
        .toString();
  }

  ChannelInfoPb toPb() {
    ChannelInfoPb pb = new ChannelInfoPb();
    pb.setDbsqlVersion(dbsqlVersion);
    pb.setName(name);

    return pb;
  }

  static ChannelInfo fromPb(ChannelInfoPb pb) {
    ChannelInfo model = new ChannelInfo();
    model.setDbsqlVersion(pb.getDbsqlVersion());
    model.setName(pb.getName());

    return model;
  }

  public static class ChannelInfoSerializer extends JsonSerializer<ChannelInfo> {
    @Override
    public void serialize(ChannelInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ChannelInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ChannelInfoDeserializer extends JsonDeserializer<ChannelInfo> {
    @Override
    public ChannelInfo deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ChannelInfoPb pb = mapper.readValue(p, ChannelInfoPb.class);
      return ChannelInfo.fromPb(pb);
    }
  }
}
