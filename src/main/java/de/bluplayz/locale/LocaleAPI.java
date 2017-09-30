package de.bluplayz.locale;

import de.bluplayz.LocaleManager;
import lombok.Getter;

public class LocaleAPI {
    @Getter
    private static LocaleManager localeManager;

    public static void init(LocaleManager localeManager) {
        LocaleAPI.localeManager = localeManager;
    }

    public static String translate(String languageCode, String key, Object... args) {
        return translate(getLocaleManager().getLocale(languageCode), key, args);
    }

    public static String translate(String key, Object... args) {
        return translate(getLocaleManager().getDefaultLocale(), key, args);
    }

    public static String translate(Locale locale, String key, Object... args) {
        return getLocaleManager().getTranslatedMessage(locale, key, args);
    }
}
