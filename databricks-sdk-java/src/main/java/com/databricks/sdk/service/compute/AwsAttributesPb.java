// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Attributes set during cluster creation which are related to Amazon Web Services. */
@Generated
class AwsAttributesPb {
  @JsonProperty("availability")
  private AwsAvailability availability;

  @JsonProperty("ebs_volume_count")
  private Long ebsVolumeCount;

  @JsonProperty("ebs_volume_iops")
  private Long ebsVolumeIops;

  @JsonProperty("ebs_volume_size")
  private Long ebsVolumeSize;

  @JsonProperty("ebs_volume_throughput")
  private Long ebsVolumeThroughput;

  @JsonProperty("ebs_volume_type")
  private EbsVolumeType ebsVolumeType;

  @JsonProperty("first_on_demand")
  private Long firstOnDemand;

  @JsonProperty("instance_profile_arn")
  private String instanceProfileArn;

  @JsonProperty("spot_bid_price_percent")
  private Long spotBidPricePercent;

  @JsonProperty("zone_id")
  private String zoneId;

  public AwsAttributesPb setAvailability(AwsAvailability availability) {
    this.availability = availability;
    return this;
  }

  public AwsAvailability getAvailability() {
    return availability;
  }

  public AwsAttributesPb setEbsVolumeCount(Long ebsVolumeCount) {
    this.ebsVolumeCount = ebsVolumeCount;
    return this;
  }

  public Long getEbsVolumeCount() {
    return ebsVolumeCount;
  }

  public AwsAttributesPb setEbsVolumeIops(Long ebsVolumeIops) {
    this.ebsVolumeIops = ebsVolumeIops;
    return this;
  }

  public Long getEbsVolumeIops() {
    return ebsVolumeIops;
  }

  public AwsAttributesPb setEbsVolumeSize(Long ebsVolumeSize) {
    this.ebsVolumeSize = ebsVolumeSize;
    return this;
  }

  public Long getEbsVolumeSize() {
    return ebsVolumeSize;
  }

  public AwsAttributesPb setEbsVolumeThroughput(Long ebsVolumeThroughput) {
    this.ebsVolumeThroughput = ebsVolumeThroughput;
    return this;
  }

  public Long getEbsVolumeThroughput() {
    return ebsVolumeThroughput;
  }

  public AwsAttributesPb setEbsVolumeType(EbsVolumeType ebsVolumeType) {
    this.ebsVolumeType = ebsVolumeType;
    return this;
  }

  public EbsVolumeType getEbsVolumeType() {
    return ebsVolumeType;
  }

  public AwsAttributesPb setFirstOnDemand(Long firstOnDemand) {
    this.firstOnDemand = firstOnDemand;
    return this;
  }

  public Long getFirstOnDemand() {
    return firstOnDemand;
  }

  public AwsAttributesPb setInstanceProfileArn(String instanceProfileArn) {
    this.instanceProfileArn = instanceProfileArn;
    return this;
  }

  public String getInstanceProfileArn() {
    return instanceProfileArn;
  }

  public AwsAttributesPb setSpotBidPricePercent(Long spotBidPricePercent) {
    this.spotBidPricePercent = spotBidPricePercent;
    return this;
  }

  public Long getSpotBidPricePercent() {
    return spotBidPricePercent;
  }

  public AwsAttributesPb setZoneId(String zoneId) {
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
    AwsAttributesPb that = (AwsAttributesPb) o;
    return Objects.equals(availability, that.availability)
        && Objects.equals(ebsVolumeCount, that.ebsVolumeCount)
        && Objects.equals(ebsVolumeIops, that.ebsVolumeIops)
        && Objects.equals(ebsVolumeSize, that.ebsVolumeSize)
        && Objects.equals(ebsVolumeThroughput, that.ebsVolumeThroughput)
        && Objects.equals(ebsVolumeType, that.ebsVolumeType)
        && Objects.equals(firstOnDemand, that.firstOnDemand)
        && Objects.equals(instanceProfileArn, that.instanceProfileArn)
        && Objects.equals(spotBidPricePercent, that.spotBidPricePercent)
        && Objects.equals(zoneId, that.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        availability,
        ebsVolumeCount,
        ebsVolumeIops,
        ebsVolumeSize,
        ebsVolumeThroughput,
        ebsVolumeType,
        firstOnDemand,
        instanceProfileArn,
        spotBidPricePercent,
        zoneId);
  }

  @Override
  public String toString() {
    return new ToStringer(AwsAttributesPb.class)
        .add("availability", availability)
        .add("ebsVolumeCount", ebsVolumeCount)
        .add("ebsVolumeIops", ebsVolumeIops)
        .add("ebsVolumeSize", ebsVolumeSize)
        .add("ebsVolumeThroughput", ebsVolumeThroughput)
        .add("ebsVolumeType", ebsVolumeType)
        .add("firstOnDemand", firstOnDemand)
        .add("instanceProfileArn", instanceProfileArn)
        .add("spotBidPricePercent", spotBidPricePercent)
        .add("zoneId", zoneId)
        .toString();
  }
}
