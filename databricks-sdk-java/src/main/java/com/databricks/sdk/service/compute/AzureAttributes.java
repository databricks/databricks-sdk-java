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

/** Attributes set during cluster creation which are related to Microsoft Azure. */
@Generated
@JsonSerialize(using = AzureAttributes.AzureAttributesSerializer.class)
@JsonDeserialize(using = AzureAttributes.AzureAttributesDeserializer.class)
public class AzureAttributes {
  /**
   * Availability type used for all subsequent nodes past the `first_on_demand` ones. Note: If
   * `first_on_demand` is zero, this availability type will be used for the entire cluster.
   */
  private AzureAvailability availability;

  /**
   * The first `first_on_demand` nodes of the cluster will be placed on on-demand instances. This
   * value should be greater than 0, to make sure the cluster driver node is placed on an on-demand
   * instance. If this value is greater than or equal to the current cluster size, all nodes will be
   * placed on on-demand instances. If this value is less than the current cluster size,
   * `first_on_demand` nodes will be placed on on-demand instances and the remainder will be placed
   * on `availability` instances. Note that this value does not affect cluster size and cannot
   * currently be mutated over the lifetime of a cluster.
   */
  private Long firstOnDemand;

  /** Defines values necessary to configure and run Azure Log Analytics agent */
  private LogAnalyticsInfo logAnalyticsInfo;

  /**
   * The max bid price to be used for Azure spot instances. The Max price for the bid cannot be
   * higher than the on-demand price of the instance. If not specified, the default value is -1,
   * which specifies that the instance cannot be evicted on the basis of price, and only on the
   * basis of availability. Further, the value should > 0 or -1.
   */
  private Double spotBidMaxPrice;

  public AzureAttributes setAvailability(AzureAvailability availability) {
    this.availability = availability;
    return this;
  }

  public AzureAvailability getAvailability() {
    return availability;
  }

  public AzureAttributes setFirstOnDemand(Long firstOnDemand) {
    this.firstOnDemand = firstOnDemand;
    return this;
  }

  public Long getFirstOnDemand() {
    return firstOnDemand;
  }

  public AzureAttributes setLogAnalyticsInfo(LogAnalyticsInfo logAnalyticsInfo) {
    this.logAnalyticsInfo = logAnalyticsInfo;
    return this;
  }

  public LogAnalyticsInfo getLogAnalyticsInfo() {
    return logAnalyticsInfo;
  }

  public AzureAttributes setSpotBidMaxPrice(Double spotBidMaxPrice) {
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
    AzureAttributes that = (AzureAttributes) o;
    return Objects.equals(availability, that.availability)
        && Objects.equals(firstOnDemand, that.firstOnDemand)
        && Objects.equals(logAnalyticsInfo, that.logAnalyticsInfo)
        && Objects.equals(spotBidMaxPrice, that.spotBidMaxPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availability, firstOnDemand, logAnalyticsInfo, spotBidMaxPrice);
  }

  @Override
  public String toString() {
    return new ToStringer(AzureAttributes.class)
        .add("availability", availability)
        .add("firstOnDemand", firstOnDemand)
        .add("logAnalyticsInfo", logAnalyticsInfo)
        .add("spotBidMaxPrice", spotBidMaxPrice)
        .toString();
  }

  AzureAttributesPb toPb() {
    AzureAttributesPb pb = new AzureAttributesPb();
    pb.setAvailability(availability);
    pb.setFirstOnDemand(firstOnDemand);
    pb.setLogAnalyticsInfo(logAnalyticsInfo);
    pb.setSpotBidMaxPrice(spotBidMaxPrice);

    return pb;
  }

  static AzureAttributes fromPb(AzureAttributesPb pb) {
    AzureAttributes model = new AzureAttributes();
    model.setAvailability(pb.getAvailability());
    model.setFirstOnDemand(pb.getFirstOnDemand());
    model.setLogAnalyticsInfo(pb.getLogAnalyticsInfo());
    model.setSpotBidMaxPrice(pb.getSpotBidMaxPrice());

    return model;
  }

  public static class AzureAttributesSerializer extends JsonSerializer<AzureAttributes> {
    @Override
    public void serialize(AzureAttributes value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AzureAttributesPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AzureAttributesDeserializer extends JsonDeserializer<AzureAttributes> {
    @Override
    public AzureAttributes deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AzureAttributesPb pb = mapper.readValue(p, AzureAttributesPb.class);
      return AzureAttributes.fromPb(pb);
    }
  }
}
