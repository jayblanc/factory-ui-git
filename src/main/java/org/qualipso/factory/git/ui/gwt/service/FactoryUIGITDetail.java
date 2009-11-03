package org.qualipso.factory.git.ui.gwt.service;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * @author Jerome Blanchard (jayblanc@gmail.com)
 * @date 2 november 2009
 */
public class FactoryUIGITDetail implements EntryPoint {

	private static final String SERVER_ERROR = "An error occurred while attempting to contact the server. Please check your network connection and try again.";
	private final GITServiceAsync git = GITServiceAsync.Util.getInstance();

	@Override
	public void onModuleLoad() {
		Window.setMargin("0px");
		Label label = new Label("DTC");
		RootPanel.get("git-detail").add(label);
	}

}
