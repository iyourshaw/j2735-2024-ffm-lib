// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct RegionInfo {
 *     Position3D_t referencePoint;
 *     struct RegionUncertainty *locationUncertainty;
 *     ReferencePointType_t *referencePointType;
 *     DescriptiveName_t *descriptiveName;
 *     Zoom_t *scale;
 *     struct AreaType *approachRegion;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class RegionInfo {

    RegionInfo() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Position3D.layout().withName("referencePoint"),
        MessageFrame_h.C_POINTER.withName("locationUncertainty"),
        MessageFrame_h.C_POINTER.withName("referencePointType"),
        MessageFrame_h.C_POINTER.withName("descriptiveName"),
        MessageFrame_h.C_POINTER.withName("scale"),
        MessageFrame_h.C_POINTER.withName("approachRegion"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("RegionInfo");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout referencePoint$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("referencePoint"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Position3D_t referencePoint
     * }
     */
    public static final GroupLayout referencePoint$layout() {
        return referencePoint$LAYOUT;
    }

    private static final long referencePoint$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Position3D_t referencePoint
     * }
     */
    public static final long referencePoint$offset() {
        return referencePoint$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Position3D_t referencePoint
     * }
     */
    public static MemorySegment referencePoint(MemorySegment struct) {
        return struct.asSlice(referencePoint$OFFSET, referencePoint$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Position3D_t referencePoint
     * }
     */
    public static void referencePoint(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, referencePoint$OFFSET, referencePoint$LAYOUT.byteSize());
    }

    private static final AddressLayout locationUncertainty$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("locationUncertainty"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct RegionUncertainty *locationUncertainty
     * }
     */
    public static final AddressLayout locationUncertainty$layout() {
        return locationUncertainty$LAYOUT;
    }

    private static final long locationUncertainty$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct RegionUncertainty *locationUncertainty
     * }
     */
    public static final long locationUncertainty$offset() {
        return locationUncertainty$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct RegionUncertainty *locationUncertainty
     * }
     */
    public static MemorySegment locationUncertainty(MemorySegment struct) {
        return struct.get(locationUncertainty$LAYOUT, locationUncertainty$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct RegionUncertainty *locationUncertainty
     * }
     */
    public static void locationUncertainty(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(locationUncertainty$LAYOUT, locationUncertainty$OFFSET, fieldValue);
    }

    private static final AddressLayout referencePointType$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("referencePointType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ReferencePointType_t *referencePointType
     * }
     */
    public static final AddressLayout referencePointType$layout() {
        return referencePointType$LAYOUT;
    }

    private static final long referencePointType$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ReferencePointType_t *referencePointType
     * }
     */
    public static final long referencePointType$offset() {
        return referencePointType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ReferencePointType_t *referencePointType
     * }
     */
    public static MemorySegment referencePointType(MemorySegment struct) {
        return struct.get(referencePointType$LAYOUT, referencePointType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ReferencePointType_t *referencePointType
     * }
     */
    public static void referencePointType(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(referencePointType$LAYOUT, referencePointType$OFFSET, fieldValue);
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

    private static final long descriptiveName$OFFSET = 72;

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

    private static final AddressLayout scale$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("scale"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Zoom_t *scale
     * }
     */
    public static final AddressLayout scale$layout() {
        return scale$LAYOUT;
    }

    private static final long scale$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Zoom_t *scale
     * }
     */
    public static final long scale$offset() {
        return scale$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Zoom_t *scale
     * }
     */
    public static MemorySegment scale(MemorySegment struct) {
        return struct.get(scale$LAYOUT, scale$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Zoom_t *scale
     * }
     */
    public static void scale(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(scale$LAYOUT, scale$OFFSET, fieldValue);
    }

    private static final AddressLayout approachRegion$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("approachRegion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct AreaType *approachRegion
     * }
     */
    public static final AddressLayout approachRegion$layout() {
        return approachRegion$LAYOUT;
    }

    private static final long approachRegion$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct AreaType *approachRegion
     * }
     */
    public static final long approachRegion$offset() {
        return approachRegion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct AreaType *approachRegion
     * }
     */
    public static MemorySegment approachRegion(MemorySegment struct) {
        return struct.get(approachRegion$LAYOUT, approachRegion$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct AreaType *approachRegion
     * }
     */
    public static void approachRegion(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(approachRegion$LAYOUT, approachRegion$OFFSET, fieldValue);
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

    private static final long _asn_ctx$OFFSET = 96;

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
