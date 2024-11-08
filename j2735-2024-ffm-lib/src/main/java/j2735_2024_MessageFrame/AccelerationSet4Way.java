// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct AccelerationSet4Way {
 *     Acceleration_t Long;
 *     Acceleration_t lat;
 *     VerticalAcceleration_t vert;
 *     YawRate_t yaw;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class AccelerationSet4Way {

    AccelerationSet4Way() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_LONG.withName("Long"),
        MessageFrame_h.C_LONG.withName("lat"),
        MessageFrame_h.C_LONG.withName("vert"),
        MessageFrame_h.C_LONG.withName("yaw"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("AccelerationSet4Way");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong Long_$LAYOUT = (OfLong)$LAYOUT.select(groupElement("Long"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Acceleration_t Long
     * }
     */
    public static final OfLong Long_$layout() {
        return Long_$LAYOUT;
    }

    private static final long Long_$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Acceleration_t Long
     * }
     */
    public static final long Long_$offset() {
        return Long_$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Acceleration_t Long
     * }
     */
    public static long Long_(MemorySegment struct) {
        return struct.get(Long_$LAYOUT, Long_$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Acceleration_t Long
     * }
     */
    public static void Long_(MemorySegment struct, long fieldValue) {
        struct.set(Long_$LAYOUT, Long_$OFFSET, fieldValue);
    }

    private static final OfLong lat$LAYOUT = (OfLong)$LAYOUT.select(groupElement("lat"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Acceleration_t lat
     * }
     */
    public static final OfLong lat$layout() {
        return lat$LAYOUT;
    }

    private static final long lat$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Acceleration_t lat
     * }
     */
    public static final long lat$offset() {
        return lat$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Acceleration_t lat
     * }
     */
    public static long lat(MemorySegment struct) {
        return struct.get(lat$LAYOUT, lat$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Acceleration_t lat
     * }
     */
    public static void lat(MemorySegment struct, long fieldValue) {
        struct.set(lat$LAYOUT, lat$OFFSET, fieldValue);
    }

    private static final OfLong vert$LAYOUT = (OfLong)$LAYOUT.select(groupElement("vert"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VerticalAcceleration_t vert
     * }
     */
    public static final OfLong vert$layout() {
        return vert$LAYOUT;
    }

    private static final long vert$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VerticalAcceleration_t vert
     * }
     */
    public static final long vert$offset() {
        return vert$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VerticalAcceleration_t vert
     * }
     */
    public static long vert(MemorySegment struct) {
        return struct.get(vert$LAYOUT, vert$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VerticalAcceleration_t vert
     * }
     */
    public static void vert(MemorySegment struct, long fieldValue) {
        struct.set(vert$LAYOUT, vert$OFFSET, fieldValue);
    }

    private static final OfLong yaw$LAYOUT = (OfLong)$LAYOUT.select(groupElement("yaw"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * YawRate_t yaw
     * }
     */
    public static final OfLong yaw$layout() {
        return yaw$LAYOUT;
    }

    private static final long yaw$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * YawRate_t yaw
     * }
     */
    public static final long yaw$offset() {
        return yaw$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * YawRate_t yaw
     * }
     */
    public static long yaw(MemorySegment struct) {
        return struct.get(yaw$LAYOUT, yaw$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * YawRate_t yaw
     * }
     */
    public static void yaw(MemorySegment struct, long fieldValue) {
        struct.set(yaw$LAYOUT, yaw$OFFSET, fieldValue);
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

    private static final long _asn_ctx$OFFSET = 32;

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
