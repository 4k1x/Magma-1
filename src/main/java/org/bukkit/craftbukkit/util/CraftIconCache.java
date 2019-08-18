package org.bukkit.craftbukkit.util;

import org.bukkit.util.CachedServerIcon;

public class CraftIconCache implements CachedServerIcon {
    public final String value;
    @Override
    public String getData() { return value; } // Paper
    public CraftIconCache(final String value) {
        this.value = value;
    }
}
