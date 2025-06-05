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

/** Definition of an IP Access list */
@Generated
@JsonSerialize(using = IpAccessListInfo.IpAccessListInfoSerializer.class)
@JsonDeserialize(using = IpAccessListInfo.IpAccessListInfoDeserializer.class)
public class IpAccessListInfo {
  /** Total number of IP or CIDR values. */
  private Long addressCount;

  /** Creation timestamp in milliseconds. */
  private Long createdAt;

  /** User ID of the user who created this list. */
  private Long createdBy;

  /** Specifies whether this IP access list is enabled. */
  private Boolean enabled;

  /** */
  private Collection<String> ipAddresses;

  /** Label for the IP access list. This **cannot** be empty. */
  private String label;

  /** Universally unique identifier (UUID) of the IP access list. */
  private String listId;

  /**
   * Type of IP access list. Valid values are as follows and are case-sensitive:
   *
   * <p>* `ALLOW`: An allow list. Include this IP or range. * `BLOCK`: A block list. Exclude this IP
   * or range. IP addresses in the block list are excluded even if they are included in an allow
   * list.
   */
  private ListType listType;

  /** Update timestamp in milliseconds. */
  private Long updatedAt;

  /** User ID of the user who updated this list. */
  private Long updatedBy;

  public IpAccessListInfo setAddressCount(Long addressCount) {
    this.addressCount = addressCount;
    return this;
  }

  public Long getAddressCount() {
    return addressCount;
  }

  public IpAccessListInfo setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public IpAccessListInfo setCreatedBy(Long createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public Long getCreatedBy() {
    return createdBy;
  }

  public IpAccessListInfo setEnabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  public IpAccessListInfo setIpAddresses(Collection<String> ipAddresses) {
    this.ipAddresses = ipAddresses;
    return this;
  }

  public Collection<String> getIpAddresses() {
    return ipAddresses;
  }

  public IpAccessListInfo setLabel(String label) {
    this.label = label;
    return this;
  }

  public String getLabel() {
    return label;
  }

  public IpAccessListInfo setListId(String listId) {
    this.listId = listId;
    return this;
  }

  public String getListId() {
    return listId;
  }

  public IpAccessListInfo setListType(ListType listType) {
    this.listType = listType;
    return this;
  }

  public ListType getListType() {
    return listType;
  }

  public IpAccessListInfo setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  public IpAccessListInfo setUpdatedBy(Long updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  public Long getUpdatedBy() {
    return updatedBy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    IpAccessListInfo that = (IpAccessListInfo) o;
    return Objects.equals(addressCount, that.addressCount)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(enabled, that.enabled)
        && Objects.equals(ipAddresses, that.ipAddresses)
        && Objects.equals(label, that.label)
        && Objects.equals(listId, that.listId)
        && Objects.equals(listType, that.listType)
        && Objects.equals(updatedAt, that.updatedAt)
        && Objects.equals(updatedBy, that.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        addressCount,
        createdAt,
        createdBy,
        enabled,
        ipAddresses,
        label,
        listId,
        listType,
        updatedAt,
        updatedBy);
  }

  @Override
  public String toString() {
    return new ToStringer(IpAccessListInfo.class)
        .add("addressCount", addressCount)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("enabled", enabled)
        .add("ipAddresses", ipAddresses)
        .add("label", label)
        .add("listId", listId)
        .add("listType", listType)
        .add("updatedAt", updatedAt)
        .add("updatedBy", updatedBy)
        .toString();
  }

  IpAccessListInfoPb toPb() {
    IpAccessListInfoPb pb = new IpAccessListInfoPb();
    pb.setAddressCount(addressCount);
    pb.setCreatedAt(createdAt);
    pb.setCreatedBy(createdBy);
    pb.setEnabled(enabled);
    pb.setIpAddresses(ipAddresses);
    pb.setLabel(label);
    pb.setListId(listId);
    pb.setListType(listType);
    pb.setUpdatedAt(updatedAt);
    pb.setUpdatedBy(updatedBy);

    return pb;
  }

  static IpAccessListInfo fromPb(IpAccessListInfoPb pb) {
    IpAccessListInfo model = new IpAccessListInfo();
    model.setAddressCount(pb.getAddressCount());
    model.setCreatedAt(pb.getCreatedAt());
    model.setCreatedBy(pb.getCreatedBy());
    model.setEnabled(pb.getEnabled());
    model.setIpAddresses(pb.getIpAddresses());
    model.setLabel(pb.getLabel());
    model.setListId(pb.getListId());
    model.setListType(pb.getListType());
    model.setUpdatedAt(pb.getUpdatedAt());
    model.setUpdatedBy(pb.getUpdatedBy());

    return model;
  }

  public static class IpAccessListInfoSerializer extends JsonSerializer<IpAccessListInfo> {
    @Override
    public void serialize(IpAccessListInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      IpAccessListInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class IpAccessListInfoDeserializer extends JsonDeserializer<IpAccessListInfo> {
    @Override
    public IpAccessListInfo deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      IpAccessListInfoPb pb = mapper.readValue(p, IpAccessListInfoPb.class);
      return IpAccessListInfo.fromPb(pb);
    }
  }
}
