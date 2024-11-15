// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct VehicleStatusRequest {
 *     VehicleStatusDeviceTypeTag_t dataType;
 *     long *subType;
 *     long *sendOnLessThenValue;
 *     long *sendOnMoreThenValue;
 *     BOOLEAN_t *sendAll;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class VehicleStatusRequest {

    VehicleStatusRequest() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_LONG.withName("dataType"),
        MessageFrame_h.C_POINTER.withName("subType"),
        MessageFrame_h.C_POINTER.withName("sendOnLessThenValue"),
        MessageFrame_h.C_POINTER.withName("sendOnMoreThenValue"),
        MessageFrame_h.C_POINTER.withName("sendAll"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("VehicleStatusRequest");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong dataType$LAYOUT = (OfLong)$LAYOUT.select(groupElement("dataType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VehicleStatusDeviceTypeTag_t dataType
     * }
     */
    public static final OfLong dataType$layout() {
        return dataType$LAYOUT;
    }

    private static final long dataType$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VehicleStatusDeviceTypeTag_t dataType
     * }
     */
    public static final long dataType$offset() {
        return dataType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VehicleStatusDeviceTypeTag_t dataType
     * }
     */
    public static long dataType(MemorySegment struct) {
        return struct.get(dataType$LAYOUT, dataType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VehicleStatusDeviceTypeTag_t dataType
     * }
     */
    public static void dataType(MemorySegment struct, long fieldValue) {
        struct.set(dataType$LAYOUT, dataType$OFFSET, fieldValue);
    }

    private static final AddressLayout subType$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("subType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * long *subType
     * }
     */
    public static final AddressLayout subType$layout() {
        return subType$LAYOUT;
    }

    private static final long subType$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * long *subType
     * }
     */
    public static final long subType$offset() {
        return subType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * long *subType
     * }
     */
    public static MemorySegment subType(MemorySegment struct) {
        return struct.get(subType$LAYOUT, subType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * long *subType
     * }
     */
    public static void subType(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(subType$LAYOUT, subType$OFFSET, fieldValue);
    }

    private static final AddressLayout sendOnLessThenValue$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("sendOnLessThenValue"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * long *sendOnLessThenValue
     * }
     */
    public static final AddressLayout sendOnLessThenValue$layout() {
        return sendOnLessThenValue$LAYOUT;
    }

    private static final long sendOnLessThenValue$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * long *sendOnLessThenValue
     * }
     */
    public static final long sendOnLessThenValue$offset() {
        return sendOnLessThenValue$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * long *sendOnLessThenValue
     * }
     */
    public static MemorySegment sendOnLessThenValue(MemorySegment struct) {
        return struct.get(sendOnLessThenValue$LAYOUT, sendOnLessThenValue$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * long *sendOnLessThenValue
     * }
     */
    public static void sendOnLessThenValue(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(sendOnLessThenValue$LAYOUT, sendOnLessThenValue$OFFSET, fieldValue);
    }

    private static final AddressLayout sendOnMoreThenValue$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("sendOnMoreThenValue"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * long *sendOnMoreThenValue
     * }
     */
    public static final AddressLayout sendOnMoreThenValue$layout() {
        return sendOnMoreThenValue$LAYOUT;
    }

    private static final long sendOnMoreThenValue$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * long *sendOnMoreThenValue
     * }
     */
    public static final long sendOnMoreThenValue$offset() {
        return sendOnMoreThenValue$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * long *sendOnMoreThenValue
     * }
     */
    public static MemorySegment sendOnMoreThenValue(MemorySegment struct) {
        return struct.get(sendOnMoreThenValue$LAYOUT, sendOnMoreThenValue$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * long *sendOnMoreThenValue
     * }
     */
    public static void sendOnMoreThenValue(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(sendOnMoreThenValue$LAYOUT, sendOnMoreThenValue$OFFSET, fieldValue);
    }

    private static final AddressLayout sendAll$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("sendAll"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN_t *sendAll
     * }
     */
    public static final AddressLayout sendAll$layout() {
        return sendAll$LAYOUT;
    }

    private static final long sendAll$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN_t *sendAll
     * }
     */
    public static final long sendAll$offset() {
        return sendAll$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN_t *sendAll
     * }
     */
    public static MemorySegment sendAll(MemorySegment struct) {
        return struct.get(sendAll$LAYOUT, sendAll$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN_t *sendAll
     * }
     */
    public static void sendAll(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(sendAll$LAYOUT, sendAll$OFFSET, fieldValue);
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

    private static final long _asn_ctx$OFFSET = 40;

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

