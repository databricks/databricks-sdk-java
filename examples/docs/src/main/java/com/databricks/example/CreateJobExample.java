package com.databricks.sdk.examples;

import com.databricks.sdk.WorkspaceClient;
import com.databricks.sdk.service.jobs.*;
import java.util.*;

public class CreateJobExample {
  public static void main(String[] args) {
    System.out.println("Some short name for the job (for example, my-job):");
    Scanner in = new Scanner(System.in);
    String jobName = in.nextLine();

    System.out.println("Some short description for the job (for example, My job):");
    String description = in.nextLine();

    System.out.println(
        "ID of the existing cluster in the workspace to run the job on (for example, 1234-567890-ab123cd4):");
    String existingClusterId = in.nextLine();

    System.out.println(
        "Workspace path of the notebook to run (for example, /Users/someone@example.com/my-notebook):");
    String notebookPath = in.nextLine();

    System.out.println("Some key to apply to the job's tasks (for example, my-key): ");
    String taskKey = in.nextLine();

    System.out.println("Attempting to create the job. Please wait...");

    WorkspaceClient w = new WorkspaceClient();

    Map<String, String> map = new HashMap<>();

    Collection<Task> tasks =
        Arrays.asList(
            new Task()
                .setDescription(description)
                .setExistingClusterId(existingClusterId)
                .setNotebookTask(
                    new NotebookTask()
                        .setBaseParameters(map)
                        .setNotebookPath(notebookPath)
                        .setSource(Source.WORKSPACE))
                .setTaskKey(taskKey));

    CreateResponse j = w.jobs().create(new CreateJob().setName(jobName).setTasks(tasks));

    System.out.println("View  the job at " + w.config().getHost() + "/#job/" + j.getJobId());
  }
}
