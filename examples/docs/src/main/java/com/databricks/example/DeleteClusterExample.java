package com.databricks.sdk.examples;

import com.databricks.sdk.WorkspaceClient;
import java.util.Scanner;

public class DeleteClusterExample {

  public static void main(String[] args) {
    System.out.println("ID of cluster to delete (for example, 1234-567890-ab123cd4):");

    Scanner in = new Scanner(System.in);
    String c_id = in.nextLine();
    WorkspaceClient w = new WorkspaceClient();

    w.clusters().permanentDelete(c_id);
  }
}
