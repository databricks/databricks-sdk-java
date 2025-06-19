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

/** Attributes set during cluster creation which are related to Amazon Web Services. */
@Generated
@JsonSerialize(using = AwsAttributes.AwsAttributesSerializer.class)
@JsonDeserialize(using = AwsAttributes.AwsAttributesDeserializer.class)
public class AwsAttributes {
  /**
   * Availability type used for all subsequent nodes past the `first_on_demand` ones.
   *
   * <p>Note: If `first_on_demand` is zero, this availability type will be used for the entire
   * cluster.
   */
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
  private Long ebsVolumeCount;

  /**
   * If using gp3 volumes, what IOPS to use for the disk. If this is not set, the maximum
   * performance of a gp2 volume with the same volume size will be used.
   */
  private Long ebsVolumeIops;

  /**
   * The size of each EBS volume (in GiB) launched for each instance. For general purpose SSD, this
   * value must be within the range 100 - 4096. For throughput optimized HDD, this value must be
   * within the range 500 - 4096.
   */
  private Long ebsVolumeSize;

  /**
   * If using gp3 volumes, what throughput to use for the disk. If this is not set, the maximum
   * performance of a gp2 volume with the same volume size will be used.
   */
  private Long ebsVolumeThroughput;

  /** The type of EBS volumes that will be launched with this cluster. */
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
  private Long firstOnDemand;

  /**
   * Nodes for this cluster will only be placed on AWS instances with this instance profile. If
   * ommitted, nodes will be placed on instances without an IAM instance profile. The instance
   * profile must have previously been added to the Databricks environment by an account
   * administrator.
   *
   * <p>This feature may only be available to certain customer plans.
   */
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
   */
  private Long spotBidPricePercent;

  /**
   * Identifier for the availability zone/datacenter in which the cluster resides. This string will
   * be of a form like "us-west-2a". The provided availability zone must be in the same region as
   * the Databricks deployment. For example, "us-west-2a" is not a valid zone id if the Databricks
   * deployment resides in the "us-east-1" region. This is an optional field at cluster creation,
   * and if not specified, a default zone will be used. If the zone specified is "auto", will try to
   * place cluster in a zone with high availability, and will retry placement in a different AZ if
   * there is not enough capacity.
   *
   * <p>The list of available zones as well as the default value can be found by using the `List
   * Zones` method.
   */
  private String zoneId;

  public AwsAttributes setAvailability(AwsAvailability availability) {
    this.availability = availability;
    return this;
  }

  public AwsAvailability getAvailability() {
    return availability;
  }

  public AwsAttributes setEbsVolumeCount(Long ebsVolumeCount) {
    this.ebsVolumeCount = ebsVolumeCount;
    return this;
  }

  public Long getEbsVolumeCount() {
    return ebsVolumeCount;
  }

  public AwsAttributes setEbsVolumeIops(Long ebsVolumeIops) {
    this.ebsVolumeIops = ebsVolumeIops;
    return this;
  }

  public Long getEbsVolumeIops() {
    return ebsVolumeIops;
  }

  public AwsAttributes setEbsVolumeSize(Long ebsVolumeSize) {
    this.ebsVolumeSize = ebsVolumeSize;
    return this;
  }

  public Long getEbsVolumeSize() {
    return ebsVolumeSize;
  }

  public AwsAttributes setEbsVolumeThroughput(Long ebsVolumeThroughput) {
    this.ebsVolumeThroughput = ebsVolumeThroughput;
    return this;
  }

  public Long getEbsVolumeThroughput() {
    return ebsVolumeThroughput;
  }

  public AwsAttributes setEbsVolumeType(EbsVolumeType ebsVolumeType) {
    this.ebsVolumeType = ebsVolumeType;
    return this;
  }

  public EbsVolumeType getEbsVolumeType() {
    return ebsVolumeType;
  }

  public AwsAttributes setFirstOnDemand(Long firstOnDemand) {
    this.firstOnDemand = firstOnDemand;
    return this;
  }

  public Long getFirstOnDemand() {
    return firstOnDemand;
  }

  public AwsAttributes setInstanceProfileArn(String instanceProfileArn) {
    this.instanceProfileArn = instanceProfileArn;
    return this;
  }

  public String getInstanceProfileArn() {
    return instanceProfileArn;
  }

  public AwsAttributes setSpotBidPricePercent(Long spotBidPricePercent) {
    this.spotBidPricePercent = spotBidPricePercent;
    return this;
  }

  public Long getSpotBidPricePercent() {
    return spotBidPricePercent;
  }

  public AwsAttributes setZoneId(String zoneId) {
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

  AwsAttributesPb toPb() {
    AwsAttributesPb pb = new AwsAttributesPb();
    pb.setAvailability(availability);
    pb.setEbsVolumeCount(ebsVolumeCount);
    pb.setEbsVolumeIops(ebsVolumeIops);
    pb.setEbsVolumeSize(ebsVolumeSize);
    pb.setEbsVolumeThroughput(ebsVolumeThroughput);
    pb.setEbsVolumeType(ebsVolumeType);
    pb.setFirstOnDemand(firstOnDemand);
    pb.setInstanceProfileArn(instanceProfileArn);
    pb.setSpotBidPricePercent(spotBidPricePercent);
    pb.setZoneId(zoneId);

    return pb;
  }

  static AwsAttributes fromPb(AwsAttributesPb pb) {
    AwsAttributes model = new AwsAttributes();
    model.setAvailability(pb.getAvailability());
    model.setEbsVolumeCount(pb.getEbsVolumeCount());
    model.setEbsVolumeIops(pb.getEbsVolumeIops());
    model.setEbsVolumeSize(pb.getEbsVolumeSize());
    model.setEbsVolumeThroughput(pb.getEbsVolumeThroughput());
    model.setEbsVolumeType(pb.getEbsVolumeType());
    model.setFirstOnDemand(pb.getFirstOnDemand());
    model.setInstanceProfileArn(pb.getInstanceProfileArn());
    model.setSpotBidPricePercent(pb.getSpotBidPricePercent());
    model.setZoneId(pb.getZoneId());

    return model;
  }

  public static class AwsAttributesSerializer extends JsonSerializer<AwsAttributes> {
    @Override
    public void serialize(AwsAttributes value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AwsAttributesPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AwsAttributesDeserializer extends JsonDeserializer<AwsAttributes> {
    @Override
    public AwsAttributes deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AwsAttributesPb pb = mapper.readValue(p, AwsAttributesPb.class);
      return AwsAttributes.fromPb(pb);
    }
  }
}
