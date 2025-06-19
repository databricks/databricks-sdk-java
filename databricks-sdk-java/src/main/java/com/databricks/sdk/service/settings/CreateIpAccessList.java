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

/** Details required to configure a block list or allow list. */
@Generated
@JsonSerialize(using = CreateIpAccessList.CreateIpAccessListSerializer.class)
@JsonDeserialize(using = CreateIpAccessList.CreateIpAccessListDeserializer.class)
public class CreateIpAccessList {
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

  public CreateIpAccessList setIpAddresses(Collection<String> ipAddresses) {
    this.ipAddresses = ipAddresses;
    return this;
  }

  public Collection<String> getIpAddresses() {
    return ipAddresses;
  }

  public CreateIpAccessList setLabel(String label) {
    this.label = label;
    return this;
  }

  public String getLabel() {
    return label;
  }

  public CreateIpAccessList setListType(ListType listType) {
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
    CreateIpAccessList that = (CreateIpAccessList) o;
    return Objects.equals(ipAddresses, that.ipAddresses)
        && Objects.equals(label, that.label)
        && Objects.equals(listType, that.listType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddresses, label, listType);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateIpAccessList.class)
        .add("ipAddresses", ipAddresses)
        .add("label", label)
        .add("listType", listType)
        .toString();
  }

  CreateIpAccessListPb toPb() {
    CreateIpAccessListPb pb = new CreateIpAccessListPb();
    pb.setIpAddresses(ipAddresses);
    pb.setLabel(label);
    pb.setListType(listType);

    return pb;
  }

  static CreateIpAccessList fromPb(CreateIpAccessListPb pb) {
    CreateIpAccessList model = new CreateIpAccessList();
    model.setIpAddresses(pb.getIpAddresses());
    model.setLabel(pb.getLabel());
    model.setListType(pb.getListType());

    return model;
  }

  public static class CreateIpAccessListSerializer extends JsonSerializer<CreateIpAccessList> {
    @Override
    public void serialize(CreateIpAccessList value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateIpAccessListPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateIpAccessListDeserializer extends JsonDeserializer<CreateIpAccessList> {
    @Override
    public CreateIpAccessList deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateIpAccessListPb pb = mapper.readValue(p, CreateIpAccessListPb.class);
      return CreateIpAccessList.fromPb(pb);
    }
  }
}
