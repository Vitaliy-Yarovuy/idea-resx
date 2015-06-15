package com.github.vitaliyyarovuy.idearesx;

import com.intellij.lang.Language;

/**
 * Created by vyarovuy on 12.06.2015.
 */
public class ResxLanguage extends Language {
    public static final ResxLanguage INSTANCE = new ResxLanguage();

    private ResxLanguage() {
        super("Resx");
    }
}