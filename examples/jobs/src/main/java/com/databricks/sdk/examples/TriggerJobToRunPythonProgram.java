package com.databricks.sdk.examples;

import com.databricks.sdk.DatabricksWorkspace;
import com.databricks.sdk.client.DatabricksConfig;
import com.databricks.sdk.service.compute.ClusterInfo;
import com.databricks.sdk.service.compute.CreateCluster;
import com.databricks.sdk.service.files.Create;
import com.databricks.sdk.service.files.CreateResponse;
import com.databricks.sdk.service.jobs.*;
import com.databricks.sdk.support.Wait;

import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Base64;
import java.util.Collections;
import java.util.concurrent.TimeoutException;

public class TriggerJobToRunPythonProgram {
    private static DatabricksConfig getConfig() {
        DatabricksConfig config = new DatabricksConfig();
        config.resolve().authenticate();
        return config;
    }
    private static DatabricksWorkspace getWorkspace() {
        DatabricksConfig config = getConfig();
        return new DatabricksWorkspace(config);
    }

    private static String getSamplePythonProgram() {
        return "import time; time.sleep(10); print(\"Hello, World!\")";
    }

    private static ClusterInfo getCluster(DatabricksWorkspace testWorkspace) {
        try {
            CreateCluster request = new CreateCluster()
                    .setClusterName("test-cluster")
                    .setSparkVersion("13.0.x-scala2.11")
                    .setNodeTypeId("i3.xlarge")
                    .setNumWorkers(1L);
            return testWorkspace.clusters().create(request).get(Duration.ofMinutes(5));
        } catch (TimeoutException e) {
            System.err.println("Timeout: Didn't get cluster within 5 minutes. Error Message: " + e.getMessage());
            System.exit(1);
        }
        return null;
    }

    private static String triggerJobOn(DatabricksWorkspace w, ClusterInfo cluster) {
        String pyFileOnDBFS = String.format("/home/%s/java-sdk-test-sample.py", w.currentUser().me().getUserName());
        String pyProgram = getSamplePythonProgram();
        String encodedPyProgram = Base64.getEncoder().encodeToString(pyProgram.getBytes(StandardCharsets.UTF_8));

        CreateResponse stream = w.dbfs().create(new Create().setOverwrite(true).setPath(pyFileOnDBFS));
        w.dbfs().addBlock(stream.getHandle(), encodedPyProgram);
        w.dbfs().close(stream.getHandle());

        String runName = String.format("java-sdk-run-%s", System.currentTimeMillis()/1000.0);

        String clusterId = cluster.getClusterId();
        RunSubmitTaskSettings task = new RunSubmitTaskSettings()
                .setTaskKey("hello_world")
                .setSparkPythonTask(
                        new SparkPythonTask()
                                .setPythonFile(String.format("dbfs:%s", pyFileOnDBFS))
                )
                .setExistingClusterId(clusterId);

        Wait<Run, SubmitRunResponse> submit = w.jobs().submit(
                new SubmitRun()
                        .setRunName(runName)
                        .setTasks(Collections.singletonList(task))
        );

        System.out.printf("Starting to poll: %s%n", submit.getResponse().toString());
        return submit.getResponse().toString();
    }

    public static void main(String[] args) {
        // Get your workspace
        DatabricksWorkspace testWorkspace = getWorkspace();

        // Get cluster you want to run the job on
        ClusterInfo cluster = getCluster(testWorkspace);

        // Trigger a job
        String result = triggerJobOn(testWorkspace, cluster);

        // Print the result of job
        System.out.println(result);
    }

}