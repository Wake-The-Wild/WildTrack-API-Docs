package example.wildtrack;

import com.mojang.serialization.Codec;
import dev.wakethewild.wildtrack.api.metadata.*;
import net.minecraft.resources.Identifier;

public final class TypedMetadata {
    public static final MetadataKey<String> MATERIAL = new MetadataKey<>(
            Identifier.parse("example:landmark_material"), Codec.STRING);

    public static MetadataView stone() {
        return MetadataMap.builder().put(MATERIAL, "stone").build();
    }
}
