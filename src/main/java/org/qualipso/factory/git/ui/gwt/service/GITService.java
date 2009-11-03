package org.qualipso.factory.git.ui.gwt.service;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * @author Jerome Blanchard (jayblanc@gmail.com)
 * @date 2 november 2009
 */
@RemoteServiceRelativePath("GIT")
public interface GITService extends RemoteService {

	public String sayGIT();

}
