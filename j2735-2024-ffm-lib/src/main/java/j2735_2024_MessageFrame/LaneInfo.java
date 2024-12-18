// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct LaneInfo {
 *     RSMLanePosition_t lanePosition;
 *     LaneClosed_t laneClosed;
 *     ObstacleDistance_t *laneCloseOffset;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class LaneInfo {

    LaneInfo() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_LONG.withName("lanePosition"),
        MessageFrame_h.C_INT.withName("laneClosed"),
        MemoryLayout.paddingLayout(4),
        MessageFrame_h.C_POINTER.withName("laneCloseOffset"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("LaneInfo");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong lanePosition$LAYOUT = (OfLong)$LAYOUT.select(groupElement("lanePosition"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * RSMLanePosition_t lanePosition
     * }
     */
    public static final OfLong lanePosition$layout() {
        return lanePosition$LAYOUT;
    }

    private static final long lanePosition$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * RSMLanePosition_t lanePosition
     * }
     */
    public static final long lanePosition$offset() {
        return lanePosition$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * RSMLanePosition_t lanePosition
     * }
     */
    public static long lanePosition(MemorySegment struct) {
        return struct.get(lanePosition$LAYOUT, lanePosition$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * RSMLanePosition_t lanePosition
     * }
     */
    public static void lanePosition(MemorySegment struct, long fieldValue) {
        struct.set(lanePosition$LAYOUT, lanePosition$OFFSET, fieldValue);
    }

    private static final OfInt laneClosed$LAYOUT = (OfInt)$LAYOUT.select(groupElement("laneClosed"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LaneClosed_t laneClosed
     * }
     */
    public static final OfInt laneClosed$layout() {
        return laneClosed$LAYOUT;
    }

    private static final long laneClosed$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LaneClosed_t laneClosed
     * }
     */
    public static final long laneClosed$offset() {
        return laneClosed$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LaneClosed_t laneClosed
     * }
     */
    public static int laneClosed(MemorySegment struct) {
        return struct.get(laneClosed$LAYOUT, laneClosed$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LaneClosed_t laneClosed
     * }
     */
    public static void laneClosed(MemorySegment struct, int fieldValue) {
        struct.set(laneClosed$LAYOUT, laneClosed$OFFSET, fieldValue);
    }

    private static final AddressLayout laneCloseOffset$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("laneCloseOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ObstacleDistance_t *laneCloseOffset
     * }
     */
    public static final AddressLayout laneCloseOffset$layout() {
        return laneCloseOffset$LAYOUT;
    }

    private static final long laneCloseOffset$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ObstacleDistance_t *laneCloseOffset
     * }
     */
    public static final long laneCloseOffset$offset() {
        return laneCloseOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ObstacleDistance_t *laneCloseOffset
     * }
     */
    public static MemorySegment laneCloseOffset(MemorySegment struct) {
        return struct.get(laneCloseOffset$LAYOUT, laneCloseOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ObstacleDistance_t *laneCloseOffset
     * }
     */
    public static void laneCloseOffset(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(laneCloseOffset$LAYOUT, laneCloseOffset$OFFSET, fieldValue);
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

    private static final long _asn_ctx$OFFSET = 24;

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

