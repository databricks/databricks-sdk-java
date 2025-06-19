// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

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

/** Find a Database Instance by uid */
@Generated
@JsonSerialize(
    using = FindDatabaseInstanceByUidRequest.FindDatabaseInstanceByUidRequestSerializer.class)
@JsonDeserialize(
    using = FindDatabaseInstanceByUidRequest.FindDatabaseInstanceByUidRequestDeserializer.class)
public class FindDatabaseInstanceByUidRequest {
  /** UID of the cluster to get. */
  private String uid;

  public FindDatabaseInstanceByUidRequest setUid(String uid) {
    this.uid = uid;
    return this;
  }

  public String getUid() {
    return uid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FindDatabaseInstanceByUidRequest that = (FindDatabaseInstanceByUidRequest) o;
    return Objects.equals(uid, that.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid);
  }

  @Override
  public String toString() {
    return new ToStringer(FindDatabaseInstanceByUidRequest.class).add("uid", uid).toString();
  }

  FindDatabaseInstanceByUidRequestPb toPb() {
    FindDatabaseInstanceByUidRequestPb pb = new FindDatabaseInstanceByUidRequestPb();
    pb.setUid(uid);

    return pb;
  }

  static FindDatabaseInstanceByUidRequest fromPb(FindDatabaseInstanceByUidRequestPb pb) {
    FindDatabaseInstanceByUidRequest model = new FindDatabaseInstanceByUidRequest();
    model.setUid(pb.getUid());

    return model;
  }

  public static class FindDatabaseInstanceByUidRequestSerializer
      extends JsonSerializer<FindDatabaseInstanceByUidRequest> {
    @Override
    public void serialize(
        FindDatabaseInstanceByUidRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      FindDatabaseInstanceByUidRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class FindDatabaseInstanceByUidRequestDeserializer
      extends JsonDeserializer<FindDatabaseInstanceByUidRequest> {
    @Override
    public FindDatabaseInstanceByUidRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      FindDatabaseInstanceByUidRequestPb pb =
          mapper.readValue(p, FindDatabaseInstanceByUidRequestPb.class);
      return FindDatabaseInstanceByUidRequest.fromPb(pb);
    }
  }
}
