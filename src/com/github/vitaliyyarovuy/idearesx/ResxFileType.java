package com.github.vitaliyyarovuy.idearesx;

import com.intellij.ide.highlighter.DomSupportEnabled;
import com.intellij.ide.highlighter.XmlLikeFileType;
import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by vyarovuy on 12.06.2015.
 */
public class ResxFileType extends XmlLikeFileType implements DomSupportEnabled {
    public static final ResxFileType INSTANCE = new ResxFileType();

    private ResxFileType() {
        super(ResxLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Rexs file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Rexs language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "resx";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return ResxIcons.FILE;
    }
}