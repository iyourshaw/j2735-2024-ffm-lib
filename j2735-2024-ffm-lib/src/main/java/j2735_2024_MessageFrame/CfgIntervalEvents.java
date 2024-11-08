// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct CfgIntervalEvents {
 *     CfgInterval_t interval;
 *     BOOLEAN_t *wiperStatus;
 *     BOOLEAN_t *vehCount;
 *     BOOLEAN_t *weatherData;
 *     struct CfgTransitVehicleData *transitVehData;
 *     BOOLEAN_t *numOfOccupants;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class CfgIntervalEvents {

    CfgIntervalEvents() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        CfgInterval.layout().withName("interval"),
        MessageFrame_h.C_POINTER.withName("wiperStatus"),
        MessageFrame_h.C_POINTER.withName("vehCount"),
        MessageFrame_h.C_POINTER.withName("weatherData"),
        MessageFrame_h.C_POINTER.withName("transitVehData"),
        MessageFrame_h.C_POINTER.withName("numOfOccupants"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("CfgIntervalEvents");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout interval$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("interval"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CfgInterval_t interval
     * }
     */
    public static final GroupLayout interval$layout() {
        return interval$LAYOUT;
    }

    private static final long interval$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CfgInterval_t interval
     * }
     */
    public static final long interval$offset() {
        return interval$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CfgInterval_t interval
     * }
     */
    public static MemorySegment interval(MemorySegment struct) {
        return struct.asSlice(interval$OFFSET, interval$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CfgInterval_t interval
     * }
     */
    public static void interval(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, interval$OFFSET, interval$LAYOUT.byteSize());
    }

    private static final AddressLayout wiperStatus$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("wiperStatus"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN_t *wiperStatus
     * }
     */
    public static final AddressLayout wiperStatus$layout() {
        return wiperStatus$LAYOUT;
    }

    private static final long wiperStatus$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN_t *wiperStatus
     * }
     */
    public static final long wiperStatus$offset() {
        return wiperStatus$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN_t *wiperStatus
     * }
     */
    public static MemorySegment wiperStatus(MemorySegment struct) {
        return struct.get(wiperStatus$LAYOUT, wiperStatus$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN_t *wiperStatus
     * }
     */
    public static void wiperStatus(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(wiperStatus$LAYOUT, wiperStatus$OFFSET, fieldValue);
    }

    private static final AddressLayout vehCount$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("vehCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN_t *vehCount
     * }
     */
    public static final AddressLayout vehCount$layout() {
        return vehCount$LAYOUT;
    }

    private static final long vehCount$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN_t *vehCount
     * }
     */
    public static final long vehCount$offset() {
        return vehCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN_t *vehCount
     * }
     */
    public static MemorySegment vehCount(MemorySegment struct) {
        return struct.get(vehCount$LAYOUT, vehCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN_t *vehCount
     * }
     */
    public static void vehCount(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(vehCount$LAYOUT, vehCount$OFFSET, fieldValue);
    }

    private static final AddressLayout weatherData$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("weatherData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN_t *weatherData
     * }
     */
    public static final AddressLayout weatherData$layout() {
        return weatherData$LAYOUT;
    }

    private static final long weatherData$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN_t *weatherData
     * }
     */
    public static final long weatherData$offset() {
        return weatherData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN_t *weatherData
     * }
     */
    public static MemorySegment weatherData(MemorySegment struct) {
        return struct.get(weatherData$LAYOUT, weatherData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN_t *weatherData
     * }
     */
    public static void weatherData(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(weatherData$LAYOUT, weatherData$OFFSET, fieldValue);
    }

    private static final AddressLayout transitVehData$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("transitVehData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct CfgTransitVehicleData *transitVehData
     * }
     */
    public static final AddressLayout transitVehData$layout() {
        return transitVehData$LAYOUT;
    }

    private static final long transitVehData$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct CfgTransitVehicleData *transitVehData
     * }
     */
    public static final long transitVehData$offset() {
        return transitVehData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct CfgTransitVehicleData *transitVehData
     * }
     */
    public static MemorySegment transitVehData(MemorySegment struct) {
        return struct.get(transitVehData$LAYOUT, transitVehData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct CfgTransitVehicleData *transitVehData
     * }
     */
    public static void transitVehData(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(transitVehData$LAYOUT, transitVehData$OFFSET, fieldValue);
    }

    private static final AddressLayout numOfOccupants$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("numOfOccupants"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN_t *numOfOccupants
     * }
     */
    public static final AddressLayout numOfOccupants$layout() {
        return numOfOccupants$LAYOUT;
    }

    private static final long numOfOccupants$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN_t *numOfOccupants
     * }
     */
    public static final long numOfOccupants$offset() {
        return numOfOccupants$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN_t *numOfOccupants
     * }
     */
    public static MemorySegment numOfOccupants(MemorySegment struct) {
        return struct.get(numOfOccupants$LAYOUT, numOfOccupants$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN_t *numOfOccupants
     * }
     */
    public static void numOfOccupants(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(numOfOccupants$LAYOUT, numOfOccupants$OFFSET, fieldValue);
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

    private static final long _asn_ctx$OFFSET = 80;

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
