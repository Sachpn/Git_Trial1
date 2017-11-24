package abc099;

import com.ibm.rational.test.lt.execution.http.util.CookieCacheUtil;
import com.ibm.rational.test.lt.kernel.services.ITestExecutionServices;

/**
 * @author unknown
 */
public class Clearcook implements
com.ibm.rational.test.lt.kernel.custom.ICustomCode2 {

	/**
	 * Instances of this will be created using the no-arg constructor.
	 */
	public Clearcook() {
	}

	@Override
	public String exec(ITestExecutionServices log, String[] arg) {
		CookieCacheUtil.clearCookieCache(log);
		return null;
	}

}
