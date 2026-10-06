package example.wildtrack;

import dev.wakethewild.wildtrack.api.WildTrackApi;
import dev.wakethewild.wildtrack.api.storage.*;
import net.minecraft.resources.Identifier;
import java.nio.ByteBuffer;

public final class VersionedStorage {
    public record History(int attempts, long lastTick) { }
    public static final StorageDataKey<History> KEY = new StorageDataKey<>(
            Identifier.parse("example:history"), History.class);

    public static void register() {
        WildTrackApi.get().storageData().register(KEY, 2, new StorageDataCodec<History>() {
            @Override public byte[] encode(History value) {
                return ByteBuffer.allocate(12).putInt(value.attempts()).putLong(value.lastTick()).array();
            }
            @Override public History decode(int storedVersion, byte[] encoded) {
                if (storedVersion == 1 && encoded.length == 4) {
                    return new History(ByteBuffer.wrap(encoded).getInt(), 0L);
                }
                if (storedVersion == 2 && encoded.length == 12) {
                    ByteBuffer buffer = ByteBuffer.wrap(encoded);
                    return new History(buffer.getInt(), buffer.getLong());
                }
                throw new IllegalArgumentException("Unsupported history version or size");
            }
        }, 12);
    }
}
