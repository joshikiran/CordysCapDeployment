package capdeployment.ant.handler;

import java.util.ArrayList;

import capdeployment.ant.commons.CapDeploymentSteps;
import capdeployment.ant.settings.DeploymentSettings;

public class ReadingExcel<SettingsT extends DeploymentSettings> extends CapDeploymentSteps {
	private SettingsT settings;

	public ReadingExcel(SettingsT settings) {
		this.settings = settings;
	}

	@Override
	public ArrayList<String> readPackageDetails() {
		
		return null;
	}

	@Override
	public ArrayList<String> readInterfaceDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<String> readJREDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<String> readRoleDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<String> readContainerDetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
