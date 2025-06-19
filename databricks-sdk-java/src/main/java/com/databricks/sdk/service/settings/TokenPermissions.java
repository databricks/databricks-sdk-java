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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = TokenPermissions.TokenPermissionsSerializer.class)
@JsonDeserialize(using = TokenPermissions.TokenPermissionsDeserializer.class)
public class TokenPermissions {
  /** */
  private Collection<TokenAccessControlResponse> accessControlList;

  /** */
  private String objectId;

  /** */
  private String objectType;

  public TokenPermissions setAccessControlList(
      Collection<TokenAccessControlResponse> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<TokenAccessControlResponse> getAccessControlList() {
    return accessControlList;
  }

  public TokenPermissions setObjectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

  public String getObjectId() {
    return objectId;
  }

  public TokenPermissions setObjectType(String objectType) {
    this.objectType = objectType;
    return this;
  }

  public String getObjectType() {
    return objectType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TokenPermissions that = (TokenPermissions) o;
    return Objects.equals(accessControlList, that.accessControlList)
        && Objects.equals(objectId, that.objectId)
        && Objects.equals(objectType, that.objectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControlList, objectId, objectType);
  }

  @Override
  public String toString() {
    return new ToStringer(TokenPermissions.class)
        .add("accessControlList", accessControlList)
        .add("objectId", objectId)
        .add("objectType", objectType)
        .toString();
  }

  TokenPermissionsPb toPb() {
    TokenPermissionsPb pb = new TokenPermissionsPb();
    pb.setAccessControlList(accessControlList);
    pb.setObjectId(objectId);
    pb.setObjectType(objectType);

    return pb;
  }

  static TokenPermissions fromPb(TokenPermissionsPb pb) {
    TokenPermissions model = new TokenPermissions();
    model.setAccessControlList(pb.getAccessControlList());
    model.setObjectId(pb.getObjectId());
    model.setObjectType(pb.getObjectType());

    return model;
  }

  public static class TokenPermissionsSerializer extends JsonSerializer<TokenPermissions> {
    @Override
    public void serialize(TokenPermissions value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      TokenPermissionsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class TokenPermissionsDeserializer extends JsonDeserializer<TokenPermissions> {
    @Override
    public TokenPermissions deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      TokenPermissionsPb pb = mapper.readValue(p, TokenPermissionsPb.class);
      return TokenPermissions.fromPb(pb);
    }
  }
}
