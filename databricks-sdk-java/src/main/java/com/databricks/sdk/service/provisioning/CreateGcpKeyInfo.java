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
@JsonSerialize(using = CreateGcpKeyInfo.CreateGcpKeyInfoSerializer.class)
@JsonDeserialize(using = CreateGcpKeyInfo.CreateGcpKeyInfoDeserializer.class)
public class CreateGcpKeyInfo {
  /** The GCP KMS key's resource name */
  private String kmsKeyId;

  public CreateGcpKeyInfo setKmsKeyId(String kmsKeyId) {
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
    CreateGcpKeyInfo that = (CreateGcpKeyInfo) o;
    return Objects.equals(kmsKeyId, that.kmsKeyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kmsKeyId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateGcpKeyInfo.class).add("kmsKeyId", kmsKeyId).toString();
  }

  CreateGcpKeyInfoPb toPb() {
    CreateGcpKeyInfoPb pb = new CreateGcpKeyInfoPb();
    pb.setKmsKeyId(kmsKeyId);

    return pb;
  }

  static CreateGcpKeyInfo fromPb(CreateGcpKeyInfoPb pb) {
    CreateGcpKeyInfo model = new CreateGcpKeyInfo();
    model.setKmsKeyId(pb.getKmsKeyId());

    return model;
  }

  public static class CreateGcpKeyInfoSerializer extends JsonSerializer<CreateGcpKeyInfo> {
    @Override
    public void serialize(CreateGcpKeyInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateGcpKeyInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateGcpKeyInfoDeserializer extends JsonDeserializer<CreateGcpKeyInfo> {
    @Override
    public CreateGcpKeyInfo deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateGcpKeyInfoPb pb = mapper.readValue(p, CreateGcpKeyInfoPb.class);
      return CreateGcpKeyInfo.fromPb(pb);
    }
  }
}
