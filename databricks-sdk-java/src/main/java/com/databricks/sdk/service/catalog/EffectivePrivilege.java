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
@JsonSerialize(using = EffectivePrivilege.EffectivePrivilegeSerializer.class)
@JsonDeserialize(using = EffectivePrivilege.EffectivePrivilegeDeserializer.class)
public class EffectivePrivilege {
  /**
   * The full name of the object that conveys this privilege via inheritance. This field is omitted
   * when privilege is not inherited (it's assigned to the securable itself).
   */
  private String inheritedFromName;

  /**
   * The type of the object that conveys this privilege via inheritance. This field is omitted when
   * privilege is not inherited (it's assigned to the securable itself).
   */
  private SecurableType inheritedFromType;

  /** The privilege assigned to the principal. */
  private Privilege privilege;

  public EffectivePrivilege setInheritedFromName(String inheritedFromName) {
    this.inheritedFromName = inheritedFromName;
    return this;
  }

  public String getInheritedFromName() {
    return inheritedFromName;
  }

  public EffectivePrivilege setInheritedFromType(SecurableType inheritedFromType) {
    this.inheritedFromType = inheritedFromType;
    return this;
  }

  public SecurableType getInheritedFromType() {
    return inheritedFromType;
  }

  public EffectivePrivilege setPrivilege(Privilege privilege) {
    this.privilege = privilege;
    return this;
  }

  public Privilege getPrivilege() {
    return privilege;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EffectivePrivilege that = (EffectivePrivilege) o;
    return Objects.equals(inheritedFromName, that.inheritedFromName)
        && Objects.equals(inheritedFromType, that.inheritedFromType)
        && Objects.equals(privilege, that.privilege);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inheritedFromName, inheritedFromType, privilege);
  }

  @Override
  public String toString() {
    return new ToStringer(EffectivePrivilege.class)
        .add("inheritedFromName", inheritedFromName)
        .add("inheritedFromType", inheritedFromType)
        .add("privilege", privilege)
        .toString();
  }

  EffectivePrivilegePb toPb() {
    EffectivePrivilegePb pb = new EffectivePrivilegePb();
    pb.setInheritedFromName(inheritedFromName);
    pb.setInheritedFromType(inheritedFromType);
    pb.setPrivilege(privilege);

    return pb;
  }

  static EffectivePrivilege fromPb(EffectivePrivilegePb pb) {
    EffectivePrivilege model = new EffectivePrivilege();
    model.setInheritedFromName(pb.getInheritedFromName());
    model.setInheritedFromType(pb.getInheritedFromType());
    model.setPrivilege(pb.getPrivilege());

    return model;
  }

  public static class EffectivePrivilegeSerializer extends JsonSerializer<EffectivePrivilege> {
    @Override
    public void serialize(EffectivePrivilege value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      EffectivePrivilegePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EffectivePrivilegeDeserializer extends JsonDeserializer<EffectivePrivilege> {
    @Override
    public EffectivePrivilege deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EffectivePrivilegePb pb = mapper.readValue(p, EffectivePrivilegePb.class);
      return EffectivePrivilege.fromPb(pb);
    }
  }
}
