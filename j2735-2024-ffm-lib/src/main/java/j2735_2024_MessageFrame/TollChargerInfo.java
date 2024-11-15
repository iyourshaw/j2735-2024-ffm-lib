// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct TollChargerInfo {
 *     OBJECT_IDENTIFIER_t tollChargerId;
 *     TollPointID_t tollPointId;
 *     DescriptiveName_t *descriptiveName;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class TollChargerInfo {

    TollChargerInfo() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        ASN__PRIMITIVE_TYPE_s.layout().withName("tollChargerId"),
        MessageFrame_h.C_LONG.withName("tollPointId"),
        MessageFrame_h.C_POINTER.withName("descriptiveName"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("TollChargerInfo");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout tollChargerId$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("tollChargerId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * OBJECT_IDENTIFIER_t tollChargerId
     * }
     */
    public static final GroupLayout tollChargerId$layout() {
        return tollChargerId$LAYOUT;
    }

    private static final long tollChargerId$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * OBJECT_IDENTIFIER_t tollChargerId
     * }
     */
    public static final long tollChargerId$offset() {
        return tollChargerId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * OBJECT_IDENTIFIER_t tollChargerId
     * }
     */
    public static MemorySegment tollChargerId(MemorySegment struct) {
        return struct.asSlice(tollChargerId$OFFSET, tollChargerId$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * OBJECT_IDENTIFIER_t tollChargerId
     * }
     */
    public static void tollChargerId(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, tollChargerId$OFFSET, tollChargerId$LAYOUT.byteSize());
    }

    private static final OfLong tollPointId$LAYOUT = (OfLong)$LAYOUT.select(groupElement("tollPointId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * TollPointID_t tollPointId
     * }
     */
    public static final OfLong tollPointId$layout() {
        return tollPointId$LAYOUT;
    }

    private static final long tollPointId$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * TollPointID_t tollPointId
     * }
     */
    public static final long tollPointId$offset() {
        return tollPointId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * TollPointID_t tollPointId
     * }
     */
    public static long tollPointId(MemorySegment struct) {
        return struct.get(tollPointId$LAYOUT, tollPointId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * TollPointID_t tollPointId
     * }
     */
    public static void tollPointId(MemorySegment struct, long fieldValue) {
        struct.set(tollPointId$LAYOUT, tollPointId$OFFSET, fieldValue);
    }

    private static final AddressLayout descriptiveName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("descriptiveName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DescriptiveName_t *descriptiveName
     * }
     */
    public static final AddressLayout descriptiveName$layout() {
        return descriptiveName$LAYOUT;
    }

    private static final long descriptiveName$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DescriptiveName_t *descriptiveName
     * }
     */
    public static final long descriptiveName$offset() {
        return descriptiveName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DescriptiveName_t *descriptiveName
     * }
     */
    public static MemorySegment descriptiveName(MemorySegment struct) {
        return struct.get(descriptiveName$LAYOUT, descriptiveName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DescriptiveName_t *descriptiveName
     * }
     */
    public static void descriptiveName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(descriptiveName$LAYOUT, descriptiveName$OFFSET, fieldValue);
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

