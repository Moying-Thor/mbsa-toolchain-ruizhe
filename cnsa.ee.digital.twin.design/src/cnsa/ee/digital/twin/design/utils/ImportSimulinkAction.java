package cnsa.ee.digital.twin.design.utils;

import java.util.Collection;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import base.ModelElement;

public class ImportSimulinkAction implements IExternalJavaAction {

	public ImportSimulinkAction() {
	}

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {

		EObject focus = null;
		for(EObject eobj: selections) {
			focus = eobj;
		}
		ModelElement modelElement = (ModelElement) focus;
		System.out.println("Yangruizhe to implement");

	}
	
	private String getProjectPath() {
	    IWorkbenchWindow window = PlatformUI.getWorkbench()
	            .getActiveWorkbenchWindow();

		IWorkbenchPage activePage = window.getActivePage();

		IEditorPart activeEditor = activePage.getActiveEditor();

		if (activeEditor != null) {
		   IEditorInput input = activeEditor.getEditorInput();

		   IProject project = input.getAdapter(IProject.class);
		   if (project == null) {
		      IResource resource = input.getAdapter(IResource.class);
		      if (resource != null) {
		         project = resource.getProject();
		         return project.getFullPath().toOSString();
		      }
		   }
		   else {
			  return project.getFullPath().toOSString();
		   }
		}
		return null;
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

}
