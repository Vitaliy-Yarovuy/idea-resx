package com.github.vitaliyyarovuy.idearesx.editor;

import com.github.vitaliyyarovuy.idearesx.ResxFileType;
import com.intellij.openapi.fileEditor.*;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import org.jdom.Element;
import org.jetbrains.annotations.NotNull;

/**
 * Created by vyarovuy on 15.06.2015.
 */
public class ResxPreviewEditorProvider implements FileEditorProvider {
    public static final String EDITOR_TYPE_ID = "ResxEditor";

    @Override
    public boolean accept(Project project, VirtualFile virtualFile) {
        return virtualFile.getFileType() instanceof ResxFileType;
    }

    @NotNull
    @Override
    public FileEditor createEditor(Project project, VirtualFile virtualFile) {
        return new ResxPreviewEditor(FileDocumentManager.getInstance().getDocument(virtualFile));
    }

    @Override
    public void disposeEditor(@NotNull FileEditor fileEditor) {
        fileEditor.dispose();
    }

    @NotNull
    @Override
    public FileEditorState readState(@NotNull Element element, @NotNull Project project, @NotNull VirtualFile virtualFile) {
        return null;
    }

    @Override
    public void writeState(@NotNull FileEditorState fileEditorState, @NotNull Project project, @NotNull Element element) {

    }

    @NotNull
    @Override
    public String getEditorTypeId() {
        return EDITOR_TYPE_ID;
    }

    @NotNull
    @Override
    public FileEditorPolicy getPolicy() {
        return FileEditorPolicy.NONE;
    }
}
