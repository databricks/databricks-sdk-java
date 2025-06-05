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
@JsonSerialize(using = GcpKeyInfo.GcpKeyInfoSerializer.class)
@JsonDeserialize(using = GcpKeyInfo.GcpKeyInfoDeserializer.class)
public class GcpKeyInfo {
  /** The GCP KMS key's resource name */
  private String kmsKeyId;

  public GcpKeyInfo setKmsKeyId(String kmsKeyId) {
    this.kmsKeyId = kmsKeyId;
    return this;
  }

  public String getKmsKeyId() {
    return kmsKeyId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GcpKeyInfo that = (GcpKeyInfo) o;
    return Objects.equals(kmsKeyId, that.kmsKeyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kmsKeyId);
  }

  @Override
  public String toString() {
    return new ToStringer(GcpKeyInfo.class).add("kmsKeyId", kmsKeyId).toString();
  }

  GcpKeyInfoPb toPb() {
    GcpKeyInfoPb pb = new GcpKeyInfoPb();
    pb.setKmsKeyId(kmsKeyId);

    return pb;
  }

  static GcpKeyInfo fromPb(GcpKeyInfoPb pb) {
    GcpKeyInfo model = new GcpKeyInfo();
    model.setKmsKeyId(pb.getKmsKeyId());

    return model;
  }

  public static class GcpKeyInfoSerializer extends JsonSerializer<GcpKeyInfo> {
    @Override
    public void serialize(GcpKeyInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GcpKeyInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GcpKeyInfoDeserializer extends JsonDeserializer<GcpKeyInfo> {
    @Override
    public GcpKeyInfo deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GcpKeyInfoPb pb = mapper.readValue(p, GcpKeyInfoPb.class);
      return GcpKeyInfo.fromPb(pb);
    }
  }
}
