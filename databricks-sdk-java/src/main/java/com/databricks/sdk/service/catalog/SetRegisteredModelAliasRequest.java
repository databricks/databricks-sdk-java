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

@Generated
@JsonSerialize(
    using = SetRegisteredModelAliasRequest.SetRegisteredModelAliasRequestSerializer.class)
@JsonDeserialize(
    using = SetRegisteredModelAliasRequest.SetRegisteredModelAliasRequestDeserializer.class)
public class SetRegisteredModelAliasRequest {
  /** The name of the alias */
  private String alias;

  /** Full name of the registered model */
  private String fullName;

  /** The version number of the model version to which the alias points */
  private Long versionNum;

  public SetRegisteredModelAliasRequest setAlias(String alias) {
    this.alias = alias;
    return this;
  }

  public String getAlias() {
    return alias;
  }

  public SetRegisteredModelAliasRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public SetRegisteredModelAliasRequest setVersionNum(Long versionNum) {
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
    SetRegisteredModelAliasRequest that = (SetRegisteredModelAliasRequest) o;
    return Objects.equals(alias, that.alias)
        && Objects.equals(fullName, that.fullName)
        && Objects.equals(versionNum, that.versionNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, fullName, versionNum);
  }

  @Override
  public String toString() {
    return new ToStringer(SetRegisteredModelAliasRequest.class)
        .add("alias", alias)
        .add("fullName", fullName)
        .add("versionNum", versionNum)
        .toString();
  }

  SetRegisteredModelAliasRequestPb toPb() {
    SetRegisteredModelAliasRequestPb pb = new SetRegisteredModelAliasRequestPb();
    pb.setAlias(alias);
    pb.setFullName(fullName);
    pb.setVersionNum(versionNum);

    return pb;
  }

  static SetRegisteredModelAliasRequest fromPb(SetRegisteredModelAliasRequestPb pb) {
    SetRegisteredModelAliasRequest model = new SetRegisteredModelAliasRequest();
    model.setAlias(pb.getAlias());
    model.setFullName(pb.getFullName());
    model.setVersionNum(pb.getVersionNum());

    return model;
  }

  public static class SetRegisteredModelAliasRequestSerializer
      extends JsonSerializer<SetRegisteredModelAliasRequest> {
    @Override
    public void serialize(
        SetRegisteredModelAliasRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SetRegisteredModelAliasRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SetRegisteredModelAliasRequestDeserializer
      extends JsonDeserializer<SetRegisteredModelAliasRequest> {
    @Override
    public SetRegisteredModelAliasRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SetRegisteredModelAliasRequestPb pb =
          mapper.readValue(p, SetRegisteredModelAliasRequestPb.class);
      return SetRegisteredModelAliasRequest.fromPb(pb);
    }
  }
}
