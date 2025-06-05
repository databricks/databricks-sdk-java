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

/** A storage location in DBFS */
@Generated
@JsonSerialize(using = DbfsStorageInfo.DbfsStorageInfoSerializer.class)
@JsonDeserialize(using = DbfsStorageInfo.DbfsStorageInfoDeserializer.class)
public class DbfsStorageInfo {
  /** dbfs destination, e.g. `dbfs:/my/path` */
  private String destination;

  public DbfsStorageInfo setDestination(String destination) {
    this.destination = destination;
    return this;
  }

  public String getDestination() {
    return destination;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DbfsStorageInfo that = (DbfsStorageInfo) o;
    return Objects.equals(destination, that.destination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination);
  }

  @Override
  public String toString() {
    return new ToStringer(DbfsStorageInfo.class).add("destination", destination).toString();
  }

  DbfsStorageInfoPb toPb() {
    DbfsStorageInfoPb pb = new DbfsStorageInfoPb();
    pb.setDestination(destination);

    return pb;
  }

  static DbfsStorageInfo fromPb(DbfsStorageInfoPb pb) {
    DbfsStorageInfo model = new DbfsStorageInfo();
    model.setDestination(pb.getDestination());

    return model;
  }

  public static class DbfsStorageInfoSerializer extends JsonSerializer<DbfsStorageInfo> {
    @Override
    public void serialize(DbfsStorageInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DbfsStorageInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DbfsStorageInfoDeserializer extends JsonDeserializer<DbfsStorageInfo> {
    @Override
    public DbfsStorageInfo deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DbfsStorageInfoPb pb = mapper.readValue(p, DbfsStorageInfoPb.class);
      return DbfsStorageInfo.fromPb(pb);
    }
  }
}
