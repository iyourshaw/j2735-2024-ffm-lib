// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct TrailerHistoryPoint {
 *     Common_Angle_t pivotAngle;
 *     TimeOffset_t timeOffset;
 *     Node_XY_24b_t positionOffset;
 *     VertOffset_B07_t *elevationOffset;
 *     CoarseHeading_t *heading;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class TrailerHistoryPoint {

    TrailerHistoryPoint() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_LONG.withName("pivotAngle"),
        MessageFrame_h.C_LONG.withName("timeOffset"),
        Node_XY_24b.layout().withName("positionOffset"),
        MessageFrame_h.C_POINTER.withName("elevationOffset"),
        MessageFrame_h.C_POINTER.withName("heading"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("TrailerHistoryPoint");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong pivotAngle$LAYOUT = (OfLong)$LAYOUT.select(groupElement("pivotAngle"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Common_Angle_t pivotAngle
     * }
     */
    public static final OfLong pivotAngle$layout() {
        return pivotAngle$LAYOUT;
    }

    private static final long pivotAngle$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Common_Angle_t pivotAngle
     * }
     */
    public static final long pivotAngle$offset() {
        return pivotAngle$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Common_Angle_t pivotAngle
     * }
     */
    public static long pivotAngle(MemorySegment struct) {
        return struct.get(pivotAngle$LAYOUT, pivotAngle$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Common_Angle_t pivotAngle
     * }
     */
    public static void pivotAngle(MemorySegment struct, long fieldValue) {
        struct.set(pivotAngle$LAYOUT, pivotAngle$OFFSET, fieldValue);
    }

    private static final OfLong timeOffset$LAYOUT = (OfLong)$LAYOUT.select(groupElement("timeOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * TimeOffset_t timeOffset
     * }
     */
    public static final OfLong timeOffset$layout() {
        return timeOffset$LAYOUT;
    }

    private static final long timeOffset$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * TimeOffset_t timeOffset
     * }
     */
    public static final long timeOffset$offset() {
        return timeOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * TimeOffset_t timeOffset
     * }
     */
    public static long timeOffset(MemorySegment struct) {
        return struct.get(timeOffset$LAYOUT, timeOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * TimeOffset_t timeOffset
     * }
     */
    public static void timeOffset(MemorySegment struct, long fieldValue) {
        struct.set(timeOffset$LAYOUT, timeOffset$OFFSET, fieldValue);
    }

    private static final GroupLayout positionOffset$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("positionOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Node_XY_24b_t positionOffset
     * }
     */
    public static final GroupLayout positionOffset$layout() {
        return positionOffset$LAYOUT;
    }

    private static final long positionOffset$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Node_XY_24b_t positionOffset
     * }
     */
    public static final long positionOffset$offset() {
        return positionOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Node_XY_24b_t positionOffset
     * }
     */
    public static MemorySegment positionOffset(MemorySegment struct) {
        return struct.asSlice(positionOffset$OFFSET, positionOffset$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Node_XY_24b_t positionOffset
     * }
     */
    public static void positionOffset(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, positionOffset$OFFSET, positionOffset$LAYOUT.byteSize());
    }

    private static final AddressLayout elevationOffset$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("elevationOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VertOffset_B07_t *elevationOffset
     * }
     */
    public static final AddressLayout elevationOffset$layout() {
        return elevationOffset$LAYOUT;
    }

    private static final long elevationOffset$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VertOffset_B07_t *elevationOffset
     * }
     */
    public static final long elevationOffset$offset() {
        return elevationOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VertOffset_B07_t *elevationOffset
     * }
     */
    public static MemorySegment elevationOffset(MemorySegment struct) {
        return struct.get(elevationOffset$LAYOUT, elevationOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VertOffset_B07_t *elevationOffset
     * }
     */
    public static void elevationOffset(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(elevationOffset$LAYOUT, elevationOffset$OFFSET, fieldValue);
    }

    private static final AddressLayout heading$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("heading"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CoarseHeading_t *heading
     * }
     */
    public static final AddressLayout heading$layout() {
        return heading$LAYOUT;
    }

    private static final long heading$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CoarseHeading_t *heading
     * }
     */
    public static final long heading$offset() {
        return heading$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CoarseHeading_t *heading
     * }
     */
    public static MemorySegment heading(MemorySegment struct) {
        return struct.get(heading$LAYOUT, heading$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CoarseHeading_t *heading
     * }
     */
    public static void heading(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(heading$LAYOUT, heading$OFFSET, fieldValue);
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

    private static final long _asn_ctx$OFFSET = 72;

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
