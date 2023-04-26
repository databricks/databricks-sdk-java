// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>AwsAttributes class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class AwsAttributes {
  /**
   * Availability type used for all subsequent nodes past the `first_on_demand` ones.
   *
   * <p>Note: If `first_on_demand` is zero, this availability type will be used for the entire
   * cluster.
   */
  @JsonProperty("availability")
  private AwsAvailability availability;

  /**
   * The number of volumes launched for each instance. Users can choose up to 10 volumes. This
   * feature is only enabled for supported node types. Legacy node types cannot specify custom EBS
   * volumes. For node types with no instance store, at least one EBS volume needs to be specified;
   * otherwise, cluster creation will fail.
   *
   * <p>These EBS volumes will be mounted at `/ebs0`, `/ebs1`, and etc. Instance store volumes will
   * be mounted at `/local_disk0`, `/local_disk1`, and etc.
   *
   * <p>If EBS volumes are attached, Databricks will configure Spark to use only the EBS volumes for
   * scratch storage because heterogenously sized scratch devices can lead to inefficient disk
   * utilization. If no EBS volumes are attached, Databricks will configure Spark to use instance
   * store volumes.
   *
   * <p>Please note that if EBS volumes are specified, then the Spark configuration
   * `spark.local.dir` will be overridden.
   */
  @JsonProperty("ebs_volume_count")
  private Long ebsVolumeCount;

  /** <needs content added> */
  @JsonProperty("ebs_volume_iops")
  private Long ebsVolumeIops;

  /**
   * The size of each EBS volume (in GiB) launched for each instance. For general purpose SSD, this
   * value must be within the range 100 - 4096. For throughput optimized HDD, this value must be
   * within the range 500 - 4096.
   */
  @JsonProperty("ebs_volume_size")
  private Long ebsVolumeSize;

  /** <needs content added> */
  @JsonProperty("ebs_volume_throughput")
  private Long ebsVolumeThroughput;

  /** The type of EBS volumes that will be launched with this cluster. */
  @JsonProperty("ebs_volume_type")
  private EbsVolumeType ebsVolumeType;

  /**
   * The first `first_on_demand` nodes of the cluster will be placed on on-demand instances. If this
   * value is greater than 0, the cluster driver node in particular will be placed on an on-demand
   * instance. If this value is greater than or equal to the current cluster size, all nodes will be
   * placed on on-demand instances. If this value is less than the current cluster size,
   * `first_on_demand` nodes will be placed on on-demand instances and the remainder will be placed
   * on `availability` instances. Note that this value does not affect cluster size and cannot
   * currently be mutated over the lifetime of a cluster.
   */
  @JsonProperty("first_on_demand")
  private Long firstOnDemand;

  /**
   * Nodes for this cluster will only be placed on AWS instances with this instance profile. If
   * ommitted, nodes will be placed on instances without an IAM instance profile. The instance
   * profile must have previously been added to the Databricks environment by an account
   * administrator.
   *
   * <p>This feature may only be available to certain customer plans.
   *
   * <p>If this field is ommitted, we will pull in the default from the conf if it exists.
   */
  @JsonProperty("instance_profile_arn")
  private String instanceProfileArn;

  /**
   * The bid price for AWS spot instances, as a percentage of the corresponding instance type's
   * on-demand price. For example, if this field is set to 50, and the cluster needs a new
   * `r3.xlarge` spot instance, then the bid price is half of the price of on-demand `r3.xlarge`
   * instances. Similarly, if this field is set to 200, the bid price is twice the price of
   * on-demand `r3.xlarge` instances. If not specified, the default value is 100. When spot
   * instances are requested for this cluster, only spot instances whose bid price percentage
   * matches this field will be considered. Note that, for safety, we enforce this field to be no
   * more than 10000.
   *
   * <p>The default value and documentation here should be kept consistent with
   * CommonConf.defaultSpotBidPricePercent and CommonConf.maxSpotBidPricePercent.
   */
  @JsonProperty("spot_bid_price_percent")
  private Long spotBidPricePercent;

  /**
   * Identifier for the availability zone/datacenter in which the cluster resides. This string will
   * be of a form like "us-west-2a". The provided availability zone must be in the same region as
   * the Databricks deployment. For example, "us-west-2a" is not a valid zone id if the Databricks
   * deployment resides in the "us-east-1" region. This is an optional field at cluster creation,
   * and if not specified, a default zone will be used. If the zone specified is "auto", will try to
   * place cluster in a zone with high availability, and will retry placement in a different AZ if
   * there is not enough capacity. See [[AutoAZHelper.scala]] for more details. The list of
   * available zones as well as the default value can be found by using the `List Zones`_ method.
   */
  @JsonProperty("zone_id")
  private String zoneId;

  /**
   * <p>Setter for the field <code>availability</code>.</p>
   *
   * @param availability a {@link com.databricks.sdk.service.compute.AwsAvailability} object
   * @return a {@link com.databricks.sdk.service.compute.AwsAttributes} object
   */
  public AwsAttributes setAvailability(AwsAvailability availability) {
    this.availability = availability;
    return this;
  }

  /**
   * <p>Getter for the field <code>availability</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.AwsAvailability} object
   */
  public AwsAvailability getAvailability() {
    return availability;
  }

  /**
   * <p>Setter for the field <code>ebsVolumeCount</code>.</p>
   *
   * @param ebsVolumeCount a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.AwsAttributes} object
   */
  public AwsAttributes setEbsVolumeCount(Long ebsVolumeCount) {
    this.ebsVolumeCount = ebsVolumeCount;
    return this;
  }

  /**
   * <p>Getter for the field <code>ebsVolumeCount</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getEbsVolumeCount() {
    return ebsVolumeCount;
  }

  /**
   * <p>Setter for the field <code>ebsVolumeIops</code>.</p>
   *
   * @param ebsVolumeIops a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.AwsAttributes} object
   */
  public AwsAttributes setEbsVolumeIops(Long ebsVolumeIops) {
    this.ebsVolumeIops = ebsVolumeIops;
    return this;
  }

  /**
   * <p>Getter for the field <code>ebsVolumeIops</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getEbsVolumeIops() {
    return ebsVolumeIops;
  }

  /**
   * <p>Setter for the field <code>ebsVolumeSize</code>.</p>
   *
   * @param ebsVolumeSize a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.AwsAttributes} object
   */
  public AwsAttributes setEbsVolumeSize(Long ebsVolumeSize) {
    this.ebsVolumeSize = ebsVolumeSize;
    return this;
  }

  /**
   * <p>Getter for the field <code>ebsVolumeSize</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getEbsVolumeSize() {
    return ebsVolumeSize;
  }

  /**
   * <p>Setter for the field <code>ebsVolumeThroughput</code>.</p>
   *
   * @param ebsVolumeThroughput a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.AwsAttributes} object
   */
  public AwsAttributes setEbsVolumeThroughput(Long ebsVolumeThroughput) {
    this.ebsVolumeThroughput = ebsVolumeThroughput;
    return this;
  }

  /**
   * <p>Getter for the field <code>ebsVolumeThroughput</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getEbsVolumeThroughput() {
    return ebsVolumeThroughput;
  }

  /**
   * <p>Setter for the field <code>ebsVolumeType</code>.</p>
   *
   * @param ebsVolumeType a {@link com.databricks.sdk.service.compute.EbsVolumeType} object
   * @return a {@link com.databricks.sdk.service.compute.AwsAttributes} object
   */
  public AwsAttributes setEbsVolumeType(EbsVolumeType ebsVolumeType) {
    this.ebsVolumeType = ebsVolumeType;
    return this;
  }

  /**
   * <p>Getter for the field <code>ebsVolumeType</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.EbsVolumeType} object
   */
  public EbsVolumeType getEbsVolumeType() {
    return ebsVolumeType;
  }

  /**
   * <p>Setter for the field <code>firstOnDemand</code>.</p>
   *
   * @param firstOnDemand a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.AwsAttributes} object
   */
  public AwsAttributes setFirstOnDemand(Long firstOnDemand) {
    this.firstOnDemand = firstOnDemand;
    return this;
  }

  /**
   * <p>Getter for the field <code>firstOnDemand</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getFirstOnDemand() {
    return firstOnDemand;
  }

  /**
   * <p>Setter for the field <code>instanceProfileArn</code>.</p>
   *
   * @param instanceProfileArn a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.AwsAttributes} object
   */
  public AwsAttributes setInstanceProfileArn(String instanceProfileArn) {
    this.instanceProfileArn = instanceProfileArn;
    return this;
  }

  /**
   * <p>Getter for the field <code>instanceProfileArn</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getInstanceProfileArn() {
    return instanceProfileArn;
  }

  /**
   * <p>Setter for the field <code>spotBidPricePercent</code>.</p>
   *
   * @param spotBidPricePercent a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.AwsAttributes} object
   */
  public AwsAttributes setSpotBidPricePercent(Long spotBidPricePercent) {
    this.spotBidPricePercent = spotBidPricePercent;
    return this;
  }

  /**
   * <p>Getter for the field <code>spotBidPricePercent</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getSpotBidPricePercent() {
    return spotBidPricePercent;
  }

  /**
   * <p>Setter for the field <code>zoneId</code>.</p>
   *
   * @param zoneId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.AwsAttributes} object
   */
  public AwsAttributes setZoneId(String zoneId) {
    this.zoneId = zoneId;
    return this;
  }

  /**
   * <p>Getter for the field <code>zoneId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getZoneId() {
    return zoneId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AwsAttributes that = (AwsAttributes) o;
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

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(AwsAttributes.class)
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
