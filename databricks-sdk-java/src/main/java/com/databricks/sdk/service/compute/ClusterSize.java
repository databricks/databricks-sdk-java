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

@Generated
@JsonSerialize(using = ClusterSize.ClusterSizeSerializer.class)
@JsonDeserialize(using = ClusterSize.ClusterSizeDeserializer.class)
public class ClusterSize {
  /**
   * Parameters needed in order to automatically scale clusters up and down based on load. Note:
   * autoscaling works best with DB runtime versions 3.0 or later.
   */
  private AutoScale autoscale;

  /**
   * Number of worker nodes that this cluster should have. A cluster has one Spark Driver and
   * `num_workers` Executors for a total of `num_workers` + 1 Spark nodes.
   *
   * <p>Note: When reading the properties of a cluster, this field reflects the desired number of
   * workers rather than the actual current number of workers. For instance, if a cluster is resized
   * from 5 to 10 workers, this field will immediately be updated to reflect the target size of 10
   * workers, whereas the workers listed in `spark_info` will gradually increase from 5 to 10 as the
   * new nodes are provisioned.
   */
  private Long numWorkers;

  public ClusterSize setAutoscale(AutoScale autoscale) {
    this.autoscale = autoscale;
    return this;
  }

  public AutoScale getAutoscale() {
    return autoscale;
  }

  public ClusterSize setNumWorkers(Long numWorkers) {
    this.numWorkers = numWorkers;
    return this;
  }

  public Long getNumWorkers() {
    return numWorkers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClusterSize that = (ClusterSize) o;
    return Objects.equals(autoscale, that.autoscale) && Objects.equals(numWorkers, that.numWorkers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoscale, numWorkers);
  }

  @Override
  public String toString() {
    return new ToStringer(ClusterSize.class)
        .add("autoscale", autoscale)
        .add("numWorkers", numWorkers)
        .toString();
  }

  ClusterSizePb toPb() {
    ClusterSizePb pb = new ClusterSizePb();
    pb.setAutoscale(autoscale);
    pb.setNumWorkers(numWorkers);

    return pb;
  }

  static ClusterSize fromPb(ClusterSizePb pb) {
    ClusterSize model = new ClusterSize();
    model.setAutoscale(pb.getAutoscale());
    model.setNumWorkers(pb.getNumWorkers());

    return model;
  }

  public static class ClusterSizeSerializer extends JsonSerializer<ClusterSize> {
    @Override
    public void serialize(ClusterSize value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ClusterSizePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ClusterSizeDeserializer extends JsonDeserializer<ClusterSize> {
    @Override
    public ClusterSize deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ClusterSizePb pb = mapper.readValue(p, ClusterSizePb.class);
      return ClusterSize.fromPb(pb);
    }
  }
}
