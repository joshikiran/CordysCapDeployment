package capdeployment.ant.commons;

import java.util.ArrayList;

public abstract class CapDeploymentSteps {
	
	public abstract ArrayList<String> readPackageDetails();

	public abstract ArrayList<String> readInterfaceDetails();

	public abstract ArrayList<String> readJREDetails();

	public abstract ArrayList<String> readRoleDetails();

	public abstract ArrayList<String> readContainerDetails();
}
