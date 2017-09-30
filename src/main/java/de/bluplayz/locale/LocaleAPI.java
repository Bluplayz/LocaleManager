package de.bluplayz.locale;

import de.bluplayz.LocaleManager;
import lombok.Getter;

public abstract class LocaleAPI {
    @Getter
    private LocaleManager localeManager;

    public LocaleAPI(LocaleManager localeManager) {
        this.localeManager = localeManager;
    }

    public String translate(String languageCode, String key, Object... args) {
        return translate(getLocaleManager().getLocale(languageCode), key, args);
    }

    public String translate(String key, Object... args) {
        return translate(getLocaleManager().getDefaultLocale(), key, args);
    }

    public abstract String translate(Locale locale, String key, Object... args);
}
