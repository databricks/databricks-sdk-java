// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

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
    using = EnforceClusterComplianceResponse.EnforceClusterComplianceResponseSerializer.class)
@JsonDeserialize(
    using = EnforceClusterComplianceResponse.EnforceClusterComplianceResponseDeserializer.class)
public class EnforceClusterComplianceResponse {
  /**
   * A list of changes that have been made to the cluster settings for the cluster to become
   * compliant with its policy.
   */
  private Collection<ClusterSettingsChange> changes;

  /**
   * Whether any changes have been made to the cluster settings for the cluster to become compliant
   * with its policy.
   */
  private Boolean hasChanges;

  public EnforceClusterComplianceResponse setChanges(Collection<ClusterSettingsChange> changes) {
    this.changes = changes;
    return this;
  }

  public Collection<ClusterSettingsChange> getChanges() {
    return changes;
  }

  public EnforceClusterComplianceResponse setHasChanges(Boolean hasChanges) {
    this.hasChanges = hasChanges;
    return this;
  }

  public Boolean getHasChanges() {
    return hasChanges;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EnforceClusterComplianceResponse that = (EnforceClusterComplianceResponse) o;
    return Objects.equals(changes, that.changes) && Objects.equals(hasChanges, that.hasChanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changes, hasChanges);
  }

  @Override
  public String toString() {
    return new ToStringer(EnforceClusterComplianceResponse.class)
        .add("changes", changes)
        .add("hasChanges", hasChanges)
        .toString();
  }

  EnforceClusterComplianceResponsePb toPb() {
    EnforceClusterComplianceResponsePb pb = new EnforceClusterComplianceResponsePb();
    pb.setChanges(changes);
    pb.setHasChanges(hasChanges);

    return pb;
  }

  static EnforceClusterComplianceResponse fromPb(EnforceClusterComplianceResponsePb pb) {
    EnforceClusterComplianceResponse model = new EnforceClusterComplianceResponse();
    model.setChanges(pb.getChanges());
    model.setHasChanges(pb.getHasChanges());

    return model;
  }

  public static class EnforceClusterComplianceResponseSerializer
      extends JsonSerializer<EnforceClusterComplianceResponse> {
    @Override
    public void serialize(
        EnforceClusterComplianceResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      EnforceClusterComplianceResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EnforceClusterComplianceResponseDeserializer
      extends JsonDeserializer<EnforceClusterComplianceResponse> {
    @Override
    public EnforceClusterComplianceResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EnforceClusterComplianceResponsePb pb =
          mapper.readValue(p, EnforceClusterComplianceResponsePb.class);
      return EnforceClusterComplianceResponse.fromPb(pb);
    }
  }
}
