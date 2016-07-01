package commonClassesReusable;

public class GetCurrentWorkingDir {

	public static String getWorkingDirLocation()
	{
		String workingDir = System.getProperty("user.dir");
		return workingDir;
	}

}
