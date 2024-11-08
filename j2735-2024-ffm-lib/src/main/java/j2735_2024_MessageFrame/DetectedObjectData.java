// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct DetectedObjectData {
 *     DetectedObjectCommonData_t detObjCommon;
 *     struct DetectedObjectOptionalData *detObjOptData;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class DetectedObjectData {

    DetectedObjectData() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        DetectedObjectCommonData.layout().withName("detObjCommon"),
        MessageFrame_h.C_POINTER.withName("detObjOptData"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("DetectedObjectData");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout detObjCommon$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("detObjCommon"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DetectedObjectCommonData_t detObjCommon
     * }
     */
    public static final GroupLayout detObjCommon$layout() {
        return detObjCommon$LAYOUT;
    }

    private static final long detObjCommon$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DetectedObjectCommonData_t detObjCommon
     * }
     */
    public static final long detObjCommon$offset() {
        return detObjCommon$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DetectedObjectCommonData_t detObjCommon
     * }
     */
    public static MemorySegment detObjCommon(MemorySegment struct) {
        return struct.asSlice(detObjCommon$OFFSET, detObjCommon$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DetectedObjectCommonData_t detObjCommon
     * }
     */
    public static void detObjCommon(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, detObjCommon$OFFSET, detObjCommon$LAYOUT.byteSize());
    }

    private static final AddressLayout detObjOptData$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("detObjOptData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct DetectedObjectOptionalData *detObjOptData
     * }
     */
    public static final AddressLayout detObjOptData$layout() {
        return detObjOptData$LAYOUT;
    }

    private static final long detObjOptData$OFFSET = 240;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct DetectedObjectOptionalData *detObjOptData
     * }
     */
    public static final long detObjOptData$offset() {
        return detObjOptData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct DetectedObjectOptionalData *detObjOptData
     * }
     */
    public static MemorySegment detObjOptData(MemorySegment struct) {
        return struct.get(detObjOptData$LAYOUT, detObjOptData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct DetectedObjectOptionalData *detObjOptData
     * }
     */
    public static void detObjOptData(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(detObjOptData$LAYOUT, detObjOptData$OFFSET, fieldValue);
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

    private static final long _asn_ctx$OFFSET = 248;

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

