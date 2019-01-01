/** 
 * Colocalization Colormap
 * ImageJ plugin for quantifying spatial distribution of colocalization
 */

package Colocalization_Colormap_;

import ij.plugin.PlugIn; // Imports ImageJ package
// Imports Java packages
import java.io.IOException;
import java.net.URISyntaxException;

public class Help_and_documentation_ implements PlugIn {
	public void run(String arg) {
		// Opens Colocalization colormap websita in a defoult browser
		java.awt.Desktop BrowserDesktop = java.awt.Desktop.getDesktop();
		try {
			BrowserDesktop.browse(new java.net.URI(
					"https://github.com/AdamGorlewicz/Colocalization-colormap"));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}
}