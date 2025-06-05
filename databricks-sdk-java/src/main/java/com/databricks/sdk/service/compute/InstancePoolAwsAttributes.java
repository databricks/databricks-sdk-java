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

/** Attributes set during instance pool creation which are related to Amazon Web Services. */
@Generated
@JsonSerialize(using = InstancePoolAwsAttributes.InstancePoolAwsAttributesSerializer.class)
@JsonDeserialize(using = InstancePoolAwsAttributes.InstancePoolAwsAttributesDeserializer.class)
public class InstancePoolAwsAttributes {
  /** Availability type used for the spot nodes. */
  private InstancePoolAwsAttributesAvailability availability;

  /**
   * Calculates the bid price for AWS spot instances, as a percentage of the corresponding instance
   * type's on-demand price. For example, if this field is set to 50, and the cluster needs a new
   * `r3.xlarge` spot instance, then the bid price is half of the price of on-demand `r3.xlarge`
   * instances. Similarly, if this field is set to 200, the bid price is twice the price of
   * on-demand `r3.xlarge` instances. If not specified, the default value is 100. When spot
   * instances are requested for this cluster, only spot instances whose bid price percentage
   * matches this field will be considered. Note that, for safety, we enforce this field to be no
   * more than 10000.
   */
  private Long spotBidPricePercent;

  /**
   * Identifier for the availability zone/datacenter in which the cluster resides. This string will
   * be of a form like "us-west-2a". The provided availability zone must be in the same region as
   * the Databricks deployment. For example, "us-west-2a" is not a valid zone id if the Databricks
   * deployment resides in the "us-east-1" region. This is an optional field at cluster creation,
   * and if not specified, a default zone will be used. The list of available zones as well as the
   * default value can be found by using the `List Zones` method.
   */
  private String zoneId;

  public InstancePoolAwsAttributes setAvailability(
      InstancePoolAwsAttributesAvailability availability) {
    this.availability = availability;
    return this;
  }

  public InstancePoolAwsAttributesAvailability getAvailability() {
    return availability;
  }

  public InstancePoolAwsAttributes setSpotBidPricePercent(Long spotBidPricePercent) {
    this.spotBidPricePercent = spotBidPricePercent;
    return this;
  }

  public Long getSpotBidPricePercent() {
    return spotBidPricePercent;
  }

  public InstancePoolAwsAttributes setZoneId(String zoneId) {
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
    InstancePoolAwsAttributes that = (InstancePoolAwsAttributes) o;
    return Objects.equals(availability, that.availability)
        && Objects.equals(spotBidPricePercent, that.spotBidPricePercent)
        && Objects.equals(zoneId, that.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availability, spotBidPricePercent, zoneId);
  }

  @Override
  public String toString() {
    return new ToStringer(InstancePoolAwsAttributes.class)
        .add("availability", availability)
        .add("spotBidPricePercent", spotBidPricePercent)
        .add("zoneId", zoneId)
        .toString();
  }

  InstancePoolAwsAttributesPb toPb() {
    InstancePoolAwsAttributesPb pb = new InstancePoolAwsAttributesPb();
    pb.setAvailability(availability);
    pb.setSpotBidPricePercent(spotBidPricePercent);
    pb.setZoneId(zoneId);

    return pb;
  }

  static InstancePoolAwsAttributes fromPb(InstancePoolAwsAttributesPb pb) {
    InstancePoolAwsAttributes model = new InstancePoolAwsAttributes();
    model.setAvailability(pb.getAvailability());
    model.setSpotBidPricePercent(pb.getSpotBidPricePercent());
    model.setZoneId(pb.getZoneId());

    return model;
  }

  public static class InstancePoolAwsAttributesSerializer
      extends JsonSerializer<InstancePoolAwsAttributes> {
    @Override
    public void serialize(
        InstancePoolAwsAttributes value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      InstancePoolAwsAttributesPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class InstancePoolAwsAttributesDeserializer
      extends JsonDeserializer<InstancePoolAwsAttributes> {
    @Override
    public InstancePoolAwsAttributes deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      InstancePoolAwsAttributesPb pb = mapper.readValue(p, InstancePoolAwsAttributesPb.class);
      return InstancePoolAwsAttributes.fromPb(pb);
    }
  }
}
