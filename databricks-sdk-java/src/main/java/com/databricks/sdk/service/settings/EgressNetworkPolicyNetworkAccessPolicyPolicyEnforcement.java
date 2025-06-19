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
@JsonSerialize(
    using =
        EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcement
            .EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcementSerializer.class)
@JsonDeserialize(
    using =
        EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcement
            .EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcementDeserializer.class)
public class EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcement {
  /**
   * When empty, it means dry run for all products. When non-empty, it means dry run for specific
   * products and for the other products, they will run in enforced mode.
   */
  private Collection<EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcementDryRunModeProductFilter>
      dryRunModeProductFilter;

  /**
   * The mode of policy enforcement. ENFORCED blocks traffic that violates policy, while DRY_RUN
   * only logs violations without blocking. When not specified, defaults to ENFORCED.
   */
  private EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcementEnforcementMode enforcementMode;

  public EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcement setDryRunModeProductFilter(
      Collection<EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcementDryRunModeProductFilter>
          dryRunModeProductFilter) {
    this.dryRunModeProductFilter = dryRunModeProductFilter;
    return this;
  }

  public Collection<EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcementDryRunModeProductFilter>
      getDryRunModeProductFilter() {
    return dryRunModeProductFilter;
  }

  public EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcement setEnforcementMode(
      EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcementEnforcementMode enforcementMode) {
    this.enforcementMode = enforcementMode;
    return this;
  }

  public EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcementEnforcementMode
      getEnforcementMode() {
    return enforcementMode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcement that =
        (EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcement) o;
    return Objects.equals(dryRunModeProductFilter, that.dryRunModeProductFilter)
        && Objects.equals(enforcementMode, that.enforcementMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dryRunModeProductFilter, enforcementMode);
  }

  @Override
  public String toString() {
    return new ToStringer(EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcement.class)
        .add("dryRunModeProductFilter", dryRunModeProductFilter)
        .add("enforcementMode", enforcementMode)
        .toString();
  }

  EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcementPb toPb() {
    EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcementPb pb =
        new EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcementPb();
    pb.setDryRunModeProductFilter(dryRunModeProductFilter);
    pb.setEnforcementMode(enforcementMode);

    return pb;
  }

  static EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcement fromPb(
      EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcementPb pb) {
    EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcement model =
        new EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcement();
    model.setDryRunModeProductFilter(pb.getDryRunModeProductFilter());
    model.setEnforcementMode(pb.getEnforcementMode());

    return model;
  }

  public static class EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcementSerializer
      extends JsonSerializer<EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcement> {
    @Override
    public void serialize(
        EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcement value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcementPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcementDeserializer
      extends JsonDeserializer<EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcement> {
    @Override
    public EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcement deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcementPb pb =
          mapper.readValue(p, EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcementPb.class);
      return EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcement.fromPb(pb);
    }
  }
}
