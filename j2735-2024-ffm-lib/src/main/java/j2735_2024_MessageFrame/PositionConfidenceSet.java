// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct PositionConfidenceSet {
 *     PositionConfidence_t pos;
 *     ElevationConfidence_t elevation;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class PositionConfidenceSet {

    PositionConfidenceSet() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_LONG.withName("pos"),
        MessageFrame_h.C_LONG.withName("elevation"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("PositionConfidenceSet");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong pos$LAYOUT = (OfLong)$LAYOUT.select(groupElement("pos"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PositionConfidence_t pos
     * }
     */
    public static final OfLong pos$layout() {
        return pos$LAYOUT;
    }

    private static final long pos$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PositionConfidence_t pos
     * }
     */
    public static final long pos$offset() {
        return pos$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PositionConfidence_t pos
     * }
     */
    public static long pos(MemorySegment struct) {
        return struct.get(pos$LAYOUT, pos$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PositionConfidence_t pos
     * }
     */
    public static void pos(MemorySegment struct, long fieldValue) {
        struct.set(pos$LAYOUT, pos$OFFSET, fieldValue);
    }

    private static final OfLong elevation$LAYOUT = (OfLong)$LAYOUT.select(groupElement("elevation"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ElevationConfidence_t elevation
     * }
     */
    public static final OfLong elevation$layout() {
        return elevation$LAYOUT;
    }

    private static final long elevation$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ElevationConfidence_t elevation
     * }
     */
    public static final long elevation$offset() {
        return elevation$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ElevationConfidence_t elevation
     * }
     */
    public static long elevation(MemorySegment struct) {
        return struct.get(elevation$LAYOUT, elevation$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ElevationConfidence_t elevation
     * }
     */
    public static void elevation(MemorySegment struct, long fieldValue) {
        struct.set(elevation$LAYOUT, elevation$OFFSET, fieldValue);
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

