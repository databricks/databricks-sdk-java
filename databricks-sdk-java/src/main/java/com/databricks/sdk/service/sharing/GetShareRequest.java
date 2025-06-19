// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

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

/** Get a share */
@Generated
@JsonSerialize(using = GetShareRequest.GetShareRequestSerializer.class)
@JsonDeserialize(using = GetShareRequest.GetShareRequestDeserializer.class)
public class GetShareRequest {
  /** Query for data to include in the share. */
  private Boolean includeSharedData;

  /** The name of the share. */
  private String name;

  public GetShareRequest setIncludeSharedData(Boolean includeSharedData) {
    this.includeSharedData = includeSharedData;
    return this;
  }

  public Boolean getIncludeSharedData() {
    return includeSharedData;
  }

  public GetShareRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetShareRequest that = (GetShareRequest) o;
    return Objects.equals(includeSharedData, that.includeSharedData)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeSharedData, name);
  }

  @Override
  public String toString() {
    return new ToStringer(GetShareRequest.class)
        .add("includeSharedData", includeSharedData)
        .add("name", name)
        .toString();
  }

  GetShareRequestPb toPb() {
    GetShareRequestPb pb = new GetShareRequestPb();
    pb.setIncludeSharedData(includeSharedData);
    pb.setName(name);

    return pb;
  }

  static GetShareRequest fromPb(GetShareRequestPb pb) {
    GetShareRequest model = new GetShareRequest();
    model.setIncludeSharedData(pb.getIncludeSharedData());
    model.setName(pb.getName());

    return model;
  }

  public static class GetShareRequestSerializer extends JsonSerializer<GetShareRequest> {
    @Override
    public void serialize(GetShareRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetShareRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetShareRequestDeserializer extends JsonDeserializer<GetShareRequest> {
    @Override
    public GetShareRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetShareRequestPb pb = mapper.readValue(p, GetShareRequestPb.class);
      return GetShareRequest.fromPb(pb);
    }
  }
}
