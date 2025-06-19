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

/** Details required to update an IP access list. */
@Generated
@JsonSerialize(using = UpdateIpAccessList.UpdateIpAccessListSerializer.class)
@JsonDeserialize(using = UpdateIpAccessList.UpdateIpAccessListDeserializer.class)
public class UpdateIpAccessList {
  /** Specifies whether this IP access list is enabled. */
  private Boolean enabled;

  /** The ID for the corresponding IP access list */
  private String ipAccessListId;

  /** */
  private Collection<String> ipAddresses;

  /** Label for the IP access list. This **cannot** be empty. */
  private String label;

  /**
   * Type of IP access list. Valid values are as follows and are case-sensitive:
   *
   * <p>* `ALLOW`: An allow list. Include this IP or range. * `BLOCK`: A block list. Exclude this IP
   * or range. IP addresses in the block list are excluded even if they are included in an allow
   * list.
   */
  private ListType listType;

  public UpdateIpAccessList setEnabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  public UpdateIpAccessList setIpAccessListId(String ipAccessListId) {
    this.ipAccessListId = ipAccessListId;
    return this;
  }

  public String getIpAccessListId() {
    return ipAccessListId;
  }

  public UpdateIpAccessList setIpAddresses(Collection<String> ipAddresses) {
    this.ipAddresses = ipAddresses;
    return this;
  }

  public Collection<String> getIpAddresses() {
    return ipAddresses;
  }

  public UpdateIpAccessList setLabel(String label) {
    this.label = label;
    return this;
  }

  public String getLabel() {
    return label;
  }

  public UpdateIpAccessList setListType(ListType listType) {
    this.listType = listType;
    return this;
  }

  public ListType getListType() {
    return listType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateIpAccessList that = (UpdateIpAccessList) o;
    return Objects.equals(enabled, that.enabled)
        && Objects.equals(ipAccessListId, that.ipAccessListId)
        && Objects.equals(ipAddresses, that.ipAddresses)
        && Objects.equals(label, that.label)
        && Objects.equals(listType, that.listType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, ipAccessListId, ipAddresses, label, listType);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateIpAccessList.class)
        .add("enabled", enabled)
        .add("ipAccessListId", ipAccessListId)
        .add("ipAddresses", ipAddresses)
        .add("label", label)
        .add("listType", listType)
        .toString();
  }

  UpdateIpAccessListPb toPb() {
    UpdateIpAccessListPb pb = new UpdateIpAccessListPb();
    pb.setEnabled(enabled);
    pb.setIpAccessListId(ipAccessListId);
    pb.setIpAddresses(ipAddresses);
    pb.setLabel(label);
    pb.setListType(listType);

    return pb;
  }

  static UpdateIpAccessList fromPb(UpdateIpAccessListPb pb) {
    UpdateIpAccessList model = new UpdateIpAccessList();
    model.setEnabled(pb.getEnabled());
    model.setIpAccessListId(pb.getIpAccessListId());
    model.setIpAddresses(pb.getIpAddresses());
    model.setLabel(pb.getLabel());
    model.setListType(pb.getListType());

    return model;
  }

  public static class UpdateIpAccessListSerializer extends JsonSerializer<UpdateIpAccessList> {
    @Override
    public void serialize(UpdateIpAccessList value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateIpAccessListPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateIpAccessListDeserializer extends JsonDeserializer<UpdateIpAccessList> {
    @Override
    public UpdateIpAccessList deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateIpAccessListPb pb = mapper.readValue(p, UpdateIpAccessListPb.class);
      return UpdateIpAccessList.fromPb(pb);
    }
  }
}
