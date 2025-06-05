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

@Generated
@JsonSerialize(using = AwsKeyInfo.AwsKeyInfoSerializer.class)
@JsonDeserialize(using = AwsKeyInfo.AwsKeyInfoDeserializer.class)
public class AwsKeyInfo {
  /** The AWS KMS key alias. */
  private String keyAlias;

  /** The AWS KMS key's Amazon Resource Name (ARN). */
  private String keyArn;

  /** The AWS KMS key region. */
  private String keyRegion;

  /**
   * This field applies only if the `use_cases` property includes `STORAGE`. If this is set to
   * `true` or omitted, the key is also used to encrypt cluster EBS volumes. If you do not want to
   * use this key for encrypting EBS volumes, set to `false`.
   */
  private Boolean reuseKeyForClusterVolumes;

  public AwsKeyInfo setKeyAlias(String keyAlias) {
    this.keyAlias = keyAlias;
    return this;
  }

  public String getKeyAlias() {
    return keyAlias;
  }

  public AwsKeyInfo setKeyArn(String keyArn) {
    this.keyArn = keyArn;
    return this;
  }

  public String getKeyArn() {
    return keyArn;
  }

  public AwsKeyInfo setKeyRegion(String keyRegion) {
    this.keyRegion = keyRegion;
    return this;
  }

  public String getKeyRegion() {
    return keyRegion;
  }

  public AwsKeyInfo setReuseKeyForClusterVolumes(Boolean reuseKeyForClusterVolumes) {
    this.reuseKeyForClusterVolumes = reuseKeyForClusterVolumes;
    return this;
  }

  public Boolean getReuseKeyForClusterVolumes() {
    return reuseKeyForClusterVolumes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AwsKeyInfo that = (AwsKeyInfo) o;
    return Objects.equals(keyAlias, that.keyAlias)
        && Objects.equals(keyArn, that.keyArn)
        && Objects.equals(keyRegion, that.keyRegion)
        && Objects.equals(reuseKeyForClusterVolumes, that.reuseKeyForClusterVolumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyAlias, keyArn, keyRegion, reuseKeyForClusterVolumes);
  }

  @Override
  public String toString() {
    return new ToStringer(AwsKeyInfo.class)
        .add("keyAlias", keyAlias)
        .add("keyArn", keyArn)
        .add("keyRegion", keyRegion)
        .add("reuseKeyForClusterVolumes", reuseKeyForClusterVolumes)
        .toString();
  }

  AwsKeyInfoPb toPb() {
    AwsKeyInfoPb pb = new AwsKeyInfoPb();
    pb.setKeyAlias(keyAlias);
    pb.setKeyArn(keyArn);
    pb.setKeyRegion(keyRegion);
    pb.setReuseKeyForClusterVolumes(reuseKeyForClusterVolumes);

    return pb;
  }

  static AwsKeyInfo fromPb(AwsKeyInfoPb pb) {
    AwsKeyInfo model = new AwsKeyInfo();
    model.setKeyAlias(pb.getKeyAlias());
    model.setKeyArn(pb.getKeyArn());
    model.setKeyRegion(pb.getKeyRegion());
    model.setReuseKeyForClusterVolumes(pb.getReuseKeyForClusterVolumes());

    return model;
  }

  public static class AwsKeyInfoSerializer extends JsonSerializer<AwsKeyInfo> {
    @Override
    public void serialize(AwsKeyInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AwsKeyInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AwsKeyInfoDeserializer extends JsonDeserializer<AwsKeyInfo> {
    @Override
    public AwsKeyInfo deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AwsKeyInfoPb pb = mapper.readValue(p, AwsKeyInfoPb.class);
      return AwsKeyInfo.fromPb(pb);
    }
  }
}
