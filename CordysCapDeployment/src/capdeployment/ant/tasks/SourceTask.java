package capdeployment.ant.tasks;

import com.cordys.deployment.ant.settings.StandardSettings;
import com.cordys.deployment.ant.tasks.BaseTask;

import capdeployment.ant.commons.CapDeploymentSteps;
import capdeployment.ant.handler.SourceHandler;

public class SourceTask<SettingsT extends StandardSettings, 
						DeploymentStepsT extends CapDeploymentSteps>
		extends BaseTask<SettingsT, SourceHandler<?>> {
	private DeploymentStepsT deploymentSteps;

	protected SourceTask(SettingsT settings, DeploymentStepsT deploymentSteps) {
		super(settings);
		this.deploymentSteps = deploymentSteps;
		// TODO Auto-generated constructor stub
	}

	@Override
	protected SourceHandler<?> createHandler(String ldapRoot, SettingsT arg1) {
		// TODO Auto-generated method stub
		SourceHandler<CapDeploymentSteps> handler = new SourceHandler<CapDeploymentSteps>(ldapRoot, deploymentSteps);
		return handler;
	}

}
