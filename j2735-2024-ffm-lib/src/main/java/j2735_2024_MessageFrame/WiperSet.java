// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct WiperSet {
 *     WiperStatus_t statusFront;
 *     WiperRate_t rateFront;
 *     WiperStatus_t *statusRear;
 *     WiperRate_t *rateRear;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class WiperSet {

    WiperSet() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_LONG.withName("statusFront"),
        MessageFrame_h.C_LONG.withName("rateFront"),
        MessageFrame_h.C_POINTER.withName("statusRear"),
        MessageFrame_h.C_POINTER.withName("rateRear"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("WiperSet");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong statusFront$LAYOUT = (OfLong)$LAYOUT.select(groupElement("statusFront"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WiperStatus_t statusFront
     * }
     */
    public static final OfLong statusFront$layout() {
        return statusFront$LAYOUT;
    }

    private static final long statusFront$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WiperStatus_t statusFront
     * }
     */
    public static final long statusFront$offset() {
        return statusFront$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WiperStatus_t statusFront
     * }
     */
    public static long statusFront(MemorySegment struct) {
        return struct.get(statusFront$LAYOUT, statusFront$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WiperStatus_t statusFront
     * }
     */
    public static void statusFront(MemorySegment struct, long fieldValue) {
        struct.set(statusFront$LAYOUT, statusFront$OFFSET, fieldValue);
    }

    private static final OfLong rateFront$LAYOUT = (OfLong)$LAYOUT.select(groupElement("rateFront"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WiperRate_t rateFront
     * }
     */
    public static final OfLong rateFront$layout() {
        return rateFront$LAYOUT;
    }

    private static final long rateFront$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WiperRate_t rateFront
     * }
     */
    public static final long rateFront$offset() {
        return rateFront$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WiperRate_t rateFront
     * }
     */
    public static long rateFront(MemorySegment struct) {
        return struct.get(rateFront$LAYOUT, rateFront$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WiperRate_t rateFront
     * }
     */
    public static void rateFront(MemorySegment struct, long fieldValue) {
        struct.set(rateFront$LAYOUT, rateFront$OFFSET, fieldValue);
    }

    private static final AddressLayout statusRear$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("statusRear"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WiperStatus_t *statusRear
     * }
     */
    public static final AddressLayout statusRear$layout() {
        return statusRear$LAYOUT;
    }

    private static final long statusRear$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WiperStatus_t *statusRear
     * }
     */
    public static final long statusRear$offset() {
        return statusRear$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WiperStatus_t *statusRear
     * }
     */
    public static MemorySegment statusRear(MemorySegment struct) {
        return struct.get(statusRear$LAYOUT, statusRear$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WiperStatus_t *statusRear
     * }
     */
    public static void statusRear(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(statusRear$LAYOUT, statusRear$OFFSET, fieldValue);
    }

    private static final AddressLayout rateRear$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("rateRear"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WiperRate_t *rateRear
     * }
     */
    public static final AddressLayout rateRear$layout() {
        return rateRear$LAYOUT;
    }

    private static final long rateRear$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WiperRate_t *rateRear
     * }
     */
    public static final long rateRear$offset() {
        return rateRear$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WiperRate_t *rateRear
     * }
     */
    public static MemorySegment rateRear(MemorySegment struct) {
        return struct.get(rateRear$LAYOUT, rateRear$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WiperRate_t *rateRear
     * }
     */
    public static void rateRear(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(rateRear$LAYOUT, rateRear$OFFSET, fieldValue);
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

