// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct SoundLevel {
 *     Int1Unsigned_t soundStationary;
 *     Int1Unsigned_t soundDriveBy;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class SoundLevel {

    SoundLevel() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_LONG.withName("soundStationary"),
        MessageFrame_h.C_LONG.withName("soundDriveBy"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("SoundLevel");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong soundStationary$LAYOUT = (OfLong)$LAYOUT.select(groupElement("soundStationary"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Int1Unsigned_t soundStationary
     * }
     */
    public static final OfLong soundStationary$layout() {
        return soundStationary$LAYOUT;
    }

    private static final long soundStationary$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Int1Unsigned_t soundStationary
     * }
     */
    public static final long soundStationary$offset() {
        return soundStationary$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Int1Unsigned_t soundStationary
     * }
     */
    public static long soundStationary(MemorySegment struct) {
        return struct.get(soundStationary$LAYOUT, soundStationary$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Int1Unsigned_t soundStationary
     * }
     */
    public static void soundStationary(MemorySegment struct, long fieldValue) {
        struct.set(soundStationary$LAYOUT, soundStationary$OFFSET, fieldValue);
    }

    private static final OfLong soundDriveBy$LAYOUT = (OfLong)$LAYOUT.select(groupElement("soundDriveBy"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Int1Unsigned_t soundDriveBy
     * }
     */
    public static final OfLong soundDriveBy$layout() {
        return soundDriveBy$LAYOUT;
    }

    private static final long soundDriveBy$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Int1Unsigned_t soundDriveBy
     * }
     */
    public static final long soundDriveBy$offset() {
        return soundDriveBy$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Int1Unsigned_t soundDriveBy
     * }
     */
    public static long soundDriveBy(MemorySegment struct) {
        return struct.get(soundDriveBy$LAYOUT, soundDriveBy$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Int1Unsigned_t soundDriveBy
     * }
     */
    public static void soundDriveBy(MemorySegment struct, long fieldValue) {
        struct.set(soundDriveBy$LAYOUT, soundDriveBy$OFFSET, fieldValue);
    }

    private static final GroupLayout _asn_ctx$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("_asn_ctx"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * asn_struct_ctx_t _asn_ctx
     * }
     */
    public static final GroupLayout _asn_ctx$layout() {
        return _asn_ctx$LAYOUT;
    }

    private static final long _asn_ctx$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * asn_struct_ctx_t _asn_ctx
     * }
     */
    public static final long _asn_ctx$offset() {
        return _asn_ctx$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * asn_struct_ctx_t _asn_ctx
     * }
     */
    public static MemorySegment _asn_ctx(MemorySegment struct) {
        return struct.asSlice(_asn_ctx$OFFSET, _asn_ctx$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * asn_struct_ctx_t _asn_ctx
     * }
     */
    public static void _asn_ctx(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, _asn_ctx$OFFSET, _asn_ctx$LAYOUT.byteSize());
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}
