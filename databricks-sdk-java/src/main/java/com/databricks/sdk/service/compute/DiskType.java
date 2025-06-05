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

/** Describes the disk type. */
@Generated
@JsonSerialize(using = DiskType.DiskTypeSerializer.class)
@JsonDeserialize(using = DiskType.DiskTypeDeserializer.class)
public class DiskType {
  /**
   * All Azure Disk types that Databricks supports. See
   * https://docs.microsoft.com/en-us/azure/storage/storage-about-disks-and-vhds-linux#types-of-disks
   */
  private DiskTypeAzureDiskVolumeType azureDiskVolumeType;

  /**
   * All EBS volume types that Databricks supports. See https://aws.amazon.com/ebs/details/ for
   * details.
   */
  private DiskTypeEbsVolumeType ebsVolumeType;

  public DiskType setAzureDiskVolumeType(DiskTypeAzureDiskVolumeType azureDiskVolumeType) {
    this.azureDiskVolumeType = azureDiskVolumeType;
    return this;
  }

  public DiskTypeAzureDiskVolumeType getAzureDiskVolumeType() {
    return azureDiskVolumeType;
  }

  public DiskType setEbsVolumeType(DiskTypeEbsVolumeType ebsVolumeType) {
    this.ebsVolumeType = ebsVolumeType;
    return this;
  }

  public DiskTypeEbsVolumeType getEbsVolumeType() {
    return ebsVolumeType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiskType that = (DiskType) o;
    return Objects.equals(azureDiskVolumeType, that.azureDiskVolumeType)
        && Objects.equals(ebsVolumeType, that.ebsVolumeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(azureDiskVolumeType, ebsVolumeType);
  }

  @Override
  public String toString() {
    return new ToStringer(DiskType.class)
        .add("azureDiskVolumeType", azureDiskVolumeType)
        .add("ebsVolumeType", ebsVolumeType)
        .toString();
  }

  DiskTypePb toPb() {
    DiskTypePb pb = new DiskTypePb();
    pb.setAzureDiskVolumeType(azureDiskVolumeType);
    pb.setEbsVolumeType(ebsVolumeType);

    return pb;
  }

  static DiskType fromPb(DiskTypePb pb) {
    DiskType model = new DiskType();
    model.setAzureDiskVolumeType(pb.getAzureDiskVolumeType());
    model.setEbsVolumeType(pb.getEbsVolumeType());

    return model;
  }

  public static class DiskTypeSerializer extends JsonSerializer<DiskType> {
    @Override
    public void serialize(DiskType value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DiskTypePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DiskTypeDeserializer extends JsonDeserializer<DiskType> {
    @Override
    public DiskType deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DiskTypePb pb = mapper.readValue(p, DiskTypePb.class);
      return DiskType.fromPb(pb);
    }
  }
}
