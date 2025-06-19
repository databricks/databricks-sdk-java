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
import java.util.Objects;

/** Attributes set during instance pool creation which are related to GCP. */
@Generated
@JsonSerialize(using = InstancePoolGcpAttributes.InstancePoolGcpAttributesSerializer.class)
@JsonDeserialize(using = InstancePoolGcpAttributes.InstancePoolGcpAttributesDeserializer.class)
public class InstancePoolGcpAttributes {
  /**
   * This field determines whether the instance pool will contain preemptible VMs, on-demand VMs, or
   * preemptible VMs with a fallback to on-demand VMs if the former is unavailable.
   */
  private GcpAvailability gcpAvailability;

  /**
   * If provided, each node in the instance pool will have this number of local SSDs attached. Each
   * local SSD is 375GB in size. Refer to [GCP documentation] for the supported number of local SSDs
   * for each instance type.
   *
   * <p>[GCP documentation]:
   * https://cloud.google.com/compute/docs/disks/local-ssd#choose_number_local_ssds
   */
  private Long localSsdCount;

  /**
   * Identifier for the availability zone/datacenter in which the cluster resides. This string will
   * be of a form like "us-west1-a". The provided availability zone must be in the same region as
   * the Databricks workspace. For example, "us-west1-a" is not a valid zone id if the Databricks
   * workspace resides in the "us-east1" region. This is an optional field at instance pool
   * creation, and if not specified, a default zone will be used.
   *
   * <p>This field can be one of the following: - "HA" => High availability, spread nodes across
   * availability zones for a Databricks deployment region - A GCP availability zone => Pick One of
   * the available zones for (machine type + region) from
   * https://cloud.google.com/compute/docs/regions-zones (e.g. "us-west1-a").
   *
   * <p>If empty, Databricks picks an availability zone to schedule the cluster on.
   */
  private String zoneId;

  public InstancePoolGcpAttributes setGcpAvailability(GcpAvailability gcpAvailability) {
    this.gcpAvailability = gcpAvailability;
    return this;
  }

  public GcpAvailability getGcpAvailability() {
    return gcpAvailability;
  }

  public InstancePoolGcpAttributes setLocalSsdCount(Long localSsdCount) {
    this.localSsdCount = localSsdCount;
    return this;
  }

  public Long getLocalSsdCount() {
    return localSsdCount;
  }

  public InstancePoolGcpAttributes setZoneId(String zoneId) {
    this.zoneId = zoneId;
    return this;
  }

  public String getZoneId() {
    return zoneId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InstancePoolGcpAttributes that = (InstancePoolGcpAttributes) o;
    return Objects.equals(gcpAvailability, that.gcpAvailability)
        && Objects.equals(localSsdCount, that.localSsdCount)
        && Objects.equals(zoneId, that.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gcpAvailability, localSsdCount, zoneId);
  }

  @Override
  public String toString() {
    return new ToStringer(InstancePoolGcpAttributes.class)
        .add("gcpAvailability", gcpAvailability)
        .add("localSsdCount", localSsdCount)
        .add("zoneId", zoneId)
        .toString();
  }

  InstancePoolGcpAttributesPb toPb() {
    InstancePoolGcpAttributesPb pb = new InstancePoolGcpAttributesPb();
    pb.setGcpAvailability(gcpAvailability);
    pb.setLocalSsdCount(localSsdCount);
    pb.setZoneId(zoneId);

    return pb;
  }

  static InstancePoolGcpAttributes fromPb(InstancePoolGcpAttributesPb pb) {
    InstancePoolGcpAttributes model = new InstancePoolGcpAttributes();
    model.setGcpAvailability(pb.getGcpAvailability());
    model.setLocalSsdCount(pb.getLocalSsdCount());
    model.setZoneId(pb.getZoneId());

    return model;
  }

  public static class InstancePoolGcpAttributesSerializer
      extends JsonSerializer<InstancePoolGcpAttributes> {
    @Override
    public void serialize(
        InstancePoolGcpAttributes value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      InstancePoolGcpAttributesPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class InstancePoolGcpAttributesDeserializer
      extends JsonDeserializer<InstancePoolGcpAttributes> {
    @Override
    public InstancePoolGcpAttributes deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      InstancePoolGcpAttributesPb pb = mapper.readValue(p, InstancePoolGcpAttributesPb.class);
      return InstancePoolGcpAttributes.fromPb(pb);
    }
  }
}
