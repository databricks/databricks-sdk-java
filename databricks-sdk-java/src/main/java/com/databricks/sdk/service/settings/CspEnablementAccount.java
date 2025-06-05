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

/** Account level policy for CSP */
@Generated
@JsonSerialize(using = CspEnablementAccount.CspEnablementAccountSerializer.class)
@JsonDeserialize(using = CspEnablementAccount.CspEnablementAccountDeserializer.class)
public class CspEnablementAccount {
  /**
   * Set by customers when they request Compliance Security Profile (CSP) Invariants are enforced in
   * Settings policy.
   */
  private Collection<ComplianceStandard> complianceStandards;

  /** Enforced = it cannot be overriden at workspace level. */
  private Boolean isEnforced;

  public CspEnablementAccount setComplianceStandards(
      Collection<ComplianceStandard> complianceStandards) {
    this.complianceStandards = complianceStandards;
    return this;
  }

  public Collection<ComplianceStandard> getComplianceStandards() {
    return complianceStandards;
  }

  public CspEnablementAccount setIsEnforced(Boolean isEnforced) {
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
    CspEnablementAccount that = (CspEnablementAccount) o;
    return Objects.equals(complianceStandards, that.complianceStandards)
        && Objects.equals(isEnforced, that.isEnforced);
  }

  @Override
  public int hashCode() {
    return Objects.hash(complianceStandards, isEnforced);
  }

  @Override
  public String toString() {
    return new ToStringer(CspEnablementAccount.class)
        .add("complianceStandards", complianceStandards)
        .add("isEnforced", isEnforced)
        .toString();
  }

  CspEnablementAccountPb toPb() {
    CspEnablementAccountPb pb = new CspEnablementAccountPb();
    pb.setComplianceStandards(complianceStandards);
    pb.setIsEnforced(isEnforced);

    return pb;
  }

  static CspEnablementAccount fromPb(CspEnablementAccountPb pb) {
    CspEnablementAccount model = new CspEnablementAccount();
    model.setComplianceStandards(pb.getComplianceStandards());
    model.setIsEnforced(pb.getIsEnforced());

    return model;
  }

  public static class CspEnablementAccountSerializer extends JsonSerializer<CspEnablementAccount> {
    @Override
    public void serialize(
        CspEnablementAccount value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CspEnablementAccountPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CspEnablementAccountDeserializer
      extends JsonDeserializer<CspEnablementAccount> {
    @Override
    public CspEnablementAccount deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CspEnablementAccountPb pb = mapper.readValue(p, CspEnablementAccountPb.class);
      return CspEnablementAccount.fromPb(pb);
    }
  }
}
