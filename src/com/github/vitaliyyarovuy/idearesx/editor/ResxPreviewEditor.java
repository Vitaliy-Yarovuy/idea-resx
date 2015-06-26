package com.github.vitaliyyarovuy.idearesx.editor;

import com.intellij.codeHighlighting.BackgroundEditorHighlighter;
import com.intellij.ide.structureView.StructureViewBuilder;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.fileEditor.FileEditor;
import com.intellij.openapi.fileEditor.FileEditorLocation;
import com.intellij.openapi.fileEditor.FileEditorState;
import com.intellij.openapi.fileEditor.FileEditorStateLevel;
import com.intellij.openapi.util.Key;
import com.intellij.psi.xml.XmlDocument;
import com.intellij.ui.components.JBScrollPane;
import com.intellij.ui.table.JBTable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.beans.PropertyChangeListener;

/**
 * Created by vyarovuy on 15.06.2015.
 */
public class ResxPreviewEditor implements FileEditor {
    public static final String EDITOR_NAME = "resx editor";
    protected XmlDocument document;

    protected final JPanel jEditorPane = new JPanel();
    protected final JBScrollPane scrollPane = new JBScrollPane(jEditorPane);


    public ResxPreviewEditor(/*@NotNull*/ XmlDocument document) {
        this.document = document;


        String[] columnNames = {"First Name",
                "Last Name",
                "Sport",
                "# of Years",
                "Vegetarian"};

        Object[][] data = {
                {"Kathy", "Smith",
                        "Snowboarding", new Integer(5), new Boolean(false)},
                {"John", "Doe",
                        "Rowing", new Integer(3), new Boolean(true)},
                {"Sue", "Black",
                        "Knitting", new Integer(2), new Boolean(false)},
                {"Jane", "White",
                        "Speed reading", new Integer(20), new Boolean(true)},
                {"Joe", "Brown",
                        "Pool", new Integer(10), new Boolean(false)}
        };


        TableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JBTable(model);
//        table.setPreferredScrollableViewportSize(new Dimension(500, 70));
//        table.setFillsViewportHeight(true);

        jEditorPane.setBackground(Color.GREEN);

        jEditorPane.add(table);

        // Listen to the document modifications.
//        this.document.addDocumentListener(new DocumentPreviewUpdateListener());

        // Setup the editor pane for rendering HTML.
//        final HTMLEditorKit kit = new HTMLEditorKit();
//        jEditorPane.setEditorKit(kit);
//        jEditorPane.setEditable(false);
//        jEditorPane.addHyperlinkListener(new BrowserHyperlinkListener());
//
//        // Load the stylesheet.
//        kit.getStyleSheet().importStyleSheet(MarkdownPreviewEditor.class.getResource(PREVIEW_STYLESHEET_PATH)); // FIXME Does not work
    }

    @Override
    public void dispose() {

    }

    @NotNull
    @Override
    public JComponent getComponent() {
        return scrollPane;
    }

    @Nullable
    @Override
    public JComponent getPreferredFocusedComponent() {
        return jEditorPane;
    }

    @NotNull
    @Override
    public String getName() {
        return EDITOR_NAME;
    }

    @NotNull
    @Override
    public FileEditorState getState(@NotNull FileEditorStateLevel fileEditorStateLevel) {
        return FileEditorState.INSTANCE;
    }

    @Override
    public void setState(@NotNull FileEditorState fileEditorState) {

    }

    @Override
    public boolean isModified() {
        return false;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public void selectNotify() {

    }

    @Override
    public void deselectNotify() {

    }

    @Override
    public void addPropertyChangeListener(@NotNull PropertyChangeListener propertyChangeListener) {

    }

    @Override
    public void removePropertyChangeListener(@NotNull PropertyChangeListener propertyChangeListener) {

    }

    @Nullable
    @Override
    public BackgroundEditorHighlighter getBackgroundHighlighter() {
        return null;
    }

    @Nullable
    @Override
    public FileEditorLocation getCurrentLocation() {
        return null;
    }

    @Nullable
    @Override
    public StructureViewBuilder getStructureViewBuilder() {
        return null;
    }

    @Nullable
    @Override
    public <T> T getUserData(@NotNull Key<T> key) {
        return null;
    }

    @Override
    public <T> void putUserData(@NotNull Key<T> key, @Nullable T t) {

    }
}
