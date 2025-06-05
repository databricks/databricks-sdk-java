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
@JsonSerialize(using = CreateAwsKeyInfo.CreateAwsKeyInfoSerializer.class)
@JsonDeserialize(using = CreateAwsKeyInfo.CreateAwsKeyInfoDeserializer.class)
public class CreateAwsKeyInfo {
  /** The AWS KMS key alias. */
  private String keyAlias;

  /**
   * The AWS KMS key's Amazon Resource Name (ARN). Note that the key's AWS region is inferred from
   * the ARN.
   */
  private String keyArn;

  /**
   * This field applies only if the `use_cases` property includes `STORAGE`. If this is set to
   * `true` or omitted, the key is also used to encrypt cluster EBS volumes. To not use this key
   * also for encrypting EBS volumes, set this to `false`.
   */
  private Boolean reuseKeyForClusterVolumes;

  public CreateAwsKeyInfo setKeyAlias(String keyAlias) {
    this.keyAlias = keyAlias;
    return this;
  }

  public String getKeyAlias() {
    return keyAlias;
  }

  public CreateAwsKeyInfo setKeyArn(String keyArn) {
    this.keyArn = keyArn;
    return this;
  }

  public String getKeyArn() {
    return keyArn;
  }

  public CreateAwsKeyInfo setReuseKeyForClusterVolumes(Boolean reuseKeyForClusterVolumes) {
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
    CreateAwsKeyInfo that = (CreateAwsKeyInfo) o;
    return Objects.equals(keyAlias, that.keyAlias)
        && Objects.equals(keyArn, that.keyArn)
        && Objects.equals(reuseKeyForClusterVolumes, that.reuseKeyForClusterVolumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyAlias, keyArn, reuseKeyForClusterVolumes);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateAwsKeyInfo.class)
        .add("keyAlias", keyAlias)
        .add("keyArn", keyArn)
        .add("reuseKeyForClusterVolumes", reuseKeyForClusterVolumes)
        .toString();
  }

  CreateAwsKeyInfoPb toPb() {
    CreateAwsKeyInfoPb pb = new CreateAwsKeyInfoPb();
    pb.setKeyAlias(keyAlias);
    pb.setKeyArn(keyArn);
    pb.setReuseKeyForClusterVolumes(reuseKeyForClusterVolumes);

    return pb;
  }

  static CreateAwsKeyInfo fromPb(CreateAwsKeyInfoPb pb) {
    CreateAwsKeyInfo model = new CreateAwsKeyInfo();
    model.setKeyAlias(pb.getKeyAlias());
    model.setKeyArn(pb.getKeyArn());
    model.setReuseKeyForClusterVolumes(pb.getReuseKeyForClusterVolumes());

    return model;
  }

  public static class CreateAwsKeyInfoSerializer extends JsonSerializer<CreateAwsKeyInfo> {
    @Override
    public void serialize(CreateAwsKeyInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateAwsKeyInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateAwsKeyInfoDeserializer extends JsonDeserializer<CreateAwsKeyInfo> {
    @Override
    public CreateAwsKeyInfo deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateAwsKeyInfoPb pb = mapper.readValue(p, CreateAwsKeyInfoPb.class);
      return CreateAwsKeyInfo.fromPb(pb);
    }
  }
}
