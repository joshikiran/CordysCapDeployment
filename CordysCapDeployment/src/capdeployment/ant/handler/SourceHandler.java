package capdeployment.ant.handler;

import com.cordys.deployment.ant.handler.BaseHandler;

import capdeployment.ant.commons.CapDeploymentSteps;

public class SourceHandler<DeploymentStepsT extends CapDeploymentSteps> extends BaseHandler {

	private DeploymentStepsT steps;

	public SourceHandler(String ldapRoot, DeploymentStepsT steps) {
		super(ldapRoot);
		this.steps = steps;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		/**
		 * Call all the methods of reading packages, interfaces etc., using steps object
		 * and then call deployment execution here.
		 */
		steps.readPackageDetails();
	}

}
