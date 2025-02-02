package org.spbu.pldoctoolkit.actions;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.part.FileEditorInput;
import org.spbu.pldoctoolkit.PLDocToolkitPlugin;
import org.spbu.pldoctoolkit.dialogs.SelectIntoInfElemDialog;
import org.spbu.pldoctoolkit.editors.DrlTextEditor;
import org.spbu.pldoctoolkit.parser.DRLLang.DRLDocument;
import org.spbu.pldoctoolkit.parser.DRLLang.LangElem;
import org.spbu.pldoctoolkit.refactor.PositionInText;
import org.spbu.pldoctoolkit.refactor.ProjectContent;
import org.spbu.pldoctoolkit.refactor.SelectIntoInfElem;
import org.spbu.pldoctoolkit.refactor.SplitInfElem;
import org.spbu.pldoctoolkit.registry.ProjectRegistryImpl;

public class SplitInfElemAction extends Action implements IValidateDRLSelection {
	IEditorPart editor;
	TextEditor te;
	IProject project;

	SplitInfElem refact = new SplitInfElem();
	ProjectContent projectContent;
	FileEditorInput editorInput;

	public static String refactName = "Split Inf Element";

	public SplitInfElemAction(IEditorPart editor) throws Exception {
		super(refactName);
		this.editor = editor;
		te = (TextEditor) editor;
		editorInput = (FileEditorInput) editor.getEditorInput();
		project = editorInput.getFile().getProject();
		projectContent = (ProjectContent) ((ProjectRegistryImpl) PLDocToolkitPlugin
				.getRegistry(project.getName())).projectContent;
		((DrlTextEditor) te).getMenuListener().addListener(this);
	}

	@Override
	public void validateSelection(IEditorPart part) {
		ISelection sel = te.getSelectionProvider().getSelection();
		TextSelection ts = (TextSelection) sel;

		IDocument doc = te.getDocumentProvider().getDocument(editorInput);
		DRLDocument DRLdoc = projectContent.DRLDocs.get(editorInput.getFile());
		try {
			int line1 = ts.getStartLine();
			int column1 = ts.getOffset() - doc.getLineOffset(line1);
			int line2 = ts.getEndLine();
			int column2 = ts.getOffset() + ts.getLength()
					- doc.getLineOffset(line2);
			PositionInText pos1 = new PositionInText(line1 + 1, column1 + 1);
			PositionInText pos2 = new PositionInText(line2 + 1, column2 + 1);

			if (pos1.compare(pos2) != 0) {
				setEnabled(false);
				return;
			}

			refact.setValidationParams(projectContent, DRLdoc, pos1);

			boolean res = refact.validate();
			setEnabled(res);
		} catch (Exception e) {
			setEnabled(false);
			e.printStackTrace();
		}

	}

	public void run() {

		DRLDocument DRLdoc = projectContent.DRLDocs.get(editorInput.getFile());
		IDocument doc = te.getDocumentProvider().getDocument(editorInput);
		ISelection sel = te.getSelectionProvider().getSelection();
		TextSelection ts = (TextSelection) sel;
		try {
			int line1 = ts.getStartLine();
			int column1 = ts.getOffset() - doc.getLineOffset(line1);
			int line2 = ts.getEndLine();
			int column2 = ts.getOffset() + ts.getLength()
					- doc.getLineOffset(line2);
			PositionInText startPos = new PositionInText(line1 + 1, column1 + 1);
			PositionInText endPos = new PositionInText(line2 + 1, column2 + 1);

			if(startPos.compare(endPos) != 0)
				return;
			
			refact.setParams(projectContent, DRLdoc, editor, startPos);
			refact.perform();

			projectContent.saveAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectIntoInfElem(SelectIntoInfElem refact) {
		SelectIntoInfElemDialog dialog = new SelectIntoInfElemDialog(editor
				.getSite().getShell());

		for (LangElem refs : projectContent.infElemRefs) {
			dialog.addRefId(refs.attrs.getValue("id"));
		}
		for (LangElem elems : projectContent.infElems) {
			dialog.addId(elems.attrs.getValue("id"));
		}

		int res = dialog.open();
		if (res != Window.OK)
			return;

		try {
			DRLDocument DRLdoc = projectContent.DRLDocs.get(editorInput
					.getFile());

			refact.setPararams(dialog.getInfElemId(), dialog.getInfElemName(),
					dialog.getInfElemRefId(), projectContent, DRLdoc,
					new PositionInText(0, 0), new PositionInText(0, 0));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
