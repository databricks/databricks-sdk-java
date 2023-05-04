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
import java.util.*;
import java.util.concurrent.TimeoutException;

/**
 An example class that triggers a Databricks job using the Databricks Java SDK.
 */
public class TriggerJobToRunPythonProgram {

    /**
     Returns a DatabricksConfig object with the configuration for connecting to Databricks.
     @return The DatabricksConfig object.
     */
    private static DatabricksConfig getConfig() {
        DatabricksConfig config = new DatabricksConfig();
        config.resolve().authenticate();
        return config;
    }

    /**
     Returns a DatabricksWorkspace object initialized with the configuration from getConfig().
     @return The DatabricksWorkspace object.
     */
    private static DatabricksWorkspace getWorkspace() {
        DatabricksConfig config = getConfig();
        return new DatabricksWorkspace(config);
    }

    /**
     Returns a sample Python program that sleeps for 1 second and prints a message containing the current UTC time.
     @return The sample Python program as a string.
     */
    private static String getSamplePythonProgram() {
        return "import time; time.sleep(1); print(\"This is a test run executed at: \" + time.strftime(\"%Y-%m-%d %H:%M:%S\", time.gmtime()) + \" UTC\" );";
    }

    /**
     Creates a Databricks cluster with the given specifications and returns the corresponding ClusterInfo object.
     @param testWorkspace The Databricks workspace where the cluster will be created.
     @return The ClusterInfo object representing the newly created cluster, or null if the creation process timed out.
     */
    private static ClusterInfo getCluster(DatabricksWorkspace testWorkspace) {
        try {
            CreateCluster request = new CreateCluster()
                    .setClusterName("test-cluster")
                    .setSparkVersion("8.2.x-scala2.12")
                    .setNodeTypeId("i3.xlarge")
                    .setAutoterminationMinutes(10L)
                    .setNumWorkers(1L);
            return testWorkspace.clusters().create(request).get(Duration.ofMinutes(10));
        } catch (TimeoutException e) {
            System.err.println("Timeout: Didn't get cluster within 10 minutes. Error Message: " + e.getMessage());
            System.exit(1);
        }
        return null;
    }

    /**
     Triggers a job on a specified Databricks cluster using the provided Databricks workspace.
     The method first creates a Python file on Databricks DBFS that contains a sample Python program.
     The program is then encoded using Base64, and added to the file created on DBFS.
     The method then creates a task for the job, which specifies the Python file on DBFS as the
     file to be executed, and the ID of the existing cluster to be used for the job. The task is
     then submitted to the workspace to trigger the job.
     @param testWorkspace the Databricks workspace to be used for triggering the job
     @param cluster the cluster on which to trigger the job
     @return a list of strings that contains the results of the job for each task in the job
     */
    private static List<String> triggerJobOn(DatabricksWorkspace testWorkspace, ClusterInfo cluster) {
        String pyFileOnDBFS = String.format("/home/%s/java-sdk-test-sample.py", testWorkspace.currentUser().me().getUserName());
        String pyProgram = getSamplePythonProgram();
        String encodedPyProgram = Base64.getEncoder().encodeToString(pyProgram.getBytes(StandardCharsets.UTF_8));

        CreateResponse stream = testWorkspace.dbfs().create(new Create().setOverwrite(true).setPath(pyFileOnDBFS));
        testWorkspace.dbfs().addBlock(stream.getHandle(), encodedPyProgram);
        testWorkspace.dbfs().close(stream.getHandle());

        String runName = String.format("java-sdk-run-%s", System.currentTimeMillis()/1000.0);

        RunSubmitTaskSettings task = new RunSubmitTaskSettings()
                .setTaskKey("test-task")
                .setSparkPythonTask(
                        new SparkPythonTask()
                                .setPythonFile(String.format("dbfs:%s", pyFileOnDBFS))
                )
                .setExistingClusterId(cluster.getClusterId());

        Wait<Run, SubmitRunResponse> submit = testWorkspace.jobs().submit(
                new SubmitRun()
                        .setRunName(runName)
                        .setTasks(Collections.singletonList(task))
        );

        Long runId = submit.getResponse().getRunId();
        System.out.printf("Starting to poll for JobID: %s%n%n", runId);

        List<String> results = new ArrayList<>();
        try {
            Collection<RunTask> tasks = submit.get().getTasks();
            for(RunTask eachTask: tasks) {
                Long taskRunId = eachTask.getRunId();
                String logs = testWorkspace.jobs().getRunOutput(taskRunId).getLogs();
                results.add(String.format("Result for taskID: %s = %s", taskRunId, logs));
            }
        } catch (TimeoutException e) {
            results.add(e.getMessage());
        }

        return results;
    }

    /**
     The main method to trigger the Databricks job execution and display the result of the job.
     */
    public static void main(String[] args) {
        // Get your workspace
        DatabricksWorkspace testWorkspace = getWorkspace();

        // Get cluster you want to run the job on
        ClusterInfo cluster = getCluster(testWorkspace);

        // Trigger a job
        List<String> results = triggerJobOn(testWorkspace, cluster);

        // Print the result of job
        results.forEach(System.out::println);
    }

}