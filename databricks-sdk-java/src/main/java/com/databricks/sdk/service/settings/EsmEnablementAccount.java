// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

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

/** Account level policy for ESM */
@Generated
@JsonSerialize(using = EsmEnablementAccount.EsmEnablementAccountSerializer.class)
@JsonDeserialize(using = EsmEnablementAccount.EsmEnablementAccountDeserializer.class)
public class EsmEnablementAccount {
  /** */
  private Boolean isEnforced;

  public EsmEnablementAccount setIsEnforced(Boolean isEnforced) {
    this.isEnforced = isEnforced;
    return this;
  }

  public Boolean getIsEnforced() {
    return isEnforced;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EsmEnablementAccount that = (EsmEnablementAccount) o;
    return Objects.equals(isEnforced, that.isEnforced);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEnforced);
  }

  @Override
  public String toString() {
    return new ToStringer(EsmEnablementAccount.class).add("isEnforced", isEnforced).toString();
  }

  EsmEnablementAccountPb toPb() {
    EsmEnablementAccountPb pb = new EsmEnablementAccountPb();
    pb.setIsEnforced(isEnforced);

    return pb;
  }

  static EsmEnablementAccount fromPb(EsmEnablementAccountPb pb) {
    EsmEnablementAccount model = new EsmEnablementAccount();
    model.setIsEnforced(pb.getIsEnforced());

    return model;
  }

  public static class EsmEnablementAccountSerializer extends JsonSerializer<EsmEnablementAccount> {
    @Override
    public void serialize(
        EsmEnablementAccount value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      EsmEnablementAccountPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EsmEnablementAccountDeserializer
      extends JsonDeserializer<EsmEnablementAccount> {
    @Override
    public EsmEnablementAccount deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EsmEnablementAccountPb pb = mapper.readValue(p, EsmEnablementAccountPb.class);
      return EsmEnablementAccount.fromPb(pb);
    }
  }
}
