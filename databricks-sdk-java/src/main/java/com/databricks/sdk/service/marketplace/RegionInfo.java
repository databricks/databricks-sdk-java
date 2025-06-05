// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

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
@JsonSerialize(using = RegionInfo.RegionInfoSerializer.class)
@JsonDeserialize(using = RegionInfo.RegionInfoDeserializer.class)
public class RegionInfo {
  /** */
  private String cloud;

  /** */
  private String region;

  public RegionInfo setCloud(String cloud) {
    this.cloud = cloud;
    return this;
  }

  public String getCloud() {
    return cloud;
  }

  public RegionInfo setRegion(String region) {
    this.region = region;
    return this;
  }

  public String getRegion() {
    return region;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RegionInfo that = (RegionInfo) o;
    return Objects.equals(cloud, that.cloud) && Objects.equals(region, that.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloud, region);
  }

  @Override
  public String toString() {
    return new ToStringer(RegionInfo.class).add("cloud", cloud).add("region", region).toString();
  }

  RegionInfoPb toPb() {
    RegionInfoPb pb = new RegionInfoPb();
    pb.setCloud(cloud);
    pb.setRegion(region);

    return pb;
  }

  static RegionInfo fromPb(RegionInfoPb pb) {
    RegionInfo model = new RegionInfo();
    model.setCloud(pb.getCloud());
    model.setRegion(pb.getRegion());

    return model;
  }

  public static class RegionInfoSerializer extends JsonSerializer<RegionInfo> {
    @Override
    public void serialize(RegionInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RegionInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RegionInfoDeserializer extends JsonDeserializer<RegionInfo> {
    @Override
    public RegionInfo deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RegionInfoPb pb = mapper.readValue(p, RegionInfoPb.class);
      return RegionInfo.fromPb(pb);
    }
  }
}
