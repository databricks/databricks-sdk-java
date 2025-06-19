// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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

/** Encryption options that apply to clients connecting to cloud storage. */
@Generated
@JsonSerialize(using = EncryptionDetails.EncryptionDetailsSerializer.class)
@JsonDeserialize(using = EncryptionDetails.EncryptionDetailsDeserializer.class)
public class EncryptionDetails {
  /** Server-Side Encryption properties for clients communicating with AWS s3. */
  private SseEncryptionDetails sseEncryptionDetails;

  public EncryptionDetails setSseEncryptionDetails(SseEncryptionDetails sseEncryptionDetails) {
    this.sseEncryptionDetails = sseEncryptionDetails;
    return this;
  }

  public SseEncryptionDetails getSseEncryptionDetails() {
    return sseEncryptionDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EncryptionDetails that = (EncryptionDetails) o;
    return Objects.equals(sseEncryptionDetails, that.sseEncryptionDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sseEncryptionDetails);
  }

  @Override
  public String toString() {
    return new ToStringer(EncryptionDetails.class)
        .add("sseEncryptionDetails", sseEncryptionDetails)
        .toString();
  }

  EncryptionDetailsPb toPb() {
    EncryptionDetailsPb pb = new EncryptionDetailsPb();
    pb.setSseEncryptionDetails(sseEncryptionDetails);

    return pb;
  }

  static EncryptionDetails fromPb(EncryptionDetailsPb pb) {
    EncryptionDetails model = new EncryptionDetails();
    model.setSseEncryptionDetails(pb.getSseEncryptionDetails());

    return model;
  }

  public static class EncryptionDetailsSerializer extends JsonSerializer<EncryptionDetails> {
    @Override
    public void serialize(EncryptionDetails value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      EncryptionDetailsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EncryptionDetailsDeserializer extends JsonDeserializer<EncryptionDetails> {
    @Override
    public EncryptionDetails deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EncryptionDetailsPb pb = mapper.readValue(p, EncryptionDetailsPb.class);
      return EncryptionDetails.fromPb(pb);
    }
  }
}
