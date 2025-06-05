// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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

@Generated
@JsonSerialize(using = ListVolumesResponseContent.ListVolumesResponseContentSerializer.class)
@JsonDeserialize(using = ListVolumesResponseContent.ListVolumesResponseContentDeserializer.class)
public class ListVolumesResponseContent {
  /**
   * Opaque token to retrieve the next page of results. Absent if there are no more pages.
   * __page_token__ should be set to this value for the next request to retrieve the next page of
   * results.
   */
  private String nextPageToken;

  /** */
  private Collection<VolumeInfo> volumes;

  public ListVolumesResponseContent setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListVolumesResponseContent setVolumes(Collection<VolumeInfo> volumes) {
    this.volumes = volumes;
    return this;
  }

  public Collection<VolumeInfo> getVolumes() {
    return volumes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListVolumesResponseContent that = (ListVolumesResponseContent) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(volumes, that.volumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, volumes);
  }

  @Override
  public String toString() {
    return new ToStringer(ListVolumesResponseContent.class)
        .add("nextPageToken", nextPageToken)
        .add("volumes", volumes)
        .toString();
  }

  ListVolumesResponseContentPb toPb() {
    ListVolumesResponseContentPb pb = new ListVolumesResponseContentPb();
    pb.setNextPageToken(nextPageToken);
    pb.setVolumes(volumes);

    return pb;
  }

  static ListVolumesResponseContent fromPb(ListVolumesResponseContentPb pb) {
    ListVolumesResponseContent model = new ListVolumesResponseContent();
    model.setNextPageToken(pb.getNextPageToken());
    model.setVolumes(pb.getVolumes());

    return model;
  }

  public static class ListVolumesResponseContentSerializer
      extends JsonSerializer<ListVolumesResponseContent> {
    @Override
    public void serialize(
        ListVolumesResponseContent value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListVolumesResponseContentPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListVolumesResponseContentDeserializer
      extends JsonDeserializer<ListVolumesResponseContent> {
    @Override
    public ListVolumesResponseContent deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListVolumesResponseContentPb pb = mapper.readValue(p, ListVolumesResponseContentPb.class);
      return ListVolumesResponseContent.fromPb(pb);
    }
  }
}
