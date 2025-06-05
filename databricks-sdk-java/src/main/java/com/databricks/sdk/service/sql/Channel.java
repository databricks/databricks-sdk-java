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

/**
 * Configures the channel name and DBSQL version of the warehouse. CHANNEL_NAME_CUSTOM should be
 * chosen only when `dbsql_version` is specified.
 */
@Generated
@JsonSerialize(using = Channel.ChannelSerializer.class)
@JsonDeserialize(using = Channel.ChannelDeserializer.class)
public class Channel {
  /** */
  private String dbsqlVersion;

  /** */
  private ChannelName name;

  public Channel setDbsqlVersion(String dbsqlVersion) {
    this.dbsqlVersion = dbsqlVersion;
    return this;
  }

  public String getDbsqlVersion() {
    return dbsqlVersion;
  }

  public Channel setName(ChannelName name) {
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
    Channel that = (Channel) o;
    return Objects.equals(dbsqlVersion, that.dbsqlVersion) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbsqlVersion, name);
  }

  @Override
  public String toString() {
    return new ToStringer(Channel.class)
        .add("dbsqlVersion", dbsqlVersion)
        .add("name", name)
        .toString();
  }

  ChannelPb toPb() {
    ChannelPb pb = new ChannelPb();
    pb.setDbsqlVersion(dbsqlVersion);
    pb.setName(name);

    return pb;
  }

  static Channel fromPb(ChannelPb pb) {
    Channel model = new Channel();
    model.setDbsqlVersion(pb.getDbsqlVersion());
    model.setName(pb.getName());

    return model;
  }

  public static class ChannelSerializer extends JsonSerializer<Channel> {
    @Override
    public void serialize(Channel value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ChannelPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ChannelDeserializer extends JsonDeserializer<Channel> {
    @Override
    public Channel deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ChannelPb pb = mapper.readValue(p, ChannelPb.class);
      return Channel.fromPb(pb);
    }
  }
}
