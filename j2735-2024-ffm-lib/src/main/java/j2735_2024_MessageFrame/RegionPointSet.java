// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct RegionPointSet {
 *     struct Position3D *anchor;
 *     Zoom_t *scale;
 *     RegionList_t nodeList;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class RegionPointSet {

    RegionPointSet() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_POINTER.withName("anchor"),
        MessageFrame_h.C_POINTER.withName("scale"),
        RegionList.layout().withName("nodeList"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("RegionPointSet");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout anchor$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("anchor"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct Position3D *anchor
     * }
     */
    public static final AddressLayout anchor$layout() {
        return anchor$LAYOUT;
    }

    private static final long anchor$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct Position3D *anchor
     * }
     */
    public static final long anchor$offset() {
        return anchor$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct Position3D *anchor
     * }
     */
    public static MemorySegment anchor(MemorySegment struct) {
        return struct.get(anchor$LAYOUT, anchor$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct Position3D *anchor
     * }
     */
    public static void anchor(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(anchor$LAYOUT, anchor$OFFSET, fieldValue);
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

    private static final long scale$OFFSET = 8;

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

    private static final GroupLayout nodeList$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("nodeList"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * RegionList_t nodeList
     * }
     */
    public static final GroupLayout nodeList$layout() {
        return nodeList$LAYOUT;
    }

    private static final long nodeList$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * RegionList_t nodeList
     * }
     */
    public static final long nodeList$offset() {
        return nodeList$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * RegionList_t nodeList
     * }
     */
    public static MemorySegment nodeList(MemorySegment struct) {
        return struct.asSlice(nodeList$OFFSET, nodeList$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * RegionList_t nodeList
     * }
     */
    public static void nodeList(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, nodeList$OFFSET, nodeList$LAYOUT.byteSize());
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

    private static final long _asn_ctx$OFFSET = 64;

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

