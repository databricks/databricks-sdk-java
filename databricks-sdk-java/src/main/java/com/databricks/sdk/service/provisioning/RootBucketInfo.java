// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

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

/** Root S3 bucket information. */
@Generated
@JsonSerialize(using = RootBucketInfo.RootBucketInfoSerializer.class)
@JsonDeserialize(using = RootBucketInfo.RootBucketInfoDeserializer.class)
public class RootBucketInfo {
  /** The name of the S3 bucket. */
  private String bucketName;

  public RootBucketInfo setBucketName(String bucketName) {
    this.bucketName = bucketName;
    return this;
  }

  public String getBucketName() {
    return bucketName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RootBucketInfo that = (RootBucketInfo) o;
    return Objects.equals(bucketName, that.bucketName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucketName);
  }

  @Override
  public String toString() {
    return new ToStringer(RootBucketInfo.class).add("bucketName", bucketName).toString();
  }

  RootBucketInfoPb toPb() {
    RootBucketInfoPb pb = new RootBucketInfoPb();
    pb.setBucketName(bucketName);

    return pb;
  }

  static RootBucketInfo fromPb(RootBucketInfoPb pb) {
    RootBucketInfo model = new RootBucketInfo();
    model.setBucketName(pb.getBucketName());

    return model;
  }

  public static class RootBucketInfoSerializer extends JsonSerializer<RootBucketInfo> {
    @Override
    public void serialize(RootBucketInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RootBucketInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RootBucketInfoDeserializer extends JsonDeserializer<RootBucketInfo> {
    @Override
    public RootBucketInfo deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RootBucketInfoPb pb = mapper.readValue(p, RootBucketInfoPb.class);
      return RootBucketInfo.fromPb(pb);
    }
  }
}
