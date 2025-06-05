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

/** Attributes set during instance pool creation which are related to Azure. */
@Generated
@JsonSerialize(using = InstancePoolAzureAttributes.InstancePoolAzureAttributesSerializer.class)
@JsonDeserialize(using = InstancePoolAzureAttributes.InstancePoolAzureAttributesDeserializer.class)
public class InstancePoolAzureAttributes {
  /** Availability type used for the spot nodes. */
  private InstancePoolAzureAttributesAvailability availability;

  /**
   * With variable pricing, you have option to set a max price, in US dollars (USD) For example, the
   * value 2 would be a max price of $2.00 USD per hour. If you set the max price to be -1, the VM
   * won't be evicted based on price. The price for the VM will be the current price for spot or the
   * price for a standard VM, which ever is less, as long as there is capacity and quota available.
   */
  private Double spotBidMaxPrice;

  public InstancePoolAzureAttributes setAvailability(
      InstancePoolAzureAttributesAvailability availability) {
    this.availability = availability;
    return this;
  }

  public InstancePoolAzureAttributesAvailability getAvailability() {
    return availability;
  }

  public InstancePoolAzureAttributes setSpotBidMaxPrice(Double spotBidMaxPrice) {
    this.spotBidMaxPrice = spotBidMaxPrice;
    return this;
  }

  public Double getSpotBidMaxPrice() {
    return spotBidMaxPrice;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InstancePoolAzureAttributes that = (InstancePoolAzureAttributes) o;
    return Objects.equals(availability, that.availability)
        && Objects.equals(spotBidMaxPrice, that.spotBidMaxPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availability, spotBidMaxPrice);
  }

  @Override
  public String toString() {
    return new ToStringer(InstancePoolAzureAttributes.class)
        .add("availability", availability)
        .add("spotBidMaxPrice", spotBidMaxPrice)
        .toString();
  }

  InstancePoolAzureAttributesPb toPb() {
    InstancePoolAzureAttributesPb pb = new InstancePoolAzureAttributesPb();
    pb.setAvailability(availability);
    pb.setSpotBidMaxPrice(spotBidMaxPrice);

    return pb;
  }

  static InstancePoolAzureAttributes fromPb(InstancePoolAzureAttributesPb pb) {
    InstancePoolAzureAttributes model = new InstancePoolAzureAttributes();
    model.setAvailability(pb.getAvailability());
    model.setSpotBidMaxPrice(pb.getSpotBidMaxPrice());

    return model;
  }

  public static class InstancePoolAzureAttributesSerializer
      extends JsonSerializer<InstancePoolAzureAttributes> {
    @Override
    public void serialize(
        InstancePoolAzureAttributes value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      InstancePoolAzureAttributesPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class InstancePoolAzureAttributesDeserializer
      extends JsonDeserializer<InstancePoolAzureAttributes> {
    @Override
    public InstancePoolAzureAttributes deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      InstancePoolAzureAttributesPb pb = mapper.readValue(p, InstancePoolAzureAttributesPb.class);
      return InstancePoolAzureAttributes.fromPb(pb);
    }
  }
}
