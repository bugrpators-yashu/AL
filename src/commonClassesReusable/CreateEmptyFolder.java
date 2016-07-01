package commonClassesReusable;

import java.io.File;

public class CreateEmptyFolder 
{
	public static void testCreateEmptyFolder(String nameoffolder)
	{
		File dir = new File(nameoffolder);
		dir.mkdir();
	}

}
