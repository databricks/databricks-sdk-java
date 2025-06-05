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

/** Registered model alias. */
@Generated
@JsonSerialize(using = RegisteredModelAlias.RegisteredModelAliasSerializer.class)
@JsonDeserialize(using = RegisteredModelAlias.RegisteredModelAliasDeserializer.class)
public class RegisteredModelAlias {
  /** Name of the alias, e.g. 'champion' or 'latest_stable' */
  private String aliasName;

  /** Integer version number of the model version to which this alias points. */
  private Long versionNum;

  public RegisteredModelAlias setAliasName(String aliasName) {
    this.aliasName = aliasName;
    return this;
  }

  public String getAliasName() {
    return aliasName;
  }

  public RegisteredModelAlias setVersionNum(Long versionNum) {
    this.versionNum = versionNum;
    return this;
  }

  public Long getVersionNum() {
    return versionNum;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RegisteredModelAlias that = (RegisteredModelAlias) o;
    return Objects.equals(aliasName, that.aliasName) && Objects.equals(versionNum, that.versionNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aliasName, versionNum);
  }

  @Override
  public String toString() {
    return new ToStringer(RegisteredModelAlias.class)
        .add("aliasName", aliasName)
        .add("versionNum", versionNum)
        .toString();
  }

  RegisteredModelAliasPb toPb() {
    RegisteredModelAliasPb pb = new RegisteredModelAliasPb();
    pb.setAliasName(aliasName);
    pb.setVersionNum(versionNum);

    return pb;
  }

  static RegisteredModelAlias fromPb(RegisteredModelAliasPb pb) {
    RegisteredModelAlias model = new RegisteredModelAlias();
    model.setAliasName(pb.getAliasName());
    model.setVersionNum(pb.getVersionNum());

    return model;
  }

  public static class RegisteredModelAliasSerializer extends JsonSerializer<RegisteredModelAlias> {
    @Override
    public void serialize(
        RegisteredModelAlias value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RegisteredModelAliasPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RegisteredModelAliasDeserializer
      extends JsonDeserializer<RegisteredModelAlias> {
    @Override
    public RegisteredModelAlias deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RegisteredModelAliasPb pb = mapper.readValue(p, RegisteredModelAliasPb.class);
      return RegisteredModelAlias.fromPb(pb);
    }
  }
}
