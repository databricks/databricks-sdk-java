// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

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

/**
 * The compliance security profile used to process regulated data following compliance standards.
 */
@Generated
@JsonSerialize(using = ComplianceSecurityProfile.ComplianceSecurityProfileSerializer.class)
@JsonDeserialize(using = ComplianceSecurityProfile.ComplianceSecurityProfileDeserializer.class)
public class ComplianceSecurityProfile {
  /**
   * The list of compliance standards that the compliance security profile is configured to enforce.
   */
  private Collection<com.databricks.sdk.service.settings.ComplianceStandard> complianceStandards;

  /** Whether the compliance security profile is enabled. */
  private Boolean isEnabled;

  public ComplianceSecurityProfile setComplianceStandards(
      Collection<com.databricks.sdk.service.settings.ComplianceStandard> complianceStandards) {
    this.complianceStandards = complianceStandards;
    return this;
  }

  public Collection<com.databricks.sdk.service.settings.ComplianceStandard>
      getComplianceStandards() {
    return complianceStandards;
  }

  public ComplianceSecurityProfile setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  public Boolean getIsEnabled() {
    return isEnabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ComplianceSecurityProfile that = (ComplianceSecurityProfile) o;
    return Objects.equals(complianceStandards, that.complianceStandards)
        && Objects.equals(isEnabled, that.isEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(complianceStandards, isEnabled);
  }

  @Override
  public String toString() {
    return new ToStringer(ComplianceSecurityProfile.class)
        .add("complianceStandards", complianceStandards)
        .add("isEnabled", isEnabled)
        .toString();
  }

  ComplianceSecurityProfilePb toPb() {
    ComplianceSecurityProfilePb pb = new ComplianceSecurityProfilePb();
    pb.setComplianceStandards(complianceStandards);
    pb.setIsEnabled(isEnabled);

    return pb;
  }

  static ComplianceSecurityProfile fromPb(ComplianceSecurityProfilePb pb) {
    ComplianceSecurityProfile model = new ComplianceSecurityProfile();
    model.setComplianceStandards(pb.getComplianceStandards());
    model.setIsEnabled(pb.getIsEnabled());

    return model;
  }

  public static class ComplianceSecurityProfileSerializer
      extends JsonSerializer<ComplianceSecurityProfile> {
    @Override
    public void serialize(
        ComplianceSecurityProfile value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ComplianceSecurityProfilePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ComplianceSecurityProfileDeserializer
      extends JsonDeserializer<ComplianceSecurityProfile> {
    @Override
    public ComplianceSecurityProfile deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ComplianceSecurityProfilePb pb = mapper.readValue(p, ComplianceSecurityProfilePb.class);
      return ComplianceSecurityProfile.fromPb(pb);
    }
  }
}
