package commonClassesReusable;

import java.util.Calendar;

public class CreateUniqueNumber 
{
	public static String Generate_Unique_variable(String module_name)
    {
        String[] clCourse = new String[10];
        //Date date; // your date
        Calendar cal = Calendar.getInstance();
        
        clCourse[0] = module_name;
        clCourse[1] = String.valueOf(cal.get(Calendar.YEAR));
        clCourse[2] = String.valueOf(cal.get(Calendar.MONTH));
        clCourse[3] = String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
        clCourse[4] = String.valueOf(cal.get(Calendar.HOUR));
        clCourse[5] = String.valueOf(cal.get(Calendar.MINUTE));
        clCourse[6] = String.valueOf(cal.get(Calendar.SECOND));
        
        
        String fun_inter_org = clCourse[0];
     
        fun_inter_org= fun_inter_org.concat(clCourse[1]).concat(clCourse[2]).concat(clCourse[3]).concat(clCourse[4]).concat(clCourse[5]).concat(clCourse[6]);
        return fun_inter_org;
        /*
        cal.setTime(date);
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        */
    }

}
