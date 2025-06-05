// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

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
@JsonSerialize(using = PutSecret.PutSecretSerializer.class)
@JsonDeserialize(using = PutSecret.PutSecretDeserializer.class)
public class PutSecret {
  /** If specified, value will be stored as bytes. */
  private String bytesValue;

  /** A unique name to identify the secret. */
  private String key;

  /** The name of the scope to which the secret will be associated with. */
  private String scope;

  /** If specified, note that the value will be stored in UTF-8 (MB4) form. */
  private String stringValue;

  public PutSecret setBytesValue(String bytesValue) {
    this.bytesValue = bytesValue;
    return this;
  }

  public String getBytesValue() {
    return bytesValue;
  }

  public PutSecret setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public PutSecret setScope(String scope) {
    this.scope = scope;
    return this;
  }

  public String getScope() {
    return scope;
  }

  public PutSecret setStringValue(String stringValue) {
    this.stringValue = stringValue;
    return this;
  }

  public String getStringValue() {
    return stringValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PutSecret that = (PutSecret) o;
    return Objects.equals(bytesValue, that.bytesValue)
        && Objects.equals(key, that.key)
        && Objects.equals(scope, that.scope)
        && Objects.equals(stringValue, that.stringValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bytesValue, key, scope, stringValue);
  }

  @Override
  public String toString() {
    return new ToStringer(PutSecret.class)
        .add("bytesValue", bytesValue)
        .add("key", key)
        .add("scope", scope)
        .add("stringValue", stringValue)
        .toString();
  }

  PutSecretPb toPb() {
    PutSecretPb pb = new PutSecretPb();
    pb.setBytesValue(bytesValue);
    pb.setKey(key);
    pb.setScope(scope);
    pb.setStringValue(stringValue);

    return pb;
  }

  static PutSecret fromPb(PutSecretPb pb) {
    PutSecret model = new PutSecret();
    model.setBytesValue(pb.getBytesValue());
    model.setKey(pb.getKey());
    model.setScope(pb.getScope());
    model.setStringValue(pb.getStringValue());

    return model;
  }

  public static class PutSecretSerializer extends JsonSerializer<PutSecret> {
    @Override
    public void serialize(PutSecret value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PutSecretPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PutSecretDeserializer extends JsonDeserializer<PutSecret> {
    @Override
    public PutSecret deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PutSecretPb pb = mapper.readValue(p, PutSecretPb.class);
      return PutSecret.fromPb(pb);
    }
  }
}
