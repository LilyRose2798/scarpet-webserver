package net.replaceitem.scarpetwebserver.script;

import carpet.script.value.Value;
import net.minecraft.core.RegistryAccess;
import net.minecraft.nbt.StringTag;
import net.minecraft.nbt.Tag;
import net.replaceitem.scarpetwebserver.SSEConnection;
import org.jetbrains.annotations.NotNull;

public class SSEConnectionValue extends Value {
    private final SSEConnection connection;

    public SSEConnectionValue(SSEConnection connection) {
        this.connection = connection;
    }

    public static Value of(SSEConnection connection) {
        return connection == null ? NULL : new SSEConnectionValue(connection);
    }

    public SSEConnection getConnection() {
        return connection;
    }

    @Override
    public @NotNull String getTypeString() {
        return "sse_connection";
    }

    @Override
    public @NotNull String getString() {
        return getTypeString();
    }

    @Override
    public boolean getBoolean() {
        return true;
    }

    @Override
    public @NotNull Tag toTag(boolean force, RegistryAccess regs) {
        return StringTag.valueOf(this.getString());
    }
}
