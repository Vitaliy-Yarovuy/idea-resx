package com.github.vitaliyyarovuy.idearesx;

import com.intellij.codeInsight.daemon.impl.HighlightRangeExtension;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

/**
 * Created by vyarovuy on 18.06.2015.
 */
public class ResxHighlightRangeExtension implements HighlightRangeExtension  {

    public boolean isForceHighlightParents(@NotNull final PsiFile file) {
        return file.getVirtualFile().getExtension() == "resx";
    }
}
