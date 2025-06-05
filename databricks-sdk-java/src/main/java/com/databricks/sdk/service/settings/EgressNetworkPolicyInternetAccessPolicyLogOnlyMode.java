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
        EgressNetworkPolicyInternetAccessPolicyLogOnlyMode
            .EgressNetworkPolicyInternetAccessPolicyLogOnlyModeSerializer.class)
@JsonDeserialize(
    using =
        EgressNetworkPolicyInternetAccessPolicyLogOnlyMode
            .EgressNetworkPolicyInternetAccessPolicyLogOnlyModeDeserializer.class)
public class EgressNetworkPolicyInternetAccessPolicyLogOnlyMode {
  /** */
  private EgressNetworkPolicyInternetAccessPolicyLogOnlyModeLogOnlyModeType logOnlyModeType;

  /** */
  private Collection<EgressNetworkPolicyInternetAccessPolicyLogOnlyModeWorkloadType> workloads;

  public EgressNetworkPolicyInternetAccessPolicyLogOnlyMode setLogOnlyModeType(
      EgressNetworkPolicyInternetAccessPolicyLogOnlyModeLogOnlyModeType logOnlyModeType) {
    this.logOnlyModeType = logOnlyModeType;
    return this;
  }

  public EgressNetworkPolicyInternetAccessPolicyLogOnlyModeLogOnlyModeType getLogOnlyModeType() {
    return logOnlyModeType;
  }

  public EgressNetworkPolicyInternetAccessPolicyLogOnlyMode setWorkloads(
      Collection<EgressNetworkPolicyInternetAccessPolicyLogOnlyModeWorkloadType> workloads) {
    this.workloads = workloads;
    return this;
  }

  public Collection<EgressNetworkPolicyInternetAccessPolicyLogOnlyModeWorkloadType> getWorkloads() {
    return workloads;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EgressNetworkPolicyInternetAccessPolicyLogOnlyMode that =
        (EgressNetworkPolicyInternetAccessPolicyLogOnlyMode) o;
    return Objects.equals(logOnlyModeType, that.logOnlyModeType)
        && Objects.equals(workloads, that.workloads);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logOnlyModeType, workloads);
  }

  @Override
  public String toString() {
    return new ToStringer(EgressNetworkPolicyInternetAccessPolicyLogOnlyMode.class)
        .add("logOnlyModeType", logOnlyModeType)
        .add("workloads", workloads)
        .toString();
  }

  EgressNetworkPolicyInternetAccessPolicyLogOnlyModePb toPb() {
    EgressNetworkPolicyInternetAccessPolicyLogOnlyModePb pb =
        new EgressNetworkPolicyInternetAccessPolicyLogOnlyModePb();
    pb.setLogOnlyModeType(logOnlyModeType);
    pb.setWorkloads(workloads);

    return pb;
  }

  static EgressNetworkPolicyInternetAccessPolicyLogOnlyMode fromPb(
      EgressNetworkPolicyInternetAccessPolicyLogOnlyModePb pb) {
    EgressNetworkPolicyInternetAccessPolicyLogOnlyMode model =
        new EgressNetworkPolicyInternetAccessPolicyLogOnlyMode();
    model.setLogOnlyModeType(pb.getLogOnlyModeType());
    model.setWorkloads(pb.getWorkloads());

    return model;
  }

  public static class EgressNetworkPolicyInternetAccessPolicyLogOnlyModeSerializer
      extends JsonSerializer<EgressNetworkPolicyInternetAccessPolicyLogOnlyMode> {
    @Override
    public void serialize(
        EgressNetworkPolicyInternetAccessPolicyLogOnlyMode value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      EgressNetworkPolicyInternetAccessPolicyLogOnlyModePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EgressNetworkPolicyInternetAccessPolicyLogOnlyModeDeserializer
      extends JsonDeserializer<EgressNetworkPolicyInternetAccessPolicyLogOnlyMode> {
    @Override
    public EgressNetworkPolicyInternetAccessPolicyLogOnlyMode deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EgressNetworkPolicyInternetAccessPolicyLogOnlyModePb pb =
          mapper.readValue(p, EgressNetworkPolicyInternetAccessPolicyLogOnlyModePb.class);
      return EgressNetworkPolicyInternetAccessPolicyLogOnlyMode.fromPb(pb);
    }
  }
}
