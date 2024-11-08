// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct VehicleDimensions {
 *     Int1Unsigned_t vehicleLengthOverall;
 *     Int1Unsigned_t vehicleHeigthOverall;
 *     Int1Unsigned_t vehicleWidthOverall;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class VehicleDimensions {

    VehicleDimensions() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_LONG.withName("vehicleLengthOverall"),
        MessageFrame_h.C_LONG.withName("vehicleHeigthOverall"),
        MessageFrame_h.C_LONG.withName("vehicleWidthOverall"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("VehicleDimensions");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong vehicleLengthOverall$LAYOUT = (OfLong)$LAYOUT.select(groupElement("vehicleLengthOverall"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Int1Unsigned_t vehicleLengthOverall
     * }
     */
    public static final OfLong vehicleLengthOverall$layout() {
        return vehicleLengthOverall$LAYOUT;
    }

    private static final long vehicleLengthOverall$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Int1Unsigned_t vehicleLengthOverall
     * }
     */
    public static final long vehicleLengthOverall$offset() {
        return vehicleLengthOverall$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Int1Unsigned_t vehicleLengthOverall
     * }
     */
    public static long vehicleLengthOverall(MemorySegment struct) {
        return struct.get(vehicleLengthOverall$LAYOUT, vehicleLengthOverall$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Int1Unsigned_t vehicleLengthOverall
     * }
     */
    public static void vehicleLengthOverall(MemorySegment struct, long fieldValue) {
        struct.set(vehicleLengthOverall$LAYOUT, vehicleLengthOverall$OFFSET, fieldValue);
    }

    private static final OfLong vehicleHeigthOverall$LAYOUT = (OfLong)$LAYOUT.select(groupElement("vehicleHeigthOverall"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Int1Unsigned_t vehicleHeigthOverall
     * }
     */
    public static final OfLong vehicleHeigthOverall$layout() {
        return vehicleHeigthOverall$LAYOUT;
    }

    private static final long vehicleHeigthOverall$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Int1Unsigned_t vehicleHeigthOverall
     * }
     */
    public static final long vehicleHeigthOverall$offset() {
        return vehicleHeigthOverall$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Int1Unsigned_t vehicleHeigthOverall
     * }
     */
    public static long vehicleHeigthOverall(MemorySegment struct) {
        return struct.get(vehicleHeigthOverall$LAYOUT, vehicleHeigthOverall$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Int1Unsigned_t vehicleHeigthOverall
     * }
     */
    public static void vehicleHeigthOverall(MemorySegment struct, long fieldValue) {
        struct.set(vehicleHeigthOverall$LAYOUT, vehicleHeigthOverall$OFFSET, fieldValue);
    }

    private static final OfLong vehicleWidthOverall$LAYOUT = (OfLong)$LAYOUT.select(groupElement("vehicleWidthOverall"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Int1Unsigned_t vehicleWidthOverall
     * }
     */
    public static final OfLong vehicleWidthOverall$layout() {
        return vehicleWidthOverall$LAYOUT;
    }

    private static final long vehicleWidthOverall$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Int1Unsigned_t vehicleWidthOverall
     * }
     */
    public static final long vehicleWidthOverall$offset() {
        return vehicleWidthOverall$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Int1Unsigned_t vehicleWidthOverall
     * }
     */
    public static long vehicleWidthOverall(MemorySegment struct) {
        return struct.get(vehicleWidthOverall$LAYOUT, vehicleWidthOverall$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Int1Unsigned_t vehicleWidthOverall
     * }
     */
    public static void vehicleWidthOverall(MemorySegment struct, long fieldValue) {
        struct.set(vehicleWidthOverall$LAYOUT, vehicleWidthOverall$OFFSET, fieldValue);
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
