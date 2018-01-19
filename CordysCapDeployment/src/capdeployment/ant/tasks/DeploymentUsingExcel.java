package capdeployment.ant.tasks;

import capdeployment.ant.handler.ReadingExcel;
import capdeployment.ant.settings.DeploymentSettings;

@SuppressWarnings("rawtypes")
public class DeploymentUsingExcel extends SourceTask<DeploymentSettings, ReadingExcel> {
	private static DeploymentSettings settings = new DeploymentSettings();

	public void setFilePath(String filePath) {
		((DeploymentSettings) getSettings()).setFilePath(filePath);
	}

	public DeploymentUsingExcel() {
		super(settings, new ReadingExcel(settings));
	}
}
