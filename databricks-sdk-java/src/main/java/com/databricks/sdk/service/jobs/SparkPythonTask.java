// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

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
@JsonSerialize(using = SparkPythonTask.SparkPythonTaskSerializer.class)
@JsonDeserialize(using = SparkPythonTask.SparkPythonTaskDeserializer.class)
public class SparkPythonTask {
  /**
   * Command line parameters passed to the Python file.
   *
   * <p>Use [Task parameter variables] to set parameters containing information about job runs.
   *
   * <p>[Task parameter variables]: https://docs.databricks.com/jobs.html#parameter-variables
   */
  private Collection<String> parameters;

  /**
   * The Python file to be executed. Cloud file URIs (such as dbfs:/, s3:/, adls:/, gcs:/) and
   * workspace paths are supported. For python files stored in the Databricks workspace, the path
   * must be absolute and begin with `/`. For files stored in a remote repository, the path must be
   * relative. This field is required.
   */
  private String pythonFile;

  /**
   * Optional location type of the Python file. When set to `WORKSPACE` or not specified, the file
   * will be retrieved from the local Databricks workspace or cloud location (if the `python_file`
   * has a URI format). When set to `GIT`, the Python file will be retrieved from a Git repository
   * defined in `git_source`.
   *
   * <p>* `WORKSPACE`: The Python file is located in a Databricks workspace or at a cloud filesystem
   * URI. * `GIT`: The Python file is located in a remote Git repository.
   */
  private Source source;

  public SparkPythonTask setParameters(Collection<String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Collection<String> getParameters() {
    return parameters;
  }

  public SparkPythonTask setPythonFile(String pythonFile) {
    this.pythonFile = pythonFile;
    return this;
  }

  public String getPythonFile() {
    return pythonFile;
  }

  public SparkPythonTask setSource(Source source) {
    this.source = source;
    return this;
  }

  public Source getSource() {
    return source;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SparkPythonTask that = (SparkPythonTask) o;
    return Objects.equals(parameters, that.parameters)
        && Objects.equals(pythonFile, that.pythonFile)
        && Objects.equals(source, that.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameters, pythonFile, source);
  }

  @Override
  public String toString() {
    return new ToStringer(SparkPythonTask.class)
        .add("parameters", parameters)
        .add("pythonFile", pythonFile)
        .add("source", source)
        .toString();
  }

  SparkPythonTaskPb toPb() {
    SparkPythonTaskPb pb = new SparkPythonTaskPb();
    pb.setParameters(parameters);
    pb.setPythonFile(pythonFile);
    pb.setSource(source);

    return pb;
  }

  static SparkPythonTask fromPb(SparkPythonTaskPb pb) {
    SparkPythonTask model = new SparkPythonTask();
    model.setParameters(pb.getParameters());
    model.setPythonFile(pb.getPythonFile());
    model.setSource(pb.getSource());

    return model;
  }

  public static class SparkPythonTaskSerializer extends JsonSerializer<SparkPythonTask> {
    @Override
    public void serialize(SparkPythonTask value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SparkPythonTaskPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SparkPythonTaskDeserializer extends JsonDeserializer<SparkPythonTask> {
    @Override
    public SparkPythonTask deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SparkPythonTaskPb pb = mapper.readValue(p, SparkPythonTaskPb.class);
      return SparkPythonTask.fromPb(pb);
    }
  }
}
