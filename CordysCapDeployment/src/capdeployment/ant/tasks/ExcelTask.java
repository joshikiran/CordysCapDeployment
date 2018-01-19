package capdeployment.ant.tasks;

import com.cordys.deployment.ant.tasks.BaseTask;

import capdeployment.ant.handler.ReadingExcel;
import capdeployment.ant.handler.SourceHandler;
import capdeployment.ant.settings.DeploymentSettings;

@SuppressWarnings("rawtypes")
public class ExcelTask extends BaseTask<DeploymentSettings, SourceHandler<ReadingExcel>> {
	private ReadingExcel<DeploymentSettings> excelSteps = null;
	public static DeploymentSettings settings = new DeploymentSettings();
	
	public ExcelTask() {
		super(settings);
		excelSteps = new ReadingExcel<DeploymentSettings>(settings);
		// TODO Auto-generated constructor stub
	}
	
	public void setFilePath(String filePath) {
		((DeploymentSettings) getSettings()).setFilePath(filePath);
	}

	@Override
	protected SourceHandler<ReadingExcel> createHandler(String ldapRoot, DeploymentSettings arg1) {
		// TODO Auto-generated method stub
		return new SourceHandler<ReadingExcel>(ldapRoot, excelSteps);
	}

}
